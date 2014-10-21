package com.dasalvarp.unobtaniumplus;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid="UnobtaniumPlus", name="UnobtaniumPlus", version="1.7.10-0.0.1a")//registers it as a mod.
public class UnobtaniumPlus {

	@Mod.Instance("UnobtaniumPlus")
	public static UnobtaniumPlus instance;//static object that's the mod, completely untouched by man. safe.
	
	
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)//can be whatever I want to call it. Arg is the only important thing.
	{
		
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event)
	{
		
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)//veeery basic structure of a mod.
	{
		
	}
}


/*
phases of how a mod loads:

FML and MCF use and event system.


go thrugh library/cpwmods.fml/common/eventand then find stuff.

Pre-initialization phase is when FML loads configs, sets stuff up, etc...
That's where I set up blocks, etc.


Initialization: set up GUI handler, tile entities, start recepies, etc...

Post-initialization: will look at it later.




*/