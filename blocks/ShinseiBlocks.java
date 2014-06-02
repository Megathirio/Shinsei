package shinsei.blocks;

import shinsei.items.ItemMarbleBlock;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public final class ShinseiBlocks {

//Block Variables
	//Mineral Blocks
	public static Block blockClaystone;
	public static Block blockLimestone;
	public static Block blockSiltstone;
	
	//Ore Blocks
	public static Block blockCopperOre;
	public static Block blockAluminumOre;

	//Building Blocks
	public static Block blockMarble;
	
	public static void init(){
	
	//Block Initialization
		
		//Mineral Blocks
		blockClaystone = new ShinseiOre(Material.rock).setBlockName("claystone").setResistance(2F).setHardness(0.5F);
		blockClaystone.setHarvestLevel("shovel", 0);
		GameRegistry.registerBlock(blockClaystone, "claystone");		 
		blockLimestone = new ShinseiOre(Material.rock).setBlockName("limestone");
		GameRegistry.registerBlock(blockLimestone, "limestone");
		blockSiltstone = new ShinseiOre(Material.rock).setBlockName("siltstone").setResistance(2F).setHardness(0.5F);
		blockSiltstone.setHarvestLevel("shovel", 0);
		GameRegistry.registerBlock(blockSiltstone, "siltstone");		 


		//Ore Blocks
		blockCopperOre = new ShinseiOre(Material.rock).setBlockName("copper_ore");
		GameRegistry.registerBlock(blockCopperOre, "copper_ore");
		blockAluminumOre = new ShinseiOre(Material.rock).setBlockName("aluminum_ore");
		GameRegistry.registerBlock(blockAluminumOre, "silver_ore");
		
		//Building Blocks
		blockMarble = new BlockMarble().setBlockName("marble");
		GameRegistry.registerBlock(blockMarble, ItemMarbleBlock.class, "marble");

	}
}
