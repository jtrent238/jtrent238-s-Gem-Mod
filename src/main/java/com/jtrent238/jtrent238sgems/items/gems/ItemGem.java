package com.jtrent238.jtrent238sgems.items.gems;

import com.jtrent238.jtrent238sgems.Gem;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemGem extends Item{






	public ItemGem(Gem gem) {


	}

	/**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack p_77659_1_, World p_77659_2_, EntityPlayer p_77659_3_)
    {

    	
		if(Gem.getType(Gem.BLOOD) != null){
    		System.out.println("Im a " + Gem.BLOOD.name());
    	}
    	
    	if(Gem.getType(Gem.FIRE) != null){
    		System.out.println("Im a " + Gem.FIRE.name());
    	}
    	
    	if(Gem.getType(Gem.WATER) != null){
    		System.out.println("Im a " + Gem.WATER.name());
    	}
    	
    	if(Gem.getType(Gem.AIR) != null){
    		System.out.println("Im a " + Gem.AIR.name());
    	}
    	
    	if(Gem.getType(Gem.LIGHT) != null){
    		System.out.println("Im a " + Gem.LIGHT.name());
    	}
    	
    	if(Gem.getType(Gem.EARTH) != null){
    		System.out.println("Im a " + Gem.EARTH.name());
    	}
    	
    	if(Gem.getType(Gem.ENDER) != null){
    		System.out.println("Im a " + Gem.ENDER.name());
    	}
    	return p_77659_1_;
    }
	
}

