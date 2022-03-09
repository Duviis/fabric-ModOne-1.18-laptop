package net.duvis.modone.painting;

import net.duvis.modone.ModOne;
import net.minecraft.entity.decoration.painting.PaintingMotive;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModPaintings {

    public static final PaintingMotive MARATHON = registerPainting("marathon", new PaintingMotive(16,16));
    public static final PaintingMotive FAMILY = registerPainting("family", new PaintingMotive(16,32));

    private  static PaintingMotive registerPainting(String name, PaintingMotive paintingMotive) {
        return Registry.register(Registry.PAINTING_MOTIVE, new Identifier(ModOne.MOD_ID, name), paintingMotive);
    }

    public static void registerPaintings() {
    ModOne.LOGGER.info("Registering Paintings for " + ModOne.MOD_ID);
    }
}
