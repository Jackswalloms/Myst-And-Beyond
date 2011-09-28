package net.minecraft.src;

import java.util.Random;

public class BlockMystLog extends Block
{

    public BlockMystLog(int i, int j)
    {
        super(i, j, Material.ground);
		this.setStepSound(soundWoodFootstep);
    }
	
	public int getBlockTextureFromSide(int i)
    {
        if(i == 1 || i == 0)
        {
            return mod_moon.logT;
        } else
        {
            return mod_moon.log;
		}
    }

}
