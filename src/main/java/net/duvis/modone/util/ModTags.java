package net.duvis.modone.util;

import net.duvis.modone.ModOne;
import net.fabricmc.fabric.api.tag.TagFactory;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;

public class ModTags {

    public static class Blocks {
        public static final Tag.Identified<Block> DOWSING_ROD_DETECTABLE_BLOCKS =
                createTag("dowsing_rod_detectable_blocks");

        private static Tag.Identified<Block> createTag(String name) {
            return TagFactory.BLOCK.create(new Identifier(ModOne.MOD_ID, name));
        }

        private static Tag.Identified<Block> createCommonTag(String name) {
            return TagFactory.BLOCK.create(new Identifier("c", name));
        }
    }
    public static class Items {

        public static final Tag.Identified<Item> MYTHRIL_INGOTS = createCommonTag("mythril_ingots");
        public static final Tag.Identified<Item> MYTHRIL_NUGGETS = createCommonTag("mythril_nuggets");

        private static Tag.Identified<Item> createTag(String name) {
            return TagFactory.ITEM.create(new Identifier(ModOne.MOD_ID, name));
        }

        private static Tag.Identified<Item> createCommonTag(String name) {
            return TagFactory.ITEM.create(new Identifier("c", name));
        }
    }
}
