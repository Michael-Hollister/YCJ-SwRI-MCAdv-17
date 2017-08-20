package com.example.examplemod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class DragonIron extends Block {
    public DragonIron(Material mat) {
        super(mat);


        this.setBlockName(ExampleMod.MODID + ":dragon_iron");
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setHardness(50.0f);
        this.setHarvestLevel("diamond_pickaxe", 3);
        this.setStepSound(soundTypeAnvil);
        this.setBlockTextureName(ExampleMod.MODID + ":dragon_iron");

    }
}
