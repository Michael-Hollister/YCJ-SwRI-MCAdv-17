package com.example.examplemod;



import com.google.common.collect.ImmutableSet;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;

import java.util.Set;

public class Multitool extends ItemTool {
    protected Multitool(float damage, ToolMaterial mat, Set blocks) {
        super(damage, mat, blocks);

        this.setUnlocalizedName(ExampleMod.MODID + "multitool");
        this.setTextureName(ExampleMod.MODID + "multitool");
        this.setCreativeTab(CreativeTabs.tabCombat);
        this.setCreativeTab(CreativeTabs.tabTools);
    }

    @Override
    public java.util.Set<String> getToolClasses(ItemStack stack) {
        return ImmutableSet.of("pickaxe","spade","axe");
    }
}
