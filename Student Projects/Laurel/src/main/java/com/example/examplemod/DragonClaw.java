package com.example.examplemod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class DragonClaw extends Item {
    public DragonClaw() {
        this.setUnlocalizedName(ExampleMod.MODID + ":dragon_claw");
        this.setCreativeTab(CreativeTabs.tabMaterials);
        this.setTextureName(ExampleMod.MODID + ":dragon_claw");
    }
}