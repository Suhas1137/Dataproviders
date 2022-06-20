package com.pageutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Cofigdataprovider {

	Properties pro;
	public Cofigdataprovider() throws IOException {
		String path="C:\\Users\\DELL\\eclipse-workspace\\Dataproviderpractice\\Config\\config.properties";
		FileInputStream fis=new FileInputStream(path);
		pro=new Properties();
		pro.load(fis);
	}
	
	public String getStageurl() {
		return pro.getProperty("Stageurl");
	}
}
