package com.example.examplemod;

import com.google.common.collect.Sets;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Blocks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;

import java.util.Set;

@Mod(modid = ExampleMod.MODID, version = ExampleMod.VERSION)
public class ExampleMod {
    public static final String MODID = "examplemod";
    public static final String VERSION = "1.0";

    public static DragonIron dragon_iron;
    public static DragonScale dragonScale;
    public static DragonFire dragonFire;
    public static DragonFossilOre dragonFossilOre;
    public static DragonClaw dragonClaw;
    public static DragonSword dragonSword;
    public static final Item.ToolMaterial DRAGONCLAW_TOOL_MATERIAL = EnumHelper.addToolMaterial("dragonclaw_matrial", 0, 999999999, 0, 40, 10);
    public static DragonLeg dragonLeg;
    public static LuckyBlock luckyBlock;
    public static final ItemArmor.ArmorMaterial DRAGONSCALE_ARMOR_MATERIAL = EnumHelper.addArmorMaterial("ruby_armor_material", 1000, new int[]{10, 10, 10, 10}, 10);
    public static DragonArmor dragonHelmet;
    public static DragonArmor dragonLeggings;
    public static DragonArmor dragonChestplate;
    public static DragonArmor dragonBoots;


    @EventHandler
    public void init(FMLInitializationEvent event) {

        dragon_iron = new DragonIron(Material.iron);
        GameRegistry.registerBlock(dragon_iron, dragon_iron.getUnlocalizedName());
        dragonScale = new DragonScale();
        GameRegistry.registerItem(dragonScale, dragonScale.getUnlocalizedName());
        dragonFire = new DragonFire();
        GameRegistry.registerItem(dragonFire, dragonFire.getUnlocalizedName());
        dragonClaw = new DragonClaw();
        dragonLeg = new DragonLeg(10, 2.0f, true);
        GameRegistry.registerItem(dragonLeg, dragonLeg.getUnlocalizedName());
        Set swordBlocks = Sets.newHashSet(new Block[]{});
        GameRegistry.registerItem(dragonClaw, dragonClaw.getUnlocalizedName());
        dragonSword = new DragonSword(22.0f, DRAGONCLAW_TOOL_MATERIAL, swordBlocks);
        GameRegistry.registerItem(dragonSword, dragonSword.getUnlocalizedName());
        luckyBlock = new LuckyBlock(Material.rock);
        dragonHelmet = new DragonArmor(DRAGONSCALE_ARMOR_MATERIAL, 0, "dragon_helmet");
        GameRegistry.registerItem(dragonHelmet, dragonHelmet.getUnlocalizedName());
        dragonChestplate = new DragonArmor(DRAGONSCALE_ARMOR_MATERIAL, 1, "dragon_chestplate");
        GameRegistry.registerItem(dragonChestplate, dragonChestplate.getUnlocalizedName());
        dragonLeggings = new DragonArmor(DRAGONSCALE_ARMOR_MATERIAL, 2, "dragon_leggings");
        GameRegistry.registerItem(dragonLeggings, dragonLeggings.getUnlocalizedName());
        dragonBoots = new DragonArmor(DRAGONSCALE_ARMOR_MATERIAL, 3, "dragon_boots");
        GameRegistry.registerItem(dragonBoots, dragonBoots.getUnlocalizedName());
        dragonFossilOre = new DragonFossilOre(Material.rock);
        GameRegistry.registerBlock(dragonFossilOre, dragonFossilOre.getUnlocalizedName());
        GameRegistry.addShapedRecipe(new ItemStack(dragon_iron), "xxx", "xyx", "xxx", 'x', new ItemStack(dragonScale), 'y', new ItemStack(dragonFire));

        DragonFossilOreGen oreGen = new DragonFossilOreGen();
        GameRegistry.registerWorldGenerator(oreGen, 0);

        GameRegistry.addSmelting(dragonFossilOre, new ItemStack(dragonClaw, 2), 10.0f);

        int dragonBigGoodEntityId = EntityRegistry.findGlobalUniqueEntityId();
        int dragonBigGoodEntitynEggForegroundColor = (255 << 16) + (0 << 8) + 0;
        int dragonBigGoodEntityEggBackgroundColor = (0 << 16) + (0 << 8) + 255;

        EntityRegistry.registerGlobalEntityID(DragonBigGoodEntity.class, "entity_dragon_big_good", dragonBigGoodEntityId,
                dragonBigGoodEntitynEggForegroundColor, dragonBigGoodEntityEggBackgroundColor);

        EntityRegistry.registerModEntity(DragonBigGoodEntity.class, "entity_dragon_big_good", dragonBigGoodEntityId, this
                , 80, 1, true);

        RenderingRegistry.registerEntityRenderingHandler(DragonBigGoodEntity.class, new DragonBigGoodRender());

        for (BiomeGenBase biome : BiomeGenBase.getBiomeGenArray()) {
            if (biome != null) {
                EntityRegistry.addSpawn(DragonBigGoodEntity.class, 8, 1, 3, EnumCreatureType.ambient, biome);
            }
        }
        int dragonBigBadEntityId = EntityRegistry.findGlobalUniqueEntityId();
        int dragonBigBadEntitynEggForegroundColor = (0 << 16) + (0 << 8) + 255;
        int dragonBigBadEntityEggBackgroundColor = (96 << 16) + (156 << 8) + 0;

        EntityRegistry.registerGlobalEntityID(DragonBigBadEntity.class, "entity_dragon_big_bad", dragonBigBadEntityId,
                dragonBigGoodEntitynEggForegroundColor, dragonBigGoodEntityEggBackgroundColor);

        EntityRegistry.registerModEntity(DragonBigBadEntity.class, "entity_dragon_big_bad", dragonBigBadEntityId, this
                , 80, 1, true);

        RenderingRegistry.registerEntityRenderingHandler(DragonBigBadEntity.class, new DragonBadBigRender());

        for (BiomeGenBase biome : BiomeGenBase.getBiomeGenArray()) {
            if (biome != null) {
                EntityRegistry.addSpawn(DragonBigBadEntity.class, 8, 1, 3, EnumCreatureType.ambient, biome);
            }
        }

        int dragonBiomeWarmId = getFreeBiomeId();
        int dragonBiomeWarmProbability = 100;
        BiomeManager.addBiome(BiomeManager.BiomeType.WARM, new BiomeManager.BiomeEntry(
                new DragonBiome(dragonBiomeWarmId), dragonBiomeWarmProbability));
        int dragonBiomeCoolId = getFreeBiomeId();
        int dragonBiomeCoolProbability = 100;
        BiomeManager.addBiome(BiomeManager.BiomeType.COOL, new BiomeManager.BiomeEntry(
                new DragonBiome(dragonBiomeCoolId), dragonBiomeCoolProbability));
        int dragonBiomeDesertId = getFreeBiomeId();
        int dragonBiomeDesertProbability = 100;
        BiomeManager.addBiome(BiomeManager.BiomeType.DESERT, new BiomeManager.BiomeEntry(
                new DragonBiome(dragonBiomeDesertId), dragonBiomeDesertProbability));
        int dragonBiomeIcyId = getFreeBiomeId();
        int dragonBiomeIcyProbability = 100;
        BiomeManager.addBiome(BiomeManager.BiomeType.ICY, new BiomeManager.BiomeEntry(
                new DragonBiome(dragonBiomeIcyId), dragonBiomeIcyProbability));
        com.example.examplemod.EventHandler eventHandler = new com.example.examplemod.EventHandler();
        MinecraftForge.EVENT_BUS.register(eventHandler);
    }

    public int getFreeBiomeId() {
        int id = 0;
        id += BiomeManager.getBiomes(BiomeManager.BiomeType.COOL).size();
        id += BiomeManager.getBiomes(BiomeManager.BiomeType.DESERT).size();
        id += BiomeManager.getBiomes(BiomeManager.BiomeType.ICY).size();
        id += BiomeManager.getBiomes(BiomeManager.BiomeType.WARM).size();
        return id + 1;

    }
}


