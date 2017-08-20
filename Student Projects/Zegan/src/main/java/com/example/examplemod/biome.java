package com.example.examplemod;

import net.minecraft.block.Block;
import net.minecraft.entity.monster.*;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenHell;

import java.util.Random;
import java.util.Scanner;

public class biome extends BiomeGenHell {
    public biome(int id) {
        super(id);

        this.setBiomeName("Hell_Islands");
        this.setDisableRain();
        Height biomeHeight = new Height(-0.2f, 2.5f);

        this.rootHeight = biomeHeight.rootHeight;
        this.heightVariation = biomeHeight.variation;

        this.spawnableMonsterList.add(new SpawnListEntry(steveentinty.class,
                1, 1, 1));

        this.spawnableMonsterList.add(new SpawnListEntry(EntityEnderman.class,
                1, 1, 1));

        this.spawnableMonsterList.add(new SpawnListEntry(EntityPigZombie.class,
                1, 1, 1));

        this.spawnableMonsterList.add(new SpawnListEntry(EntitySkeleton.class,
                1, 1, 1));

        this.spawnableMonsterList.add(new SpawnListEntry(EntityZombie.class,
                1, 1, 1));

        this.spawnableMonsterList.add(new SpawnListEntry(EntityGiantZombie.class,
                1, 1, 1));
    }

    @Override
    public void genTerrainBlocks(World p_150573_1_, Random p_150573_2_, Block[] p_150573_3_, byte[] p_150573_4_, int p_150573_5_, int p_150573_6_, double p_150573_7_) {
        this.topBlock = Blocks.netherrack;
        this.fillerBlock = Blocks.netherrack;

        super.genBiomeTerrain(p_150573_1_, p_150573_2_, p_150573_3_, p_150573_4_, p_150573_5_, p_150573_6_, p_150573_7_);
    }

    @Override
    public void decorate(World world, Random random, int chunkX, int chunkZ) {
        super.decorate(world, random, chunkX, chunkZ);

        int frequency = 250;

        for (int l = 0; l < frequency; l++) {

            int x = chunkX + random.nextInt(6);
            int y = 20 + random.nextInt(128);
            int z = chunkZ + random.nextInt(16);

            if (world.getBlock(x, y - 1, z) == this.topBlock );
            if((l % 100) == 0) {
                world.setBlock(x, y, z, Blocks.fire);
            }
            else {
                world.setBlock(x, y, z, Blocks.obsidian);
            }

        }
    }


}
