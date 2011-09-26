package net.minecraft.src; 

import net.minecraft.client.Minecraft;
 
public class mod_moon extends BaseMod 
	{ 
	public static final Block moonportal = (BlockMoonPortal)(new BlockMoonPortal(145, 14)).setHardness(-1F).setLightValue(0.75F).setBlockName("moonportal");
	public static final Block moonfire = (new BlockMoonFire(146, 18)).setHardness(0.5F).setBlockName("moonfire");


 
         
        public String Version(){ 
                return "1.8_01"; 
        } 
         
         

public mod_moon()
{ 
	ModLoader.RegisterBlock(moonportal);
	ModLoader.RegisterBlock(moonfire);
	
	ModLoader.AddName(moonportal, "Moon Portal");
	ModLoader.AddName(moonfire, "Moon Fire");
	
	ModLoader.AddRecipe(new ItemStack(moonfire, 1), new Object[] { 
        "XX", Character.valueOf('X'), Block.sand
    }); 
}


}