package com.example.examplemod;

import com.google.common.collect.Sets;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockAir;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Blocks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import net.minecraft.init.Items;
import net.minecraft.item.*;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.EmptyChunk;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;

import java.rmi.registry.Registry;
import java.util.Set;

import static net.minecraft.item.EnumAction.block;
import static net.minecraft.world.biome.BiomeGenBase.forest;

@Mod(modid = ExampleMod.MODID, version = ExampleMod.VERSION)
public class ExampleMod
{
    public static final String MODID = "examplefile";
    public static final String VERSION = "1.0";

    public static luckyblock Luckyblock;
    public static pizza pizzaItem;
    public static rubyore rubyOre;
    public static RubyBlock rubyBlock;
    public static Rubyitem rubyitem;
    public static Multitool rubyMultitool;
    public static Item.ToolMaterial RUBY_TOOL_MATERIAL =
            EnumHelper.addToolMaterial("ruby_tool", 3, 1000000000,
                    1000000000, 1000000000, 1000000000);

    public static final ItemArmor.ArmorMaterial RUBY_ARMOR_MATERIAL =
            EnumHelper.addArmorMaterial("ruby_armor_material", 1000000000, new int[] { 1000000000, 1000000000, 1000000000, 1000000000},10);

    public static armor rubyhelmet;
    public static armor rubychestplate;
    public static armor rubyleggings;
    public static armor rubyboots;


    @EventHandler
    public void init(FMLInitializationEvent event) {

        rubyhelmet = new armor(RUBY_ARMOR_MATERIAL, 0,
                "ruby_helmet");
        GameRegistry.registerItem(rubyhelmet, rubyhelmet.getUnlocalizedName());

        rubychestplate = new armor(RUBY_ARMOR_MATERIAL, 1,
                "ruby_chestplate");
        GameRegistry.registerItem(rubychestplate, rubychestplate.getUnlocalizedName());

        rubyleggings = new armor(RUBY_ARMOR_MATERIAL, 2,
                "ruby_leggings");

        GameRegistry.registerItem(rubyleggings, rubyleggings.getUnlocalizedName());

        rubyboots = new armor(RUBY_ARMOR_MATERIAL, 3,
                "ruby_boots");
        GameRegistry.registerItem(rubyboots, rubyboots.getUnlocalizedName());


        Luckyblock = new luckyblock(Material.iron);
        GameRegistry.registerBlock(Luckyblock, Luckyblock.getUnlocalizedName());


        rubyBlock = new RubyBlock(Material.iron);
        GameRegistry.registerBlock(rubyBlock, rubyBlock.getUnlocalizedName());

        rubyitem = new Rubyitem();
        GameRegistry.registerItem(rubyitem, rubyitem.getUnlocalizedName());

        pizzaItem = new pizza(20, 1000000000.0f, true);
        GameRegistry.registerItem(pizzaItem, pizzaItem.getUnlocalizedName());

        GameRegistry.addShapedRecipe(new ItemStack(pizzaItem), "xyx", "xxx", "xxx", 'x', new ItemStack(Items.wheat),
                'y', new ItemStack(Items.cooked_porkchop));

        rubyOre = new rubyore(Material.iron);
        GameRegistry.registerBlock(rubyOre, rubyOre.getUnlocalizedName());


        GameRegistry.addShapedRecipe(new ItemStack(rubyBlock), "xxx", "xxx", "xxx",
                'x', new ItemStack(rubyitem));

        GameRegistry.addShapelessRecipe(new ItemStack(rubyitem), new ItemStack(rubyBlock));

        rubyoregen oreGen = new rubyoregen();
        GameRegistry.registerWorldGenerator(oreGen, 0);


        GameRegistry.addSmelting(rubyOre, new ItemStack(rubyitem, 1), 1000000.0f);

        Set pickaxeBlocks = Sets.newHashSet(new Block[]{Blocks.cobblestone, Blocks.double_stone_slab,
                Blocks.stone_slab, Blocks.stone, Blocks.sandstone, Blocks.mossy_cobblestone,
                Blocks.iron_ore, Blocks.iron_block, Blocks.coal_ore, Blocks.gold_block,
                Blocks.gold_ore, Blocks.diamond_ore, Blocks.diamond_block, Blocks.ice,
                Blocks.netherrack, Blocks.lapis_ore, Blocks.lapis_block, Blocks.redstone_ore,
                Blocks.lit_redstone_ore, Blocks.rail, Blocks.detector_rail, Blocks.golden_rail,
                Blocks.activator_rail});



        Set axe = Sets.newHashSet(new Block[]{Blocks.planks, Blocks.bookshelf, Blocks.log, Blocks.log2, Blocks.chest, Blocks.pumpkin, Blocks.lit_pumpkin});

        Set shovelBlocks = Sets.newHashSet(new Block[]{Blocks.grass, Blocks.dirt, Blocks.sand, Blocks.gravel, Blocks.snow_layer, Blocks.snow, Blocks.clay, Blocks.farmland, Blocks.soul_sand, Blocks.mycelium});

        rubyMultitool = new Multitool(100000000000000.0f, RUBY_TOOL_MATERIAL, pickaxeBlocks);

        com.example.examplemod.eventhandler EventHandler =
                new com.example.examplemod.eventhandler();
        MinecraftForge.EVENT_BUS.register(EventHandler);

        int humanEntityId;
        humanEntityId = EntityRegistry.findGlobalUniqueEntityId();
        int humanEggForegroundColor = (255 << 16) + (0 << 8) + 0;
        int humanEggBackgroundgroundColor = (0 << 16) + (0 << 8) + 0;

        EntityRegistry.registerGlobalEntityID(steveentinty.class,
                "entity_human", humanEntityId, humanEggForegroundColor, humanEggBackgroundgroundColor);

        EntityRegistry.registerModEntity(steveentinty.class,
                "entity_human", humanEntityId, this, 800,
                100, true);

        EntityRegistry.addSpawn(steveentinty.class, 8, 1, 3,
                EnumCreatureType.ambient, BiomeGenBase.desert);

        RenderingRegistry.registerEntityRenderingHandler(steveentinty.class,
                new HumanRenderer());

        // some example code
        System.out.println("DIRT BLOCK >> " + Blocks.dirt.getUnlocalizedName());

        Sets.union(pickaxeBlocks, shovelBlocks);

        int biomeCoolId = getFreeBiomeId();
        int biomeCoolProbability = 1000;
        BiomeManager.addBiome(BiomeManager.BiomeType.COOL, new BiomeManager.BiomeEntry(new biome(biomeCoolId),
                biomeCoolProbability));

        int biomeWarmId = getFreeBiomeId();
        int biomeWarmProbability = 1000;
        BiomeManager.addBiome(BiomeManager.BiomeType.WARM, new BiomeManager.BiomeEntry(
        new biome(biomeWarmId), biomeWarmProbability));



    }

    public int getFreeBiomeId(){
        int id = 0;
        id += BiomeManager.getBiomes(BiomeManager.BiomeType.COOL).size();
        id += BiomeManager.getBiomes(BiomeManager.BiomeType.DESERT).size();
        id += BiomeManager.getBiomes(BiomeManager.BiomeType.ICY).size();
        id += BiomeManager.getBiomes(BiomeManager.BiomeType.WARM).size();

        return id + 1;
    }

}


