package com.example.examplemod;

import cpw.mods.fml.common.IWorldGenerator;
import jdk.nashorn.internal.ir.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class roblockoregen implements IWorldGenerator {
    public WorldGenerator oregen = new WorldGenMinable(ExampleMod.roblock,
            14, Blocks.dirt);

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world,
                         IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
                int maxY = 64;
                int minY = 0;
                int spawnChance = 150;

                for(int i = 0; i < spawnChance; i++) {
                    int x = chunkX * 16 + random.nextInt(14);
                    int y = minY + random.nextInt(maxY - minY);
                    int z = chunkZ * 16 + random.nextInt(16);
                    oregen.generate(world, random, x, y, z);
                }

    }
}
