package shinsei.core.gui;

import org.lwjgl.opengl.GL11;

import shinsei.core.container.ContainerWoodFurnace;
import shinsei.lib.References;
import shinsei.tileentity.TileEntityWoodFurnace;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

public class GuiWoodFurnace extends GuiContainer{

	public static final ResourceLocation bground = new ResourceLocation(References.MODID + ":" + "textures/gui/GuiWoodFurnace.png");
	
	public TileEntityWoodFurnace woodFurnace;
	
	public GuiWoodFurnace(InventoryPlayer inventoryPlayer, TileEntityWoodFurnace entity) {
		super(new ContainerWoodFurnace(inventoryPlayer, entity));
		
		this.woodFurnace = entity;
		
		this.xSize = 176;
		this.ySize = 166;
	}

	public void drawGuiContainerForegroundLayer(int par1, int par2){
		String name = "Split Wood Furnace";
	
		this.fontRendererObj.drawString(name,  this.xSize / 2 - this.fontRendererObj.getStringWidth(name) / 2, 6, 4210752);
		this.fontRendererObj.drawString(I18n.format("container.inventory", new Object[0]), 8,this.ySize - 96 + 2, 4210752);
	}
	
	@Override
	protected void drawGuiContainerBackgroundLayer(float var1, int var2, int var3) {
		
		GL11.glColor4f(1f, 1f, 1f, 1f);
		Minecraft.getMinecraft().getTextureManager().bindTexture(bground);
		drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
		
		if(this.woodFurnace.isBurning()){
			
			int k = this.woodFurnace.getBurnTimeRemainingScaled(40);
			int j = 40 - k;
			drawTexturedModalRect(guiLeft + 53, guiTop + 56, 176, 0, 40 - j, 10);
			
		}
		
		int k = this.woodFurnace.getCookProgressScaled(24);
		drawTexturedModalRect(guiLeft + 79, guiTop + 34, 176, 10, k + 1, 16);

	}

}
