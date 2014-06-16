package com.megathirio.shinsei.core.gui;

import org.lwjgl.opengl.GL11;

import com.megathirio.shinsei.core.container.ContainerToolBench;
import com.megathirio.shinsei.lib.References;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

public class GuiToolBench extends GuiContainer {

	private ResourceLocation texture = new ResourceLocation(References.MODID + ":" + "textures/gui/containers/gui_tool_bench.png");
	
	public GuiToolBench(InventoryPlayer invPlayer, World world, int x, int y, int z) {
		super(new ContainerToolBench(invPlayer, world, x, y, z));

		this.xSize = 176;
		this.ySize = 166;
		
	}


	public void onGuiClosed(){
		super.onGuiClosed();
	}

	protected void drawGuiContainerForegroundLayer(int i, int j){

		this.fontRendererObj.drawString(StatCollector.translateToLocal("Tool Bench"), 100, 6, 0x000000);
		
		
	}
	
	@Override
	protected void drawGuiContainerBackgroundLayer(float var1, int var2,
			int var3) {
		
		GL11.glColor4f(1F, 1F, 1F, 1F);
		
		Minecraft.getMinecraft().getTextureManager().bindTexture(texture);
		
		drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
	}
}
