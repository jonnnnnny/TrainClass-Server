package com.train.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.train.mapper.ClassPlanMapper;
import com.train.mapper.ClassProcessMapper;
import com.train.mapper.StudentCurrentMapper;
import com.train.mapper.StudentCurrentRegisterMapper;
import com.train.mapper.StudentHistoryMapper;
import com.train.mapper.StudentRegisterTypeMapper;
import com.train.mapper.UserMapper;
import com.train.pojo.ClassPlan;
import com.train.pojo.ClassProcess;
import com.train.pojo.StudentCurrent;
import com.train.pojo.StudentCurrentRegister;
import com.train.pojo.StudentHistory;
import com.train.pojo.StudentRegisterType;
import com.train.pojo.User;

@Service
public class UserService {
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private StudentCurrentRegisterMapper studentCurrentRegisterMapper;
	@Autowired
	private StudentCurrentMapper studentCurrentMapper;
	@Autowired
	private StudentHistoryMapper studentHistoryMapper;
	@Autowired
	private ClassPlanMapper classPlanMapper;
	@Autowired
	private ClassProcessMapper classProcessMapper;
	@Autowired
	private StudentRegisterTypeMapper studentRegisterTypeMapper;

	/**
	 * 返回登陆结果-1:该手机号未注册,0:密码错误,1:登陆成功
	 * 
	 * @param map
	 * @return
	 */
	public int login(HashMap map) {
		User user = userMapper.selectByPhone(map);
		if (user == null)
			return -1;
		if (map.get("password") != null
				&& user.getuPassword().equals(map.get("password"))) {
			return 1;
		}
		return 0;
	}

	/**
	 * 0:手机号已存在 1:注册成功
	 * 
	 * @param map
	 * @return
	 */
	public int register(HashMap map) {
		User user = userMapper.selectByPhone(map);
		if (user != null) {
			// 手机号已存在
			return 0;
		}
		User u = new User();
		u.setuPhone((String) map.get("phone"));
		u.setuPassword((String) map.get("password"));
		u.setuType("0");// 表示游客
		userMapper.insert(u);
		return 1;
	}

	// 普通报名(当前或计划班级报名)
	// .新学员报名:用户点击报名某个课程后，客户端首先需要完善个人信息（实名认证），然后将所选课程和个人信息同时发送到服务器，
	// 此时需要修改表：当前学员注册表，添加一条学员注册信息。修改表当前学员信息表：增加一条当前学员。修改用户表，将该用户的类型改为1（当前学员）,填入该用户生成的学号。
	// 班级id，报名类型为XXY（新学员普通），学号生成规则：截取班级id前14位，将首位替换成H，再获取当前班级的已报人数(cp_calculate)+1生成后三位的数字编码，
	// BCA-SQS-100628-SJ1-412A ---> HCA-SQS-100628-001

	// 同一个学员在课程未结束不能报同一个班

