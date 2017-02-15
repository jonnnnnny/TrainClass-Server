package com.train.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.train.mapper.ClassPlanMapper;
import com.train.mapper.ClassProcessMapper;
import com.train.mapper.ClassSchemeMapper;
import com.train.pojo.ClassPlan;
import com.train.pojo.ClassProcess;
import com.train.pojo.ClassScheme;

@Service(value = "classService")
public class ClassService {
	@Autowired
	private ClassSchemeMapper classSchemeMapper;
	@Autowired
	private ClassPlanMapper classPlanMapper;

	@Autowired
	private ClassProcessMapper classProcessMapper;

	/**
	 * 获取所有的策划班级信息
	 */
	public List getAllSchemeClass() {
		// TODO Auto-generated method stub
		List list = classSchemeMapper.selectAll();
		return list;
	}

	/**
	 * 根据策划班级号和教师id，教师姓名添加计划班级
	 * 
	 * @param csId
	 * @param teacherId
	 * @param teacherName
	 * @return
	 */
	public int addNewPlanClass(String csId, String teacherId,
			String teacherName, String operator, int studamount) {
		// TODO Auto-generated method stub
		// 1.获取策划班级
		ClassScheme cs = classSchemeMapper.selectByPrimaryKey(csId);
		// 2.封装planClass
		ClassPlan cp = new ClassPlan();
		cp.setCpId(cs.getCsId());
		// cqkka+2010-4-19+转计划$
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		String nowDate = format.format(new Date());
		String commnet = operator + "+" + nowDate + "+转计划$";
		cp.setCpComment(cs.getCsComment() + commnet);
		cp.setCpSchemeno(cs.getCsSchemeno());
		cp.setCpSchemeno(cs.getCsSchemeno());
		cp.setCpCoursename(cs.getCsCoursename());
		cp.setCpEndtime(cs.getCsEndtime());
		cp.setCpLocaname(cs.getCsLoacname());
		cp.setCpModebfname(cs.getCsModebfname());
		cp.setCpName(cs.getCsName());
		cp.setCpOperator(operator);
		cp.setCpSchtime(cs.getCsSchtime());
		cp.setCpStarttime(cs.getCsStarttime());
		cp.setCpStudamount((byte) studamount);
		cp.setCpTeacher(teacherId);
		cp.setCpTeachername(teacherName);
		cp.setCpTimename(cs.getCsTimename());
		cp.setCpCalculate(0);
		// 3.添加计划班级
		classPlanMapper.insert(cp);
		// 4.删除对应策划班级
		classSchemeMapper.deleteByPrimaryKey(csId);
		return 1;
	}

	public int addNewSchemeClass(ClassScheme cs) {
		return classSchemeMapper.insert(cs);
	}

	public List getAllPlan() {
		return classPlanMapper.selectAll();
	}

	public void addNewProcess(String id) {
		// TODO Auto-generated method stub
		ClassPlan cplan = classPlanMapper.selectByPrimaryKey(id);
		ClassProcess cpro = new ClassProcess();
		String nowDate = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
		String comment = "cqkka+" + nowDate + "+开课$";// cqkka+2010-5-4+开课$
		cpro.setCpCalculate(cplan.getCpCalculate());
		cpro.setCpSchemeno(cplan.getCpSchemeno());
		cpro.setCpComment(cplan.getCpComment() + comment);
		cpro.setCpCoursename(cplan.getCpCoursename());
		cpro.setCpEndtime(cplan.getCpEndtime());
		cpro.setCpId(cplan.getCpId());
		cpro.setCpLocaname(cplan.getCpLocaname());
		cpro.setCpModebfname(cplan.getCpModebfname());
		cpro.setCpName(cplan.getCpName());
		cpro.setCpOperator("cqkka");// 操作人固定为cqkka
		cpro.setCpSchtime(cplan.getCpSchtime());
		cpro.setCpStarttime(cplan.getCpStarttime());
		cpro.setCpStudamount(cplan.getCpStudamount());
		cpro.setCpTeacher(cplan.getCpTeacher());
		cpro.setCpTeachername(cplan.getCpTeachername());
		cpro.setCpTimename(cplan.getCpTimename());
		classProcessMapper.insert(cpro);
		classPlanMapper.deleteByPrimaryKey(id);
	}

	public List getAllProcess() {
		// TODO Auto-generated method stub
		return classProcessMapper.selectAll();
	}

}
