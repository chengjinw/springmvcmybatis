package com.wcj.framework.lib;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesConfig {
	private static Properties prop;
	
	public  PropertiesConfig() {
        super();
        prop = loadConfig("wobei.config");
    }
   
	private Properties loadConfig(String config) {
		String propFile = System.getProperty("user.dir") + File.separator
				+ "resources" + File.separator + config;
		try {
			InputStream in = new FileInputStream(propFile);
			prop.load(in);
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop;
	}
	
	public static Integer getIntegerByKey(String key, Integer defStr) {
		String tmpVal = getByKey(key, defStr.toString());
		return Integer.valueOf(tmpVal).intValue();
	}
	
	public static String getByKey(String key, String defStr) {
		return prop.getProperty(key, defStr);
	}
	
}
