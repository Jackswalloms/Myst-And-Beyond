package net.minecraft.src; 

import net.minecraft.client.Minecraft;
 
public class mod_moon extends BaseMod 
	{ 
	public static final Block moonportal = (BlockMoonPortal)(new BlockMoonPortal(145, 14)).setHardness(-1F).setLightValue(1F).setBlockName("moonportal");
	public static final Block entranceBlock = (new BlockEntranceBlock(146,0)).setHardness(0.5F).setResistance(0.5F).setBlockName("entranceBlock");
	
	public static final Block mystDirt = (new BlockMystDirt(147,0)).setHardness(0.6F).setBlockName("Dirt");
	public static final Block mystStone = (new BlockMystStone(148,0)).setHardness(1.5F).setBlockName("Stone");
	public static final Block mystWood = (new BlockMystWood(149,0)).setHardness(0.5F).setBlockName("Wood");	
	
	public static final Block mystGrass = (new BlockMystGrass(150,0)).setHardness(0.5F).setBlockName("Grass");
	public static final Block mystLeaf = (new BlockMystLeaf(151,0)).setHardness(0.6F).setBlockName("Leaf");
	public static final Block mystLog = (new BlockMystLog(152,0)).setHardness(1.5F).setBlockName("Log");

	
	
	//Grass
	public static int grass = ModLoader.addOverride("/terrain.png", "/MystAndBeyond/grass.png");
	public static int dirt = ModLoader.addOverride("/terrain.png", "/MystAndBeyond/dirt.png");
	public static int Gdirt = ModLoader.addOverride("/terrain.png", "/MystAndBeyond/Gdirt.png");
	public static int grassTop = ModLoader.addOverride("/terrain.png", "/MystAndBeyond/grassTop.png");	
	
	//Stone
	public static int stone = ModLoader.addOverride("/terrain.png", "/MystAndBeyond/stone.png");	
	
	//Tree
	public static int log = ModLoader.addOverride("/terrain.png", "/MystAndBeyond/trunk.png");
	public static int logT = ModLoader.addOverride("/terrain.png", "/MystAndBeyond/trunkTop.png");	
	public static int leavesFancy = ModLoader.addOverride("/terrain.png", "/MystAndBeyond/fancyTree.png");	
	public static int leavesFast = ModLoader.addOverride("/terrain.png", "/MystAndBeyond/fastTree.png");	
	
	//Portal
	public static int EBlock = ModLoader.addOverride("/terrain.png", "/MystAndBeyond/portal.png");
	
	//Wood
	public static int wood = ModLoader.addOverride("/terrain.png", "/MystAndBeyond/wood.png");


	//trampolineCloth.iconIndex = ModLoader.addOverride("/gui/items.png", "/trampolines/cloth.png");
	//public static int low = ModLoader.addOverride("/terrain.png", "/trampolines/trampoline.png");
    
	public mod_moon()
	{ 
		mystDirt.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/MystAndBeyond/dirt.png");
		mystStone.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/MystAndBeyond/stone.png");
		mystWood.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/MystAndBeyond/wood.png");
		
		ModLoader.RegisterBlock(moonportal);
		ModLoader.RegisterBlock(entranceBlock);
		ModLoader.RegisterBlock(mystDirt);
		ModLoader.RegisterBlock(mystStone);
		
		ModLoader.RegisterBlock(mystGrass);
		ModLoader.RegisterBlock(mystWood);
		ModLoader.RegisterBlock(mystLog);
		ModLoader.RegisterBlock(mystLeaf);
		
		ModLoader.AddName(entranceBlock, "Mysterious block");
		ModLoader.AddName(moonportal, "Moon Portal");
		ModLoader.AddName(mystDirt, "Dirt");
		ModLoader.AddName(mystStone, "Stone");
		
		ModLoader.AddRecipe(new ItemStack(entranceBlock, 9), new Object[] {
            "XXX", "X#X","XXX", Character.valueOf('X'), Block.cobblestone, Character.valueOf('#'), Block.blockLapis
        });
		
	}

	public String Version()
	{ 
        return "1.8.1"; 
    } 

}