package com.example.examplemod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class SaphireBattleaxe extends ItemSword {
    public SaphireBattleaxe(ToolMaterial mat) {
        super(mat);

        this.setCreativeTab(CreativeTabs.tabCombat);
        this.setUnlocalizedName(ExampleMod.MODID + ":saphire_battleaxe");
        this.setTextureName(ExampleMod.MODID + ":saphire_battleaxe");
    }

}

