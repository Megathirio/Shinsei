package com.megathirio.shinsei.tileentity;

import com.megathirio.shinsei.blocks.ShinseiMachines;
import com.megathirio.shinsei.core.container.ContainerForgeFurnace;
import com.megathirio.shinsei.core.container.ContainerWoodFurnace;
import com.megathirio.shinsei.items.ShinseiIngots;
import com.megathirio.shinsei.items.ShinseiItems;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;

public class TileEntityMachinePress extends TileEntity /*implements IInventory*/{

/*	private ItemStack slots[];
	private String customName;

	public TileEntityMachinePress(){
		slots = new ItemStack[3];
	}

	@Override
	public int getSizeInventory() {
		return slots.length;
	}

	@Override
	public ItemStack getStackInSlot(int i) {
		return slots[i];
	}

	@Override
	public ItemStack decrStackSize(int i, int j) {
		
		if(slots[i] != null){
			if(slots[i].stackSize <= j){
				ItemStack itemstack = slots[i];
				slots[i] = null;
				return itemstack;
			}
			ItemStack itemstack1 = slots[i].splitStack(j);
			if(slots[i].stackSize == 0){
				slots[i] = null;
			}
			return itemstack1;
		}else{
			return null;
		}
	}

	@Override
	public ItemStack getStackInSlotOnClosing(int i) {

		if(slots[i] != null){
			ItemStack itemstack = slots[i];
			slots[i] = null;
			return itemstack;
		}else{
			return null;
		}
	}

	@Override
	public void setInventorySlotContents(int i, ItemStack itemstack) {

		slots[i] = itemstack;
		if(itemstack != null && itemstack.stackSize > getInventoryStackLimit()){
			itemstack.stackSize = getInventoryStackLimit();
		}
	}

	@Override
	public String getInventoryName() {
		
		return this.hasCustomInventoryName() ? this.customName : "container.machinePress";
	}

	@Override
	public boolean hasCustomInventoryName() {

		return this.customName != null && this.customName.length() > 0;
	}

	@Override
	public int getInventoryStackLimit() {
		return 64;
	}

	@Override
	public boolean isUseableByPlayer(EntityPlayer player) {

		if(worldObj.getTileEntity(xCoord, yCoord, zCoord) != this){
			return false;
		}else{
			return player.getDistanceSq((double)xCoord + 0.5D, (double)yCoord + 0.5D, (double)zCoord + 0.5D) <= 64;
		}
	}

	@Override
	public void openInventory() {}

	@Override
	public void closeInventory() {}

	@Override
	public boolean isItemValidForSlot(int i, ItemStack itemstack) {
		Item item = itemstack.getItem();
		switch(i){
			case 0:
				if(item == ShinseiIngots.itemAluminumIngot){
					return true;
				}
				return false;
			case 1:
				if(item == ShinseiItems.itemAxeCast){
					return true;
				}
				return false;
			case 2:
				return false;
			}
		return false;
		}
		*/
	}



