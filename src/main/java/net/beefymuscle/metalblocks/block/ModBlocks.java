package net.beefymuscle.metalblocks.block;

import net.beefymuscle.metalblocks.BeefsMetalBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.registry.OxidizableBlocksRegistry;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import javax.swing.table.TableStringConverter;

import static net.minecraft.block.Blocks.CHISELED_COPPER;
import static net.minecraft.block.Blocks.createLightLevelFromLitBlockState;

public class ModBlocks {
    /***********************************************New Iron Blocks****************************************************/
    public static final Block CUT_IRON = registerBlock("cut_iron",
        new Block(
                AbstractBlock.Settings.create()
                        .mapColor(MapColor.IRON_GRAY)
                        .strength(5.0F, 6.0F)
                        .requiresTool()
                        .sounds(BlockSoundGroup.METAL)));

    public static final Block CUT_IRON_SLAB = registerBlock("cut_iron_slab",
            new SlabBlock(AbstractBlock.Settings.copy(ModBlocks.CUT_IRON)));

    public static final Block CUT_IRON_STAIRS = registerBlock("cut_iron_stairs",
            new StairsBlock(ModBlocks.CUT_IRON.getDefaultState(), AbstractBlock.Settings.copy(ModBlocks.CUT_IRON)));

    public static final Block SMOOTH_IRON = registerBlock("smooth_iron",
            new Block(AbstractBlock.Settings.copy(CUT_IRON)));

    public static final Block CHISELED_IRON = registerBlock("chiseled_iron",
            new Block(AbstractBlock.Settings.copy(CHISELED_COPPER)));

    public static final Block POLISHED_IRON = registerBlock("polished_iron",
            new Block(AbstractBlock.Settings.copy(CUT_IRON)));


