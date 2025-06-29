package neville.indevwool.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
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

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(IndevWool.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block){
        Registry.register(Registries.ITEM, Identifier.of(IndevWool.MOD_ID, name), new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks(){
        IndevWool.LOGGER.info("Registering Mod Blocks for " + IndevWool.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ModBlocks.INDEV_RED_WOOL);
        });
    }
}
