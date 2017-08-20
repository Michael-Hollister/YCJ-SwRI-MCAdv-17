package com.example.examplemod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemTool;

import java.util.Set;

public class Sword extends ItemTool {
    public Sword(float damage, ToolMaterial mat, Set blocks){
        super(damage, mat, blocks);

        this.setUnlocalizedName(ExampleMod.MODID + ":ruby_sword");
        this.setTextureName(ExampleMod.MODID + ":ruby_sword");
        this.setCreativeTab(CreativeTabs.tabCombat);
        this.setCreativeTab(CreativeTabs.tabTools);

    }
}
