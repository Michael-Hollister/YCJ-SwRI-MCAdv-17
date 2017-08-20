package com.example.examplemod;

import ibxm.Player;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class pizza extends ItemFood {
    public pizza(int foodValue, float saturation, boolean isWolfFavoritMeat) {
        super(foodValue, saturation, isWolfFavoritMeat);

        this.setUnlocalizedName(ExampleMod.MODID + ":pizza");
        this.setCreativeTab(CreativeTabs.tabFood);
        this.setTextureName(ExampleMod.MODID + ":pizza");
    }

    @Override
    protected void onFoodEaten(ItemStack itemStack, World world, EntityPlayer player) {
              super.onFoodEaten(itemStack, world, player);
    }
}
