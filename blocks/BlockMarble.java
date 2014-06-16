package com.megathirio.shinsei.blocks;

import java.util.List;

import com.megathirio.shinsei.Main;
import com.megathirio.shinsei.creativetab.ShinseiTabs;
import com.megathirio.shinsei.lib.References;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class BlockMarble extends Block{

	//Variables
	@SideOnly(Side.CLIENT)
	private IIcon[] texture;
	
	//MetaBlock variables
	final static String[] subBlocks = new String[] {"white", "black", "blue", "brown", "cyan", "gray", "green", "light_blue", "lime", "magenta", "orange", "pink", "purple", "red", "silver", "yellow"};

	public BlockMarble(){
		
		//Block Properties
		super(Material.rock);
		setHardness(5f);
		setResistance(8f);
		setCreativeTab(ShinseiTabs.blocksTab);
	}
	
	//MetaBlock Texture Setup
	@SideOnly(Side.CLIENT)
	@Override
	public void registerBlockIcons(IIconRegister iconRegister){
		
		texture = new IIcon[subBlocks.length];
		for(int i = 0; i < subBlocks.length; i++){
			texture[i] = iconRegister.registerIcon(References.MODID + ":" + "marble_" + subBlocks[i]);
		}
	}
	
	//MetaBlocks added to CreativeTab
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(Item block, CreativeTabs creativeTabs, List list){
		
		for(int i = 0; i < subBlocks.length; i++){	
			list.add(new ItemStack(block, 1, i));
		}
	}
	
	//Sets MetaBlock Texture 
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int meta){
		
		return texture[meta];
	}

	//Sets MetaBlock 
	public int damageDropped(int meta){
		
		return meta;
	}
}
