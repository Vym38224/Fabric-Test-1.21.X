package net.vymetal.testmod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.vymetal.testmod.block.ModBlocks;
import net.vymetal.testmod.item.ModItemGroups;
import net.vymetal.testmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class TestMod implements ModInitializer {
	public static final String MOD_ID = "testmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		FuelRegistry.INSTANCE.add(ModItems.STARLIGHT_ASHES, 600);
	}
}