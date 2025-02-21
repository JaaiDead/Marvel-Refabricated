package org.arcticquests.dev.world.level.block;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.block.MapColor;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import org.arcticquests.dev.MarvelSuperHeroes;

import java.util.function.Function;


public class MarvelBlocks {

    public static final Block VIBRANIUM_ORE = registerBlock("vibranium_ore",
            new ExperienceDroppingBlock(ConstantIntProvider.create(0), AbstractBlock.Settings.create()
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(6.0F,1200.0F)
            ));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(MarvelSuperHeroes.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(MarvelSuperHeroes.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerMarvelBlocks() {
        MarvelSuperHeroes.LOGGER.info("Registering Marvel Blocks for " + MarvelSuperHeroes.MOD_ID);
    }
}
