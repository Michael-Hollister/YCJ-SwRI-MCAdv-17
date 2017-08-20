package com.example.examplemod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class pizza extends ItemFood {

    public pizza(int foodValue, float saturation, boolean isWolfsFavoriteMeat) {
        super(foodValue, saturation, isWolfsFavoriteMeat);

        this.setUnlocalizedName(ExampleMod.MODID + ":pizza");
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setTextureName(ExampleMod.MODID);
    }
}
