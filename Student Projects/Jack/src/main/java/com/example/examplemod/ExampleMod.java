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
import net.minecraftforge.common.util.EnumHelper;

import java.util.Set;

@Mod(modid = ExampleMod.MODID, version = ExampleMod.VERSION)
public class ExampleMod {
    public static final String MODID = "examplemod";
    public static final String VERSION = "1.0";

    public static RubyBlock rubyBlock;
    public static RubyOre rubyOre;

    public static SaphireBlock saphireBlock;
    public static SaphireOre saphireOre;

    public static OnyxBlock onyxBlock;
    public static OnyxOre onyxOre;

    public static GreatBlock greatBlock;


    public static LuckyBlock luckyBlock;


    public static RubyItem rubyItem;
    public static SaphireItem saphireItem;
    public static OnyxItem onyxItem;

    public static GreatGem greatGem;


    public static Multitool multitool;
    public static final Item.ToolMaterial RUBY_TOOL_MATERIAL =
            EnumHelper.addToolMaterial("ruby material", 3, 999999999,
                    150, 8, 30);






    public static final Item.ToolMaterial SAPHIRE_SWORD_MATERIAL =
            EnumHelper.addToolMaterial("saphire material", 3, 999999999,
                    150, 25, 30);



    public static final Item.ToolMaterial ONYX_SWORD_MATERIAL =
            EnumHelper.addToolMaterial("onyx material", 3, 999999999,
                    150, 25, 30);



    public static final Item.ToolMaterial RUBY_SWORD_MATERIAL =
            EnumHelper.addToolMaterial("ruby sword material", 3, 999999999,
                    150, 25, 30);





    public static RubyBattleaxe rubyBattleaxe;
    public static SaphireBattleaxe saphireBattleaxe;
    public static OnyxBattleaxe onyxBattleaxe;


    public static GreatHoe greatHoe;


    public static Gapple gappleItem;


    public static MinersPick minersPick;

    public static GreatBattlehammer greatBattlehammer;

    public static final Item.ToolMaterial MINERS_TOOL_MATERIAL =
            EnumHelper.addToolMaterial("miners material", 3, 999999999,
                    30, 10, 60);

    public static final Item.ToolMaterial GREAT_HAMMER_MATERIAL =
            EnumHelper.addToolMaterial("great material", 3, 999999999, 30,
                    70, 100);




    public static RubyArmor rubyHelmet;
    public static RubyArmor rubyChestplate;
    public static RubyArmor rubyLegging;
    public static RubyArmor rubyBoots;

    public static final ItemArmor.ArmorMaterial RUBY_ARMOR_MATERIAL =
            EnumHelper.addArmorMaterial("ruby_armor_material", 999999999, new int[]{16, 10, 12, 12}, 50);


    public static SaphireArmor saphireHelmet;
    public static SaphireArmor saphireChestplate;
    public static SaphireArmor saphireLegging;
    public static SaphireArmor saphireBoots;

    public static final ItemArmor.ArmorMaterial SAPHIRE_ARMOR_MATERIAL =
            EnumHelper.addArmorMaterial("saphire_armor_material", 999999999, new int[]{16, 10, 12, 12}, 50);

    public static OnyxArmor onyxHelmet;
    public static OnyxArmor onyxChestplate;
    public static OnyxArmor onyxLegging;
    public static OnyxArmor onyxBoots;

    public static final ItemArmor.ArmorMaterial ONYX_ARMOR_MATERIAL =
            EnumHelper.addArmorMaterial("onyx_armor_material", 999999999, new int[]{16, 10, 12, 12}, 50);


    public static GreatArmor greatHelmet;
    public static GreatArmor greatChestplate;
    public static GreatArmor greatLegging;
    public static GreatArmor greatBoots;

    public static final ItemArmor.ArmorMaterial GREAT_ARMOR_MATERIAL =
            EnumHelper.addArmorMaterial("great_armor_material", 999999999, new int[]{32, 20, 24, 24}, 100);


