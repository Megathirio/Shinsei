package com.megathirio.shinsei.crafting;

import com.megathirio.shinsei.items.ShinseiDusts;
import com.megathirio.shinsei.items.ShinseiIngots;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ForgeFurnaceRecipes {

	public ForgeFurnaceRecipes(){
		
	}
	
	public static ItemStack getForgeResult(Item item, Item item2, Item item3){
		
		return getOutput(item, item2, item3);
	}
	
	public static ItemStack getOutput(Item item, Item item2, Item item3){
		//Recipe 1
		if(item == ShinseiIngots.itemAluminumIngot && item2 == ShinseiIngots.itemCopperIngot && item3 == ShinseiDusts.itemArsenicPowder || item2 == ShinseiIngots.itemAluminumIngot && item == ShinseiIngots.itemCopperIngot && item3 == ShinseiDusts.itemArsenicPowder){
			return new ItemStack(Items.gold_ingot, 2);
		}
		return null;
	}
}
