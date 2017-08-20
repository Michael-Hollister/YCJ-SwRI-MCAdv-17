package com.example.examplemod;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.world.World;

import java.util.Random;
import java.util.Set;

public class MinersPick extends ItemPickaxe {

    protected MinersPick(ToolMaterial mat) {
        super(mat);

    this.setUnlocalizedName(ExampleMod.MODID + ":miners_pick");
    this.setCreativeTab(CreativeTabs.tabTools);
    this.setTextureName(ExampleMod.MODID + ":miners_pick");
    }

    @Override
    public boolean onBlockDestroyed(ItemStack stack, World world, Block block, int x, int y, int z, EntityLivingBase entity) {
        if (Math.random() > 0.5) {
            world.spawnEntityInWorld(new EntityItem(world, x, y, z, new ItemStack(block)));
        }



        return super.onBlockDestroyed(stack, world, block, x, y, z, entity);


    }
}
