package com.megathirio.shinsei.crafting;

import java.util.List;
import java.util.Iterator;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;

public class RecipeOverride {
	
	public static void overrideRecipe(){
		List<IRecipe> recipes = CraftingManager.getInstance().getRecipeList();
		
		Iterator<IRecipe> override = recipes.iterator();
		
			while(override.hasNext()){
				ItemStack itemstack = override.next().getRecipeOutput();
				if(itemstack != null){
					if(itemstack.getItem() == Items.iron_axe)override.remove();
					if(itemstack.getItem() == Items.iron_hoe)override.remove();
					if(itemstack.getItem() == Items.iron_pickaxe)override.remove();
					if(itemstack.getItem() == Items.iron_shovel){override.remove();
					if(itemstack.getItem() == Items.iron_sword)override.remove();
					if(itemstack.getItem() == Item.getItemFromBlock(Blocks.furnace))override.remove();
				}
				}
			}
	}

}
