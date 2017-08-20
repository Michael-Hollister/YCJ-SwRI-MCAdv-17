package com.example.examplemod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemTool;

import java.util.Set;

public class DragonSword extends ItemTool {


    protected DragonSword(float p_i45333_1_, ToolMaterial p_i45333_2_, Set p_i45333_3_) {
        super(p_i45333_1_, p_i45333_2_, p_i45333_3_);

        this.setUnlocalizedName(ExampleMod.MODID + ":dragon_sword");
        this.setTextureName(ExampleMod.MODID + ":dragonsword");
        this.setCreativeTab(CreativeTabs.tabCombat);
    }
}
