package neville.indevwool;

import net.fabricmc.api.ModInitializer;

import neville.indevwool.block.ModBlocks;
import neville.indevwool.item.ModItemGroups;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IndevWool implements ModInitializer {
	public static final String MOD_ID = "indev-wool";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModBlocks.registerModBlocks();
	}
}