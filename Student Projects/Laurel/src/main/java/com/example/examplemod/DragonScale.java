package com.example.examplemod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class DragonScale extends Item {
    public DragonScale() {
        this.setUnlocalizedName(ExampleMod.MODID + ":dragon_scale");
        this.setCreativeTab(CreativeTabs.tabMaterials);
        this.setTextureName(ExampleMod.MODID + ":dragon_scale");
    }
}
