package shinsei.creativetab;

import shinsei.items.ShinseiItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ShinseiTab extends CreativeTabs{
	
	public ShinseiTab(int id, String modid){
		
		super(id, modid);
	}
	
	@Override
	public Item getTabIconItem(){
		
		return ShinseiItems.itemCopperIngot;
	}

}
