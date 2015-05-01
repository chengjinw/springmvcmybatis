package com.wcj.framework.lib;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class JedisUtil {
	static JedisPool pool;
    
	public static Jedis getJedis() {
		System.out.println("1234");
		//String ip = PropertiesConfig.getByKey("redis.master.url", "127.0.0.1");
    	pool = new JedisPool(new JedisPoolConfig(), "192.168.1.80");
		return pool.getResource();
	}
}
