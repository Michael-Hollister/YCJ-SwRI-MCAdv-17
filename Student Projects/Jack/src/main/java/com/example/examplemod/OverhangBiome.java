package com.example.examplemod;

import net.minecraft.block.Block;
import net.minecraft.entity.passive.EntityBat;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenHills;

import java.util.Random;

public class OverhangBiome extends BiomeGenHills {
    public OverhangBiome(int id) {
        super(id, false);

        this.setBiomeName("overhang");
        Height biomeHeight = new Height(-0.2f, 2.5f);

        this.rootHeight = biomeHeight.rootHeight;
        this.heightVariation = biomeHeight.variation;

        this.spawnableCreatureList.add(new SpawnListEntry(EntitySheep.class, 10, 3, 7));
        this.spawnableCreatureList.add(new SpawnListEntry(EntityPig.class, 10, 3, 7));
        this.spawnableCreatureList.add(new SpawnListEntry(EntityCow.class, 10, 3, 7));
        this.spawnableCreatureList.add(new SpawnListEntry(EntityBat.class, 20, 1, 1));



    }

    @Override
    public void genTerrainBlocks(World p_150573_1_, Random p_150573_2_, Block[] p_150573_3_, byte[] p_150573_4_, int p_150573_5_, int p_150573_6_, double p_150573_7_) {
        this.topBlock = Blocks.soul_sand;
        this.fillerBlock = Blocks.gravel;


    }

    @Override
    public void decorate(World world, Random random, int chunkX, int chunkZ) {
        this.theBiomeDecorator.decorateChunk(world, random, this, chunkX, chunkZ);

        int frequency = 250;

        for (int l = 0; l < frequency; l++) {

            int x = chunkX + random.nextInt(16);
            int y = 20 + random.nextInt(128);
            int z = chunkZ + random.nextInt(16);

            if (world.getBlock(x, y - l, z) == this.topBlock) {
                if ((l % 20) == 0) {
                    world.setBlock(x, y, z, Blocks.dragon_egg);
                } else if ((l % 10) == 0) {
                    world.setBlock(x, y, z, Blocks.brown_mushroom_block);
                } else if ((l % 3) == 0) {
                    world.setBlock(x, y, z, Blocks.red_mushroom_block);
                } else {
                    world.setBlock(x, y, z, Blocks.stone);
                }

            }
        }
    }
}
