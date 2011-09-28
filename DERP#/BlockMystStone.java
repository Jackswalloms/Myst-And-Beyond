package net.minecraft.src;

import java.util.Random;

public class BlockMystStone extends Block
{

    public BlockMystStone(int i, int j)
    {
        super(i, j, Material.rock);
		this.setStepSound(soundStoneFootstep);
    }

}
