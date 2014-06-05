package shinsei;

import net.minecraft.creativetab.CreativeTabs;
import shinsei.blocks.ShinseiBlocks;
import shinsei.blocks.ShinseiMachines;
import shinsei.core.handler.CraftingHandler;
import shinsei.core.handler.FuelHandler;
import shinsei.core.handler.GuiHandler;
import shinsei.core.handler.ShinseiRecipes;
import shinsei.core.proxy.CommonProxy;
import shinsei.creativetab.ShinseiTab;
import shinsei.items.ShinseiItems;
import shinsei.items.ShinseiTools;
import shinsei.lib.References;
import shinsei.world.ShinseiWorldGen;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = References.MODID, name = References.MODNAME, version = References.VERSION)

public class Main {
	
	@Instance(References.MODID)
	public static Main instance;
	
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

		//Machines Initialization
		ShinseiMachines.init();

		//Item Initialization
		ShinseiItems.init();

		//Tools Initialization
		ShinseiTools.init();

		//WorldGen Registry
		GameRegistry.registerWorldGenerator(new ShinseiWorldGen(), 1);

	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event){

		//Crafting Handler Registration
		FMLCommonHandler.instance().bus().register(new CraftingHandler());
		
		//Gui Handler Registration 
		NetworkRegistry.INSTANCE.registerGuiHandler(this, new GuiHandler());
		
		//Fuel Handler Registration
		GameRegistry.registerFuelHandler(new FuelHandler());
		
		//Recipes Initialization
		ShinseiRecipes.init();

	}

	@Mod.EventHandler
	public static void postInit(FMLPostInitializationEvent event){
		
	}

}
