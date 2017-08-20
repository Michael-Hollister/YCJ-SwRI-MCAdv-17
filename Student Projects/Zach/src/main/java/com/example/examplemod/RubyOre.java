package com.example.examplemod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class RubyOre extends Block {
    public RubyOre(net.minecraft.block.material.Material mat) {
        super(mat);

        this.setBlockName(ExampleMod.MODID + ":ruby_ore");
        this.setHardness(7.0f);
        this.setStepSound(soundTypeMetal);
        this.setHarvestLevel("pickaxe", 3);
        this.setBlockTextureName(ExampleMod.MODID + ":ruby_ore");
        this.setCreativeTab(CreativeTabs.tabBlock);

    }
}
