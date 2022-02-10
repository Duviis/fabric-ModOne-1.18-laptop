package net.duvis.modone.item;

import net.duvis.modone.ModOne;
import net.duvis.modone.item.custom.DowsingRodItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModItems {

    public static final Item MYTHRIL_INGOT = registerItem("mythril_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.MYTHRIL)));

    public static final Item MYTHRIL_NUGGET = registerItem("mythril_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.MYTHRIL)));

    public static final Item RAW_MYTHRIL = registerItem("raw_mythril",
            new Item(new FabricItemSettings().group(ModItemGroup.MYTHRIL)));

    public static final Item DOWSING_ROD = registerItem("dowsing_rod",
            new DowsingRodItem(new FabricItemSettings().group(ModItemGroup.MYTHRIL).maxDamage(64)));

    private static Item registerItem(String name,Item item) {
        return Registry.register(Registry.ITEM, new Identifier(ModOne.MOD_ID, name), item);
    }


    public static void registerModItems() {
        ModOne.LOGGER.info("Registering Mod Items for" + ModOne.MOD_ID);
    }
}
