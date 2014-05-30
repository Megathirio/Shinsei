package shinsei.blocks;

import shinsei.items.ItemMarbleBlock;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public final class ShinseiBlocks {

	//Block Variables
	public static Block blockCalciteOre;
	public static Block blockLimestone;
	public static Block blockMarble;
	public static Block blockCopperOre;
	public static Block blockSilverOre;

	public static void init(){
	
	//Block Initialization
		
		//Ores
		blockCalciteOre = new ShinseiOre(Material.rock).setBlockName("calcite_ore");
		GameRegistry.registerBlock(blockCalciteOre, "calcite_ore");
		blockCopperOre = new ShinseiOre(Material.rock).setBlockName("copper_ore");
		GameRegistry.registerBlock(blockCopperOre, "copper_ore");
		blockSilverOre = new ShinseiOre(Material.rock).setBlockName("silver_ore");
		GameRegistry.registerBlock(blockSilverOre, "silver_ore");
		blockLimestone = new ShinseiOre(Material.rock).setBlockName("limestone");
		GameRegistry.registerBlock(blockLimestone, "limestone");
		
		//Building Blocks
		blockMarble = new BlockMarble().setBlockName("marble");
		GameRegistry.registerBlock(blockMarble, ItemMarbleBlock.class, "marble");

	}
}
