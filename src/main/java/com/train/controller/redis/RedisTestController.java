package com.train.controller.redis;

import java.util.HashMap;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.train.redis.RedisClientTemplate;

@Controller
@RequestMapping("/redis/")
public class RedisTestController {
	@Resource
	private RedisClientTemplate redisClientTemplate;

	@RequestMapping("test.do")
	@ResponseBody
	public Object redisTest() {
		return redisClientTemplate.get("Lemon");
	}
}
