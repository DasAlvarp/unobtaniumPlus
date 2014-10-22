package com.dasalvarp.unobtaniumplus.configuration;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

public class ConfigurationHandler {
	public static void init(File configFile)
	{
		
		
		boolean explicitMode = false;
		//creates config object.
		Configuration config = new Configuration(configFile);
		
		try
		{
			//load config file
			config.load();
			explicitMode = config.get("ExplicitMode", "explicitMode", false, "examle config value").getBoolean(true);//loads in value from config file, loads configValue, default value is true. If I can't get it, it returns troue. If there's an exception, it goes to catch statement.		
		}
		catch(Exception e)
		{
			//bad code. Should log it someday.

		}
		finally
		{
		
			//save config file. This will always happen.
			config.save();
		}
		
		System.out.println("Config Test: " + explicitMode);
	}

}
