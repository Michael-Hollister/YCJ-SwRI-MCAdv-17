package com.example.examplemod;


import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class RubyItem extends Item {
    public RubyItem()  {
        this.setUnlocalizedName(ExampleMod.MODID + ":ruby_item");
        this.setCreativeTab(CreativeTabs.tabMaterials);
        this.setTextureName(ExampleMod.MODID + ":ruby_item");

    }
}
