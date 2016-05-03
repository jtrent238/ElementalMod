package com.jtrent238.elementalmod;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class ItemLoader {
	
	public static Item itemFireOrb;

	/**
	 * Load Items.
	 */
public static void LoadItems() {
	itemFireOrb = new Item().setUnlocalizedName("itemFireOrb").setTextureName("elementalmod:itemFireOrb").setCreativeTab(ElementalMod.ElementalMod);
	
}

/**
 * Register Items.
 */
private static void registerItems(){
	GameRegistry.registerItem(itemFireOrb, itemFireOrb.getUnlocalizedName().substring(5));
    
}

}
