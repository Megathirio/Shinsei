package com.megathirio.shinsei.items;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ShinseiMaterials {
	
	//Materials
	/* 
	 * eg.("name", harvestLevel[int], maxUses[int], efficiency[float], damage[float], enchantability[int])
		Harvest levels: Wood:0; Stone:1; Iron:2; Diamond:3; Gold:0
		maxUses: Wood:59; Stone:131; Iron:250; Diamond:1561; Gold:32
		efficiency: Wood:2.0F; Stone:4.0F; Iron:6.0F; Diamond:8.0F; Gold:12.0F
		damage: Wood:0.0F; Stone:1.0F; Iron:2.0F; Diamond:3.0F; Gold:0.0F
		enchantability: Wood:15; Stone:5; Iron:14; Diamond:10; Gold:22
	*/

	public static ToolMaterial materialAluminum = EnumHelper.addToolMaterial("materialAluminum", 2, 175, 5.0F, 1.5F, 16);
	public static ToolMaterial materialCopper = EnumHelper.addToolMaterial("materialCopper", 2, 200, 6.0F, 1.5F, 16);
	
	/*
	public static ToolMaterial materialBrass = EnumHelper.addToolMaterial("materialBrass", 2, 250, 6.5F, 2.5F, 16);
	public static ToolMaterial materialCarbonFibre = EnumHelper.addToolMaterial("materialCarbonFibre", 3, 1250, 7.0F, 3.0F, 10);
	public static ToolMaterial materialChromium = EnumHelper.addToolMaterial("materialChromium", 2, 500, 7.0F, 3.0F, 14);
	public static ToolMaterial materialCobalt = EnumHelper.addToolMaterial("materialCobalt", 2, 300, 6.0F, 2.5F, 14);
	public static ToolMaterial materialLead = EnumHelper.addToolMaterial("materialLead", 1, 150, 3.0F, 1.5F, 6);
	public static ToolMaterial materialNickel = EnumHelper.addToolMaterial("materialNickel", 2, 200, 6.0F, 2.0F, 15);
	public static ToolMaterial materialOpal = EnumHelper.addToolMaterial("materialOpal", 2, 250, 6.0F, 3.0F, 20);
	public static ToolMaterial materialPeridot = EnumHelper.addToolMaterial("materialPeridot", 2, 250, 6.0F, 3.0F, 20);
	public static ToolMaterial materialPlatinum = EnumHelper.addToolMaterial("materialPlatinum", 2, 50, 5.0F, 2.5F, 18);
	public static ToolMaterial materialQuartz = EnumHelper.addToolMaterial("materialQuartz", 2, 300, 6.0F, 4.0F, 24);
	public static ToolMaterial materialShinzui = EnumHelper.addToolMaterial("materialShinzui", 4, 2500, 12.0F, 7.0F, 30);
	public static ToolMaterial materialSilicon = EnumHelper.addToolMaterial("materialSilicon", 2, 400, 6.5F, 2.5F, 10);
	public static ToolMaterial materialSiliconCarbide = EnumHelper.addToolMaterial("materialSiliconCarbide", 3, 1400, 7.0F, 3.0F, 10);
	public static ToolMaterial materialSilver = EnumHelper.addToolMaterial("materialSilver", 2, 50, 7.0F, 1.5F, 18);
	public static ToolMaterial materialSteel = EnumHelper.addToolMaterial("materialSteel", 2, 250, 5.5F, 2.5F, 8);
	public static ToolMaterial materialTitaniumCarbide = EnumHelper.addToolMaterial("materialTitaniumCarbide", 3, 1500, 7.5F, 3.5F, 8);
	public static ToolMaterial materialTin = EnumHelper.addToolMaterial("materialTin", 1, 150, 4.5F, 1.5F, 8);
	public static ToolMaterial materialTitanium = EnumHelper.addToolMaterial("materialTitanium", 2, 450, 6.5F, 3.0F, 8);
	public static ToolMaterial materialTopaz = EnumHelper.addToolMaterial("materialTopaz", 2, 450, 6.5F, 4.5F, 24);
	public static ToolMaterial materialTungsten = EnumHelper.addToolMaterial("materialTungsten", 2, 500, 6.5F, 3.0F, 8);
	public static ToolMaterial materialTungstenCarbide = EnumHelper.addToolMaterial("materialTungstenCarbide", 3, 1550, 7.5F, 4.0F, 8);
	public static ToolMaterial materialZinc = EnumHelper.addToolMaterial("materialZinc", 2, 200, 5.5F, 1.0F, 20);
*/

}
