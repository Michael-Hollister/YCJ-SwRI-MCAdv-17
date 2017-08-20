package com.example.examplemod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class roblock extends Block
{
    protected roblock(Material mat) {
        super(mat);
        this.setBlockName(ExampleMod.MODID + ":roblock");
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setHardness(1f);
        this.setHarvestLevel("pickaxe", 1);
        this.setStepSound(soundTypePiston);
        this.setBlockTextureName(ExampleMod.MODID + ":roblock");

    }
}
