package com.train.controller.student;

import java.util.HashMap;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.train.service.UserService;

/**
 * 学员注册和登陆相关控制处理
 * 
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/student/user/")
public class APPUserController {

	@Resource
	private UserService userService;

	// 1.学员登陆
	@RequestMapping("login.do")
	@ResponseBody
	public HashMap login(@RequestParam HashMap map) {
		HashMap result = new HashMap();
		// 返回登陆结果-1:该手机号未注册,0:密码错误,1:登陆成功
		Integer status = null;
		String message = null;
		status = userService.login(map);
		if (status == -1)
			message = "该手机号未注册";
		else if (status == 0)
			message = "密码错误";
		else
			message = "登陆成功";
		result.put("status", status);
		result.put("message", message);
		return result;
	}

	// 2用户注册:传递来手机号和密码
	@RequestMapping("register.do")
	@ResponseBody
	public HashMap register(@RequestParam HashMap map) {
		HashMap result = new HashMap();
		Integer status = null;
		String message = null;
		status = userService.register(map);
		if (status == 1)
			message = "注册成功";
		else
			message = "手机号已存在";
		result.put("status", status);
		result.put("message", message);
		return result;
	}

	// 3.获取学员详细信息

	// 普通报名
	// 4.新学员报名:用户点击报名某个课程后，客户端首先需要完善个人信息（实名认证），然后将所选课程和个人信息同时发送到服务器，
	// 此时需要修改表：当前学员注册表，添加一条学员注册信息。修改表当前学员信息表：增加一条当前学员。修改用户表，将该用户的类型改为1（当前学员）,填入该用户生成的学号。
	// 班级id，报名类型为XXY（新学员普通），学号生成规则：截取班级id前14位，将首位替换成H，再获取当前班级的已报人数(cp_calculate)+1生成后三位的数字编码，
	// BCA-SQS-100628-SJ1-412A ---> HCA-SQS-100628-001

	// 老学员报名：当前学员注册表，添加一条学员注册信息（使用用户表中的学号）。若该学号在历史学员信息表中，将该学号转到当前学员信息表中。
	// 班级id，学号，手机号 报名类型为LXY（老学员普通），若是历史学员，转到当前学员后，将用户表中的用户类型改为1(原来的类型为2：历史学员)

	@RequestMapping("simplyApply.do")
	@ResponseBody
	public HashMap simpleyApply(@RequestParam HashMap map) {
		HashMap result = new HashMap();
		Integer status = null;
		String message = null;
		status = userService.simplyAppley(map);
		if (status == 1)
			message = "报名成功";
		else if (status == 0)
			message = "报名失败";
		else {
			message = "重复报名";
		}
		result.put("status", status);
		result.put("message", message);
		return result;
	}

	// 获取某个学员的详细信息:通过手机号
	@RequestMapping("getUserInfo.do")
	@ResponseBody
	public HashMap getUserInfo(@RequestParam HashMap map) {
		HashMap result = new HashMap();
		Integer status = null;
		String message = null;
		HashMap ans = userService.getUserInfoByPhone(map);
		status = (Integer) ans.get("status");
		if (status == 0) {
			message = "游客身份";
		} else if (status == 1) {
			message = "当前学员";
		} else if (status == -1) {
			message = "非系统用户";
		} else {
			message = "历史学员";
		}
		result.put("status", status);
		result.put("message", message);
		result.put("userinfo", ans.get("user"));
		return result;
	}

	// 修改某个学员的详细信息
	@RequestMapping("updateUserInfo.do")
	@ResponseBody
	public HashMap updateUserInfo(@RequestParam HashMap map) {
		HashMap result = new HashMap();
		Integer status = null;
		String message = null;
		status = userService.updateUserInfoByPhone(map);
		if (status == 0) {
			message = "修改失败";

		} else {
			message = "修改成功";
		}
		result.put("status", status);
		result.put("message", message);
		return result;
	}
}
