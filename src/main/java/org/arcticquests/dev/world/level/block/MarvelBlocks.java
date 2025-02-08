package org.arcticquests.dev.world.level.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import org.arcticquests.dev.MarvelSuperHeroes;

public class MarvelBlocks {

/*    public static final Block PINK_GARNET_BLOCK =registerBlock("pink",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));*/



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
