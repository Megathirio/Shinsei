package shinsei.items;

import shinsei.Main;
import shinsei.lib.References;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemHoe;

public class ItemCopperHoe extends ItemHoe {

	private String name = "copper_hoe";
	
	public ItemCopperHoe(ToolMaterial material) {
		super(material);
		setCreativeTab(Main.getCreativeTab());
		GameRegistry.registerItem(this, name);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister){
		
		itemIcon = iconRegister.registerIcon(References.MODID + ":" + name);
	}

}
