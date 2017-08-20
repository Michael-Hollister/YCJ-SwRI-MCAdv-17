package com.example.examplemod;


import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class OnyxArmor extends ItemArmor {
    public OnyxArmor(ArmorMaterial mat, int armorType, String name) {
        super(mat, 0, armorType);

        this.setUnlocalizedName(ExampleMod.MODID + ":" + name);
        this.setCreativeTab(CreativeTabs.tabCombat);
        this.setTextureName(ExampleMod.MODID + ":" + name);

    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity,
                                  int slot, String type) {

        if (slot == 2) {
            return ExampleMod.MODID + ":textures/models/armor/onyx_layer_2.png";
        }
        else {
            return ExampleMod.MODID + ":textures/models/armor/onyx_layer_1.png";
        }

    }

    @Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
        super.onArmorTick(world, player, itemStack);

        if (player.getCurrentArmor(3) != null && player.getCurrentArmor(3).getItem() == ExampleMod.onyxHelmet &&
                player.getCurrentArmor(2) != null && player.getCurrentArmor(2).getItem() == ExampleMod.onyxChestplate &&
                player.getCurrentArmor(1) != null && player.getCurrentArmor(1).getItem() == ExampleMod.onyxLegging &&
                player.getCurrentArmor(0) != null && player.getCurrentArmor(0).getItem() == ExampleMod.onyxBoots) {

            player.addPotionEffect(new PotionEffect((Potion.damageBoost.getId()), 100, 5));  }





    }
}

