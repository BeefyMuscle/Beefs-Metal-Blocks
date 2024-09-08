package net.beefymuscle.metalblocks;

import net.beefymuscle.metalblocks.block.ModBlocks;
import net.beefymuscle.metalblocks.items.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BeefsMetalBlocks implements ModInitializer {
	public static final String MOD_ID = "bmb";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModBlocks.registerOxidizable();
	}
}