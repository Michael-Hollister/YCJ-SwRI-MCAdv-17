package com.example.examplemod;


import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class GreatGem extends Item {
    public GreatGem()  {
        this.setUnlocalizedName(ExampleMod.MODID + ":great_gem");
        this.setCreativeTab(CreativeTabs.tabMaterials);
        this.setTextureName(ExampleMod.MODID + ":great_gem");

    }
}


