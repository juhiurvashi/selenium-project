package com.k2js.SampleProjectProject.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class CommonUtil {
	public static String getPropertyvalue(String fn, String key) throws IOException {
		FileInputStream fis = new FileInputStream("./TestData/"+fn+".properties");
		Properties p = new Properties();
		p.load(fis);
		return p.getProperty(key);

	}
}
