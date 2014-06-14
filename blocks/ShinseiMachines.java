package com.megathirio.shinsei.blocks;

import com.megathirio.shinsei.tileentity.TileEntityForgeFurnace;
import com.megathirio.shinsei.tileentity.TileEntityWoodFurnace;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public final class ShinseiMachines {
	
//Block Variables
	//Furnaces
	public static Block blockWoodFurnaceIdle;
	public static Block blockWoodFurnaceActi;
	public static final int guiIDWoodFurnace = 0;
	public static Block blockForgeFurnaceIdle;
	public static Block blockForgeFurnaceActi;
	public static final int guiIDForgeFurnace = 1;

	//Work Stations
	public static Block blockToolBench;
	public static final int guiIDToolBench = 2;
	public static Block blockMachinePress;
	public static final int guiIDMachinePress = 3;
	
	public static void init(){
	
	//Block Initialization
		//Furnaces
		blockWoodFurnaceIdle = new WoodFurnace(false).setBlockName("iwood_furnace").setHardness(3.5F);
		GameRegistry.registerBlock(blockWoodFurnaceIdle, "iwood_furnace");
		blockWoodFurnaceActi = new WoodFurnace(true).setBlockName("awood_furnace").setLightLevel(0.875F).setHardness(3.5F).setCreativeTab(null);
		GameRegistry.registerBlock(blockWoodFurnaceActi, "awood_furnace");
		GameRegistry.registerTileEntity(TileEntityWoodFurnace.class, "WoodFurnace");

		blockForgeFurnaceIdle = new ForgeFurnace(false).setBlockName("iforge_furnace").setHardness(3.5F);
		GameRegistry.registerBlock(blockForgeFurnaceIdle, "iforge_furnace");
		blockForgeFurnaceActi = new ForgeFurnace(true).setBlockName("aforge_furnace").setLightLevel(0.875F).setHardness(3.5F).setCreativeTab(null);
		GameRegistry.registerBlock(blockForgeFurnaceActi, "aforge_furnace");
		GameRegistry.registerTileEntity(TileEntityForgeFurnace.class, "ForgeFurnace");

		//Work Stations
		blockToolBench = new ToolBench(Material.wood).setBlockName("tool_bench").setBlockTextureName("");
		GameRegistry.registerBlock(blockToolBench, "tool_bench");

		blockMachinePress = new MachinePress(Material.iron).setBlockName("machine_press").setBlockTextureName("");
		GameRegistry.registerBlock(blockMachinePress, "machine_press");

	}
}
