package shinsei.blocks;

import shinsei.items.ItemMarbleBlock;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public final class ShinseiMachines {

//Block Variables
	//Furnaces
	public static Block blockWoodFurnaceIdle;
	public static Block blockWoodFurnaceActive;

	public static void init(){
	
	//Block Initialization
		//Furnaces
		blockWoodFurnaceIdle = new ShinseiFurnace(false).setBlockName("iwood_furnace");
		GameRegistry.registerBlock(blockWoodFurnaceIdle, "iwood_furnace").setCreativeTab(null);
		blockWoodFurnaceActive = new ShinseiFurnace(true).setBlockName("awood_furnace").setLightLevel(.0625F);
		GameRegistry.registerBlock(blockWoodFurnaceActive, "awood_furnace");

	}
}
