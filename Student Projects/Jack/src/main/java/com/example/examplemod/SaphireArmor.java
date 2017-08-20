package com.example.examplemod;


import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class SaphireArmor extends ItemArmor {
    public SaphireArmor(ArmorMaterial mat, int armorType, String name) {
        super(mat, 0, armorType);

        this.setUnlocalizedName(ExampleMod.MODID + ":" + name);
        this.setCreativeTab(CreativeTabs.tabCombat);
        this.setTextureName(ExampleMod.MODID + ":" + name);

    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity,
                                  int slot, String type) {

        if (slot == 2) {
            return ExampleMod.MODID + ":textures/models/armor/saphire_layer_2.png";
        }
        else {
            return ExampleMod.MODID + ":textures/models/armor/saphire_layer_1.png";
        }

    }

    @Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
        super.onArmorTick(world, player, itemStack);

        if (player.getCurrentArmor(3) != null && player.getCurrentArmor(3).getItem() == ExampleMod.saphireHelmet &&
                player.getCurrentArmor(2) != null && player.getCurrentArmor(2).getItem() == ExampleMod.saphireChestplate &&
                player.getCurrentArmor(1) != null && player.getCurrentArmor(1).getItem() == ExampleMod.saphireLegging &&
                player.getCurrentArmor(0) != null && player.getCurrentArmor(0).getItem() == ExampleMod.saphireBoots) {

            player.addPotionEffect(new PotionEffect((Potion.digSpeed.getId()), 100, 5));  }





    }
}

