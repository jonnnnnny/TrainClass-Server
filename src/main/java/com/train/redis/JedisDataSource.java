package com.train.redis;  
  
import redis.clients.jedis.ShardedJedis;  
  
public interface JedisDataSource {  
    public abstract ShardedJedis getRedisClient();  //取得redis客户端，这样就可以执行命令了
    public void returnResource(ShardedJedis shardedJedis);  //将资源返回给pool
    public void returnResource(ShardedJedis shardedJedis,boolean broken); //出现异常后，将资源返回给pool 
} 