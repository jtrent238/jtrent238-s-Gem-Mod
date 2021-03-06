package com.jtrent238.jtrent238sgems.items.gems;

import com.jtrent238.jtrent238sgems.Gem;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

public class ItemBLOODGem extends ItemGem{

	public ItemBLOODGem(Gem gem) {
		super(gem);
		this.setMaxDamage(100);
	}

	/**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack p_77659_1_, World p_77659_2_, EntityPlayer p_77659_3_)
    {


		p_77659_3_.setHealth(p_77659_3_.getHealth() - 2);
		p_77659_2_.playSoundAtEntity(p_77659_3_, "entity.player.hurt", 2.5F, 2.5F);
		p_77659_3_.clearActivePotions();
		p_77659_1_.damageItem(1, p_77659_3_);
		
		//p_77659_3_.addChatMessage(new ChatComponentText("Your Blood has been cleansed!"));

    	return p_77659_1_;
    }
	
}
