package com.example.examplemod;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRedstoneTorch;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenHills;

import java.util.Random;

public class DragonBiome extends BiomeGenHills {
    public DragonBiome(int id) {
        super(id, false);

        this.setBiomeName("dragon_biome");
        this.setDisableRain();

        Height biomeHeight = new Height( -0.2f, 2.5f);

        this.rootHeight = biomeHeight.rootHeight;
        this.heightVariation = biomeHeight.variation;

        this.spawnableMonsterList.add(new SpawnListEntry(EntityDragon.class, 1, 1, 1));

    }

    @Override
    public void genTerrainBlocks(World p_150573_1_, Random p_150573_2_, Block[] p_150573_3_, byte[] p_150573_4_, int p_150573_5_, int p_150573_6_, double p_150573_7_) {
        this.topBlock = Blocks.redstone_block;
        this.fillerBlock = Blocks.golden_rail;

        super.genTerrainBlocks(p_150573_1_, p_150573_2_, p_150573_3_, p_150573_4_, p_150573_5_, p_150573_6_, p_150573_7_);
    }

    @Override
    public void decorate(World world, Random random, int chunkX, int chunkZ) {
        this.theBiomeDecorator.decorateChunk(world, random, this, chunkX, chunkZ);

        int frequency = 600;

        for(int i = 0; i < frequency; i++) {
            int x = chunkX + random.nextInt( 16);
            int y = 20 + random.nextInt(180);
            int z = chunkZ + random.nextInt( 16);

            if (world.getBlock(x, y-1,z) != Blocks.air) {
                //if ()
            }
        }


    }
}