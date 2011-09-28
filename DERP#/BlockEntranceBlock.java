// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Block, Material

public class BlockEntranceBlock extends Block
{

    public BlockEntranceBlock(int i, int j)
    {
        super(i, j, Material.rock);
		this.setStepSound(soundStoneFootstep);
    }

    public int idDropped(int i, Random random)
    {
        return mod_moon.entranceBlock.blockID;
    }
	
	public int getBlockTextureFromSide(int i)
    {
        if(i == 1 || i == 0)
        {
            return mod_moon.EBlock;
        } else
        {
            return mod_moon.EBlock;
        }
    }
}
