package com.jtrent238.elementalmod;

import com.jtrent238.elementalmod.items.orbs.ItemFireOrb;
import com.jtrent238.elementalmod.items.orbs.ItemIceOrb;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class ItemLoader {
	
	public static Item ItemFireOrb;
	public static Item ItemIceOrb;

	/**
	 * Load Items.
	 */
public static void LoadItems() {
	ItemFireOrb = new ItemFireOrb().setUnlocalizedName("ItemFireOrb").setTextureName("elementalmod:ItemFireOrb").setCreativeTab(ElementalMod.ElementalMod);
	ItemIceOrb = new ItemIceOrb().setUnlocalizedName("ItemIceOrb").setTextureName("elementalmod:ItemIceOrb").setCreativeTab(ElementalMod.ElementalMod);
	
}

/**
 * Register Items.
 */
private static void registerItems(){
	GameRegistry.registerItem(ItemFireOrb, ItemFireOrb.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(ItemIceOrb, ItemIceOrb.getUnlocalizedName().substring(5));
    
}

}
