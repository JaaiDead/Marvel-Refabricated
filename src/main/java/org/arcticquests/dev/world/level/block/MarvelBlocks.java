package org.arcticquests.dev.world.level.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.block.MapColor;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import org.arcticquests.dev.MarvelSuperHeroes;


public class MarvelBlocks {

    public static final Block VIBRANIUM_ORE = registerBlocks("vibranium_ore",

            new ExperienceDroppingBlock(
                    ConstantIntProvider.create(0),
                    AbstractBlock.Settings.create()
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                            .strength(6.0F, 1200.0F)
                            .requiresTool()
            )
            //new Item.Settings().rarity(Rarity.UNCOMMON).fireproof()
            //TODO: Helppp me , dont know what to do here :D i want to regitser only like five items with this settings

    );

    public static final Block DEEPSLATE_VIBRANIUM_ORE = registerBlocks("deepslate_vibranium_ore",
            new ExperienceDroppingBlock(ConstantIntProvider.create(0),
                    AbstractBlock.Settings.copy(VIBRANIUM_ORE)
                            .mapColor(MapColor.DEEPSLATE_GRAY)
                            .strength(7.5F, 1200.0F)
                            .sounds(BlockSoundGroup.DEEPSLATE)
                            .requiresTool()
            ));

    public static final Block VIBRANIUM_BLOCK = registerBlocks("vibranium_block",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.MAGENTA)
                    .strength(50.0F, 1200.0F)
                    .requiresTool()
                    .sounds(BlockSoundGroup.METAL)
            ));

    public static final Block TITANIUM_ORE = registerBlocks("titanium_ore",
            new ExperienceDroppingBlock(ConstantIntProvider.create(0),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.STONE_GRAY)
                            .strength(3.0F, 3.0F)
                            .requiresTool()
            ));
    public static final Block DEEPSLATE_TITANIUM_ORE = registerBlocks("deepslate_titanium_ore",
            new ExperienceDroppingBlock(ConstantIntProvider.create(0),
                    AbstractBlock.Settings.copy(TITANIUM_ORE)
                            .mapColor(MapColor.DEEPSLATE_GRAY)
                            .strength(4.5F, 3.0F)
                            .sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block TITANIUM_BLOCK = registerBlocks("titanium_block",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.BLUE)
                    .strength(5.0F, 6.0F)
                    .requiresTool()
                    .sounds(BlockSoundGroup.METAL)));

// Maybe im approching this wrong hmm

    private static Block registerBlocks(String name, Block block) {
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
