package com.megathirio.shinsei.core.gui;

import org.lwjgl.opengl.GL11;

import com.megathirio.shinsei.core.container.ContainerWoodFurnace;
import com.megathirio.shinsei.lib.References;
import com.megathirio.shinsei.tileentity.TileEntityWoodFurnace;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

public class GuiWoodFurnace extends GuiContainer{

	private ResourceLocation bground = new ResourceLocation(References.MODID + ":" + "textures/gui/containers/gui_wood_furnace.png");
	
	public TileEntityWoodFurnace woodFurnace;
	
	public GuiWoodFurnace(InventoryPlayer inventoryPlayer, TileEntityWoodFurnace teWoodFurnace) {
		super(new ContainerWoodFurnace(inventoryPlayer, teWoodFurnace));
		
		this.woodFurnace = teWoodFurnace;
		
		this.xSize = 176;
		this.ySize = 166;
	}

	public void drawGuiContainerForegroundLayer(int par1, int par2){

		String name = this.woodFurnace.hasCustomInventoryName() ? this.woodFurnace.getInventoryName() : I18n.format(this.woodFurnace.getInventoryName());
		this.fontRendererObj.drawString(name,  this.xSize / 2 - this.fontRendererObj.getStringWidth(name) / 2, 6, 4210752);
		this.fontRendererObj.drawString(I18n.format("container.inventory", new Object[0]), 8,this.ySize - 96 + 2, 4210752);
	}
	
	@Override
	protected void drawGuiContainerBackgroundLayer(float var1, int var2, int var3) {
		
		GL11.glColor4f(1f, 1f, 1f, 1f);
		Minecraft.getMinecraft().getTextureManager().bindTexture(bground);
		drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
		
		 if(this.woodFurnace.isBurning()){
		  	
			int k = this.woodFurnace.getBurnTimeRemainingScaled(32);
			drawTexturedModalRect(guiLeft + 38, guiTop + 48 - k, 176, 32 - k, 10, k + 2);
			
		}
		
		int k = this.woodFurnace.getCookProgressScaled(24);
		drawTexturedModalRect(guiLeft + 108, guiTop + 36, 186, 0, k + 1, 16);

	}

}
