package shinsei.core.handler;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import shinsei.blocks.ShinseiBlocks;
import shinsei.items.ShinseiItems;
import shinsei.items.ShinseiTools;
import cpw.mods.fml.common.registry.GameRegistry;

public class ShinseiRecipes {
	
	public static void init(){
		
		// Shapeless
		GameRegistry.addShapelessRecipe(new ItemStack(ShinseiBlocks.blockLimestone), ShinseiItems.itemLimestoneShard, ShinseiItems.itemLimestoneShard);
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.clay), ShinseiItems.itemSilt, ShinseiItems.itemSilt, ShinseiItems.itemSilt, Blocks.dirt);

		// Shaped
		GameRegistry.addRecipe(new ItemStack(Blocks.furnace, 1), "xxx","x x","xxx", 'x', ShinseiBlocks.blockLimestone);
		GameRegistry.addRecipe(new ItemStack(ShinseiBlocks.blockCopperBlock, 1), "xxx","xxx","xxx", 'x', ShinseiItems.itemCopperIngot);
		GameRegistry.addRecipe(new ItemStack(ShinseiBlocks.blockAluminumBlock, 1), "xxx","xxx","xxx", 'x', ShinseiItems.itemAluminumIngot);
 		//GameRegistry.addRecipe(new ItemStack(ShinseiItems.itemSplitWood, 2), "xy", 'x', Blocks.log, "y", Items.iron_axe);

		//Tool Parts
		GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemWoodToolHandle, 1), "x  ","x  ","   ", 'x', Items.stick);
	
			//Axe Heads
			GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemAluminumAxeHead, 1), "xx ","   ","   ", 'x', ShinseiItems.itemAluminumIngot);
			GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemCopperAxeHead, 1), "xx ","   ","   ", 'x', ShinseiItems.itemCopperIngot);
	 		GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemStoneAxeHead, 1), "xx ","   ","   ", 'x', ShinseiBlocks.blockLimestone);
	 		GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemStoneAxeHead, 1), "xx ","   ","   ", 'x', Blocks.cobblestone);
	  		GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemStoneAxeHead, 1), "xx ","   ","   ", 'x', Blocks.stone);
	 		GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemGoldAxeHead, 1), "xx ","   ","   ", 'x', Items.gold_ingot);
	 		GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemDiamondAxeHead, 1), "xx ","   ","   ", 'x', Items.diamond);
	 		GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemIronAxeHead, 1), "xx ","   ","   ", 'x', Items.iron_ingot);
	 		GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemWoodAxeHead, 1), "xx ","   ","   ", 'x', Blocks.planks);
		
	 		//Hoe Heads
			GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemAluminumHoeHead, 1), " x ","x  ","   ", 'x', ShinseiItems.itemAluminumIngot);
			GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemCopperHoeHead, 1), " x ","x  ","   ", 'x', ShinseiItems.itemCopperIngot);
	 		GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemStoneHoeHead, 1), " x ","x  ","   ", 'x', ShinseiBlocks.blockLimestone);
	 		GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemStoneHoeHead, 1), " x ","x  ","   ", 'x', Blocks.cobblestone);
	 		GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemStoneHoeHead, 1), " x ","x  ","   ", 'x', Blocks.stone);
	 		GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemGoldHoeHead, 1), " x ","x  ","   ", 'x', Items.gold_ingot);
	 		GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemDiamondHoeHead, 1), " x ","x  ","   ", 'x', Items.diamond);
	 		GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemIronHoeHead, 1), " x ","x  ","   ", 'x', Items.iron_ingot);
	 		GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemWoodHoeHead, 1), " x ","x  ","   ", 'x', Blocks.planks);
			
	 		//Pickaxe Heads
			GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemAluminumPickaxeHead, 1), "xxx","   ","   ", 'x', ShinseiItems.itemAluminumIngot);
			GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemCopperPickaxeHead, 1), "xxx","   ","   ", 'x', ShinseiItems.itemCopperIngot);
	 		GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemStonePickaxeHead, 1), "xxx","   ","   ", 'x', ShinseiBlocks.blockLimestone);
	 		GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemStonePickaxeHead, 1), "xxx","   ","   ", 'x', Blocks.cobblestone);
	 		GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemStonePickaxeHead, 1), "xxx","   ","   ", 'x', Blocks.stone);
	  		GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemGoldPickaxeHead, 1), "xxx","   ","   ", 'x', Items.gold_ingot);
	  		GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemDiamondPickaxeHead, 1), "xxx","   ","   ", 'x', Items.diamond);
	  		GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemIronPickaxeHead, 1), "xxx","   ","   ", 'x', Items.iron_ingot);
	 		GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemWoodPickaxeHead, 1), "xxx","   ","   ", 'x', Blocks.planks);
			
	 		//Shovel Heads
			GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemAluminumShovelHead, 1), " x ","   ","   ", 'x', ShinseiItems.itemAluminumIngot);
			GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemCopperShovelHead, 1), " x ","   ","   ", 'x', ShinseiItems.itemCopperIngot);
	 		GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemStoneShovelHead, 1), " x ","   ","   ", 'x', ShinseiBlocks.blockLimestone);
	 		GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemStoneShovelHead, 1), " x ","   ","   ", 'x', Blocks.cobblestone);
	 		GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemStoneShovelHead, 1), " x ","   ","   ", 'x', Blocks.stone);
	 		GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemGoldShovelHead, 1), " x ","   ","   ", 'x', Items.gold_ingot);
	 		GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemDiamondShovelHead, 1), " x ","   ","   ", 'x', Items.diamond);
	 		GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemIronShovelHead, 1), " x ","   ","   ", 'x', Items.iron_ingot);
	 		GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemWoodShovelHead, 1), " x ","   ","   ", 'x', Blocks.planks);
	 		
	 		//Sword Blades
			GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemAluminumSwordBlade, 1), " x "," x "," x ", 'x', ShinseiItems.itemAluminumIngot);
			GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemCopperSwordBlade, 1), " x "," x "," x ", 'x', ShinseiItems.itemCopperIngot);
	 		GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemStoneSwordBlade, 1), " x "," x "," x ", 'x', ShinseiBlocks.blockLimestone);
	 		GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemStoneSwordBlade, 1), " x "," x "," x ", 'x', Blocks.cobblestone);
	 		GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemStoneSwordBlade, 1), " x "," x "," x ", 'x', Blocks.stone);
	 		GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemGoldSwordBlade, 1), " x "," x "," x ", 'x', Items.gold_ingot);
	 		GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemDiamondSwordBlade, 1), " x "," x "," x ", 'x', Items.diamond);
	 		GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemIronSwordBlade, 1), " x "," x "," x ", 'x', Items.iron_ingot);
	 		GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemWoodSwordBlade, 1), " x "," x "," x ", 'x', Blocks.planks);

		//Tools
			//Axes
			GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemAluminumAxe, 1), "x  ","y  ","   ", 'x', ShinseiTools.itemAluminumAxeHead, 'y', ShinseiTools.itemWoodToolHandle);
			GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemCopperAxe, 1), "x  ","y  ","   ", 'x', ShinseiTools.itemCopperAxeHead, 'y', ShinseiTools.itemWoodToolHandle);
	 		GameRegistry.addRecipe(new ItemStack(Items.stone_axe, 1), "x  ","y  ","   ", 'x', ShinseiTools.itemStoneAxeHead, 'y', ShinseiTools.itemWoodToolHandle);
	 		GameRegistry.addRecipe(new ItemStack(Items.golden_axe, 1), "x  ","y  ","   ", 'x', ShinseiTools.itemGoldAxeHead, 'y', ShinseiTools.itemWoodToolHandle);
	 		GameRegistry.addRecipe(new ItemStack(Items.diamond_axe, 1), "x  ","y  ","   ", 'x', ShinseiTools.itemDiamondAxeHead, 'y', ShinseiTools.itemWoodToolHandle);
	 		GameRegistry.addRecipe(new ItemStack(Items.iron_axe, 1), "x  ","y  ","   ", 'x', ShinseiTools.itemIronAxeHead, 'y', ShinseiTools.itemWoodToolHandle);
	 		GameRegistry.addRecipe(new ItemStack(Items.wooden_axe, 1), "x  ","y  ","   ", 'x', ShinseiTools.itemWoodAxeHead, 'y', ShinseiTools.itemWoodToolHandle);
	
	 		//Hoes
			GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemAluminumHoe, 1), "x  ","y  ","   ", 'x', ShinseiTools.itemAluminumHoeHead, 'y', ShinseiTools.itemWoodToolHandle);
			GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemCopperHoe, 1), "x  ","y  ","   ", 'x', ShinseiTools.itemCopperHoeHead, 'y', ShinseiTools.itemWoodToolHandle);
	 		GameRegistry.addRecipe(new ItemStack(Items.stone_hoe, 1), "x  ","y  ","   ", 'x', ShinseiTools.itemStoneHoeHead, 'y', ShinseiTools.itemWoodToolHandle);
	 		GameRegistry.addRecipe(new ItemStack(Items.golden_hoe, 1), "x  ","y  ","   ", 'x', ShinseiTools.itemGoldHoeHead, 'y', ShinseiTools.itemWoodToolHandle);
	 		GameRegistry.addRecipe(new ItemStack(Items.diamond_hoe, 1), "x  ","y  ","   ", 'x', ShinseiTools.itemDiamondHoeHead, 'y', ShinseiTools.itemWoodToolHandle);
	 		GameRegistry.addRecipe(new ItemStack(Items.iron_hoe, 1), "x  ","y  ","   ", 'x', ShinseiTools.itemIronHoeHead, 'y', ShinseiTools.itemWoodToolHandle);
	 		GameRegistry.addRecipe(new ItemStack(Items.wooden_hoe, 1), "x  ","y  ","   ", 'x', ShinseiTools.itemWoodHoeHead, 'y', ShinseiTools.itemWoodToolHandle);

	 		//Pickaxes
			GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemAluminumPickaxe, 1), "x  ","y  ","   ", 'x', ShinseiTools.itemAluminumPickaxeHead, 'y', ShinseiTools.itemWoodToolHandle);
			GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemCopperPickaxe, 1), "x  ","y  ","   ", 'x', ShinseiTools.itemCopperPickaxeHead, 'y', ShinseiTools.itemWoodToolHandle);
			GameRegistry.addRecipe(new ItemStack(Items.stone_pickaxe, 1), "x  ","y  ","   ", 'x', ShinseiTools.itemStonePickaxeHead, 'y', ShinseiTools.itemWoodToolHandle);
	 		GameRegistry.addRecipe(new ItemStack(Items.golden_pickaxe, 1), "x  ","y  ","   ", 'x', ShinseiTools.itemGoldPickaxeHead, 'y', ShinseiTools.itemWoodToolHandle);
	 		GameRegistry.addRecipe(new ItemStack(Items.diamond_pickaxe, 1), "x  ","y  ","   ", 'x', ShinseiTools.itemDiamondPickaxeHead, 'y', ShinseiTools.itemWoodToolHandle);
	 		GameRegistry.addRecipe(new ItemStack(Items.iron_pickaxe, 1), "x  ","y  ","   ", 'x', ShinseiTools.itemIronPickaxeHead, 'y', ShinseiTools.itemWoodToolHandle);
	 		GameRegistry.addRecipe(new ItemStack(Items.wooden_pickaxe, 1), "x  ","y  ","   ", 'x', ShinseiTools.itemWoodPickaxeHead, 'y', ShinseiTools.itemWoodToolHandle);

			//Shovels
			GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemAluminumShovel, 1), "x  ","y  ","   ", 'x', ShinseiTools.itemAluminumShovelHead, 'y', ShinseiTools.itemWoodToolHandle);
			GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemCopperShovel, 1), "x  ","y  ","   ", 'x', ShinseiTools.itemCopperShovelHead, 'y', ShinseiTools.itemWoodToolHandle);
	 		GameRegistry.addRecipe(new ItemStack(Items.stone_shovel, 1), "x  ","y  ","   ", 'x', ShinseiTools.itemStoneShovelHead, 'y', ShinseiTools.itemWoodToolHandle);
	 		GameRegistry.addRecipe(new ItemStack(Items.golden_shovel, 1), "x  ","y  ","   ", 'x', ShinseiTools.itemGoldShovelHead, 'y', ShinseiTools.itemWoodToolHandle);
	 		GameRegistry.addRecipe(new ItemStack(Items.diamond_shovel, 1), "x  ","y  ","   ", 'x', ShinseiTools.itemDiamondShovelHead, 'y', ShinseiTools.itemWoodToolHandle);
	 		GameRegistry.addRecipe(new ItemStack(Items.iron_shovel, 1), "x  ","y  ","   ", 'x', ShinseiTools.itemIronShovelHead, 'y', ShinseiTools.itemWoodToolHandle);
	 		GameRegistry.addRecipe(new ItemStack(Items.wooden_shovel, 1), "x  ","y  ","   ", 'x', ShinseiTools.itemWoodShovelHead, 'y', ShinseiTools.itemWoodToolHandle);

			//Swords
			GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemAluminumSword, 1), "x  ","y  ","   ", 'x', ShinseiTools.itemAluminumSwordBlade, 'y', ShinseiTools.itemWoodToolHandle);
			GameRegistry.addRecipe(new ItemStack(ShinseiTools.itemCopperSword, 1), "x  ","y  ","   ", 'x', ShinseiTools.itemCopperSwordBlade, 'y', ShinseiTools.itemWoodToolHandle);
	 		GameRegistry.addRecipe(new ItemStack(Items.stone_sword, 1), "x  ","y  ","   ", 'x', ShinseiTools.itemStoneSwordBlade, 'y', ShinseiTools.itemWoodToolHandle);
	 		GameRegistry.addRecipe(new ItemStack(Items.golden_sword, 1), "x  ","y  ","   ", 'x', ShinseiTools.itemGoldSwordBlade, 'y', ShinseiTools.itemWoodToolHandle);
	 		GameRegistry.addRecipe(new ItemStack(Items.diamond_sword, 1), "x  ","y  ","   ", 'x', ShinseiTools.itemDiamondSwordBlade, 'y', ShinseiTools.itemWoodToolHandle);
	 		GameRegistry.addRecipe(new ItemStack(Items.iron_sword, 1), "x  ","y  ","   ", 'x', ShinseiTools.itemIronSwordBlade, 'y', ShinseiTools.itemWoodToolHandle);
	 		GameRegistry.addRecipe(new ItemStack(Items.wooden_sword, 1), "x  ","y  ","   ", 'x', ShinseiTools.itemWoodSwordBlade, 'y', ShinseiTools.itemWoodToolHandle);
			
			// Smelting
			GameRegistry.addSmelting(ShinseiBlocks.blockLimestone, new ItemStack(ShinseiBlocks.blockMarble), 1f);
			GameRegistry.addSmelting(ShinseiBlocks.blockCopperOre, new ItemStack(ShinseiItems.itemCopperIngot), 1f);
			GameRegistry.addSmelting(ShinseiBlocks.blockAluminumOre, new ItemStack(ShinseiItems.itemAluminumIngot), 1f);

	}

}
