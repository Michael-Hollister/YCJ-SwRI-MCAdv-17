package com.example.examplemod;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.common.BiomeManager;

public class armor extends ItemArmor {
    public armor(ArmorMaterial mat, int armorType, String name) {
        super(mat, 0, armorType);

        this.setUnlocalizedName(ExampleMod.MODID + ":" + name);
        this.setCreativeTab(CreativeTabs.tabCombat);
        this.setTextureName(ExampleMod.MODID + ":" + name);
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {

        if (slot == 2) {
            return ExampleMod.MODID + ":textures/models/armor/ruby_layer_2.png";
        }
        else { // All other armor slots
            return ExampleMod.MODID + ":textures/models/armor/ruby_layer_1.png";
        }

    }

    @Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
        super.onArmorTick(world, player, itemStack);

        if (player.getCurrentArmor(1) != null &&
                player.getCurrentArmor(1).getItem() == ExampleMod.rubyleggings);
            player.addPotionEffect(new PotionEffect(Potion.moveSpeed.getId(),
                    1000000000, 1000000000));
    }




}
