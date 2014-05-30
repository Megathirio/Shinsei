package shinsei;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import shinsei.blocks.ShinseiBlocks;
import shinsei.core.handler.CraftingHandler;
import shinsei.core.proxy.CommonProxy;
import shinsei.creativetab.ShinseiTab;
import shinsei.items.ShinseiItems;
import shinsei.lib.References;
import shinsei.world.ShinseiWorldGen;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = References.MODID, name = References.MODNAME, version = References.VERSION)

public class Main {
	
	//Materials
	public static ToolMaterial materialCopper = EnumHelper.addToolMaterial("materialCopper", 2, 150, 5.0F, 2.0F, 14);
	
	// Client and Server Proxies 
	@SidedProxy(clientSide = References.CLIENTPROXYLOCATION, serverSide = References.COMMONPROXYLOCATION)
	public static CommonProxy proxy;
	
	//Creative Tabs
	private static CreativeTabs shinseiTab = new ShinseiTab(CreativeTabs.getNextID(), References.MODID);

	public static CreativeTabs getCreativeTab(){
		return(shinseiTab);
	}
	
	//Initialization Methods
	@Mod.EventHandler
	public static void preInit(FMLPreInitializationEvent event){

		//Block Initialization
		ShinseiBlocks.init();

		//Item Initialization
		ShinseiItems.init();

		//Recipe Initialization
		CraftingHandler.init();

		//WorldGen Registry
		GameRegistry.registerWorldGenerator(new ShinseiWorldGen(), 1);

	}
	
	@Mod.EventHandler
	public static void init(FMLInitializationEvent event){
		
	}

	@Mod.EventHandler
	public static void postInit(FMLPostInitializationEvent event){
		
	}

}
