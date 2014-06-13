package com.megathirio.shinsei.crafting;

import java.util.Comparator;

import net.minecraft.item.crafting.IRecipe;

public class ToolBenchRecipeSorter implements Comparator {

	
	final ToolBenchCraftingManager toolBench;
	
	public ToolBenchRecipeSorter(ToolBenchCraftingManager toolBenchCraftingManager){
		
		this.toolBench = toolBenchCraftingManager; 
	}
	
	public int compareRecipes(IRecipe irecipe1, IRecipe irecipe2){
		return irecipe1 instanceof ToolBenchShapelessRecipes && irecipe2 instanceof ToolBenchShapedRecipes ? 1: (irecipe2 instanceof ToolBenchShapelessRecipes && irecipe1 instanceof ToolBenchShapedRecipes ? -1 : (irecipe2.getRecipeSize() < irecipe1.getRecipeSize() ? -1 : (irecipe2.getRecipeSize() > irecipe1.getRecipeSize() ? 1 : 0)));
	}
	
	@Override
	public int compare(Object o1, Object o2) {

		return this.compareRecipes((IRecipe)o1, (IRecipe)o2);
	}

}