    /**********************************************New Gold Blocks*****************************************************/
    public static final Block CUT_GOLD = registerBlock("cut_gold",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.GOLD)
                            .strength(4.0F, 6.0F)
                            .requiresTool()
                            .sounds(BlockSoundGroup.METAL)));
    public static final Block CUT_GOLD_SLAB = registerBlock("cut_gold_slab",
            new SlabBlock(AbstractBlock.Settings.copy(ModBlocks.CUT_GOLD)));

    public static final Block CUT_GOLD_STAIRS = registerBlock("cut_gold_stairs",
            new StairsBlock(ModBlocks.CUT_GOLD.getDefaultState(), AbstractBlock.Settings.copy(ModBlocks.CUT_IRON)));

    public static final Block SMOOTH_GOLD = registerBlock("smooth_gold",
            new Block(AbstractBlock.Settings.copy(CUT_GOLD)));

    public static final Block CHISELED_GOLD = registerBlock("chiseled_gold",
            new Block(AbstractBlock.Settings.copy(CUT_GOLD)));

    public static final Block REINFORCED_GOLD = registerBlock("reinforced_gold",
            new Block(AbstractBlock.Settings.copy(CUT_GOLD)));


    /***************************************Reinforced Copper Oxidization Blocks***************************************/
    public static final Block REINFORCED_COPPER = registerBlock("reinforced_copper",
            new OxidizableBlock(Oxidizable.OxidationLevel.UNAFFECTED,
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.ORANGE)
                            .requiresTool()
                            .strength(3.0F, 6.0F)
                            .sounds(BlockSoundGroup.COPPER)
            )
    );
    public static final Block EXPOSED_REINFORCED_COPPER = registerBlock("exposed_reinforced_copper",
             new OxidizableBlock(Oxidizable.OxidationLevel.EXPOSED,
                    AbstractBlock.Settings.copy(REINFORCED_COPPER).mapColor(MapColor.TERRACOTTA_LIGHT_GRAY))
    );
    public static final Block WEATHERED_REINFORCED_COPPER = registerBlock("weathered_reinforced_copper",
             new OxidizableBlock(Oxidizable.OxidationLevel.WEATHERED,
                    AbstractBlock.Settings.copy(REINFORCED_COPPER).mapColor(MapColor.DARK_AQUA))
    );
    public static final Block OXIDIZED_REINFORCED_COPPER = registerBlock("oxidized_reinforced_copper",
             new OxidizableBlock(Oxidizable.OxidationLevel.OXIDIZED,
                    AbstractBlock.Settings.copy(REINFORCED_COPPER).mapColor(MapColor.TEAL)));

    /*****************************************Reinforced Copper Waxed Blocks*******************************************/
    public static final Block WAXED_REINFORCED_COPPER = registerBlock("waxed_reinforced_copper",
            new Block(AbstractBlock.Settings.copy(REINFORCED_COPPER)));

    public static final Block WAXED_EXPOSED_REINFORCED_COPPER = registerBlock("waxed_exposed_reinforced_copper",
            new Block(AbstractBlock.Settings.copy(EXPOSED_REINFORCED_COPPER)));

    public static final Block WAXED_WEATHERED_REINFORCED_COPPER = registerBlock("waxed_weathered_reinforced_copper",
            new Block(AbstractBlock.Settings.copy(WEATHERED_REINFORCED_COPPER)));

    public static final Block WAXED_OXIDIZED_REINFORCED_COPPER = registerBlock("waxed_oxidized_reinforced_copper",
            new Block(AbstractBlock.Settings.copy(OXIDIZED_REINFORCED_COPPER)));

    /***************************************Polished Copper Oxidization Blocks*****************************************/
    public static final Block POLISHED_COPPER = registerBlock("polished_copper",
            new OxidizableBlock(Oxidizable.OxidationLevel.UNAFFECTED,
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.ORANGE)
                            .requiresTool()
                            .strength(3.0F, 6.0F)
                            .sounds(BlockSoundGroup.COPPER)
            )
    );
    public static final Block EXPOSED_POLISHED_COPPER = registerBlock("exposed_polished_copper",
            new OxidizableBlock(Oxidizable.OxidationLevel.EXPOSED,
                    AbstractBlock.Settings.copy(REINFORCED_COPPER).mapColor(MapColor.TERRACOTTA_LIGHT_GRAY))
    );
    public static final Block WEATHERED_POLISHED_COPPER = registerBlock("weathered_polished_copper",
            new OxidizableBlock(Oxidizable.OxidationLevel.WEATHERED,
                    AbstractBlock.Settings.copy(REINFORCED_COPPER).mapColor(MapColor.DARK_AQUA))
    );
    public static final Block OXIDIZED_POLISHED_COPPER = registerBlock("oxidized_polished_copper",
            new OxidizableBlock(Oxidizable.OxidationLevel.OXIDIZED,
                    AbstractBlock.Settings.copy(POLISHED_COPPER).mapColor(MapColor.TEAL)));

    /******************************************Polished Copper Waxed Blocks********************************************/
    public static final Block WAXED_POLISHED_COPPER = registerBlock("waxed_polished_copper",
            new Block(AbstractBlock.Settings.copy(POLISHED_COPPER)));

    public static final Block WAXED_EXPOSED_POLISHED_COPPER = registerBlock("waxed_exposed_polished_copper",
            new Block(AbstractBlock.Settings.copy(EXPOSED_POLISHED_COPPER)));

    public static final Block WAXED_WEATHERED_POLISHED_COPPER = registerBlock("waxed_weathered_polished_copper",
            new Block(AbstractBlock.Settings.copy(WEATHERED_POLISHED_COPPER)));

    public static final Block WAXED_OXIDIZED_POLISHED_COPPER = registerBlock("waxed_oxidized_polished_copper",
            new Block(AbstractBlock.Settings.copy(OXIDIZED_POLISHED_COPPER)));


    /***********************************************New Grate Blocks***************************************************/
    public static final Block IRON_GRATE = registerBlock("iron_grate",
            new GrateBlock(
                    AbstractBlock.Settings.create()
                            .strength(5.0F, 6.0F)
                            .sounds(BlockSoundGroup.COPPER_GRATE)
                            .mapColor(MapColor.IRON_GRAY)
                            .nonOpaque()
                            .requiresTool()
                            .allowsSpawning(Blocks::never)
                            .solidBlock(Blocks::never)
                            .suffocates(Blocks::never)
                            .blockVision(Blocks::never)));

    public static final Block GOLD_GRATE = registerBlock("gold_grate",
            new GrateBlock(
                    AbstractBlock.Settings.create()
                            .strength(4.0F, 6.0F)
                            .sounds(BlockSoundGroup.COPPER_GRATE)
                            .mapColor(MapColor.GOLD)
                            .nonOpaque()
                            .requiresTool()
                            .allowsSpawning(Blocks::never)
                            .solidBlock(Blocks::never)
                            .suffocates(Blocks::never)
                            .blockVision(Blocks::never)));


    /*******************************************New Oxidizing Bars Blocks**********************************************/
    public static final Block COPPER_BARS = registerBlock("copper_bars",
            new OxidizablePaneBlock(Oxidizable.OxidationLevel.UNAFFECTED,
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.ORANGE)
                            .requiresTool()
                            .strength(3.0F, 6.0F)
                            .sounds(BlockSoundGroup.COPPER)));

    public static final Block EXPOSED_COPPER_BARS = registerBlock("exposed_copper_bars",
            new OxidizablePaneBlock(Oxidizable.OxidationLevel.EXPOSED,
                    AbstractBlock.Settings.copy(COPPER_BARS).mapColor(MapColor.TERRACOTTA_LIGHT_GRAY)));

    public static final Block WEATHERED_COPPER_BARS = registerBlock("weathered_copper_bars",
            new OxidizablePaneBlock(Oxidizable.OxidationLevel.WEATHERED,
                    AbstractBlock.Settings.copy(COPPER_BARS).mapColor(MapColor.DARK_AQUA)));

    public static final Block OXIDIZED_COPPER_BARS = registerBlock("oxidized_copper_bars",
            new OxidizablePaneBlock(Oxidizable.OxidationLevel.OXIDIZED,
                    AbstractBlock.Settings.copy(COPPER_BARS).mapColor(MapColor.TEAL)));


    /*********************************************New Waxed Bars Blocks************************************************/
    public static final Block WAXED_COPPER_BARS = registerBlock("waxed_copper_bars",
            new PaneBlock(AbstractBlock.Settings.copy(COPPER_BARS)));

    public static final Block WAXED_EXPOSED_COPPER_BARS = registerBlock("waxed_exposed_copper_bars",
            new PaneBlock(AbstractBlock.Settings.copy(EXPOSED_COPPER_BARS)));

    public static final Block WAXED_WEATHERED_COPPER_BARS = registerBlock("waxed_weathered_copper_bars",
            new PaneBlock(AbstractBlock.Settings.copy(WEATHERED_COPPER_BARS)));

    public static final Block WAXED_OXIDIZED_COPPER_BARS = registerBlock("waxed_oxidized_copper_bars",
            new PaneBlock(AbstractBlock.Settings.copy(OXIDIZED_COPPER_BARS)));


    /************************************************New Bars Blocks***************************************************/
    public static final Block GOLD_BARS = registerBlock("gold_bars",
            new PaneBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .strength(3.0F, 6.0F)
                    .sounds(BlockSoundGroup.METAL)
                    .nonOpaque()));


    /***********************************************New Bulb Blocks****************************************************/
    public static final Block GOLD_BULB = registerBlock("gold_bulb",
            new BulbBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.GOLD)
                            .strength(3.0F, 6.0F)
                            .sounds(BlockSoundGroup.COPPER_BULB)
                            .requiresTool()
                            .solidBlock(Blocks::never)
                            .luminance(createLightLevelFromLitBlockState(15))));

    public static final Block IRON_BULB = registerBlock("iron_bulb",
            new BulbBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.GOLD)
                            .strength(3.0F, 6.0F)
                            .sounds(BlockSoundGroup.COPPER_BULB)
                            .requiresTool()
                            .solidBlock(Blocks::never)
                            .luminance(createLightLevelFromLitBlockState(15))));


    /**********************************************New Trapdoor Block**************************************************/
    public static final Block GOLD_TRAPDOOR = registerBlock("gold_trapdoor",
            new TrapdoorBlock(BlockSetType.IRON,
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.GOLD)
                            .requiresTool()
                            .strength(4.0F)
                            .nonOpaque()
                            .allowsSpawning(Blocks::never)));


