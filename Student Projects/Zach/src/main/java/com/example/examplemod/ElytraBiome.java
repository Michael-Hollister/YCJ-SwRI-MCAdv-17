package com.example.examplemod;

import net.minecraft.block.Block;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenHills;

import java.util.Random;

public class ElytraBiome extends BiomeGenHills {
    public ElytraBiome(int id) {
        super(id, false);
        this.setBiomeName("elytra_race");
        this.setEnableSnow();
        Height biomeHeight = new Height(-0.2f, 2.5f);
        this.rootHeight = biomeHeight.rootHeight;
        this.heightVariation = biomeHeight.variation;
        this.spawnableMonsterList.add(new SpawnListEntry(EntityDragon.class, 1,1, 1));
    }

    @Override
    public void genTerrainBlocks(World p_150573_1_, Random p_150573_2_, Block[] p_150573_3_, byte[] p_150573_4_, int p_150573_5_, int p_150573_6_, double p_150573_7_) {
        this.topBlock = Blocks.packed_ice;
        this.fillerBlock = Blocks.snow;
        super.genBiomeTerrain(p_150573_1_, p_150573_2_, p_150573_3_, p_150573_4_, p_150573_5_, p_150573_6_, p_150573_7_);
    }

    @Override
    public void decorate(World world, Random random, int chunkX, int chunkZ) {
        super.decorate(world, random,chunkX, chunkZ);
        this.theBiomeDecorator.decorateChunk(world, random, this, chunkX, chunkZ);
        int frequency = 250;

        for(int i = 0; i < frequency; i++) {
            int x = chunkX + random.nextInt(16);
            int y = 20 + random.nextInt(128);
            int z = chunkZ + random.nextInt(16);
            if(world.getBlock(x, y - i, z) == this.topBlock) {
                if((i % 20) == 0) {
                    world.setBlock(x, y, z, Blocks.skull);
                }
                else if ((i % 10) == 0) {
                    world.setBlock(x, y, z, Blocks.command_block);
                }
                else if ((i % 3) == 0) {
                    world.setBlock(x,y, z, Blocks.water);
                }
                else {
                    world.setBlock(x,y,z, Blocks.mob_spawner);
                }
            }
        }

    }
}
