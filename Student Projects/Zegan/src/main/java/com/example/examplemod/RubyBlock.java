package com.example.examplemod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class RubyBlock extends Block {

    public RubyBlock(Material mat) {
        super(mat);

        this.setBlockName(ExampleMod.MODID + ":ruby_block");
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setHardness(500.0f);
        this.setHarvestLevel("pickaxe", 3);
        this.setStepSound(soundTypePiston);
        this.setBlockTextureName(ExampleMod.MODID + ":ruby_ore");

    }


}
