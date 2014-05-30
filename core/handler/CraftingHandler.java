package shinsei.core.handler;

import cpw.mods.fml.common.registry.GameRegistry;
import shinsei.blocks.ShinseiBlocks;
import shinsei.items.ShinseiItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class CraftingHandler {
	
	public static void init(){
		
		registerRecipes();
	}
	
	public static void registerRecipes(){
		
		// Shapeless
		GameRegistry.addShapelessRecipe(new ItemStack(ShinseiBlocks.blockLimestone), ShinseiItems.itemLimestoneShard, ShinseiItems.itemLimestoneShard);
		GameRegistry.addShapelessRecipe(new ItemStack(ShinseiBlocks.blockLimestone), ShinseiItems.itemLimestoneShard, ShinseiItems.itemCalciteShard, ShinseiItems.itemCalciteShard);
		GameRegistry.addShapelessRecipe(new ItemStack(ShinseiBlocks.blockLimestone), ShinseiItems.itemCalciteShard, ShinseiItems.itemCalciteShard, ShinseiItems.itemCalciteShard, ShinseiItems.itemCalciteShard);

		// Shaped
		GameRegistry.addRecipe(new ItemStack(Blocks.furnace, 1), "xxx","x x","xxx", 'x', ShinseiBlocks.blockLimestone);
		GameRegistry.addRecipe(new ItemStack(ShinseiItems.itemStonePickaxeHead, 1), "xx ","   ","   ", 'x', ShinseiBlocks.blockLimestone);
		GameRegistry.addRecipe(new ItemStack(ShinseiItems.itemStonePickaxeHead, 1), "xx ","   ","   ", 'x', Blocks.cobblestone);
		GameRegistry.addRecipe(new ItemStack(Items.stone_pickaxe, 1), "x  ","y  ","   ", 'x', ShinseiItems.itemStonePickaxeHead, 'y', Items.stick);
		GameRegistry.addRecipe(new ItemStack(ShinseiItems.itemCopperPickaxe, 1), "x  ","y  ","   ", 'x', ShinseiItems.itemCopperPickaxeHead, 'y', Items.stick);
		GameRegistry.addRecipe(new ItemStack(ShinseiItems.itemCopperPickaxeHead, 1), "xx ","   ","   ", 'x', ShinseiItems.itemCopperIngot);
		
		// Smelting
		GameRegistry.addSmelting(ShinseiBlocks.blockLimestone, new ItemStack(ShinseiBlocks.blockMarble), 1f);
		GameRegistry.addSmelting(ShinseiItems.itemCopperIngot, new ItemStack(ShinseiBlocks.blockCopperOre), 1f);
	}

}