	// 老学员报名：当前学员注册表，添加一条学员注册信息（使用用户表中的学号）。若该学号在历史学员信息表中，将该学号转到当前学员信息表中。
	// 班级id，学号，手机号 报名类型为LXY（老学员普通），若是历史学员，转到当前学员后，将用户表中的用户类型改为1(原来的类型为2：历史学员)
	public Integer simplyAppley(HashMap map) {
		// TODO Auto-generated method stub
		// 获取手机号码
		String phone = (String) map.get("phone");
		// 获取这个用户在user表中的类型
		User user = userMapper.selectByPrimaryKey(phone);
		// 获取班级id
		String classId = (String) map.get("cp_id");
		// 获取班级的id，全名称，当前报名人数(报名之后要将人数加1)
		String className = null;
		Integer calculate = null;// 当前已报名人数
		ClassPlan cPlan = classPlanMapper.selectByPrimaryKey(classId);
		if (cPlan != null) {
			className = cPlan.getCpName();
			calculate = cPlan.getCpCalculate();

		} else {
			ClassProcess cProcess = classProcessMapper
					.selectByPrimaryKey(classId);
			className = cProcess.getCpName();
			calculate = cProcess.getCpCalculate();
		}
		// 判断类型然后得到学号
		String stuId = null;
		String regType = null;
		if (user.getuType().equals("0")) {
			// 新学员普通,根据班级id和班级报名人数生成学号 XXY
			String sub = classId.substring(1, 14);
			sub = "H" + sub;
			Integer newCalculate = calculate + 1;
			String calculateString = newCalculate.toString();
			if (calculateString.length() == 1) {
				sub = sub + "00" + calculateString;
			} else if (calculateString.length() == 2) {
				sub = sub + "0" + calculateString;
			} else {
				sub = sub + calculateString;
			}
			stuId = sub;
			regType = "XXY";
			// 注册一条学员注册信息
			StudentRegisterType srt = studentRegisterTypeMapper
					.selectByPrimaryKey(regType);
			StudentCurrentRegister record = new StudentCurrentRegister();
			record.setScrClassid(classId);
			record.setScrClassname(className);
			record.setScrPs("0");
			record.setScrSingleornot("X");
			record.setScrStudid(stuId);
			record.setScrTime(new Date());
			record.setScrRegtypeid(regType);
			record.setScrRegtypefeat(srt.getSrtFeature());
			record.setScrRegtypename(srt.getSrtName());
			record.setScrOperator("cqkka");
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			String nowDate = format.format(new Date());
			record.setScrInfo("cqkka" + "+" + nowDate + "+注册--" + className
					+ "$");
			studentCurrentRegisterMapper.insert(record);
			// 当前学员信息表中增加一条信息
			StudentCurrent newStudent = new StudentCurrent();
			newStudent.setScId(stuId);
			newStudent.setScName((String) map.get("name"));
			newStudent.setScGender((String) map.get("gender"));
			newStudent.setScIdcardno((String) map.get("idcardno"));
			newStudent.setScZhitel(phone);
			studentCurrentMapper.insert(newStudent);
			// 将学号加到user表中，type =1
			user.setuStuid(stuId);
			user.setuType("1");
			userMapper.updateByPrimaryKey(user);

		} else if (user.getuType().equals("1")) {
			// 当前学员LXY
			stuId = user.getuStuid();
			// 判断当前学员注册信息表中有没有这个学员注侧的当前课程，有就不能重复注册
			HashMap scrMap = new HashMap();
			scrMap.put("studid", stuId);
			scrMap.put("classid", classId);
			if (studentCurrentRegisterMapper.selectByStudidAndclassid(scrMap) != null) {
				return -1;
			}
			regType = "LXY";
			StudentRegisterType srt = studentRegisterTypeMapper
					.selectByPrimaryKey(regType);
			StudentCurrentRegister record = new StudentCurrentRegister();
			record.setScrClassid(classId);
			record.setScrClassname(className);
			record.setScrPs("0");
			record.setScrSingleornot("X");
			record.setScrStudid(stuId);
			record.setScrTime(new Date());
			record.setScrRegtypeid(regType);
			record.setScrRegtypefeat(srt.getSrtFeature());
			record.setScrRegtypename(srt.getSrtName());
			record.setScrOperator("cqkka");
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			String nowDate = format.format(new Date());
			record.setScrInfo("cqkka" + "+" + nowDate + "+注册--" + className
					+ "$");
			studentCurrentRegisterMapper.insert(record);

		} else {
			// 历史学员LXY
			stuId = user.getuStuid();
			regType = "LXY";
			StudentRegisterType srt = studentRegisterTypeMapper
					.selectByPrimaryKey(regType);
			StudentCurrentRegister record = new StudentCurrentRegister();
			record.setScrClassid(classId);
			record.setScrClassname(className);
			record.setScrPs("0");
			record.setScrSingleornot("X");
			record.setScrStudid(stuId);
			record.setScrTime(new Date());
			record.setScrRegtypeid(regType);
			record.setScrRegtypefeat(srt.getSrtFeature());
			record.setScrRegtypename(srt.getSrtName());
			record.setScrOperator("cqkka");
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			String nowDate = format.format(new Date());
			record.setScrInfo("cqkka" + "+" + nowDate + "+注册--" + className
					+ "$");
			studentCurrentRegisterMapper.insert(record);
			// 历史学员转当前学员
			StudentHistory sh = studentHistoryMapper.selectByPrimaryKey(stuId);
			studentHistoryMapper.deleteByPrimaryKey(stuId);
			StudentCurrent sc = new StudentCurrent();
			sc.setScBg(sh.getShBg());
			sc.setScEmail(sh.getShEmail());
			sc.setScGender(sh.getShGender());
			sc.setScHiststudy(sh.getShHiststudy());
			sc.setScId(sh.getShId());
			sc.setScIdcardno(sh.getShIdcardno());
			sc.setScMsn(sh.getShMsn());
			sc.setScName(sh.getShName());
			sc.setScQq(sh.getShQq());
			sc.setScStandbytel(sh.getShStandbytel());
			sc.setScZhitel(sh.getShZhitel());
			studentCurrentMapper.insert(sc);
			// 将user表中的类型改为1
			user.setuType("1");
			userMapper.updateByPrimaryKey(user);
		}
		// 注册完成之后将对应课程中的已报名人数+1;
		calculate = calculate + 1;
		if (cPlan != null) {
			cPlan.setCpCalculate(calculate);
			classPlanMapper.updateByPrimaryKey(cPlan);
		} else {
			ClassProcess cProcess = classProcessMapper
					.selectByPrimaryKey(classId);
			cProcess.setCpCalculate(calculate);
			classProcessMapper.updateByPrimaryKey(cProcess);
		}
		return 1;
	}

	// 根据学员手机号码获取信息
	public HashMap getUserInfoByPhone(HashMap map) {
		Integer status = null;
		Object user = null;
		User u = userMapper.selectByPhone(map);
		if (u == null) {
			status = -1;// 非系统用户
		} else {
			if ("0".equals(u.getuType())) {
				// 用户为游客
				status = 0;
			} else if ("1".equals(u.getuType())) {
				status = 1;

				user = studentCurrentMapper.selectByPhone(map);
			} else {
				status = 2;
				user = studentHistoryMapper.selectByPhone(map);
			}
		}
		HashMap ans = new HashMap();
		ans.put("status", status);
		ans.put("user", user);
		return ans;
	}

	// 根据学员手机号修改学员信息
	public int updateUserInfoByPhone(HashMap map) {
		User u = userMapper.selectByPhone(map);
		System.out.println(u);
		if ("0".equals(u.getuType())) {
			// 用户为游客
		} else if ("1".equals(u.getuType())) {
			String id = u.getuStuid();
			map.put("id", id);
			return studentCurrentMapper
					.updateByPrimaryKeySelectiveWithHashMap(map);
		} else {
			String id = u.getuStuid();
			map.put("id", id);
			return studentHistoryMapper
					.updateByPrimaryKeySelectiveWithHashMap(map);
		}
		return 0;
	}
}
