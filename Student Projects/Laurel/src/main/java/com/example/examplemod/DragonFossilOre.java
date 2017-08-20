package com.example.examplemod;


import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import java.util.Random;

public class DragonFossilOre extends Block {

    protected DragonFossilOre(Material mat) {
        super(mat);

        this.setBlockName(ExampleMod.MODID + ":dragon_fossil_ore");
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setHardness(7.0f);
        this.setStepSound(soundTypeStone);
        this.setHarvestLevel("pickaxe", 1);
        this.setBlockTextureName(ExampleMod.MODID + ":dragon_fossil_ore");


    }

   @Override
    public Item getItemDropped(int metadata, Random random, int fortune) {
        return ExampleMod.dragonClaw;
    }


    @Override
    public int quantityDropped(Random _p_149745_1) {
        return 5;

    }
}
