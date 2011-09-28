package net.minecraft.src;

import java.util.Random;

public class BlockMystGrass extends Block
{

    public BlockMystGrass(int i, int j)
    {
        super(i, j, Material.grass);
		this.setStepSound(soundGrassFootstep);
    }
	
	public int getBlockTextureFromSide(int i)
    {
        if(i == 1)
        {
            return mod_moon.grassTop;
        }else if (i == 0)
        {
            return mod_moon.Gdirt;
        }
		return mod_moon.grass;
    }
	
    public int idDropped(int i, Random random)
    {
        return mod_moon.mystDirt.idDropped(0, random);
    }

}
