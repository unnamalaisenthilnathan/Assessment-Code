package com.atmecs.shoptools.constants;

import java.io.File;

public class ProjectPathConstants {
	public static String currentdir = System.getProperty("user.dir") + File.separator;
	public static String resources = currentdir +  File.separator + "resources" + File.separator;
	public static String log = currentdir +  File.separator + "log" + File.separator;
	public static String test = currentdir +  File.separator + "test" + File.separator;
	
	//config
	public static String config = resources + "config.properties";

	
	
	//menu
	public static String locators= resources+"locators.properties";
	
	
	//log
	public static String logpropertyfile=log+"log.properties";
	
	
	public static String testdatapropertyfile=test+"testdata.properties";

}
