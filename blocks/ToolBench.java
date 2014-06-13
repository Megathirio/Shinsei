package com.megathirio.shinsei.blocks;

import com.megathirio.shinsei.Main;
import com.megathirio.shinsei.creativetab.ShinseiTabs;
import com.megathirio.shinsei.lib.References;
import com.megathirio.shinsei.tileentity.TileEntityToolBench;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class ToolBench extends BlockContainer{

	public ToolBench(Material material) {
		super(material);

		this.setHardness(2.0F);
		this.setResistance(3.0F);
		
		setCreativeTab(ShinseiTabs.machinesTab);

	}

	public int getRenderType(){
		return -1;
	}
	
	public boolean isOpaqueCube(){
		return false;
	}
	
	public boolean renderAsNormalBlock(){
		return false;
	}
	
	@Override
	public TileEntity createNewTileEntity(World var1, int var2) {
		return new TileEntityToolBench();
	}
	
	@Override
	public void registerBlockIcons(IIconRegister iconRegister){
		
		blockIcon = iconRegister.registerIcon(References.MODID + ":" + this.getUnlocalizedName().substring(5));
	}

	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int q, float a, float b, float c){
		
		if(!player.isSneaking()){
			
			player.openGui(Main.instance, ShinseiMachines.guiIDToolBench, world, x, y, z);
			return true;
		}else{
			return false;
		}
	}
	
	public void setDefaultDirection(World world, int x, int y, int z) {
		if(!world.isRemote) {
			Block b1 = world.getBlock(x, y, z - 1);
			Block b2 = world.getBlock(x,  y,  z + 1);
			Block b3 = world.getBlock(x - 1, y, z);
			Block b4  = world.getBlock(x + 1, y, z);

			byte b0 = 3;

			if(b1.func_149730_j() && !b2.func_149730_j()) {
				b0 = 3;	
			}

			if(b2.func_149730_j() && !b1.func_149730_j()) {
				b0 = 2;	
			}

			if(b3.func_149730_j() && !b4.func_149730_j()) {
				b0 = 5;	
			}

			if(b4.func_149730_j() && !b3.func_149730_j()) {
				b0 = 4;	
			}

			world.setBlockMetadataWithNotify(x, y, x, b0, 2);
		}

	}

	public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entityplayer, ItemStack itemstack) {
		int l = MathHelper.floor_double((double)(entityplayer.rotationYaw * 4.0F / 360.F) + 0.5D) & 3;

		if(l == 0) {
			world.setBlockMetadataWithNotify(x, y, z, 2, 2);
		}

		if(l == 1) {
			world.setBlockMetadataWithNotify(x, y, z, 5, 2);
		}

		if(l == 2) {
			world.setBlockMetadataWithNotify(x, y, z, 3, 2);
		}

		if(l == 3) {
			world.setBlockMetadataWithNotify(x, y, z, 4, 2);
		}

/*		if(itemstack.hasDisplayName()) {
			((TileEntityToolBench)world.getTileEntity(x, y, z)).setGuiDisplayName(itemstack.getDisplayName());
		}*/

	}

}
