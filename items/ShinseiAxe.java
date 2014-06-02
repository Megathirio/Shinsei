package shinsei.items;

import shinsei.Main;
import shinsei.lib.References;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemAxe;

public class ShinseiAxe extends ItemAxe {

	//Default Axe Properties
	public ShinseiAxe(ToolMaterial material) {
		super(material);
		setCreativeTab(Main.getCreativeTab());
	}

	
	//Set Axe Texture
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister){
		
		itemIcon = iconRegister.registerIcon(References.MODID + ":" + this.getUnlocalizedName().substring(5));
	}

}
