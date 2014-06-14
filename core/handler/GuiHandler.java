package com.megathirio.shinsei.core.handler;

import com.megathirio.shinsei.blocks.ShinseiMachines;
import com.megathirio.shinsei.core.container.ContainerForgeFurnace;
import com.megathirio.shinsei.core.container.ContainerMachinePress;
import com.megathirio.shinsei.core.container.ContainerToolBench;
import com.megathirio.shinsei.core.container.ContainerWoodFurnace;
import com.megathirio.shinsei.core.gui.GuiForgeFurnace;
import com.megathirio.shinsei.core.gui.GuiMachinePress;
import com.megathirio.shinsei.core.gui.GuiToolBench;
import com.megathirio.shinsei.core.gui.GuiWoodFurnace;
import com.megathirio.shinsei.tileentity.TileEntityForgeFurnace;
import com.megathirio.shinsei.tileentity.TileEntityWoodFurnace;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {

		TileEntity entity = world.getTileEntity(x, y, z);
		
		if(entity != null){
			
			switch(ID){
			case ShinseiMachines.guiIDWoodFurnace:
				if(entity instanceof TileEntityWoodFurnace){
					
					return new ContainerWoodFurnace(player.inventory, (TileEntityWoodFurnace) entity);
				}
				return null;		
			case ShinseiMachines.guiIDForgeFurnace:
				if(entity instanceof TileEntityForgeFurnace){
				
					return new ContainerForgeFurnace(player.inventory, (TileEntityForgeFurnace) entity);
				}
				return null;		
			}

			switch(ID){
			case ShinseiMachines.guiIDToolBench:
				return ID == ShinseiMachines.guiIDToolBench && world.getBlock(x, y, z) == ShinseiMachines.blockToolBench ? new ContainerToolBench(player.inventory, world, x, y, z) : null;
			case ShinseiMachines.guiIDMachinePress:
				return ID == ShinseiMachines.guiIDMachinePress && world.getBlock(x, y, z) == ShinseiMachines.blockMachinePress ? new ContainerMachinePress(player.inventory, world, x, y, z) : null;
			}
			return null;
	}
		return null;
}
	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {

		TileEntity entity = world.getTileEntity(x, y, z);
		
		if(entity != null){
			
			switch(ID){
			case ShinseiMachines.guiIDWoodFurnace:
				if(entity instanceof TileEntityWoodFurnace){
					
					return new GuiWoodFurnace(player.inventory, (TileEntityWoodFurnace) entity);
					
				}
				return null;
			case ShinseiMachines.guiIDForgeFurnace:
				if(entity instanceof TileEntityForgeFurnace){
					
					return new GuiForgeFurnace(player.inventory, (TileEntityForgeFurnace) entity);
					
				}
				return null;
		}
			switch(ID){
			case ShinseiMachines.guiIDToolBench:
				return ID == ShinseiMachines.guiIDToolBench && world.getBlock(x, y, z) == ShinseiMachines.blockToolBench ? new GuiToolBench(player.inventory, world, x, y, z) : null;
			case ShinseiMachines.guiIDMachinePress:
				return ID == ShinseiMachines.guiIDMachinePress && world.getBlock(x, y, z) == ShinseiMachines.blockMachinePress ? new GuiMachinePress(player.inventory, world, x, y, z) : null;
			}

		return null;
	}
		return null;
	}
}
