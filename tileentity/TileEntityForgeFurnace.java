package com.megathirio.shinsei.tileentity;

import com.megathirio.shinsei.items.ShinseiItems;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;

public class TileEntityForgeFurnace extends TileEntity implements IInventory{

	private ItemStack slots[];
	
	public int dualPower;
	public int dualCookTime;
	
	private String customName;
	
	public TileEntityForgeFurnace(){
		slots = new ItemStack[5];
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
		
		return this.hasCustomInventoryName() ? this.customName : "container.forgeFurnace";
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

	public void openInventory() {}
	public void closeInventory() {}

	@Override
	public boolean isItemValidForSlot(int i, ItemStack itemstack) {

		return i == 3 ? false : (i == 1 ? hasItemPower(itemstack) : true);
	}
	
	public boolean hasItemPower(ItemStack itemstack){
		return getItemPower(itemstack) >0;
	}
	
	private static int getItemPower(ItemStack itemstack){
		
		if(itemstack == null){
			return 0;
		}else{
			Item item = itemstack.getItem();
			if(item == ShinseiItems.itemSplitWood) return 50;
			return 0;
		}
	}
	
	public void readFromNBT(NBTTagCompound nbt){
		
		super.readFromNBT(nbt);
		NBTTagList list = nbt.getTagList("Items", 10);
		slots = new ItemStack[getSizeInventory()];
		for(int i = 0; i < list.tagCount(); i++){
			NBTTagCompound nbt1 = (NBTTagCompound)list.getCompoundTagAt(i);
			byte b0 = nbt1.getByte("Slot");
			if(b0 >= 0 && b0 < slots.length){
				slots[b0] = ItemStack.loadItemStackFromNBT(nbt1);
			}
		}
		dualPower = nbt.getShort("PowerTime");
		dualCookTime = nbt.getShort("CookTime");
	}
	
	public void writeToNBT(NBTTagCompound nbt){
		
		super.writeToNBT(nbt);
		nbt.setShort("PowerTime", (short)dualPower);
		nbt.setShort("CookTime", (short)dualCookTime);
		NBTTagList list = new NBTTagList();
		for(int i =0; i < slots.length; i++){
			if(slots[i] != null){
				NBTTagCompound nbt1 = new NBTTagCompound();
				nbt1.setByte("Slot", (byte)i);
				list.appendTag(nbt1);
			}
		}
		nbt.setTag("Items", list);
	}
}
