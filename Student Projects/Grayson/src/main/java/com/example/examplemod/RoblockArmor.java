package com.example.examplemod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;


public class RoblockArmor extends ItemArmor {
    public RoblockArmor(ArmorMaterial mat, int armorType, String name) {
        super(mat, 0, armorType);

        this.setUnlocalizedName(ExampleMod.MODID + ":" + name);
        this.setCreativeTab(CreativeTabs.tabCombat);
        this.setTextureName(ExampleMod.MODID + ":" + name);
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
        if (slot == 1) {
            return ExampleMod.MODID + ":textures/models/armor/roblock_layer 2.png";
        } else { // all other armor slots
            return ExampleMod.MODID + ":textures/models/armor/roblock_layer 1.png";
        }
    }

    @Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
        super.onArmorTick(world, player, itemStack);
    }



}





