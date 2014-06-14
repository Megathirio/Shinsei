package com.megathirio.shinsei.core.proxy;

import cpw.mods.fml.client.registry.ClientRegistry;

import com.megathirio.shinsei.blocks.ShinseiMachines;
import com.megathirio.shinsei.renderer.ItemRenderMachinePress;
import com.megathirio.shinsei.renderer.ItemRenderToolBench;
import com.megathirio.shinsei.renderer.RenderMachinePress;
import com.megathirio.shinsei.renderer.RenderToolBench;
import com.megathirio.shinsei.tileentity.TileEntityMachinePress;
import com.megathirio.shinsei.tileentity.TileEntityToolBench;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;


public class ClientProxy extends CommonProxy {
	
	public void registerRenderThings(){
		
		//Tool Bench
		TileEntitySpecialRenderer renderToolBench = new RenderToolBench();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityToolBench.class, renderToolBench);
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ShinseiMachines.blockToolBench), new ItemRenderToolBench(renderToolBench, new TileEntityToolBench()));

		//Machine Press
		TileEntitySpecialRenderer renderMachinePress = new RenderMachinePress();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityMachinePress.class, renderMachinePress);
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ShinseiMachines.blockMachinePress), new ItemRenderMachinePress(renderMachinePress, new TileEntityMachinePress()));

	}
	
	public void registerTileEntitySpecialRenderer(){
		
	}

}
