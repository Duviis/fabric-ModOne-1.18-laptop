package net.duvis.modone;

import net.duvis.modone.block.ModBlocks;
import net.duvis.modone.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ModOne implements ModInitializer {
	public static final String MOD_ID = "modone";
	public static final Logger LOGGER = LoggerFactory.getLogger("ModOne");

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}
