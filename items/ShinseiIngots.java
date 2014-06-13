package com.megathirio.shinsei.items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public final class ShinseiIngots {

	//Item Variables
		//Ingots
		public static Item itemAluminumIngot;
		public static Item itemAntimonyIngot;
		public static Item itemCopperIngot;

//Item Initialization
	public static void init(){
		
	//Item Initialzation
		//Ingots
		itemAluminumIngot = new ShinseiItem().setUnlocalizedName("aluminum_ingot");
		GameRegistry.registerItem(itemAluminumIngot, "aluminum_ingot");
		OreDictionary.registerOre("ingotAluminum", new ItemStack(itemAluminumIngot));
	
		itemAntimonyIngot = new ShinseiItem().setUnlocalizedName("antimony_ingot");
		GameRegistry.registerItem(itemAntimonyIngot, "antimony_ingot");
		OreDictionary.registerOre("ingotAntimony", new ItemStack(itemAntimonyIngot));

		itemCopperIngot = new ShinseiItem().setUnlocalizedName("copper_ingot");
		GameRegistry.registerItem(itemCopperIngot, "copper_ingot");
		OreDictionary.registerOre("ingotCopper", new ItemStack(itemCopperIngot));

	}
}
