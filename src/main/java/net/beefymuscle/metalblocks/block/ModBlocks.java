package net.beefymuscle.metalblocks.block;

import net.beefymuscle.metalblocks.BeefsMetalBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import static net.minecraft.block.Blocks.CHISELED_COPPER;
import static net.minecraft.block.Blocks.createLightLevelFromLitBlockState;

public class ModBlocks {
    public static final Block CUT_IRON = registerBlock("cut_iron",
        new Block(
                AbstractBlock.Settings.create()
                        .mapColor(MapColor.IRON_GRAY)
                        .strength(5.0F, 6.0F)
                        .requiresTool()
                        .sounds(BlockSoundGroup.METAL)));

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

    public static final Block SMOOTH_IRON = registerBlock("smooth_iron",
            new Block(AbstractBlock.Settings.copy(CUT_IRON)));

    public static final Block CHISELED_IRON = registerBlock("chiseled_iron",
            new Block(AbstractBlock.Settings.copy(CHISELED_COPPER)));

    public static final Block POLISHED_IRON = registerBlock("polished_iron",
            new Block(AbstractBlock.Settings.copy(CUT_IRON)));


    public static final Block CUT_IRON_SLAB = registerBlock("cut_iron_slab",
            new SlabBlock(AbstractBlock.Settings.copy(ModBlocks.CUT_IRON)));


    public static final Block CUT_IRON_STAIRS = registerBlock("cut_iron_stairs",
            new StairsBlock(ModBlocks.CUT_IRON.getDefaultState(), AbstractBlock.Settings.copy(ModBlocks.CUT_IRON)));




    public static final Block CUT_GOLD = registerBlock("cut_gold",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.GOLD)
                            .strength(5.0F, 6.0F)
                            .requiresTool()
                            .sounds(BlockSoundGroup.METAL)));

    public static final Block GOLD_GRATE = registerBlock("gold_grate",
            new GrateBlock(
                    AbstractBlock.Settings.create()
                            .strength(5.0F, 6.0F)
                            .sounds(BlockSoundGroup.COPPER_GRATE)
                            .mapColor(MapColor.GOLD)
                            .nonOpaque()
                            .requiresTool()
                            .allowsSpawning(Blocks::never)
                            .solidBlock(Blocks::never)
                            .suffocates(Blocks::never)
                            .blockVision(Blocks::never)));

    public static final Block SMOOTH_GOLD = registerBlock("smooth_gold",
            new Block(AbstractBlock.Settings.copy(CUT_GOLD)));

    public static final Block CHISELED_GOLD = registerBlock("chiseled_gold",
            new Block(AbstractBlock.Settings.copy(CUT_GOLD)));

    public static final Block REINFORCED_GOLD = registerBlock("reinforced_gold",
            new Block(AbstractBlock.Settings.copy(CUT_GOLD)));


    public static final Block CUT_GOLD_SLAB = registerBlock("cut_gold_slab",
            new SlabBlock(AbstractBlock.Settings.copy(ModBlocks.CUT_GOLD)));


    public static final Block CUT_GOLD_STAIRS = registerBlock("cut_gold_stairs",
            new StairsBlock(ModBlocks.CUT_GOLD.getDefaultState(), AbstractBlock.Settings.copy(ModBlocks.CUT_IRON)));




    public static final Block REINFORCED_COPPER = registerBlock("reinforced_copper",
            new Block(AbstractBlock.Settings.copy(CUT_IRON)));

    public static final Block POLISHED_COPPER = registerBlock("polished_copper",
            new Block(AbstractBlock.Settings.copy(CUT_IRON)));




    public static final Block COPPER_BARS = registerBlock("copper_bars",
            new PaneBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .strength(5.0F, 6.0F)
                    .sounds(BlockSoundGroup.METAL)
                    .nonOpaque()));

    public static final Block GOLD_BARS = registerBlock("gold_bars",
            new PaneBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .strength(5.0F, 6.0F)
                    .sounds(BlockSoundGroup.METAL)
                    .nonOpaque()));






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


    public static final Block GOLD_TRAPDOOR = registerBlock("gold_trapdoor",
            new TrapdoorBlock(BlockSetType.IRON,
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.GOLD)
                            .requiresTool()
                            .strength(5.0F).nonOpaque()
                            .allowsSpawning(Blocks::never)));




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
            entries.add(ModBlocks.REINFORCED_COPPER);

            entries.add(ModBlocks.GOLD_BARS);
            entries.add(ModBlocks.COPPER_BARS);

            entries.add(ModBlocks.GOLD_TRAPDOOR);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.REDSTONE).register(entries -> {
            entries.add(ModBlocks.GOLD_BULB);
            entries.add(ModBlocks.IRON_BULB);

        });
    }
}
