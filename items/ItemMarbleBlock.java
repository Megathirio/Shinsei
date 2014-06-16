package com.megathirio.shinsei.items;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlockWithMetadata;
import net.minecraft.item.ItemStack;

public class ItemMarbleBlock extends ItemBlockWithMetadata{

	final static String[] subBlocks = new String[] {"white", "black", "blue", "brown", "cyan", "gray", "green", "light_blue", "lime", "magenta", "orange", "pink", "purple", "red", "silver", "yellow"};

	public ItemMarbleBlock(Block block) {
		super(block, block);
	}
	
	public String getUnlocalizedName(ItemStack itemStack){
		
		int i = itemStack.getItemDamage();
		if(i < 0 || i >= subBlocks.length){
			i =0;
		}
		
		return super.getUnlocalizedName() + "_" + subBlocks[i];
		
	}

	public int getMetaData(int meta){
		return meta;
	}
	
}
