package com.example.examplemod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class RubyBattleaxe extends ItemSword {
    public RubyBattleaxe(ToolMaterial mat) {
        super(mat);

        this.setCreativeTab(CreativeTabs.tabCombat);
        this.setUnlocalizedName(ExampleMod.MODID + ":ruby_battleaxe");
        this.setTextureName(ExampleMod.MODID + ":ruby_battleaxe");
    }

}
