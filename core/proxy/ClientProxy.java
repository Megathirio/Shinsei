package com.megathirio.shinsei.core.proxy;

import cpw.mods.fml.client.registry.ClientRegistry;
import com.megathirio.shinsei.blocks.ShinseiMachines;
import com.megathirio.shinsei.renderer.ItemRenderToolBench;
import com.megathirio.shinsei.renderer.RenderToolBench;
import com.megathirio.shinsei.tileentity.TileEntityToolBench;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;


public class ClientProxy extends CommonProxy {
	
	public void registerRenderThings(){
		
		//ToolBench
		TileEntitySpecialRenderer render = new RenderToolBench();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityToolBench.class, render);
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ShinseiMachines.blockToolBench), new ItemRenderToolBench(render, new TileEntityToolBench()));
	}
	
	public void registerTileEntitySpecialRenderer(){
		
	}

}
