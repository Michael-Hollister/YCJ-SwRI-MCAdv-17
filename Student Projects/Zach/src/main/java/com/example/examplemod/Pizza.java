package com.example.examplemod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class Pizza extends ItemFood {


    public Pizza(int foodValue, float saturation, boolean isWolfsFavoriteMeat) {
        super(foodValue, saturation, isWolfsFavoriteMeat);

        this.setUnlocalizedName(ExampleMod.MODID + ":pizza");
        this.setTextureName(ExampleMod.MODID + ":pizza");
        this.setCreativeTab(CreativeTabs.tabFood);

    }
    protected void  onFoodEaten(ItemStack itemstack, World world, EntityPlayer player) {
        player.addPotionEffect(new PotionEffect(1, 20, 255));
        super.onFoodEaten(itemstack, world, player);
    }

}
