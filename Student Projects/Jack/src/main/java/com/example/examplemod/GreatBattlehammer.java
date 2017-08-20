package com.example.examplemod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class GreatBattlehammer extends ItemSword {
    public GreatBattlehammer(ToolMaterial mat) {
        super(mat);

        this.setCreativeTab(CreativeTabs.tabCombat);
        this.setUnlocalizedName(ExampleMod.MODID + ":great_battlehammer");
        this.setTextureName(ExampleMod.MODID + ":great_battlehammer");
    }

}

