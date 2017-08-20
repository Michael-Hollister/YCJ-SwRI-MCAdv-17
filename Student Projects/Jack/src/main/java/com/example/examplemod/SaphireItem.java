package com.example.examplemod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class SaphireItem extends Item {
    public SaphireItem()  {
        this.setUnlocalizedName(ExampleMod.MODID + ":saphire_item");
        this.setCreativeTab(CreativeTabs.tabMaterials);
        this.setTextureName(ExampleMod.MODID + ":saphire_item");

    }
}

