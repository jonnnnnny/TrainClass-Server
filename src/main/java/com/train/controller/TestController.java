package com.train.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/train/")
public class TestController {
	@RequestMapping("test.do")
	public void test(HttpServletRequest request, HttpServletResponse response)
			throws IOException {
		response.getWriter().print("test");
	}

	@RequestMapping("test1.do")
	@ResponseBody
	public Object test1(HttpServletRequest request, HttpServletResponse response)
			throws IOException {
		Map<String, String> map = new HashMap<>();
		map.put("test", "123");
		map.put("sadfas", "sdafas");
		return map;
	}
}
