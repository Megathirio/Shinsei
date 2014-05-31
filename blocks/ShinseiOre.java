package shinsei.blocks;

import java.util.Random;

import shinsei.Main;
import shinsei.items.ShinseiItems;
import shinsei.lib.References;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class ShinseiOre extends Block{

	public ShinseiOre(Material material){
		//Generic Block Properties
		super(material);

		this.setHardness(1f);
		this.setResistance(3f);
		this.setCreativeTab(Main.getCreativeTab());
		this.setStepSound(soundTypeStone);
		this.enableStats = true;
		
	}

	public Item getItemDropped(int i, Random random, int j){
		return this == ShinseiBlocks.blockLimestone ? ShinseiItems.itemLimestoneShard : (this == ShinseiBlocks.blockSiltstone ? ShinseiItems.itemSilt : (this == ShinseiBlocks.blockClaystone ? Items.clay_ball : Item.getItemFromBlock(this)));
		
	}
    public int quantityDroppedWithBonus(int i, Random random)
    {
        return this == ShinseiBlocks.blockLimestone ? this.quantityDropped(random) + random.nextInt(3 + 1) : (this == ShinseiBlocks.blockSiltstone ? this.quantityDropped(random) + random.nextInt(1 + 1) : 1);
    }

	//Set Block Texture
	@Override
	public void registerBlockIcons(IIconRegister iconRegister){
		
		blockIcon = iconRegister.registerIcon(References.MODID + ":" + this.getUnlocalizedName().substring(5));
	}

}
