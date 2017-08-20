package com.example.examplemod;


import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenHills;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class DragonBiome extends BiomeGenHills {
    public DragonBiome(int id) {
        super(id, false);
        this.setBiomeName("dragon_lair");
        this.setEnableSnow();
        Height biomeHeight = new Height(-0.2f, 2.5f);
        this.rootHeight = biomeHeight.rootHeight;
        this.heightVariation = biomeHeight.variation;
        this.spawnableMonsterList.add(new SpawnListEntry(DragonBigGoodEntity.class, 1,3, 5));
    }

    @Override
    public void genTerrainBlocks(World p_150573_1_, Random p_150573_2_, Block[] p_150573_3_, byte[] p_150573_4_, int p_150573_5_, int p_150573_6_, double p_150573_7_)
    {this.topBlock = Blocks.stone;
     this.fillerBlock = Blocks.air;
        super.genBiomeTerrain(p_150573_1_, p_150573_2_, p_150573_3_, p_150573_4_, p_150573_5_, p_150573_6_, p_150573_7_);
    }

    @Override
    public void decorate(World world, Random random, int chunkX, int chunkZ) {
        super.decorate(world, random, chunkX, chunkZ);
        int frequency = 250;
        for (int l = 0; l < frequency; l++) {
            int x = chunkX + random.nextInt(16);
            int y = 20 + random.nextInt(128);
            int z = chunkZ + random.nextInt(16);
            if (world.getBlock(x, y - 1, z) == this.topBlock) {
                if ((1 % 20) == 0) {
                    world.setBlock(x, y, z, Blocks.dragon_egg);
                } else if ((l % 10) == 0) {
                    world.setBlock(x, y, z, Blocks.skull);
                }
            }
        }
    }
}
