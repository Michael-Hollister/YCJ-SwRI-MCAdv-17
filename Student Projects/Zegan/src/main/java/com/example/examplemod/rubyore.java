package com.example.examplemod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class rubyore extends Block {
    public rubyore(Material mat) {
        super(mat);

        this.setBlockName(ExampleMod.MODID + ":ruby_ore2");
        this.setHardness(20.0f);
        this.setStepSound(soundTypePiston);
        this.setHarvestLevel("pickaxe", 3);
        this.setBlockTextureName(ExampleMod.MODID + ":ruby_ore2");
        this.setCreativeTab(CreativeTabs.tabBlock);
    }
}