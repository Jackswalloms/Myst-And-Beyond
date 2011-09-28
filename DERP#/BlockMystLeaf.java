package net.minecraft.src;

import java.util.Random;

public class BlockMystLeaf extends Block
{

    public BlockMystLeaf(int i, int j)
    {
        super(i, j, Material.ground);
		this.setStepSound(soundGrassFootstep);
    }	

}
