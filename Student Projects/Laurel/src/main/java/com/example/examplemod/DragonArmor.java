package com.example.examplemod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class DragonArmor extends ItemArmor {
    public DragonArmor(ArmorMaterial mat, int armorType, String name) {
        super (mat, 0, armorType);
        this.setUnlocalizedName(ExampleMod.MODID + ":" + name);
        this.setCreativeTab(CreativeTabs.tabCombat);
        this.setTextureName(ExampleMod.MODID + ":" + name);
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {

        if (slot == 2){
            return ExampleMod.MODID + ":textures/models/armor/dragon_armor_2.png";

        }
        else {
            return ExampleMod.MODID + ":textures/models/armor/dragon_armor.png";
        }
    }

    @Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
        super.onArmorTick(world, player, itemStack);

        if (player.getCurrentArmor(1) != null&& player.getCurrentArmor(1).getItem() == ExampleMod.dragonLeggings) player.addPotionEffect(new PotionEffect(Potion.fireResistance.getId(), 20, 255));
        if (player.getCurrentArmor(1) != null&& player.getCurrentArmor(0).getItem() == ExampleMod.dragonBoots) player.addPotionEffect(new PotionEffect(Potion.fireResistance.getId(), 20, 255));
        if (player.getCurrentArmor(1) != null&& player.getCurrentArmor(2).getItem() == ExampleMod.dragonChestplate) player.addPotionEffect(new PotionEffect(Potion.fireResistance.getId(), 20, 255));
        if (player.getCurrentArmor(1) != null&& player.getCurrentArmor(3).getItem() == ExampleMod.dragonHelmet) player.addPotionEffect(new PotionEffect(Potion.fireResistance.getId(), 20, 255));
    }
}
