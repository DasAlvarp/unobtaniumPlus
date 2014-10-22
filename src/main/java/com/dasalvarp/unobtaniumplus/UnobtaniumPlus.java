package com.dasalvarp.unobtaniumplus;



import com.dasalvarp.unobtaniumplus.proxy.IProxy;
import com.dasalvarp.unobtaniumplus.reference.Reference;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;



@Mod(modid=Reference.MODID, name=Reference.MODNAME, version=Reference.VERSION)//registers it as a mod.
public class UnobtaniumPlus {

	@Mod.Instance(Reference.MODID)
	public static UnobtaniumPlus instance;//static object that's the mod, completely untouched by man. safe.
	
	@SidedProxy(clientSide = "proxy.ClientProxy", serverSide = "proxy.ServerProxy")
	public static IProxy proxy;
	
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