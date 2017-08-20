package com.example.examplemod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class Gapple extends ItemFood {
    public Gapple(int foodValue, float saturation, boolean isWolvesFavoriteFood) {
        super(foodValue, saturation, isWolvesFavoriteFood);

   this.setUnlocalizedName(ExampleMod.MODID + ":Gapple");
   this.setCreativeTab(CreativeTabs.tabFood);
   this.setTextureName(ExampleMod.MODID + ":Gapple");



    }

    @Override
    protected void onFoodEaten(ItemStack itemStack, World world, EntityPlayer player)  {
        player.addPotionEffect(new PotionEffect(1, 9999999, 4));
        player.addPotionEffect(new PotionEffect(3, 9999999, 4));
        player.addPotionEffect(new PotionEffect(5, 9999999, 4));
        player.addPotionEffect(new PotionEffect(8, 9999999, 4));
        player.addPotionEffect(new PotionEffect(10, 9999999, 4));
        player.addPotionEffect(new PotionEffect(11, 9999999, 4));
        player.addPotionEffect(new PotionEffect(12, 9999999, 4));
        player.addPotionEffect(new PotionEffect(14, 9999999, 4));
        player.addPotionEffect(new PotionEffect(16, 9999999, 4));
        super.onFoodEaten(itemStack, world, player);
    }
}
