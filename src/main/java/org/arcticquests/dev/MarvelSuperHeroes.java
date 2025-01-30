package org.arcticquests.dev;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import org.arcticquests.dev.world.effect.MarvelStatusEffects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MarvelSuperHeroes implements ModInitializer {

    public static final String MOD_ID = "marvel";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        MarvelStatusEffects.registerEffects();
    }
    public static Identifier id(String path) {
        return Identifier.of(MOD_ID, path);
    }
}
