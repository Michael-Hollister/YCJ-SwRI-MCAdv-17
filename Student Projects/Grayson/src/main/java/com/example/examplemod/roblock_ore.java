package com.example.examplemod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.world.World;

import java.util.Random;

public class roblock_ore extends Block {
    protected roblock_ore(Material mat) {
        super(mat);

        this.setBlockName(ExampleMod.MODID + ":roblock_ore");
        this.setHardness(7.0F);
        this.setStepSound(soundTypeAnvil);
        this.setHarvestLevel("pickaxe", 1);
        this.setBlockTextureName(ExampleMod.MODID + ":roblock_ore");
        this.setCreativeTab(CreativeTabs.tabBlock);

    }

    @Override
    public Item getItemDropped(int metadata, Random random, int fortune) {
        return ExampleMod.roblockThing;
    }

    @Override
    public int quantityDropped(Random random) {
        return 100;
    }
}
