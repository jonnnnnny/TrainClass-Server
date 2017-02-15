package com.train.redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * 使用连接池
 * 
 * @author Administrator
 *
 */
public class JedisPoolTest {
	static JedisPool jedisPool;
	static JedisPoolConfig config;
	static {
		// 初始化连接池配置对象
		config = new JedisPoolConfig();
		config.setMaxIdle(10);
		config.setMaxTotal(30);
		config.setMaxWaitMillis(3000);
		// 实例化连接池
		jedisPool = new JedisPool(config, "192.168.200.101", 6379);
	}

	public static void main(String[] args) {
		Jedis conn = jedisPool.getResource();
		conn.del("cities");
		conn.lpush("cities", "北京");
		conn.lpush("cities", "上海");
		conn.lpush("cities", "广州");
		System.out.println(conn.lrange("cities", 0, -1));
		close(conn, jedisPool);
	}

	@SuppressWarnings("deprecation")
	private static void close(Jedis conn, JedisPool pool) {
		if (conn != null && pool != null) {
			pool.returnResource(conn);
		}
		if (pool != null) {
			pool.destroy();
		}
	}

}
