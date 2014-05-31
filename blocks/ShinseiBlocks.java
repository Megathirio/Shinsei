package shinsei.blocks;

import shinsei.items.ItemMarbleBlock;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public final class ShinseiBlocks {

	//Block Variables
	public static Block blockSiltstone;
	public static Block blockClaystone;
	public static Block blockLimestone;
	public static Block blockMarble;
	public static Block blockCopperOre;
	public static Block blockSilverOre;

	public static void init(){
	
	//Block Initialization
		
		//Ores Blocks
		blockCopperOre = new ShinseiOre(Material.rock).setBlockName("copper_ore");
		GameRegistry.registerBlock(blockCopperOre, "copper_ore");
		blockSilverOre = new ShinseiOre(Material.rock).setBlockName("silver_ore");
		GameRegistry.registerBlock(blockSilverOre, "silver_ore");

		//Mineral Blocks
		blockLimestone = new ShinseiOre(Material.rock).setBlockName("limestone");
		GameRegistry.registerBlock(blockLimestone, "limestone");
		blockClaystone = new ShinseiOre(Material.rock).setBlockName("claystone").setResistance(2F);
		GameRegistry.registerBlock(blockClaystone, "claystone");

		//Building Blocks
		blockMarble = new BlockMarble().setBlockName("marble");
		GameRegistry.registerBlock(blockMarble, ItemMarbleBlock.class, "marble");

	}
}
