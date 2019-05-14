//property java file for properties

package com.cg.initializer;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class Property {
	static Properties prop = new Properties();
	public static void readProperties() {
		
		try {
			InputStream is = new FileInputStream(
					"C:\\Users\\Home\\eclipse-workspace490\\TestAutomationandSelenium\\src\\main\\java\\config.properties");
			prop.load(is);
			System.out.println(prop.getProperty("browser"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
