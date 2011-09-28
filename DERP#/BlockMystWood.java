package net.minecraft.src;

import java.util.Random;

public class BlockMystWood extends Block
{

    public BlockMystWood(int i, int j)
    {
        super(i, j, Material.wood);
		this.setStepSound(soundWoodFootstep);
    }

}
