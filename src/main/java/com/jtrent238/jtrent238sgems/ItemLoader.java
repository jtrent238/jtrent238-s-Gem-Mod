package com.jtrent238.jtrent238sgems;

import com.jtrent238.jtrent238sgems.items.gems.ItemAIRGem;
import com.jtrent238.jtrent238sgems.items.gems.ItemBLOODGem;
import com.jtrent238.jtrent238sgems.items.gems.ItemEARTHGem;
import com.jtrent238.jtrent238sgems.items.gems.ItemENDERGem;
import com.jtrent238.jtrent238sgems.items.gems.ItemFIREGem;
import com.jtrent238.jtrent238sgems.items.gems.ItemGem;
import com.jtrent238.jtrent238sgems.items.gems.ItemLIGHTGem;
import com.jtrent238.jtrent238sgems.items.gems.ItemWATERGem;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.Item;

public class ItemLoader {

	public static Item ItemBloodGem;
	public static Item ItemFireGem;
	public static Item ItemWaterGem;
	public static Item ItemAirGem;
	public static Item ItemLightGem;
	public static Item ItemEarthGem;
	public static Item ItemEnderGem;
	
	public static void LoadItems() {

		ItemBloodGem  = new ItemBLOODGem(Gem.BLOOD).setUnlocalizedName("GEM_" + Gem.BLOOD.name()).setTextureName(GemMod.MODID + ":" + Gem.BLOOD.name()).setCreativeTab(GemMod.GemTab);
		ItemFireGem  = new ItemFIREGem(Gem.FIRE).setUnlocalizedName("GEM_" + Gem.FIRE.name()).setTextureName(GemMod.MODID + ":" + Gem.FIRE.name()).setCreativeTab(GemMod.GemTab);
		ItemWaterGem  = new ItemWATERGem(Gem.WATER).setUnlocalizedName("GEM_" + Gem.WATER.name()).setTextureName(GemMod.MODID + ":" + Gem.WATER.name()).setCreativeTab(GemMod.GemTab);
		ItemAirGem  = new ItemAIRGem(Gem.AIR).setUnlocalizedName("GEM_" + Gem.AIR.name()).setTextureName(GemMod.MODID + ":" + Gem.AIR.name()).setCreativeTab(GemMod.GemTab);
		ItemLightGem  = new ItemLIGHTGem(Gem.LIGHT).setUnlocalizedName("GEM_" + Gem.LIGHT.name()).setTextureName(GemMod.MODID + ":" + Gem.LIGHT.name()).setCreativeTab(GemMod.GemTab);
		ItemEarthGem  = new ItemEARTHGem(Gem.EARTH).setUnlocalizedName("GEM_" + Gem.EARTH.name()).setTextureName(GemMod.MODID + ":" + Gem.EARTH.name()).setCreativeTab(GemMod.GemTab);
		ItemEnderGem  = new ItemENDERGem(Gem.ENDER).setUnlocalizedName("GEM_" + Gem.ENDER.name()).setTextureName(GemMod.MODID + ":" + Gem.ENDER.name()).setCreativeTab(GemMod.GemTab);
		
		registerItems();
	}

	private static void registerItems() {

		GameRegistry.registerItem(ItemBloodGem, ItemBloodGem.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemFireGem, ItemFireGem.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemWaterGem, ItemWaterGem.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemAirGem, ItemAirGem.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemLightGem, ItemLightGem.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemEarthGem, ItemEarthGem.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemEnderGem, ItemEnderGem.getUnlocalizedName().substring(5));
		
		registerLanguage();
	}

	private static void registerLanguage() {

		LanguageRegistry.addName(ItemBloodGem, "Blood Gem");
		LanguageRegistry.addName(ItemFireGem, "Fire Gem");
		LanguageRegistry.addName(ItemWaterGem, "Water Gem");
		LanguageRegistry.addName(ItemAirGem, "Air Gem");
		LanguageRegistry.addName(ItemLightGem, "Light Gem");
		LanguageRegistry.addName(ItemEarthGem, "Earth Gem");
		LanguageRegistry.addName(ItemEnderGem, "Ender Gem");

		

	}

	
}
