package com.example.examplemod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class OnyxItem extends Item {
    public OnyxItem()  {
        this.setUnlocalizedName(ExampleMod.MODID + ":onyx_item");
        this.setCreativeTab(CreativeTabs.tabMaterials);
        this.setTextureName(ExampleMod.MODID + ":onyx_item");

    }
}


