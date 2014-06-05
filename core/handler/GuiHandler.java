package shinsei.core.handler;

import shinsei.blocks.ShinseiMachines;
import shinsei.core.container.ContainerWoodFurnace;
import shinsei.core.gui.GuiWoodFurnace;
import shinsei.tileentity.TileEntityWoodFurnace;
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
			}
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
			}
		}
		return null;
	}
	

}
