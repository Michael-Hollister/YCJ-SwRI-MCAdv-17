package com.example.examplemod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class DragonFire extends Item {
    public DragonFire(){
        this.setUnlocalizedName(ExampleMod.MODID + ":dragon_fire");
        this.setCreativeTab(CreativeTabs.tabMaterials);
        this.setTextureName(ExampleMod.MODID+":dragon_fire");
    }
}
