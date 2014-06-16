package com.megathirio.shinsei.items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public final class ShinseiItems {

//Item Variables
	//Fuels
	public static Item itemSplitWood;
	
	
	//Mineral Drops
	public static Item itemLimestoneShard;
	public static Item itemSilt;
	
	//Item Initialization
	public static void init(){
		
	//Item Initialzation
		//Fuels
		itemSplitWood = new ShinseiItem().setUnlocalizedName("split_wood");
		GameRegistry.registerItem(itemSplitWood, "split_wood");
		
		//Mineral Drops
		itemLimestoneShard = new ShinseiItem().setUnlocalizedName("limestone_shard");
		GameRegistry.registerItem(itemLimestoneShard, "limestone_shard");
		itemSilt = new ShinseiItem().setUnlocalizedName("silt");
		GameRegistry.registerItem(itemSilt, "silt");

	}
}
