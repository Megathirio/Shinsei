package com.megathirio.shinsei.items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public final class ShinseiItems {

//Item Variables
	//Casts
	public static Item itemAxeCast;
	public static Item itemHoeCast;
	public static Item itemPickaxeCast;
	public static Item itemShovelCast;
	public static Item itemSwordCast;

	//Fuels
	public static Item itemSplitWood;
	
	
	//Mineral Drops
	public static Item itemLimestoneShard;
	public static Item itemSilt;
	
	//Item Initialization
	public static void init(){
		
	//Item Initialzation
		//Casts
		itemAxeCast = new ShinseiItem().setUnlocalizedName("axe_cast");
		GameRegistry.registerItem(itemAxeCast, "axe_cast");

		itemHoeCast = new ShinseiItem().setUnlocalizedName("hoe_cast");
		GameRegistry.registerItem(itemHoeCast, "hoe_cast");

		itemPickaxeCast = new ShinseiItem().setUnlocalizedName("pickaxe_cast");
		GameRegistry.registerItem(itemPickaxeCast, "pickaxe_cast");

		itemShovelCast = new ShinseiItem().setUnlocalizedName("shovel_cast");
		GameRegistry.registerItem(itemShovelCast, "shovel_cast");

		itemSwordCast = new ShinseiItem().setUnlocalizedName("sword_cast");
		GameRegistry.registerItem(itemSwordCast, "sword_cast");

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
