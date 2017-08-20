package com.example.examplemod;

import com.google.common.collect.ImmutableSet;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.*;

import java.util.Set;

        public class Multitool extends ItemTool{


            public Multitool(float damage, ToolMaterial mat, Set blocks) {
                super(damage, mat, blocks);

                this.setUnlocalizedName(ExampleMod.MODID + ":Multitool");
                this.setTextureName(ExampleMod.MODID + ":Multitool");
                this.setCreativeTab(CreativeTabs.tabTools);

            }


            @Override
            public Set<String> getToolClasses(ItemStack stack) {
                return ImmutableSet.of("pickaxe", "spade", "axe");
            }

            @Override
            public boolean canHarvestBlock(Block par1Block, ItemStack itemStack) {
                return true;
            }
        }

