package com.config;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	Properties pro;

	public ConfigReader() throws FileNotFoundException {
		try {
			File src = new File("./Configuration/Config.property");
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();

			pro.load(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Eception"+e);
		}
	}

	public String getChromeDriver() {
		return(pro.getProperty("ChromeDriver"));
	}
	
	public String getURL() {
		return(pro.getProperty("URL"));
	}
}
