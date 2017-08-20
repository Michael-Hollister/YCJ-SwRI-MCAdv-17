package com.example.examplemod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class DragonLeg extends ItemFood {
    public DragonLeg(int foodValue, float saturation, boolean isWolfsFavoriteMeat) {
        super(foodValue, saturation, isWolfsFavoriteMeat);

        this.setUnlocalizedName(ExampleMod.MODID + ":dragon_leg");
        this.setCreativeTab(CreativeTabs.tabFood);
        this.setTextureName(ExampleMod.MODID + ":dragon_leg");

    }

    @Override
    protected void onFoodEaten(ItemStack itemStack, World world, EntityPlayer player) {
        player.addPotionEffect(new PotionEffect(1, 1999999999, 3));
        super.onFoodEaten(itemStack, world, player);
    }
}
