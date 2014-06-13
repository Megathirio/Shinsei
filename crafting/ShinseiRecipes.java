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
		
		//Shapeless
		GameRegistry.addShapelessRecipe(new ItemStack(ShinseiBlocks.blockLimestone), ShinseiItems.itemLimestoneShard, ShinseiItems.itemLimestoneShard);
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.clay), ShinseiItems.itemSilt, ShinseiItems.itemSilt, ShinseiItems.itemSilt, Blocks.dirt);

		//Shaped
			//Machines
			GameRegistry.addRecipe(new ItemStack(ShinseiMachines.blockWoodFurnaceIdle, 1), "@@@","@#@","$%$", '@', Blocks.stone, '#', Blocks.glass_pane, '$', Items.iron_ingot, '%', Blocks.iron_bars);
			GameRegistry.addRecipe(new ItemStack(ShinseiMachines.blockWoodFurnaceIdle, 1), "@@@","@#@","$%$", '@', ShinseiBlocks.blockLimestone, '#', Blocks.glass_pane, '$', Items.iron_ingot, '%', Blocks.iron_bars);
			GameRegistry.addRecipe(new ItemStack(ShinseiMachines.blockForgeFurnaceIdle, 1), "@@@","@#@","$$$", '@', Blocks.brick_block, '#', Blocks.iron_bars, '$', Items.iron_ingot);
			GameRegistry.addRecipe(new ItemStack(ShinseiMachines.blockToolBench, 1), "@@@","# #","# #", '@', Blocks.planks, '#', Items.stick);
			GameRegistry.addRecipe(new ItemStack(Blocks.furnace, 1), "@@@","@ @","@@@", '@', ShinseiBlocks.blockLimestone);
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.blockCopperBlock, 1), "@@@","@@@","@@@", '@', "ingotCopper"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiBlocks.blockAluminumBlock, 1), "@@@","@@@","@@@", '@', "ingotAluminum"));

		//Tool Parts
	
			//Axe Heads
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiTools.itemAluminumAxeHead, 1), "@@ ","   ","   ", '@', "ingotAluminum"));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ShinseiTools.itemCopperAxeHead, 1), "@@ ","   ","   ", '@', "ingotCopper"));
			GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemStoneAxeHead, 1), "@@ ","   ","   ", '@', ShinseiBlocks.blockLimestone);
	 		GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemStoneAxeHead, 1), "@@ ","   ","   ", '@', Blocks.cobblestone);
	  		GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemStoneAxeHead, 1), "@@ ","   ","   ", '@', Blocks.stone);
	 		GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemGoldAxeHead, 1), "@@ ","   ","   ", '@', Items.gold_ingot);
	 		GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemDiamondAxeHead, 1), "@@ ","   ","   ", '@', Items.diamond);
	 		GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemIronAxeHead, 1), "@@ ","   ","   ", '@', Items.iron_ingot);
	 		GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemWoodAxeHead, 1), "@@ ","   ","   ", '@', Blocks.planks);
		
	 		//Hoe Heads
//			GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemAluminumHoeHead, 1), " @ ","@  ","   ", '@', ShinseiIngots.itemAluminumIngot);
//			GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemCopperHoeHead, 1), " @ ","@  ","   ", '@', ShinseiIngots.itemCopperIngot);
	 		GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemStoneHoeHead, 1), " @ ","@  ","   ", '@', ShinseiBlocks.blockLimestone);
	 		GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemStoneHoeHead, 1), " @ ","@  ","   ", '@', Blocks.cobblestone);
	 		GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemStoneHoeHead, 1), " @ ","@  ","   ", '@', Blocks.stone);
	 		GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemGoldHoeHead, 1), " @ ","@  ","   ", '@', Items.gold_ingot);
	 		GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemDiamondHoeHead, 1), " @ ","@  ","   ", '@', Items.diamond);
	 		GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemIronHoeHead, 1), " @ ","@  ","   ", '@', Items.iron_ingot);
	 		GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemWoodHoeHead, 1), " @ ","@  ","   ", '@', Blocks.planks);
			
	 		//Pickaxe Heads
