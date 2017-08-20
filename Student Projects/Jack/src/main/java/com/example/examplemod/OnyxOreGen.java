package com.example.examplemod;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class OnyxOreGen implements IWorldGenerator {
    public WorldGenerator oreGen2 = new WorldGenMinable(ExampleMod.onyxOre,
            1, Blocks.dirt);

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {

        int maxY = 56;
        int minY = 2;
        int spawnChance = 30;

        for (int i = 0; i < spawnChance; i++) {
            int x = chunkX * 16 + random.nextInt(16);
            int y = minY + random.nextInt(maxY - minY);
            int z = chunkZ * 16 + random.nextInt(16);

            oreGen2.generate(world, random, x, y, z);
        }
    }
}

