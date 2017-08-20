package com.example.examplemod;

import com.google.common.collect.Sets;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;
import org.omg.CORBA.PUBLIC_MEMBER;

@Mod(modid = ExampleMod.MODID, version = ExampleMod.VERSION)
public class ExampleMod {
    public static final String MODID = "examplemod";
    public static final String VERSION = "1.0";

    public static roblock roblock;
    public static Roblockitem roblockThing;

    public static roblock_ore roblockOre;
    public static Multitool roblockMultitool;
    public static pizza pizzaItem;


    public static RoblockArmor roblockHelmet;
    public static RoblockArmor roblockChestplate;
    public static RoblockArmor roblockLegging;
    public static RoblockArmor roblockBoots;

    public static final Item.ToolMaterial ROBLOCK_TOOL_MATERIAL =
            EnumHelper.addToolMaterial("ruby_material", 99, 999999,
                    9999, 99999, 99999);

    public static final ItemArmor.ArmorMaterial ROBLOCK_ARMOR_MATERIAL =
            EnumHelper.addArmorMaterial("roblock_armor_material",
                    99999, new int[]{0, 0, 0, 0}, 40);

    @EventHandler
    public void init(FMLInitializationEvent event) {

        roblockHelmet = new RoblockArmor(ROBLOCK_ARMOR_MATERIAL, 0,
                "roblock_helmet");
        GameRegistry.registerItem(roblockHelmet, roblockHelmet.getUnlocalizedName());

        roblockChestplate = new RoblockArmor(ROBLOCK_ARMOR_MATERIAL, 1,
                "roblock_chestplate");
        GameRegistry.registerItem(roblockChestplate, roblockChestplate.getUnlocalizedName());

        roblockLegging = new RoblockArmor(ROBLOCK_ARMOR_MATERIAL, 0,
                "roblock_legging");
        GameRegistry.registerItem(roblockLegging, roblockLegging.getUnlocalizedName());

        roblockBoots = new RoblockArmor(ROBLOCK_ARMOR_MATERIAL, 0,
                "roblock_boots");
        GameRegistry.registerItem(roblockBoots, roblockBoots.getUnlocalizedName());


        roblock = new roblock(Material.iron);
        GameRegistry.registerBlock(roblock, roblock.getUnlocalizedName());

        roblockThing = new Roblockitem();
        GameRegistry.registerItem(roblockThing, roblockThing.getUnlocalizedName());

        roblockOre = new roblock_ore(Material.rock);
        GameRegistry.registerBlock(roblockOre, roblockOre.getUnlocalizedName());

        pizzaItem = new pizza(20, 20.0f, true);
        GameRegistry.registerItem(pizzaItem, pizzaItem.getUnlocalizedName());

        GameRegistry.addShapedRecipe(new ItemStack(pizzaItem), "xxx",
                "xxx", "xxx", 'x', new ItemStack(Items.stick));


        GameRegistry.addShapelessRecipe(new ItemStack(Items.diamond, 64), new ItemStack(roblockThing));
        GameRegistry.addShapedRecipe(new ItemStack(roblockThing), "xxx", "xyx", "xxx",
                'x', new ItemStack(roblockThing), 'y', new ItemStack(Items.diamond, 64));

        roblockoregen oregen = new roblockoregen();
        GameRegistry.registerWorldGenerator(oregen, 0);

        GameRegistry.addSmelting(roblockThing, new ItemStack(roblockThing, 2), 300.0f);


        com.example.examplemod.EventHandler eventHandler = new com.example.examplemod.EventHandler();
        MinecraftForge.EVENT_BUS.register(eventHandler);

        // some example code
        System.out.println("DIRT BLOCK >> " + Blocks.dirt.getUnlocalizedName());

        int dragonBiomeCoolId = getFreeBiomeId();
        int dragonBiomeCoolProbability = 10;
        BiomeManager.addBiome(BiomeManager.BiomeType.COOL, new BiomeManager.BiomeEntry(
                new DragonBiome(dragonBiomeCoolId), dragonBiomeCoolProbability));

        int dragonBiomeWarmId = getFreeBiomeId();
        int dragonBiomeWarmProbability = 15;
        BiomeManager.addBiome(BiomeManager.BiomeType.WARM, new BiomeManager.BiomeEntry(
                new DragonBiome(dragonBiomeWarmId), dragonBiomeWarmProbability));


    }

    public int getFreeBiomeId() {
        int id = 0;
        id += BiomeManager.getBiomes(BiomeManager.BiomeType.COOL).size();
        id += BiomeManager.getBiomes(BiomeManager.BiomeType.DESERT).size();
        id += BiomeManager.getBiomes(BiomeManager.BiomeType.ICY).size();
        id += BiomeManager.getBiomes(BiomeManager.BiomeType.WARM).size();

        return id = 1;
    }
}
