package com.example.examplemod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.Random;

public class LuckyBlock extends Block {
    public  LuckyBlock(Material mat) {
        super(mat);

        this.setBlockName(ExampleMod.MODID + ":lucky_block");
        this.setCreativeTab(CreativeTabs.tabBlock) ;
        this.setBlockTextureName(ExampleMod.MODID + ":lucky_block");
    }
    enum Action {
        Drop_Item,
        Drop_Anvil
    }
    public  void  onBlockDestroyedByPlayer(World world, int x, int y, int z, int meta) {
        super.onBlockDestroyedByPlayer(world, x, y, z, meta) ;
        Random generator = new Random();
        Action[] actionList = Action.values();
        int actionIndex = generator.nextInt(actionList.length);
        Action selectedAction = actionList[generator.nextInt(actionList.length)];
        switch (selectedAction) {

            case Drop_Item:
                ArrayList<Item> itemList = new ArrayList<Item>();
                for(Object item: Item.itemRegistry) {
                    itemList.add((Item)item);
                }

                int randomItemIndex = generator.nextInt(itemList.size());
                world.spawnEntityInWorld(
                        new EntityItem(world, x, y, z, new ItemStack(itemList.get(randomItemIndex))));

            case Drop_Anvil:

                break;
        }

    }
}