    @EventHandler
    public void init(FMLInitializationEvent event) {

        rubyBlock = new RubyBlock(Material.iron);
        GameRegistry.registerBlock(rubyBlock, rubyBlock.getUnlocalizedName());

        rubyOre = new RubyOre(Material.iron);
        GameRegistry.registerBlock(rubyOre, rubyOre.getUnlocalizedName());

        saphireBlock = new SaphireBlock(Material.iron);
        GameRegistry.registerBlock(saphireBlock, saphireBlock.getUnlocalizedName());

        saphireOre = new SaphireOre(Material.iron);
        GameRegistry.registerBlock(saphireOre, saphireOre.getUnlocalizedName());

        onyxBlock = new OnyxBlock(Material.iron);
        GameRegistry.registerBlock(onyxBlock, onyxBlock.getUnlocalizedName());

        onyxOre = new OnyxOre(Material.iron);
        GameRegistry.registerBlock(onyxOre, onyxOre.getUnlocalizedName());


        greatBlock = new GreatBlock(Material.iron);
        GameRegistry.registerBlock(greatBlock, greatBlock.getUnlocalizedName());


        luckyBlock = new LuckyBlock(Material.iron);
        GameRegistry.registerBlock(luckyBlock, luckyBlock.getUnlocalizedName());


        rubyItem = new RubyItem();
        GameRegistry.registerItem(rubyItem, rubyItem.getUnlocalizedName());

        saphireItem = new SaphireItem();
        GameRegistry.registerItem(saphireItem, saphireItem.getUnlocalizedName());

        onyxItem = new OnyxItem();
        GameRegistry.registerItem(onyxItem, onyxItem.getUnlocalizedName());


        greatGem = new GreatGem();
        GameRegistry.registerItem(greatGem, greatGem.getUnlocalizedName());

        gappleItem = new Gapple(20, 2.0f, true);
        GameRegistry.registerItem(gappleItem, gappleItem.getUnlocalizedName());


        rubyHelmet = new RubyArmor(RUBY_ARMOR_MATERIAL, 0, "ruby_helmet");
        GameRegistry.registerItem(rubyHelmet, rubyHelmet.getUnlocalizedName());

        rubyChestplate = new RubyArmor(RUBY_ARMOR_MATERIAL, 1, "ruby_chestplate");
        GameRegistry.registerItem(rubyChestplate, rubyChestplate.getUnlocalizedName());

        rubyLegging = new RubyArmor(RUBY_ARMOR_MATERIAL, 2, "ruby_legging");
        GameRegistry.registerItem(rubyLegging, rubyLegging.getUnlocalizedName());

        rubyBoots = new RubyArmor(RUBY_ARMOR_MATERIAL, 3, "ruby_boots");
        GameRegistry.registerItem(rubyBoots, rubyBoots.getUnlocalizedName());


        saphireHelmet = new SaphireArmor(SAPHIRE_ARMOR_MATERIAL, 0, "saphire_helmet");
        GameRegistry.registerItem(saphireHelmet, saphireHelmet.getUnlocalizedName());

        saphireChestplate = new SaphireArmor(SAPHIRE_ARMOR_MATERIAL, 1, "saphire_chestplate");
        GameRegistry.registerItem(saphireChestplate, saphireChestplate.getUnlocalizedName());

        saphireLegging = new SaphireArmor(SAPHIRE_ARMOR_MATERIAL, 2, "saphire_legging");
        GameRegistry.registerItem(saphireLegging, saphireLegging.getUnlocalizedName());

        saphireBoots = new SaphireArmor(SAPHIRE_ARMOR_MATERIAL, 3, "saphire_boots");
        GameRegistry.registerItem(saphireBoots, saphireBoots.getUnlocalizedName());


        onyxHelmet = new OnyxArmor(ONYX_ARMOR_MATERIAL, 0, "onyx_helmet");
        GameRegistry.registerItem(onyxHelmet, onyxHelmet.getUnlocalizedName());

        onyxChestplate = new OnyxArmor(ONYX_ARMOR_MATERIAL, 1, "onyx_chestplate");
        GameRegistry.registerItem(onyxChestplate, onyxChestplate.getUnlocalizedName());

        onyxLegging = new OnyxArmor(ONYX_ARMOR_MATERIAL, 2, "onyx_legging");
        GameRegistry.registerItem(onyxLegging, onyxLegging.getUnlocalizedName());

        onyxBoots = new OnyxArmor(ONYX_ARMOR_MATERIAL, 3, "onyx_boots");
        GameRegistry.registerItem(onyxBoots, onyxBoots.getUnlocalizedName());


        greatHelmet = new GreatArmor(GREAT_ARMOR_MATERIAL, 0, "great_helmet");
        GameRegistry.registerItem(greatHelmet, greatHelmet.getUnlocalizedName());

        greatChestplate = new GreatArmor(GREAT_ARMOR_MATERIAL, 1, "great_chestplate");
        GameRegistry.registerItem(greatChestplate, greatChestplate.getUnlocalizedName());

        greatLegging = new GreatArmor(GREAT_ARMOR_MATERIAL, 2, "great_legging");
        GameRegistry.registerItem(greatLegging, greatLegging.getUnlocalizedName());

        greatBoots = new GreatArmor(GREAT_ARMOR_MATERIAL, 3, "great_boots");
        GameRegistry.registerItem(greatBoots, greatBoots.getUnlocalizedName());


        Set pickaxeBlocks = Sets.newHashSet(new Block[]{Blocks.cobblestone, Blocks.double_stone_slab, Blocks.stone_slab, Blocks.stone, Blocks.sandstone, Blocks.mossy_cobblestone, Blocks.iron_ore, Blocks.iron_block, Blocks.coal_ore, Blocks.gold_block, Blocks.gold_ore, Blocks.diamond_ore, Blocks.diamond_block, Blocks.ice, Blocks.netherrack, Blocks.lapis_ore, Blocks.lapis_block, Blocks.redstone_ore, Blocks.lit_redstone_ore, Blocks.rail, Blocks.detector_rail, Blocks.golden_rail, Blocks.activator_rail});
        Set shovelBlocks = Sets.newHashSet(new Block[]{Blocks.grass, Blocks.dirt, Blocks.sand, Blocks.gravel, Blocks.snow_layer, Blocks.snow, Blocks.clay, Blocks.farmland, Blocks.soul_sand, Blocks.mycelium});
        Set axeBlocks = Sets.newHashSet(new Block[]{Blocks.planks, Blocks.bookshelf, Blocks.log, Blocks.log2, Blocks.chest, Blocks.pumpkin, Blocks.lit_pumpkin});

        Set set_point = Sets.union(pickaxeBlocks, shovelBlocks);
        Set alt_blocks = Sets.union(set_point, axeBlocks);

        multitool = new Multitool(8.0f, RUBY_TOOL_MATERIAL, alt_blocks);
        GameRegistry.registerItem(multitool, multitool.getUnlocalizedName());


        greatHoe = new GreatHoe(RUBY_TOOL_MATERIAL);
        GameRegistry.registerItem(greatHoe, greatHoe.getUnlocalizedName());

        minersPick = new MinersPick(MINERS_TOOL_MATERIAL);
        GameRegistry.registerItem(minersPick, minersPick.getUnlocalizedName());




        rubyBattleaxe = new RubyBattleaxe(RUBY_SWORD_MATERIAL);
        GameRegistry.registerItem(rubyBattleaxe, rubyBattleaxe.getUnlocalizedName());

        saphireBattleaxe = new SaphireBattleaxe(SAPHIRE_SWORD_MATERIAL);
        GameRegistry.registerItem(saphireBattleaxe, saphireBattleaxe.getUnlocalizedName());

        onyxBattleaxe = new OnyxBattleaxe(ONYX_SWORD_MATERIAL);
        GameRegistry.registerItem(onyxBattleaxe, onyxBattleaxe.getUnlocalizedName());


        greatBattlehammer = new GreatBattlehammer(GREAT_HAMMER_MATERIAL);
        GameRegistry.registerItem(greatBattlehammer, greatBattlehammer.getUnlocalizedName());


        GameRegistry.addShapelessRecipe(new ItemStack(rubyItem, 9), new ItemStack(rubyBlock));

        GameRegistry.addShapedRecipe(new ItemStack(rubyBlock), "xxx", "xxx", "xxx", 'x', new ItemStack(rubyItem));


        GameRegistry.addShapelessRecipe(new ItemStack(saphireItem, 9), new ItemStack(saphireBlock));

        GameRegistry.addShapedRecipe(new ItemStack(saphireBlock), "xxx", "xxx", "xxx", 'x', new ItemStack(saphireItem));


        GameRegistry.addShapelessRecipe(new ItemStack(onyxItem, 9), new ItemStack(onyxBlock));

        GameRegistry.addShapedRecipe(new ItemStack(onyxBlock), "xxx", "xxx", "xxx", 'x', new ItemStack(onyxItem));


        GameRegistry.addShapedRecipe(new ItemStack(multitool), "xyy", "xso", "ozo", 'x', new ItemStack(rubyBlock), 'y', new ItemStack(saphireBlock), 'z', new ItemStack(onyxBlock), 's', new ItemStack(Items.stick));




        GameRegistry.addShapedRecipe(new ItemStack(greatGem), "xyz", "ooo", "ooo", 'x', new ItemStack(rubyItem), 'y', new ItemStack(saphireItem), 'z', new ItemStack(onyxItem));
        GameRegistry.addShapedRecipe(new ItemStack(greatBlock), "xxx", "xxx", "xxx", 'x', new ItemStack(greatGem));

        GameRegistry.addShapedRecipe(new ItemStack(rubyBattleaxe), "xxx", "ysy", "oso", 'x', new ItemStack(rubyBlock), 'y', new ItemStack(rubyItem), 's', new ItemStack(Items.stick));
        GameRegistry.addShapedRecipe(new ItemStack(saphireBattleaxe), "xxx", "ysy", "oso", 'x', new ItemStack(saphireBlock), 'y', new ItemStack(saphireItem), 's', new ItemStack(Items.stick));
        GameRegistry.addShapedRecipe(new ItemStack(onyxBattleaxe), "xxx", "ysy", "oso", 'x', new ItemStack(onyxBlock), 'y', new ItemStack(onyxItem), 's', new ItemStack(Items.stick));


        GameRegistry.addShapedRecipe(new ItemStack(greatBattlehammer), "xxx", "xsx", "oso", 'x', new ItemStack(greatBlock), 's', new ItemStack(Items.stick));
        GameRegistry.addShapedRecipe(new ItemStack(greatHoe), "oxx", "oso", "oso", 'x', new ItemStack(greatBlock), 's', new ItemStack(Items.stick));

        GameRegistry.addShapedRecipe(new ItemStack(minersPick), "xxx", "ysy", "oso", 'x', new ItemStack(greatBlock), 'y', new ItemStack(greatGem), 's', new ItemStack(Items.stick));


        GameRegistry.addShapedRecipe(new ItemStack(rubyHelmet), "xxx", "xox", "ooo", 'x', new ItemStack(rubyBlock));
        GameRegistry.addShapedRecipe(new ItemStack(rubyChestplate), "xox", "xxx", "xxx", 'x', new ItemStack(rubyBlock));
        GameRegistry.addShapedRecipe(new ItemStack(rubyLegging), "xxx", "xox", "xox", 'x', new ItemStack(rubyBlock));
        GameRegistry.addShapedRecipe(new ItemStack(rubyBoots), "ooo", "xox", "xox", 'x', new ItemStack(rubyBlock));

        GameRegistry.addShapedRecipe(new ItemStack(saphireHelmet), "xxx", "xox", "ooo", 'x', new ItemStack(saphireBlock));
        GameRegistry.addShapedRecipe(new ItemStack(saphireChestplate), "xox", "xxx", "xxx", 'x', new ItemStack(saphireBlock));
        GameRegistry.addShapedRecipe(new ItemStack(saphireLegging), "xxx", "xox", "xox", 'x', new ItemStack(saphireBlock));
        GameRegistry.addShapedRecipe(new ItemStack(saphireBoots), "ooo", "xox", "xox", 'x', new ItemStack(saphireBlock));

        GameRegistry.addShapedRecipe(new ItemStack(onyxHelmet), "xxx", "xox", "ooo", 'x', new ItemStack(onyxBlock));
        GameRegistry.addShapedRecipe(new ItemStack(onyxChestplate), "xox", "xxx", "xxx", 'x', new ItemStack(onyxBlock));
        GameRegistry.addShapedRecipe(new ItemStack(onyxLegging), "xxx", "xox", "xox", 'x', new ItemStack(onyxBlock));
        GameRegistry.addShapedRecipe(new ItemStack(onyxBoots), "ooo", "xox", "xox", 'x', new ItemStack(onyxBlock));


        GameRegistry.addShapedRecipe(new ItemStack(greatHelmet), "xxx", "xox", "ooo", 'x', new ItemStack(greatBlock));
        GameRegistry.addShapedRecipe(new ItemStack(greatChestplate), "xox", "xxx", "xxx", 'x', new ItemStack(greatBlock));
        GameRegistry.addShapedRecipe(new ItemStack(greatLegging), "xxx", "xox", "xox", 'x', new ItemStack(greatBlock));
        GameRegistry.addShapedRecipe(new ItemStack(greatBoots), "ooo", "xox", "xox", 'x', new ItemStack(greatBlock));

        GameRegistry.addShapedRecipe(new ItemStack(luckyBlock), "xxx", "xyx", "xxx", 'x', new ItemStack(Items.gold_ingot), 'y', new ItemStack(Blocks.iron_block) );




        GameRegistry.addSmelting(rubyOre, new ItemStack(rubyItem, 2), 10.0f);

        GameRegistry.addSmelting(saphireOre, new ItemStack(saphireItem, 2), 10.0f);

        GameRegistry.addSmelting(onyxOre, new ItemStack(onyxItem, 2), 10.0f);

        RubyOreGen oreGen = new RubyOreGen();
        GameRegistry.registerWorldGenerator(oreGen, 0);


        SaphireOreGen oreGen1 = new SaphireOreGen();
        GameRegistry.registerWorldGenerator(oreGen1, 0);


        OnyxOreGen oreGen2 = new OnyxOreGen();
        GameRegistry.registerWorldGenerator(oreGen2, 0);


        int humanEntityId = EntityRegistry.findGlobalUniqueEntityId();
        int humanEggForegroundColor = (255 << 16) + (255 << 8) + 255;
        int humanEggBackgroundColor = (0 << 16) + (0 << 8) + 0;


        EntityRegistry.registerGlobalEntityID(HumanEntity.class, "enetity_human", humanEntityId, humanEggForegroundColor, humanEggBackgroundColor);

        EntityRegistry.registerModEntity(HumanEntity.class, "entity_human", humanEntityId, this, 80, 1, true);

        EntityRegistry.addSpawn(HumanEntity.class, 8, 1, 3, EnumCreatureType.ambient, BiomeGenBase.plains);

        RenderingRegistry.registerEntityRenderingHandler(HumanEntity.class, new HumanRenderer());


        int overhangBiomeCoolId = getFreeBiomeId();
        int overhangBiomeCoolProbability = 40;
        OverhangBiome coolOverhangBiome = new OverhangBiome(overhangBiomeCoolId);
        BiomeManager.addBiome(BiomeManager.BiomeType.COOL, new BiomeManager.BiomeEntry(
                coolOverhangBiome, overhangBiomeCoolProbability));

        int overhangBiomeWarmId = getFreeBiomeId();
        int overhangBiomeWarmProbability = 40;
        OverhangBiome warmOverhangBiome = new OverhangBiome(overhangBiomeWarmId);
        BiomeManager.addBiome(BiomeManager.BiomeType.WARM, new BiomeManager.BiomeEntry(warmOverhangBiome, overhangBiomeWarmProbability));

        int overhangBiomeDesertId = getFreeBiomeId();
        int overhangBiomeDesertProbability = 10;
        OverhangBiome desertOverhangBiome = new OverhangBiome(overhangBiomeDesertId);
        BiomeManager.addBiome(BiomeManager.BiomeType.DESERT, new BiomeManager.BiomeEntry(desertOverhangBiome, overhangBiomeDesertProbability));


        int gapplecowEntityId = EntityRegistry.findGlobalUniqueEntityId();
        int gapplecowEggForegroundColor = (255 << 16) + (255 << 8) + 255;
        int gapplecowEggBackgroundColor = (0 << 16) + (0 << 8) + 0;


        EntityRegistry.registerGlobalEntityID(GappleCowEntity.class, "enetity_gapplecow", gapplecowEntityId, gapplecowEggForegroundColor, gapplecowEggBackgroundColor);

        EntityRegistry.registerModEntity(GappleCowEntity.class, "entity_gapplecow", gapplecowEntityId, this, 80, 1, true);

        EntityRegistry.addSpawn(GappleCowEntity.class, 1, 1, 1, EnumCreatureType.ambient, coolOverhangBiome);

        RenderingRegistry.registerEntityRenderingHandler(GappleCowEntity.class, new GappleCowRenderer());









        // some example code


        System.out.println("DIRT BLOCK >> " + Blocks.dirt.getUnlocalizedName());








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
