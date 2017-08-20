package com.example.examplemod;

        import net.minecraft.block.Block;
        import net.minecraft.block.material.Material;
        import net.minecraft.creativetab.CreativeTabs;

public class RainBlock extends Block {
    public RainBlock (Material mat) {
        super(mat);


        this.setBlockName(ExampleMod.MODID + ":rain_block");
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setHardness(50.0f);
        this.setHarvestLevel("diamond_pickaxe", 3);
        this.setStepSound(soundTypeAnvil);
        this.setBlockTextureName(ExampleMod.MODID + ":rain_block");

    }
}