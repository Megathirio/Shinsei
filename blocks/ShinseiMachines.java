package shinsei.blocks;

import shinsei.tileentity.TileEntityWoodFurnace;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public final class ShinseiMachines {
	
//Block Variables
	//Furnaces
	public static Block blockWoodFurnaceIdle;
	public static Block blockWoodFurnaceActi;
	public static final int guiIDWoodFurnace = 0;

	public static void init(){
	
	//Block Initialization
		//Furnaces
		blockWoodFurnaceIdle = new WoodFurnace(false).setBlockName("iwood_furnace");
		GameRegistry.registerBlock(blockWoodFurnaceIdle, "iwood_furnace");
		blockWoodFurnaceActi = new WoodFurnace(true).setBlockName("awood_furnace").setLightLevel(.0625F);
		GameRegistry.registerBlock(blockWoodFurnaceActi, "awood_furnace").setCreativeTab(null);
		GameRegistry.registerTileEntity(TileEntityWoodFurnace.class, "WoodFurnace");
	}
}
