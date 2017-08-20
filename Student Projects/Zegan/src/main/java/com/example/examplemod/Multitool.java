package com.example.examplemod;

import com.google.common.collect.ImmutableSet;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;

import java.util.Set;



public class Multitool extends ItemTool {
    protected Multitool(float damage, ToolMaterial mat, Set blocks) {
        super(damage, mat, blocks);

        this.setUnlocalizedName(ExampleMod.MODID + ":multitool");
        this.setTextureName(ExampleMod.MODID + ":multitool");
        this.setCreativeTab(CreativeTabs.tabCombat);
        this.setCreativeTab(CreativeTabs.tabTools);

    }

    @Override
    public Set<String> getToolClasses(ItemStack Stack) {
        return ImmutableSet.of("pickaxe", "axe", "shovel");

    }

    @Override
    public boolean canHarvestBlock(Block par1Block, ItemStack itemStack) {
        return true;
    }
}


