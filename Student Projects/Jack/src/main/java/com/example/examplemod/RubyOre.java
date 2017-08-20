package com.example.examplemod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import java.util.Random;

public class RubyOre extends Block {

    protected RubyOre(Material mat) {
        super(mat);

        this.setBlockName(ExampleMod.MODID + ":ruby_ore");
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setHardness(10.0f);
        this.setHarvestLevel("pickaxe",2);
        this.setStepSound(soundTypeMetal);
        this.setBlockTextureName(ExampleMod.MODID + ":ruby_ore");


    }

    @Override
    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_) {
        return ExampleMod.rubyItem;
    }
}

