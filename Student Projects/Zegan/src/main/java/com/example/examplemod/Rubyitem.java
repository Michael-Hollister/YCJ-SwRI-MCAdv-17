package com.example.examplemod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Rubyitem extends Item {
    public Rubyitem() {
        this.setUnlocalizedName(ExampleMod.MODID + ":ruby_item");
        this.setCreativeTab(CreativeTabs.tabMaterials);
        this.setTextureName(ExampleMod.MODID + ":ruby_item");
    }
}
