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
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;

import java.util.Set;

@Mod(modid = ExampleMod.MODID, version = ExampleMod.VERSION)
public class ExampleMod
{
    public static final String MODID = "examplemod";
    public static final String VERSION = "1.0";

    public static RubbyBlock rubbyBlock;
    public static LuckyBlock luckyBlock;
    public static Pizza  pizza;
    public static RubyArmor rubyHelmet;
    public static RubyArmor rubyChestplate;
    public static RubyArmor rubbyLeggings;
    public static RubyArmor rubbyBoots;
    public static RubyItem rubyItem;
    public static RubyOre rubyOre;
    public static Sword rubySword;
    public static Item.ToolMaterial  RUBY_TOOL_MATERIAL =
            EnumHelper.addToolMaterial("ruby_sword",3 , 10000000, 100, 1000, 5);
    public static  final ItemArmor.ArmorMaterial RUBY_ARMOR_MATERIAL =
            EnumHelper.addArmorMaterial("ruby_armor_material",
                    300000000, new int[] { 100, 100, 100, 100}, 10);
    public static PortalA portalA;
    public static PortalB portalB;



    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        luckyBlock = new LuckyBlock(Material.iron);
        GameRegistry.registerBlock(luckyBlock, luckyBlock.getUnlocalizedName());
        rubbyBlock = new RubbyBlock(Material.iron);
        GameRegistry.registerBlock(rubbyBlock, rubbyBlock.getUnlocalizedName());
        // some example code
        System.out.println("DIRT BLOCK >> "+Blocks.dirt.getUnlocalizedName());
        rubyItem = new RubyItem();
        GameRegistry.registerItem(rubyItem, rubyItem.getUnlocalizedName());

        GameRegistry.addShapelessRecipe(new ItemStack(Items.diamond), new ItemStack(rubyItem));
        GameRegistry.addShapedRecipe(new ItemStack(rubbyBlock), "xxx", "xyx", "xxx",
                'x', new ItemStack(rubyItem), 'y', new ItemStack(Items.diamond));
        rubyOre = new RubyOre(Material.iron);
        GameRegistry.registerBlock(rubyOre, rubyOre.getUnlocalizedName());

        RubyOreGen oreGen = new RubyOreGen();
        GameRegistry.registerWorldGenerator(oreGen, 0);

        GameRegistry.addSmelting(rubyOre, new ItemStack(rubyItem, 3), 10.0f );

        Set sowrdBlocks = Sets.newHashSet(new Block[] {});
        rubySword = new Sword(22.0f, RUBY_TOOL_MATERIAL, sowrdBlocks);
        GameRegistry.registerItem(rubySword, rubySword.getUnlocalizedName());
        pizza = new Pizza(10, 10.0f, true );
        GameRegistry.addShapedRecipe(new ItemStack(pizza), "xxx", "xyx", "xxx", 'x', new
                ItemStack(Items.wheat), 'y', new ItemStack(Items.cooked_porkchop));
        rubyHelmet = new RubyArmor(RUBY_ARMOR_MATERIAL, 0, "ruby_helmet");
        GameRegistry.registerItem(rubyHelmet, rubyHelmet.getUnlocalizedName());
        rubyChestplate = new RubyArmor(RUBY_ARMOR_MATERIAL, 1, "ruby_chestplate");
        GameRegistry.registerItem(rubyChestplate, rubyChestplate.getUnlocalizedName());
        rubbyLeggings = new RubyArmor(RUBY_ARMOR_MATERIAL, 2, "ruby_leggings");
        GameRegistry.registerItem(rubbyLeggings, rubbyLeggings.getUnlocalizedName());
        rubbyBoots = new RubyArmor(RUBY_ARMOR_MATERIAL, 3, "rubby_boots");
        GameRegistry.registerItem(rubbyBoots, rubbyBoots.getUnlocalizedName());

        int humanEntityId = EntityRegistry.findGlobalUniqueEntityId();
        int humanEggForegroundColor = (255 << 8) + 255;
        int humanEggBackgroundColor = (0 <<16) +(0<<8)+0;

        EntityRegistry.registerGlobalEntityID(HumanEntity.class, "entity_human", humanEntityId,humanEggForegroundColor,
               humanEggBackgroundColor );

        EntityRegistry.registerModEntity(HumanEntity.class, "entity_human", humanEntityId, this, 80,
                1, true );

        EntityRegistry.addSpawn(HumanEntity.class, 8, 1, 3, EnumCreatureType.ambient, BiomeGenBase.plains );

        RenderingRegistry.registerEntityRenderingHandler(HumanEntity.class, new HumanRenderer());
        int elytraBiomeCoolID = getFreeBiomeID();
        int elytraBiomeCoolProbability= 100;
        BiomeManager.addBiome(BiomeManager.BiomeType.COOL, new BiomeManager.BiomeEntry(
        new ElytraBiome(elytraBiomeCoolID), elytraBiomeCoolProbability));

        int elytraBiomeWarmID = getFreeBiomeID();
        int elytraBiomeWarmProbability= 100;
        BiomeManager.addBiome(BiomeManager.BiomeType.WARM, new BiomeManager.BiomeEntry(
                new ElytraBiome(elytraBiomeWarmID), elytraBiomeWarmProbability));

        int elytraBiomeDesertID = getFreeBiomeID();
        int elytraBiomeDesertProbability = 100;
        BiomeManager.addBiome(BiomeManager.BiomeType.DESERT, new BiomeManager.BiomeEntry(
                new ElytraBiome(elytraBiomeDesertID), elytraBiomeDesertProbability));
        com.example.examplemod.EventHandler eventHandler =
                new com.example.examplemod.EventHandler();
        MinecraftForge.EVENT_BUS.register(eventHandler);
        portalA = new PortalA(Material.iron);
        GameRegistry.registerBlock(portalA , portalA.getUnlocalizedName());
        portalB = new PortalB(Material.iron);
        GameRegistry.registerBlock(portalB, portalB.getUnlocalizedName());



    }
    public int getFreeBiomeID() {
        int id = 0;
        id += BiomeManager.getBiomes(BiomeManager.BiomeType.COOL).size();
        id += BiomeManager.getBiomes(BiomeManager.BiomeType.DESERT).size();
        id += BiomeManager.getBiomes(BiomeManager.BiomeType.ICY).size();
        id += BiomeManager.getBiomes(BiomeManager.BiomeType.WARM).size();

        return id + 1;

    }
}
