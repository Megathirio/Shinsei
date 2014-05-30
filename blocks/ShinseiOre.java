package shinsei.blocks;

import shinsei.Main;
import shinsei.lib.References;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

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

	//Set Block Texture
	@Override
	public void registerBlockIcons(IIconRegister iconRegister){
		
		blockIcon = iconRegister.registerIcon(References.MODID + ":" + this.getUnlocalizedName().substring(5));
	}

}
