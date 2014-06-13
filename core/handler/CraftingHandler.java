package com.megathirio.shinsei.core.handler;

import com.megathirio.shinsei.items.ShinseiTools;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.gameevent.PlayerEvent.ItemCraftedEvent;


public class CraftingHandler {
	
	public void onCrafting(ItemCraftedEvent event){
		
		final IInventory craftMatrix = null;
		for(int i = 0; i < event.craftMatrix.getSizeInventory(); i++){
			if(event.craftMatrix.getStackInSlot(i) != null){
				
				ItemStack item0 = event.craftMatrix.getStackInSlot(i);
				if(item0 != null && item0.getItem() == ShinseiTools.itemCopperAxe){
					ItemStack k = new ItemStack(ShinseiTools.itemCopperAxe, 2, (item0.getItemDamage() + 1));
					
					if(k.getItemDamage() >= k.getMaxDamage()){
						k.stackSize--;
					}
					event.craftMatrix.setInventorySlotContents(i, k);
				}
			}
		}
	}

	
}
