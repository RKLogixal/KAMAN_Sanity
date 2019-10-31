package com.operations.Common;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadUserconfig {
	public String SiteName;
	public String Suite;
	//Properties c = new Properties();
 
@Test
	public void getUserConfig() throws IOException{
		//Read object repository file
		
		File configFile = new File("resources\\UserConfig.properties");
		InputStream inputStream = new FileInputStream(configFile);
		Properties prop1 = new Properties();
		prop1.load(inputStream);
		SiteName = prop1.getProperty("Site");
		Suite = prop1.getProperty("Suite");
		
		}

	
}
