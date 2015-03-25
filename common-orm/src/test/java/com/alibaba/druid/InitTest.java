package com.alibaba.druid;

import java.io.File;

import jef.database.DbClient;
import jef.database.DbClientBuilder;

import org.easyframe.fastjson.JSON;
import org.easyframe.fastjson.JSONObject;
import org.junit.Test;

public class InitTest {

	@Test
	public void buildTest() {
		DbClient db = new DbClientBuilder("derby", new File("./db"), null, null).setMaxPoolSize(0).build();
	}

	@Test
	public void testJson() {
		String json = "{\"aaaa\":123,\"bbb\":\"sss\"}";
		JSON jo = JSON.parseObject(json, JSONObject.class);
		System.out.println("[" + jo + "]");
	}
}