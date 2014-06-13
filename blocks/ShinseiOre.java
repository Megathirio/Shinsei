package com.megathirio.shinsei.blocks;

import java.util.Random;

import com.megathirio.shinsei.Main;
import com.megathirio.shinsei.creativetab.ShinseiTabs;
import com.megathirio.shinsei.items.ShinseiDusts;
import com.megathirio.shinsei.items.ShinseiItems;
import com.megathirio.shinsei.lib.References;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class ShinseiOre extends Block{

	//Default Block Properties
	public ShinseiOre(Material material){
		
		super(material);

		this.setHardness(1f);
		this.setResistance(3f);
		setCreativeTab(ShinseiTabs.blocksTab);
		this.setStepSound(soundTypeStone);
		this.enableStats = true;
	}

	public Item getItemDropped(int i, Random random, int j){
		
		if(this == ShinseiBlocks.blockLimestone){
			return ShinseiItems.itemLimestoneShard;
		}else if(this == ShinseiBlocks.blockSiltstone){
			return ShinseiItems.itemSilt;
		}else if(this == ShinseiBlocks.blockClaystone){
			return Items.clay_ball;
		}else if(this == ShinseiBlocks.blockArsenicOre){
			return ShinseiDusts.itemArsenicPowder;
		}else{
			return Item.getItemFromBlock(this);
		}
		
	}

	public int quantityDropped(Random random){

		if(this == ShinseiBlocks.blockLimestone){
			return 1 + random.nextInt(2);
		}else if(this == ShinseiBlocks.blockSiltstone){
			return 1 + random.nextInt(3);
		}else if(this == ShinseiBlocks.blockClaystone){
			return 1 + random.nextInt(2);
		}else if(this == ShinseiBlocks.blockArsenicOre){
			return 3 + random.nextInt(6);
		}else{
			return 1;
		}

	}
	
	//Sets Block Texture
	@Override
	public void registerBlockIcons(IIconRegister iconRegister){
		
		blockIcon = iconRegister.registerIcon(References.MODID + ":" + this.getUnlocalizedName().substring(5));
	}

}
