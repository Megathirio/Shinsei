package com.megathirio.shinsei.items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public final class ShinseiDusts {

	//Item Variables
		//Powders
		public static Item itemArsenicPowder;

//Item Initialization
	public static void init(){
		
	//Item Initialzation
		//Powders
		itemArsenicPowder = new ShinseiItem().setUnlocalizedName("arsenic_powder");
		GameRegistry.registerItem(itemArsenicPowder, "arsenic_powder");
		OreDictionary.registerOre("dustArsenic", new ItemStack(itemArsenicPowder));
	
	}
}
