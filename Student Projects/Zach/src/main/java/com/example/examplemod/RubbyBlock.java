package com.example.examplemod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.world.World;

import java.util.Random;

public class RubbyBlock extends Block{

    public RubbyBlock(Material mat) {
        super(mat);
        this.setBlockName(ExampleMod.MODID + ":ruby_block") ;
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setHardness(5.0f);
        this.setHarvestLevel("pickaxe", 1);
        this.setStepSound(soundTypeMetal);
        this.setBlockTextureName(ExampleMod.MODID + ":ruby_block");
    }

    @Override
    public Item getItemDropped(int metadata, Random random, int fortune) {
        return ExampleMod.rubyItem;
    }
    public  int quantityDropped(Random random) {
        return 9;
    }
}

