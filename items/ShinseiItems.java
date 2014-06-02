package shinsei.items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public final class ShinseiItems {

//Item Variables
//Fuels
	public static Item itemSplitWood;
	
	
//Mineral Drops
	public static Item itemLimestoneShard;
	public static Item itemSilt;
	
//Ingots
	public static Item itemAluminumIngot;
	public static Item itemCopperIngot;

	//Item Initialization
	public static void init(){
		

	//Fuels
		itemSplitWood = new ShinseiItem().setUnlocalizedName("split_wood");
		GameRegistry.registerItem(itemSplitWood, "split_wood");
		
	//Mineral Drops
		itemLimestoneShard = new ShinseiItem().setUnlocalizedName("limestone_shard");
		GameRegistry.registerItem(itemLimestoneShard, "limestone_shard");
		itemSilt = new ShinseiItem().setUnlocalizedName("silt");
		GameRegistry.registerItem(itemSilt, "silt");

	//Ingots
		itemAluminumIngot = new ShinseiItem().setUnlocalizedName("aluminum_ingot");
		GameRegistry.registerItem(itemAluminumIngot, "aluminum_ingot");
		itemCopperIngot = new ShinseiItem().setUnlocalizedName("copper_ingot");
		GameRegistry.registerItem(itemCopperIngot, "copper_ingot");

	}
}
