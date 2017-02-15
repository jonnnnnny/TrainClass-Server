package com.train.controller.student;

import java.util.HashMap;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.train.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentLogin {
	@Resource(name = "studentService")
	private StudentService stuService;

	@RequestMapping("/login.do")
	@ResponseBody
	public HashMap login() {
		String phone = "12345678901";
		String password = "123456";
		// 执行service层登陆逻辑
		int ans = stuService.login(phone, password);
		HashMap result = new HashMap();
		String message = null;
		if (ans == -1) {
			message = "用户不存在";
		} else if (ans == 0) {
			message = "密码错误";
		} else {
			message = "登陆成功";
		}
		result.put("status", ans);
		result.put("message", message);
		return result;
	}
}
