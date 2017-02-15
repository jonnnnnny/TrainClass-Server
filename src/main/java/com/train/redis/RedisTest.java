package com.train.redis;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ /*
						 * "classpath:spring.xml", "classpath:spring-mvc.xml",
						 * "classpath:spring-mybatis.xml",
						 */"classpath:spring-redis.xml" })
public class RedisTest extends AbstractJUnit4SpringContextTests {
	@Resource
	private RedisClientTemplate redisClientTemplate;

	@Test
	public final void test() {
		System.out.println(redisClientTemplate.get("Lemon"));
		redisClientTemplate.set("我的名字", "梁继东");
		System.out.println(redisClientTemplate.get("我的名字"));
	}
}