/*******************************************Registers Oxidizable/Waxable Blocks****************************************/
public static void registerOxidizable() {
    OxidizableBlocksRegistry.registerOxidizableBlockPair(POLISHED_COPPER, EXPOSED_POLISHED_COPPER);
    OxidizableBlocksRegistry.registerOxidizableBlockPair(EXPOSED_POLISHED_COPPER, WEATHERED_POLISHED_COPPER);
    OxidizableBlocksRegistry.registerOxidizableBlockPair(WEATHERED_POLISHED_COPPER, OXIDIZED_POLISHED_COPPER);
    OxidizableBlocksRegistry.registerWaxableBlockPair(POLISHED_COPPER, WAXED_POLISHED_COPPER);
    OxidizableBlocksRegistry.registerWaxableBlockPair(EXPOSED_POLISHED_COPPER, WAXED_EXPOSED_POLISHED_COPPER);
    OxidizableBlocksRegistry.registerWaxableBlockPair(WEATHERED_POLISHED_COPPER, WAXED_WEATHERED_POLISHED_COPPER);
    OxidizableBlocksRegistry.registerWaxableBlockPair(OXIDIZED_POLISHED_COPPER, WAXED_OXIDIZED_POLISHED_COPPER);

    OxidizableBlocksRegistry.registerOxidizableBlockPair(REINFORCED_COPPER, EXPOSED_REINFORCED_COPPER);
    OxidizableBlocksRegistry.registerOxidizableBlockPair(EXPOSED_REINFORCED_COPPER, WEATHERED_REINFORCED_COPPER);
    OxidizableBlocksRegistry.registerOxidizableBlockPair(WEATHERED_REINFORCED_COPPER, OXIDIZED_REINFORCED_COPPER);
    OxidizableBlocksRegistry.registerWaxableBlockPair(REINFORCED_COPPER, WAXED_REINFORCED_COPPER);
    OxidizableBlocksRegistry.registerWaxableBlockPair(EXPOSED_REINFORCED_COPPER, WAXED_EXPOSED_REINFORCED_COPPER);
    OxidizableBlocksRegistry.registerWaxableBlockPair(WEATHERED_REINFORCED_COPPER, WAXED_WEATHERED_REINFORCED_COPPER);
    OxidizableBlocksRegistry.registerWaxableBlockPair(OXIDIZED_REINFORCED_COPPER, WAXED_OXIDIZED_REINFORCED_COPPER);

    OxidizableBlocksRegistry.registerOxidizableBlockPair(COPPER_BARS, EXPOSED_COPPER_BARS);
    OxidizableBlocksRegistry.registerOxidizableBlockPair(EXPOSED_COPPER_BARS, WEATHERED_COPPER_BARS);
    OxidizableBlocksRegistry.registerOxidizableBlockPair(WEATHERED_COPPER_BARS, OXIDIZED_COPPER_BARS);
    OxidizableBlocksRegistry.registerWaxableBlockPair(COPPER_BARS, WAXED_COPPER_BARS);
    OxidizableBlocksRegistry.registerWaxableBlockPair(EXPOSED_COPPER_BARS, WAXED_EXPOSED_COPPER_BARS);
    OxidizableBlocksRegistry.registerWaxableBlockPair(WEATHERED_COPPER_BARS, WAXED_WEATHERED_COPPER_BARS);
    OxidizableBlocksRegistry.registerWaxableBlockPair(OXIDIZED_COPPER_BARS, WAXED_OXIDIZED_COPPER_BARS);
}
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(BeefsMetalBlocks.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(BeefsMetalBlocks.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }


    public static void registerModBlocks() {
        BeefsMetalBlocks.LOGGER.info("Registering Mod Blocks for " + BeefsMetalBlocks.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ModBlocks.CUT_IRON);
            entries.add(ModBlocks.SMOOTH_IRON);
            entries.add(ModBlocks.CUT_IRON_SLAB);
            entries.add(ModBlocks.CUT_IRON_STAIRS);
            entries.add(ModBlocks.CHISELED_IRON);
            entries.add(ModBlocks.POLISHED_IRON);
            entries.add(ModBlocks.IRON_GRATE);

            entries.add(ModBlocks.CUT_GOLD);
            entries.add(ModBlocks.SMOOTH_GOLD);
            entries.add(ModBlocks.CUT_GOLD_SLAB);
            entries.add(ModBlocks.CUT_GOLD_STAIRS);
            entries.add(ModBlocks.CHISELED_GOLD);
            entries.add(ModBlocks.REINFORCED_GOLD);
            entries.add(ModBlocks.GOLD_GRATE);

            entries.add(ModBlocks.POLISHED_COPPER);
            entries.add(ModBlocks.EXPOSED_POLISHED_COPPER);
            entries.add(ModBlocks.WEATHERED_POLISHED_COPPER);
            entries.add(ModBlocks.OXIDIZED_POLISHED_COPPER);

            entries.add(ModBlocks.WAXED_POLISHED_COPPER);
            entries.add(ModBlocks.WAXED_EXPOSED_POLISHED_COPPER);
            entries.add(ModBlocks.WAXED_WEATHERED_POLISHED_COPPER);
            entries.add(ModBlocks.WAXED_OXIDIZED_POLISHED_COPPER);

            entries.add(ModBlocks.REINFORCED_COPPER);
            entries.add(ModBlocks.EXPOSED_REINFORCED_COPPER);
            entries.add(ModBlocks.WEATHERED_REINFORCED_COPPER);
            entries.add(ModBlocks.OXIDIZED_REINFORCED_COPPER);

            entries.add(ModBlocks.WAXED_REINFORCED_COPPER);
            entries.add(ModBlocks.WAXED_EXPOSED_REINFORCED_COPPER);
            entries.add(ModBlocks.WAXED_WEATHERED_REINFORCED_COPPER);
            entries.add(ModBlocks.WAXED_OXIDIZED_REINFORCED_COPPER);

            entries.add(ModBlocks.GOLD_BARS);

            entries.add(ModBlocks.COPPER_BARS);
            entries.add(ModBlocks.EXPOSED_COPPER_BARS);
            entries.add(ModBlocks.WEATHERED_COPPER_BARS);
            entries.add(ModBlocks.OXIDIZED_COPPER_BARS);

            entries.add(ModBlocks.WAXED_COPPER_BARS);
            entries.add(ModBlocks.WAXED_EXPOSED_COPPER_BARS);
            entries.add(ModBlocks.WAXED_WEATHERED_COPPER_BARS);
            entries.add(ModBlocks.WAXED_OXIDIZED_COPPER_BARS);


            entries.add(ModBlocks.GOLD_TRAPDOOR);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.REDSTONE).register(entries -> {
            entries.add(ModBlocks.GOLD_BULB);
            entries.add(ModBlocks.IRON_BULB);

        });
    }
}
