package com.train.controller.student;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.train.service.ClassProcessService;

@Controller
@RequestMapping("/student/cp")
public class APPClassProcessController {
	@Resource
	private ClassProcessService cpService;

	// 获取所有的进行班级信息
	@RequestMapping("/getCpInfo.do")
	@ResponseBody
	public HashMap getCpInfo() {
		// 使用List<HashMap>得到
		List<HashMap> list = cpService.getAllCpInfo();
		HashMap result = new HashMap();
		String message = null;
		if (list == null) {
			message = "数据为空";
		} else {
			message = "成功";
		}
		result.put("message", message);
		result.put("result", list);
		return result;
	}

	@RequestMapping("/getCpInfoWithCourse.do")
	@ResponseBody
	public HashMap getCprocessWithCourseName() {
		HashMap result = new HashMap();
		List<HashMap> list = cpService.getAlllCprocessInfoWithCourse();
		result.put("list", list);
		result.put("message", "返回成功");
		return result;
	}

	/**
	 * 通过查询条件获取到进行班级的信息 条件有:cp_coursename cp_timename cp_teachername cp_locaname
	 * 
	 * @return
	 */
	@RequestMapping("/getCpInfoBySelection.do")
	@ResponseBody
	public HashMap getCprocessBySelection(@RequestParam HashMap map) {
		HashMap result = new HashMap();
		List<HashMap> list = cpService.getCprocessInfoBySelection(map);
		result.put("list", list);
		result.put("message", "返回成功");
		return result;
	}
}
