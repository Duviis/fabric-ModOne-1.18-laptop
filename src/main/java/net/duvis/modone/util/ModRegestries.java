package net.duvis.modone.util;

import net.duvis.modone.ModOne;
import net.duvis.modone.item.ModItems;
import net.fabricmc.fabric.api.registry.FuelRegistry;

public class ModRegestries {
    public static void registerModStuffs() {
        registerFuels();
    }


    private static void registerFuels() {
        ModOne.LOGGER.info("Registering Fuels for" + ModOne.MOD_ID);
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(ModItems.LILAC_FLOWER_BULB, 200);
    }
}
