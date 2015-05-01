package com.wcj.wb.test;

import org.junit.Before;
import org.junit.Test;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import com.wcj.framework.lib.JedisUtil;

public class JedisUtilTest {
	JedisPool pool;
	Jedis jedis;

	@Before
	public void setUp() {
		//pool = new JedisPool(new JedisPoolConfig(), "192.168.1.80");
		//jedis = pool.getResource();
		// jedis.auth("password");
	}

	@Test
	public void testGet() {
		System.out.println(JedisUtil.getJedis().get("a12"));
	}
}
