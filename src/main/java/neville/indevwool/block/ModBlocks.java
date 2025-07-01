package neville.indevwool.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.CarpetBlock;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import neville.indevwool.IndevWool;
import net.minecraft.block.Block;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block INDEV_RED_WOOL = registerBlock("indev_red_wool", new Block(AbstractBlock.Settings.create().instrument(NoteBlockInstrument.GUITAR).strength(0.8f).sounds(BlockSoundGroup.WOOL).burnable()));
    public static final Block INDEV_ORANGE_WOOL = registerBlock("indev_orange_wool", new Block(AbstractBlock.Settings.create().instrument(NoteBlockInstrument.GUITAR).strength(0.8f).sounds(BlockSoundGroup.WOOL).burnable()));
    public static final Block INDEV_YELLOW_WOOL = registerBlock("indev_yellow_wool", new Block(AbstractBlock.Settings.create().instrument(NoteBlockInstrument.GUITAR).strength(0.8f).sounds(BlockSoundGroup.WOOL).burnable()));
    public static final Block INDEV_LIME_WOOL = registerBlock("indev_lime_wool", new Block(AbstractBlock.Settings.create().instrument(NoteBlockInstrument.GUITAR).strength(0.8f).sounds(BlockSoundGroup.WOOL).burnable()));
    public static final Block INDEV_GREEN_WOOL = registerBlock("indev_green_wool", new Block(AbstractBlock.Settings.create().instrument(NoteBlockInstrument.GUITAR).strength(0.8f).sounds(BlockSoundGroup.WOOL).burnable()));
    public static final Block INDEV_CYAN_WOOL = registerBlock("indev_cyan_wool", new Block(AbstractBlock.Settings.create().instrument(NoteBlockInstrument.GUITAR).strength(0.8f).sounds(BlockSoundGroup.WOOL).burnable()));
    public static final Block INDEV_LIGHT_BLUE_WOOL = registerBlock("indev_light_blue_wool", new Block(AbstractBlock.Settings.create().instrument(NoteBlockInstrument.GUITAR).strength(0.8f).sounds(BlockSoundGroup.WOOL).burnable()));
    public static final Block INDEV_BROWN_WOOL = registerBlock("indev_brown_wool", new Block(AbstractBlock.Settings.create().instrument(NoteBlockInstrument.GUITAR).strength(0.8f).sounds(BlockSoundGroup.WOOL).burnable()));
    public static final Block INDEV_BLUE_WOOL = registerBlock("indev_blue_wool", new Block(AbstractBlock.Settings.create().instrument(NoteBlockInstrument.GUITAR).strength(0.8f).sounds(BlockSoundGroup.WOOL).burnable()));
    public static final Block INDEV_PURPLE_WOOL = registerBlock("indev_purple_wool", new Block(AbstractBlock.Settings.create().instrument(NoteBlockInstrument.GUITAR).strength(0.8f).sounds(BlockSoundGroup.WOOL).burnable()));
    public static final Block INDEV_MAGENTA_WOOL = registerBlock("indev_magenta_wool", new Block(AbstractBlock.Settings.create().instrument(NoteBlockInstrument.GUITAR).strength(0.8f).sounds(BlockSoundGroup.WOOL).burnable()));
    public static final Block INDEV_PINK_WOOL = registerBlock("indev_pink_wool", new Block(AbstractBlock.Settings.create().instrument(NoteBlockInstrument.GUITAR).strength(0.8f).sounds(BlockSoundGroup.WOOL).burnable()));
    public static final Block INDEV_WHITE_WOOL = registerBlock("indev_white_wool", new Block(AbstractBlock.Settings.create().instrument(NoteBlockInstrument.GUITAR).strength(0.8f).sounds(BlockSoundGroup.WOOL).burnable()));
    public static final Block INDEV_LIGHT_GRAY_WOOL = registerBlock("indev_light_gray_wool", new Block(AbstractBlock.Settings.create().instrument(NoteBlockInstrument.GUITAR).strength(0.8f).sounds(BlockSoundGroup.WOOL).burnable()));
    public static final Block INDEV_GRAY_WOOL = registerBlock("indev_gray_wool", new Block(AbstractBlock.Settings.create().instrument(NoteBlockInstrument.GUITAR).strength(0.8f).sounds(BlockSoundGroup.WOOL).burnable()));
    public static final Block INDEV_BLACK_WOOL = registerBlock("indev_black_wool", new Block(AbstractBlock.Settings.create().instrument(NoteBlockInstrument.GUITAR).strength(0.8f).sounds(BlockSoundGroup.WOOL).burnable()));

    public static final Block INDEV_RED_CARPET = registerBlock("indev_red_carpet", new CarpetBlock(AbstractBlock.Settings.create().strength(0.1F).sounds(BlockSoundGroup.WOOL).burnable()));
    public static final Block INDEV_ORANGE_CARPET = registerBlock("indev_orange_carpet", new CarpetBlock(AbstractBlock.Settings.create().strength(0.1F).sounds(BlockSoundGroup.WOOL).burnable()));
    public static final Block INDEV_YELLOW_CARPET = registerBlock("indev_yellow_carpet", new CarpetBlock(AbstractBlock.Settings.create().strength(0.1F).sounds(BlockSoundGroup.WOOL).burnable()));
    public static final Block INDEV_LIME_CARPET = registerBlock("indev_lime_carpet", new CarpetBlock(AbstractBlock.Settings.create().strength(0.1F).sounds(BlockSoundGroup.WOOL).burnable()));
    public static final Block INDEV_GREEN_CARPET = registerBlock("indev_green_carpet", new CarpetBlock(AbstractBlock.Settings.create().strength(0.1F).sounds(BlockSoundGroup.WOOL).burnable()));
    public static final Block INDEV_CYAN_CARPET = registerBlock("indev_cyan_carpet", new CarpetBlock(AbstractBlock.Settings.create().strength(0.1F).sounds(BlockSoundGroup.WOOL).burnable()));
    public static final Block INDEV_LIGHT_BLUE_CARPET = registerBlock("indev_light_blue_carpet", new CarpetBlock(AbstractBlock.Settings.create().strength(0.1F).sounds(BlockSoundGroup.WOOL).burnable()));
    public static final Block INDEV_BROWN_CARPET = registerBlock("indev_brown_carpet", new CarpetBlock(AbstractBlock.Settings.create().strength(0.1F).sounds(BlockSoundGroup.WOOL).burnable()));
    public static final Block INDEV_BLUE_CARPET = registerBlock("indev_blue_carpet", new CarpetBlock(AbstractBlock.Settings.create().strength(0.1F).sounds(BlockSoundGroup.WOOL).burnable()));
    public static final Block INDEV_PURPLE_CARPET = registerBlock("indev_purple_carpet", new CarpetBlock(AbstractBlock.Settings.create().strength(0.1F).sounds(BlockSoundGroup.WOOL).burnable()));
    public static final Block INDEV_MAGENTA_CARPET = registerBlock("indev_magenta_carpet", new CarpetBlock(AbstractBlock.Settings.create().strength(0.1F).sounds(BlockSoundGroup.WOOL).burnable()));
    public static final Block INDEV_PINK_CARPET = registerBlock("indev_pink_carpet", new CarpetBlock(AbstractBlock.Settings.create().strength(0.1F).sounds(BlockSoundGroup.WOOL).burnable()));
    public static final Block INDEV_WHITE_CARPET = registerBlock("indev_white_carpet", new CarpetBlock(AbstractBlock.Settings.create().strength(0.1F).sounds(BlockSoundGroup.WOOL).burnable()));
    public static final Block INDEV_LIGHT_GRAY_CARPET = registerBlock("indev_light_gray_carpet", new CarpetBlock(AbstractBlock.Settings.create().strength(0.1F).sounds(BlockSoundGroup.WOOL).burnable()));
    public static final Block INDEV_GRAY_CARPET = registerBlock("indev_gray_carpet", new CarpetBlock(AbstractBlock.Settings.create().strength(0.1F).sounds(BlockSoundGroup.WOOL).burnable()));
    public static final Block INDEV_BLACK_CARPET = registerBlock("indev_black_carpet", new CarpetBlock(AbstractBlock.Settings.create().strength(0.1F).sounds(BlockSoundGroup.WOOL).burnable()));

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(IndevWool.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block){
        Registry.register(Registries.ITEM, Identifier.of(IndevWool.MOD_ID, name), new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks(){
        IndevWool.LOGGER.info("Registering Mod Blocks for " + IndevWool.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(entries -> {
            entries.add(ModBlocks.INDEV_RED_WOOL);
            entries.add(ModBlocks.INDEV_ORANGE_WOOL);
            entries.add(ModBlocks.INDEV_YELLOW_WOOL);
            entries.add(ModBlocks.INDEV_LIME_WOOL);
            entries.add(ModBlocks.INDEV_GREEN_WOOL);
            entries.add(ModBlocks.INDEV_CYAN_WOOL);
            entries.add(ModBlocks.INDEV_LIGHT_BLUE_WOOL);
            entries.add(ModBlocks.INDEV_BROWN_WOOL); //actually a blue tinted color
            entries.add(ModBlocks.INDEV_BLUE_WOOL);
            entries.add(ModBlocks.INDEV_PURPLE_WOOL);
            entries.add(ModBlocks.INDEV_MAGENTA_WOOL);
            entries.add(ModBlocks.INDEV_PINK_WOOL);
            entries.add(ModBlocks.INDEV_WHITE_WOOL);
            entries.add(ModBlocks.INDEV_LIGHT_GRAY_WOOL);
            entries.add(ModBlocks.INDEV_GRAY_WOOL);
            entries.add(ModBlocks.INDEV_BLACK_WOOL);

            entries.add(ModBlocks.INDEV_RED_CARPET);
            entries.add(ModBlocks.INDEV_ORANGE_CARPET);
            entries.add(ModBlocks.INDEV_YELLOW_CARPET);
            entries.add(ModBlocks.INDEV_LIME_CARPET);
            entries.add(ModBlocks.INDEV_GREEN_CARPET);
            entries.add(ModBlocks.INDEV_CYAN_CARPET);
            entries.add(ModBlocks.INDEV_LIGHT_BLUE_CARPET);
            entries.add(ModBlocks.INDEV_BROWN_CARPET);
            entries.add(ModBlocks.INDEV_BLUE_CARPET);
            entries.add(ModBlocks.INDEV_PURPLE_CARPET);
            entries.add(ModBlocks.INDEV_MAGENTA_CARPET);
            entries.add(ModBlocks.INDEV_PINK_CARPET);
            entries.add(ModBlocks.INDEV_WHITE_CARPET);
            entries.add(ModBlocks.INDEV_LIGHT_GRAY_CARPET);
            entries.add(ModBlocks.INDEV_GRAY_CARPET);
            entries.add(ModBlocks.INDEV_BLACK_CARPET);
        });
    }
}