//			GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemAluminumPickaxeHead, 1), "@@@","   ","   ", '@', ShinseiIngots.itemAluminumIngot);
//			GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemCopperPickaxeHead, 1), "@@@","   ","   ", '@', ShinseiIngots.itemCopperIngot);
	 		GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemStonePickaxeHead, 1), "@@@","   ","   ", '@', ShinseiBlocks.blockLimestone);
	 		GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemStonePickaxeHead, 1), "@@@","   ","   ", '@', Blocks.cobblestone);
	 		GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemStonePickaxeHead, 1), "@@@","   ","   ", '@', Blocks.stone);
	  		GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemGoldPickaxeHead, 1), "@@@","   ","   ", '@', Items.gold_ingot);
	  		GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemDiamondPickaxeHead, 1), "@@@","   ","   ", '@', Items.diamond);
	  		GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemIronPickaxeHead, 1), "@@@","   ","   ", '@', Items.iron_ingot);
	 		GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemWoodPickaxeHead, 1), "@@@","   ","   ", '@', Blocks.planks);
			
	 		//Shovel Heads
//			GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemAluminumShovelHead, 1), " @ ","   ","   ", '@', ShinseiIngots.itemAluminumIngot);
//			GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemCopperShovelHead, 1), " @ ","   ","   ", '@', ShinseiIngots.itemCopperIngot);
	 		GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemStoneShovelHead, 1), " @ ","   ","   ", '@', ShinseiBlocks.blockLimestone);
	 		GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemStoneShovelHead, 1), " @ ","   ","   ", '@', Blocks.cobblestone);
	 		GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemStoneShovelHead, 1), " @ ","   ","   ", '@', Blocks.stone);
	 		GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemGoldShovelHead, 1), " @ ","   ","   ", '@', Items.gold_ingot);
	 		GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemDiamondShovelHead, 1), " @ ","   ","   ", '@', Items.diamond);
	 		GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemIronShovelHead, 1), " @ ","   ","   ", '@', Items.iron_ingot);
	 		GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemWoodShovelHead, 1), " @ ","   ","   ", '@', Blocks.planks);
	 		
	 		//Sword Blades
//			GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemAluminumSwordBlade, 1), " @ "," @ "," @ ", '@', ShinseiIngots.itemAluminumIngot);
//			GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemCopperSwordBlade, 1), " @ "," @ "," @ ", '@', ShinseiIngots.itemCopperIngot);
	 		GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemStoneSwordBlade, 1), " @ "," @ "," @ ", '@', ShinseiBlocks.blockLimestone);
	 		GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemStoneSwordBlade, 1), " @ "," @ "," @ ", '@', Blocks.cobblestone);
	 		GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemStoneSwordBlade, 1), " @ "," @ "," @ ", '@', Blocks.stone);
	 		GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemGoldSwordBlade, 1), " @ "," @ "," @ ", '@', Items.gold_ingot);
	 		GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemDiamondSwordBlade, 1), " @ "," @ "," @ ", '@', Items.diamond);
	 		GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemIronSwordBlade, 1), " @ "," @ "," @ ", '@', Items.iron_ingot);
	 		GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemWoodSwordBlade, 1), " @ "," @ "," @ ", '@', Blocks.planks);

			
			// Smelting
			GameRegistry.addSmelting(ShinseiBlocks.blockLimestone, new ItemStack(ShinseiBlocks.blockMarble), 1f);
			GameRegistry.addSmelting(ShinseiBlocks.blockCopperOre, new ItemStack(ShinseiIngots.itemCopperIngot), 1f);
			GameRegistry.addSmelting(ShinseiBlocks.blockBauxiteOre, new ItemStack(ShinseiIngots.itemAluminumIngot), 1f);

	}

}
