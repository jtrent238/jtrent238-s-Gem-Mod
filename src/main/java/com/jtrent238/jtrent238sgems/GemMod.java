package com.jtrent238.jtrent238sgems;


import java.util.ArrayList;

import com.jtrent238.jtrent238sgems.common.CommonProxy;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.command.ICommandManager;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.common.ChestGenHooks;

@Mod(modid=GemMod.MODID, name=GemMod.MODNAME, version=(GemMod.MODVERSION))
//@MeddleMod(id=Main.MODID, name=Main.MODNAME, version=(Main.MODVERSION), author=Main.MODAUTHOR)
public class GemMod
{

	
	@SidedProxy(clientSide="com.jtrent238.jtrent238sgems.client.ClientProxy", serverSide="com.jtrent238.jtrent238sgems.common.CommonProxy")
	public static CommonProxy proxy;
	
	
	public static final String MODID = "jtrent238sgems";

	@Instance(MODID)
    public static GemMod instance;
	public static final String MODVERSION = "1.0.0.0";
	public static final String MODNAME = "jtrent238's Gems Mod";
	public static final String MODAUTHOR = "jtrent238";
	public static final String MC = "1.7.10";



	@ForgeSubscribe(priority = EventPriority.NORMAL)
    public void eventHandler(RenderGameOverlayEvent event) {

	}
	
	
@Mod.EventHandler
public void preInit(FMLPreInitializationEvent event)
{
	
}



@Mod.EventHandler
public void init(FMLInitializationEvent event)
{
	proxy.init(event);
	
	
	ItemLoader.LoadItems();
	//BlockLoader.loadBlocks();
	//Recipes.registerRecpies();
	//EntityLoader.LoadEntitys();
	//OreDict.addores();
	//Achievements.loadAchievements();
	//Stats.RegisterStats();
	//ChestGen.registerItems();
	
	
	
	
	
	
	//LanguageRegistry.addName(GemMod.GemTab, "jtrent238's Gems");
	
}


public static CreativeTabs GemTab = new CreativeTabs("GemTab")

{
	public Item getTabIconItem() {

		return new ItemStack(ItemLoader.ItemBloodGem).getItem();
	}
	
	public boolean hasSearchBar(){
		return false;
	}
	/*
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "EpicProportionsMod_Halloween.png";
	}
	
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	*/
	
	};








@Mod.EventHandler
public void postInit(FMLPostInitializationEvent event) {
	{
		
	    
	}
}


@EventHandler
public void serverStart(FMLServerStartingEvent event)
{
     MinecraftServer server = MinecraftServer.getServer();
     // Get's the current server instance
     
     ICommandManager command = server.getCommandManager();
     //ServerCommandManager manager = (ServerCommandManager) command;
     
     //manager.registerCommand(new CommandModInfo());
     //manager.registerCommand(new CommandChangelog());
}

					
}
