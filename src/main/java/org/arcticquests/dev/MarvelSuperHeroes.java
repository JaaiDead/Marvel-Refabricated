package org.arcticquests.dev;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import org.arcticquests.dev.sounds.MarvelSoundEvents;
import org.arcticquests.dev.world.effect.MarvelStatusEffects;
import org.arcticquests.dev.world.item.MarvelItems;
import org.arcticquests.dev.world.item.groups.MarvelItemGroups;
import org.arcticquests.dev.world.item.tags.MarvelTags;
import org.arcticquests.dev.world.level.block.MarvelBlocks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MarvelSuperHeroes implements ModInitializer {

    public static final String MOD_ID = "marvel";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        MarvelItemGroups.registerItemGroups();

        MarvelSoundEvents.registerSounds();
        MarvelStatusEffects.registerEffects();
        MarvelItems.registerItems();
        MarvelBlocks.registerMarvelBlocks();
    }

    public static Identifier id(String path) {
        return Identifier.of(MOD_ID, path);
    }
}
