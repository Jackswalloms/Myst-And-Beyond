package net.minecraft.src; 

import net.minecraft.client.Minecraft;
 
public class mod_moon extends BaseMod 
	{ 
	public static final Block moonportal = (BlockMoonPortal)(new BlockMoonPortal(145, 14)).setHardness(-1F).setLightValue(1F).setBlockName("moonportal");
    
        public String Version()
		{ 
                return "1.8.1"; 
        } 
	public mod_moon()
	{ 
		ModLoader.RegisterBlock(moonportal);
	
		ModLoader.AddName(moonportal, "Moon Portal");
}


}