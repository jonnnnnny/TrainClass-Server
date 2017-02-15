package com.train.controller.manager;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.train.mapper.TeachingLocationMapper;
import com.train.mapper.TeachingModeMapper;
import com.train.pojo.ClassPlan;
import com.train.pojo.ClassProcess;
import com.train.pojo.ClassScheme;
import com.train.service.ClassService;
import com.train.service.CourseProductService;
import com.train.service.TeachingLocationService;
import com.train.service.TeachingModeService;
import com.train.service.TimePropertyService;

@Controller
@RequestMapping("/class/")
public class ClassController {

	@Resource(name = "classService")
	private ClassService cService;
	@Resource
	private CourseProductService courseProductService;
	@Resource
	private TeachingLocationService teachingLocationService;
	@Resource
	private TimePropertyService timePropertyService;
	@Resource
	private TeachingModeService teachingModeService;

	@RequestMapping("cScheme/showAll.do")
	public String showAllClassScheme(HttpServletRequest request) {
		List all = cService.getAllSchemeClass();
		request.setAttribute("all", all);
		for (Object object : all) {
			ClassScheme cs = (ClassScheme) object;
			System.out.println(cs);
		}
		return "jsp/showClassScheme";
	}

	/**
	 * 展示添加策划班级页面的控制器
	 * 
	 * @author liangjidong
	 * @param request
	 * @return
	 */
	@RequestMapping("cScheme/toAddClassScheme.do")
	public String toAddClassScheme(HttpServletRequest request) {
		// 1.获取所有的课程产品
		List<String> courseProductList = courseProductService
				.getAllCourseProductName();
		request.setAttribute("courseProductList", courseProductList);
		// 2.获取所有的教学点
		List<String> teachingLocationList = teachingLocationService
				.getAllTeachingLocationName();
		request.setAttribute("teachingLocationList", teachingLocationList);
		// 3.获取所有时间性质名称
		List<String> timePropertyList = timePropertyService.getAllTpName();
		request.setAttribute("timePropertyList", timePropertyList);
		// 4.获取所有上课方式名称
		List<String> teachingModeList = teachingModeService.getAllTmName();
		request.setAttribute("teachingModeList", teachingModeList);
		return "jsp/addNewClassScheme";
	}

	/**
	 * 添加一条策划班级信息
	 * 
	 * @author liangjidong
	 * 
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("cScheme/addClassScheme.do")
	public String addClassScheme(@RequestParam HashMap map) throws Exception {
		// 获取所有的信息，拼接出班级id和班级全名称
		for (Object key : map.keySet()) {
			System.out.println(key + ":" + map.get(key));
		}
		// 1.将开课日期转换为060812格式
		String startTime = (String) map.get("starttime");
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date dStartTime = format.parse(startTime.toString());
		format = new SimpleDateFormat("yyMMdd");
		String starttime = format.format(dStartTime);
		System.out.println(starttime);
		// 2.获取coursename对应的id
		String coursename = (String) map.get("coursename");
		String cpId = courseProductService.getCourseProductIdByName(coursename);
		System.out.println("课程" + coursename + "对应的id为:" + cpId);
		// 3.获取locaname对应的id
		String locaname = (String) map.get("locaname");
		String tlId = teachingLocationService.getTlIdByName(locaname);
		System.out.println(locaname + " 对应 :" + tlId);
		// 4.获取timename对应的id
		String timename = (String) map.get("timename");
		String tpId = timePropertyService.getTpIdByName(timename);
		System.out.println(timename + " 对应 :" + tpId);
		// 5.获取modebfname对应的id
		String modebfname = (String) map.get("modebfname");
		String tmId = teachingModeService.getTmIdByBfName(modebfname);
		System.out.println(modebfname + " 对应 :" + tmId);
		// 6.拼接id
		String id = "B" + cpId + "-" + tlId + "-" + starttime + "-" + tpId
				+ "-" + tmId + "A";
		String name = coursename + "-" + locaname + "-" + starttime + "-"
				+ timename + "-" + modebfname + "A";
		System.out.println(id + "  " + name);
		// 7.向class_scheme中添加数据
		String schtime = (String) map.get("schtime");
		String endtime = (String) map.get("endtime");
		format = new SimpleDateFormat("yyyy-MM-dd");
		Date dEndTime = format.parse(endtime.toString());
		String operator = (String) map.get("operator");
		// String comment = (String) map.get("comment");
		// cqkka+2010-4-19+增加策划班级$
		String nowDate = format.format(new Date());
		String comment = operator + "+" + nowDate + "+增加策划班级$";
		ClassScheme cs = new ClassScheme();
		cs.setCsId(id);
		cs.setCsName(name);
		cs.setCsCoursename(coursename);
		cs.setCsStarttime(dStartTime);
		cs.setCsEndtime(dEndTime);
		cs.setCsComment(comment);
		cs.setCsLoacname(locaname);
		cs.setCsModebfname(modebfname);
		cs.setCsOperator(operator);
		cs.setCsSchtime(schtime);
		cs.setCsTimename(timename);
		cService.addNewSchemeClass(cs);
		return "redirect:/class/cScheme/showAll.do";
	}

	@RequestMapping("cScheme/toAddPlan.do")
	public String linkToAddClassPlan(HttpServletRequest request,
			@RequestParam("csId") String csId) {
		System.out.println("策划班级ID为:" + csId);
		request.setAttribute("csId", csId);
		return "jsp/addNewClassPlan";
	}

	/**
	 * 策划转计划
	 * 
	 * @param request
	 * @param paraMap
	 * @return
	 */
	@RequestMapping("cScheme/addPlan.do")
	public String addPlanClass(HttpServletRequest request,
			@RequestParam HashMap paraMap) {
		System.out.println("csId=" + paraMap.get("csId"));
		System.out.println("cpTeacherId=" + paraMap.get("cpTeacher"));
		System.out.println("cpTeacherName=" + paraMap.get("cpTeachername"));
		String csId = (String) paraMap.get("csId");
		String cpTeacher = (String) paraMap.get("cpTeacher");
		String cpTeachername = (String) paraMap.get("cpTeachername");
		String operator = (String) paraMap.get("operator");
		int studamount = Integer.parseInt((String) paraMap.get("studamount"));
		// 添加信息
		cService.addNewPlanClass(csId, cpTeacher, cpTeachername, operator,
				studamount);
		// 跳转到展示所有计划班级
		return "redirect:/class/cPlan/showAll.do";
	}

	@RequestMapping("cPlan/showAll.do")
	public String showAllClassPlan(HttpServletRequest request) {
		List all = cService.getAllPlan();
		request.setAttribute("all", all);
		for (Object object : all) {
			ClassPlan cs = (ClassPlan) object;
			System.out.println(cs);
		}
		return "jsp/showClassPlan";
	}

	@RequestMapping("cProcess/addProcess.do")
	public String addClassPlan(HttpServletRequest request,
			@RequestParam("cpId") String id) {
		cService.addNewProcess(id);
		return "redirect:/class/cProcess/showAll.do";
	}

	@RequestMapping("cProcess/showAll.do")
	public String showAllClassProcess(HttpServletRequest request) {
		List all = cService.getAllProcess();
		request.setAttribute("all", all);
		for (Object object : all) {
			ClassProcess cs = (ClassProcess) object;
			System.out.println(cs);
		}
		return "jsp/showClassProcess";
	}
}
