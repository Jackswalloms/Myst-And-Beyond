// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

package net.minecraft.src;

import java.util.List;


public class BiomeGenMoon extends BiomeGenBase
{

    public BiomeGenMoon(int i)
    {        
		super(i);
		topBlock = (byte)mod_moon.mystGrass.blockID;
        fillerBlock = (byte)mod_moon.mystDirt.blockID;
        spawnableMonsterList.clear();
        spawnableCreatureList.clear();
        spawnableWaterCreatureList.clear();
         }
}
