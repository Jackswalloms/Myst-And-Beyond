package net.minecraft.src;

import java.util.Random;

public class BlockMystDirt extends Block
{

    public BlockMystDirt(int i, int j)
    {
        super(i, j, Material.ground);
		this.setStepSound(soundGravelFootstep);
    }

}
