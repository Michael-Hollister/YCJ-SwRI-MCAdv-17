package com.example.examplemod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Roblockitem extends Item {
    public Roblockitem() {
        this.setUnlocalizedName(ExampleMod.MODID + "roblock_item");
        this.setCreativeTab(CreativeTabs.tabMaterials);
        this.setTextureName(ExampleMod.MODID + ":roblock_item");
    }
}
