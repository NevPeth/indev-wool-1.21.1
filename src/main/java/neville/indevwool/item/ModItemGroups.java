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
                    })
                    .build());

    public static void registerItemGroups(){
        IndevWool.LOGGER.info("Registering Item Groups for "+ IndevWool.MOD_ID);
    }
}
