package com.megathirio.shinsei.creativetab;

import com.megathirio.shinsei.blocks.ShinseiBlocks;
import com.megathirio.shinsei.blocks.ShinseiMachines;
import com.megathirio.shinsei.items.ShinseiIngots;
import com.megathirio.shinsei.items.ShinseiTools;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public final class ShinseiTabs {

//Tabs Variables
	public static CreativeTabs blocksTab;
	public static CreativeTabs itemsTab;
	public static CreativeTabs toolsTab;
	public static CreativeTabs machinesTab;
	
	
//Tabs Initialization
	public static void init(){

		blocksTab = new CreativeTabs("shinseiBlocks"){
			@SideOnly(Side.CLIENT)
			public Item getTabIconItem(){
				return Item.getItemFromBlock(ShinseiBlocks.blockBauxiteOre) ;
			}
		};

		itemsTab = new CreativeTabs("shinseiItems"){
			@SideOnly(Side.CLIENT)
			public Item getTabIconItem(){
				return ShinseiIngots.itemAluminumIngot;
			}
		};

		toolsTab = new CreativeTabs("shinseiTools"){
			@SideOnly(Side.CLIENT)
			public Item getTabIconItem(){
				return ShinseiTools.itemAluminumPickaxe;
			}
		};

		machinesTab = new CreativeTabs("shinseiMachines"){
			@SideOnly(Side.CLIENT)
			public Item getTabIconItem(){
				return Item.getItemFromBlock(ShinseiMachines.blockToolBench);
			}
		};
}
}
