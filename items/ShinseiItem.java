package shinsei.items;

import shinsei.Main;
import shinsei.lib.References;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

public class ShinseiItem extends Item {

	//Default Item Properties
	public ShinseiItem(){
		
		setCreativeTab(Main.getCreativeTab());
		
	}
	
	//Sets Item Texture
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister){
		
		itemIcon = iconRegister.registerIcon(References.MODID + ":" + this.getUnlocalizedName().substring(5));
	}


}