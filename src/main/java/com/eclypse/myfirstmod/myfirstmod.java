package com.eclypse.myfirstmod;

import com.eclypse.myfirstmod.proxy.IProxy;
import com.eclypse.myfirstmod.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class myfirstmod
{
    @Mod.Instance("Reference.MOD_ID")
    public static myfirstmod instance;

    @SidedProxy(clientSide = "com.eclypse.myfirstmod.proxy.ClientProxy" , serverSide = "com.eclypse.myfirstmod.proxy.ServerProxy")
    public static IProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

    }

    @EventHandler
    public void Init(FMLInitializationEvent event)
    {

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
