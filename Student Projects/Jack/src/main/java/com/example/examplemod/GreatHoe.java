package com.example.examplemod;

import com.google.common.collect.ImmutableSet;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.Set;

public class GreatHoe extends ItemHoe{
    public GreatHoe(ToolMaterial mat) {
        super(mat);

    this.setCreativeTab(CreativeTabs.tabTools);
    this.setUnlocalizedName(ExampleMod.MODID + ":great_hoe");
    this.setTextureName(ExampleMod.MODID + ":great_hoe");
    }

    @Override
    public Set<String> getToolClasses(ItemStack stack) {
        return ImmutableSet.of("hoe");
    }

    @Override
    public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int meta, float p_77648_8_, float p_77648_9_, float p_77648_10_) {

        if(world.getBlock(x-1, y, z-1) == Blocks.dirt ||
                world.getBlock(x-1, y, z-1) == Blocks.grass)   {
            world.setBlock(x-1, y, z-1, Blocks.farmland);
        }
        if(world.getBlock(x, y, z-1) == Blocks.dirt ||
                world.getBlock(x, y, z-1) == Blocks.grass)   {
            world.setBlock(x, y, z-1, Blocks.farmland);
        }
        if(world.getBlock(x+1, y, z-1) == Blocks.dirt ||
                world.getBlock(x+1, y, z-1) == Blocks.grass)   {
            world.setBlock(x+1, y, z-1, Blocks.farmland);
        }
        if(world.getBlock(x-1, y, z) == Blocks.dirt ||
                world.getBlock(x-1, y, z) == Blocks.grass)   {
            world.setBlock(x-1, y, z, Blocks.farmland);
        }
        if(world.getBlock(x+1, y, z) == Blocks.dirt ||
                world.getBlock(x+1, y, z) == Blocks.grass)   {
            world.setBlock(x+1, y, z, Blocks.farmland);
        }
        if(world.getBlock(x-1, y, z+1) == Blocks.dirt ||
                world.getBlock(x-1, y, z+1) == Blocks.grass)   {
            world.setBlock(x-1, y, z+1, Blocks.farmland);
        }
        if(world.getBlock(x, y, z+1) == Blocks.dirt ||
                world.getBlock(x, y, z+1) == Blocks.grass)   {
            world.setBlock(x, y, z+1, Blocks.farmland);
        }
        if(world.getBlock(x+1, y, z+1) == Blocks.dirt ||
                world.getBlock(x+1, y, z+1) == Blocks.grass)   {
            world.setBlock(x+1, y, z+1, Blocks.farmland);
        }

        return super.onItemUse(stack, player, world, x, y, z, meta, p_77648_8_, p_77648_9_, p_77648_10_);


    }
}
