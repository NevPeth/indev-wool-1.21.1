package neville.indevwool.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import neville.indevwool.IndevWool;
import neville.indevwool.block.ModBlocks;

public class ModItemGroups {

    public static final ItemGroup INDEV_WOOL_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(IndevWool.MOD_ID, "indev_wool_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.INDEV_RED_WOOL))
                    .displayName(Text.translatable("itemgroup.indev-wool.indev_wool_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.INDEV_RED_WOOL);
                        entries.add(ModBlocks.INDEV_ORANGE_WOOL);
                        entries.add(ModBlocks.INDEV_YELLOW_WOOL);
                        entries.add(ModBlocks.INDEV_LIME_WOOL);
                        entries.add(ModBlocks.INDEV_GREEN_WOOL);
                        entries.add(ModBlocks.INDEV_CYAN_WOOL);
                        entries.add(ModBlocks.INDEV_LIGHT_BLUE_WOOL);
                        entries.add(ModBlocks.INDEV_BROWN_WOOL);
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
                    })
                    .build());

    public static void registerItemGroups(){
        IndevWool.LOGGER.info("Registering Item Groups for "+ IndevWool.MOD_ID);
    }
}
