package shinsei.blocks;

import java.util.Random;

import shinsei.Main;
import shinsei.items.ShinseiItems;
import shinsei.lib.References;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

public class ShinseiOre extends Block{

	//Default Block Properties
	public ShinseiOre(Material material){
		
		super(material);

		this.setHardness(1f);
		this.setResistance(3f);
		this.setCreativeTab(Main.getCreativeTab());
		this.setStepSound(soundTypeStone);
		this.enableStats = true;
	}

	public Item getItemDropped(int i, Random random, int j){
		
		if(this == ShinseiBlocks.blockLimestone){
			return ShinseiItems.itemLimestoneShard;
		}else if(this == ShinseiBlocks.blockSiltstone){
			return ShinseiItems.itemSilt;
		}else{
			return Item.getItemFromBlock(this);
		}
		
	}

	public int quantityDropped(Random random){

		if(this == ShinseiBlocks.blockLimestone){
			return 1 + random.nextInt(2);
		}else if(this == ShinseiBlocks.blockSiltstone){
			return 1 + random.nextInt(3);
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
