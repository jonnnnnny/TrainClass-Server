package com.train.redis;

import java.util.ArrayList;
import java.util.List;

import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;
import redis.clients.jedis.JedisShardInfo;
import redis.clients.jedis.ShardedJedis;
import redis.clients.jedis.ShardedJedisPool;

/**
 * 多台机器，分布式连接
 * 
 * @author Administrator
 *
 */
public class MultipleJedisPoolTest {
	static ShardedJedisPool pool;
	static JedisPoolConfig config;
	static {
		List<JedisShardInfo> list = new ArrayList<JedisShardInfo>();
		list.add(new JedisShardInfo("192.168.200.101", 6379));

		config = new JedisPoolConfig();
		config.setMaxIdle(10);
		config.setMaxTotal(30);
		config.setMaxWaitMillis(3000);
		pool = new ShardedJedisPool(config, list);
	}

	public static void main(String[] args) {
		ShardedJedis conn = pool.getResource();
		conn.set("Lemon", "Hello, my name is Lemon");
		System.out.println(conn.get("Lemon"));
		close(conn, pool);
	}

	private static void close(ShardedJedis conn, ShardedJedisPool pool) {
		if (conn != null && pool != null) {
			pool.returnResource(conn);
		}
		if (pool != null) {
			pool.destroy();
		}

	}
}
