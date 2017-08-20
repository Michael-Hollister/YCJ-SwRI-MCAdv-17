package com.example.examplemod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class OnyxBattleaxe extends ItemSword {
    public OnyxBattleaxe(ToolMaterial mat) {
        super(mat);

        this.setCreativeTab(CreativeTabs.tabCombat);
        this.setUnlocalizedName(ExampleMod.MODID + ":onyx_battleaxe");
        this.setTextureName(ExampleMod.MODID + ":onyx_battleaxe");
    }

}

