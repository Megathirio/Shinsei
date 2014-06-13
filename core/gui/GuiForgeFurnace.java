package com.megathirio.shinsei.core.gui;

import org.lwjgl.opengl.GL11;

import com.megathirio.shinsei.core.container.ContainerForgeFurnace;
import com.megathirio.shinsei.lib.References;
import com.megathirio.shinsei.tileentity.TileEntityForgeFurnace;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.util.ResourceLocation;

public class GuiForgeFurnace extends GuiContainer{

	private ResourceLocation texture = new ResourceLocation(References.MODID + ":" + "textures/gui/containers/gui_forge_furnace.png");
	private TileEntityForgeFurnace forgeFurnace;
	
	public GuiForgeFurnace(InventoryPlayer invPlayer, TileEntityForgeFurnace teForgeFurnace) {
		
		super(new ContainerForgeFurnace(invPlayer, teForgeFurnace));
		forgeFurnace = teForgeFurnace;
		this.xSize = 176;
		this.ySize = 166;
		
	}

	protected void drawGuiContainerForegroundLayer(int i, int j){
	
		String name = this.forgeFurnace.hasCustomInventoryName() ? this.forgeFurnace.getInventoryName() : I18n.format(this.forgeFurnace.getInventoryName());
		this.fontRendererObj.drawString(name, this.xSize / 2 - fontRendererObj.getStringWidth(name) / 2, 6, 4210752);
		this.fontRendererObj.drawString(I18n.format("container.inventory"), 8, this.ySize - 96 + 3, 4210752);
	}
	
	@Override
	protected void drawGuiContainerBackgroundLayer(float var1, int var2,
			int var3) {
		
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		Minecraft.getMinecraft().getTextureManager().bindTexture(texture);
		drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
		
		//power bar
		
		//progress arrow
		
		
	}

}
