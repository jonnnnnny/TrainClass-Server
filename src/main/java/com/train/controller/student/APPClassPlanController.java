package com.train.controller.student;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.train.service.ClassPlanService;

@RequestMapping("/student/cplan")
@Controller
public class APPClassPlanController {
	@Resource
	private ClassPlanService classPlanService;

	@RequestMapping("/getCplanInfo.do")
	@ResponseBody
	public HashMap getAllPlan() {
		HashMap result = new HashMap();
		List list = classPlanService.getAllPlan();
		result.put("list", list);
		result.put("message", "返回成功");
		return result;
	}
}
