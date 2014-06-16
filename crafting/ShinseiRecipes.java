package com.megathirio.shinsei.crafting;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;

import com.megathirio.shinsei.blocks.ShinseiBlocks;
import com.megathirio.shinsei.blocks.ShinseiMachines;
import com.megathirio.shinsei.items.ShinseiIngots;
import com.megathirio.shinsei.items.ShinseiItems;
import com.megathirio.shinsei.items.ShinseiTools;

import cpw.mods.fml.common.registry.GameRegistry;

public class ShinseiRecipes {
	
	public static void init(){

		//Override Recipes
		RecipeOverride.overrideRecipe();
		
		//Shapeless
			GameRegistry.addShapelessRecipe(new ItemStack(ShinseiBlocks.blockLimestone), ShinseiItems.itemLimestoneShard, ShinseiItems.itemLimestoneShard);
			GameRegistry.addShapelessRecipe(new ItemStack(Blocks.clay), ShinseiItems.itemSilt, ShinseiItems.itemSilt, ShinseiItems.itemSilt, Blocks.dirt);
			GameRegistry.addShapelessRecipe(new ItemStack(ShinseiIngots.itemCopperIngot, 9), ShinseiBlocks.blockCopperBlock);
			GameRegistry.addShapelessRecipe(new ItemStack(ShinseiIngots.itemAluminumIngot, 9), ShinseiBlocks.blockAluminumBlock);

		//Shaped
			//Machines
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.furnace, 1), "@@@","@ @","@@@", '@', "blockStone"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiMachines.blockWoodFurnaceIdle, 1), "@@@","@#@","$%$", '@', "blockStone", '#', Blocks.glass_pane, '$', "ingotIron", '%', Blocks.iron_bars));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiMachines.blockForgeFurnaceIdle, 1), "@@@","@#@","$$$", '@', Blocks.brick_block, '#', Blocks.iron_bars, '$', "ingotIron"));
			GameRegistry.addRecipe(new ItemStack(ShinseiMachines.blockToolBench, 1), "@@@","# #","# #", '@', Blocks.planks, '#', Items.stick);
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiMachines.blockMachinePress, 1), " @ ","@@@","@ @", '@', "ingotIron"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.blockCopperBlock, 1), "@@@","@@@","@@@", '@', "ingotCopper"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.blockAluminumBlock, 1), "@@@","@@@","@@@", '@', "ingotAluminum"));

			//Tools Parts
				//Axe Heads
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiTools.itemStoneAxeHead, 1), "@@ ","@  ","   ", '@', "blockStone"));
				GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemStoneAxeHead, 1), "@@ ","@  ","   ", '@', Blocks.cobblestone);
				GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemWoodAxeHead, 1), "@@ ","@  ","   ", '@', Blocks.planks);

				//Hoe Heads
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiTools.itemStoneHoeHead, 1), " @ ","@  ","   ", '@', "blockStone"));
				GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemStoneHoeHead, 1), " @ ","@  ","   ", '@', Blocks.cobblestone);
				GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemWoodHoeHead, 1), " @ ","@  ","   ", '@', Blocks.planks);
				
				//Pickaxe Heads
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiTools.itemStonePickaxeHead, 1), " @ ","@ @","   ", '@', "blockStone"));
				GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemStonePickaxeHead, 1), " @ ","@ @","   ", '@', Blocks.cobblestone);
				GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemWoodPickaxeHead, 1), " @ ","@ @","   ", '@', Blocks.planks);
				
				//Shovel Heads
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiTools.itemStoneShovelHead, 1), " @ ","   ","   ", '@', "blockStone"));
				GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemStoneShovelHead, 1), " @ ","   ","   ", '@', Blocks.cobblestone);
				GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemWoodShovelHead, 1), " @ ","   ","   ", '@', Blocks.planks);
				
				//Sword Blades
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiTools.itemStoneSwordBlade, 1), " @ "," @ "," @ ", '@', "blockStone"));
				GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemStoneSwordBlade, 1), " @ "," @ "," @ ", '@', Blocks.cobblestone);
				GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemWoodSwordBlade, 1), " @ "," @ "," @ ", '@', Blocks.planks);
			
		// Smelting
			GameRegistry.addSmelting(ShinseiBlocks.blockLimestone, new ItemStack(ShinseiBlocks.blockMarble), 1f);
			GameRegistry.addSmelting(ShinseiBlocks.blockCopperOre, new ItemStack(ShinseiIngots.itemCopperIngot), 1f);
			GameRegistry.addSmelting(ShinseiBlocks.blockStibniteOre, new ItemStack(ShinseiIngots.itemAntimonyIngot), 1f);
			
	}

}
