package org.arcticquests.dev.world.level.block;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import org.arcticquests.dev.MarvelSuperHeroes;

import java.util.HashMap;

import static net.minecraft.item.Items.register;


public class MarvelBlocks {


    public static final Block VIBRANIUM_ORE = registerFire("vibranium_ore",
            new ExperienceDroppingBlock(
                    ConstantIntProvider.create(0),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.STONE_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .strength(6.0F, 1200.0F)
                            .requiresTool()),true,false

    );

    public static final Block DEEPSLATE_VIBRANIUM_ORE = registerFire("deepslate_vibranium_ore",
            new ExperienceDroppingBlock(ConstantIntProvider.create(0),
                    AbstractBlock.Settings.copy(MarvelBlocks.VIBRANIUM_ORE)
                            .mapColor(MapColor.DEEPSLATE_GRAY)
                            .strength(7.5F, 1200.0F)
                            .sounds(BlockSoundGroup.DEEPSLATE)
                            .requiresTool()
            ),true,false);

    public static final Block VIBRANIUM_BLOCK = registerFire("vibranium_block",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_MAGENTA)
                    .strength(50.0F, 1200.0F)
                    .requiresTool()
                    .sounds(BlockSoundGroup.METAL)
            ),true,false);

    public static final Block TITANIUM_ORE = registerBlocks("titanium_ore",
            new ExperienceDroppingBlock(ConstantIntProvider.create(0),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.STONE_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .strength(3.0F, 3.0F)
                            .requiresTool()
            ),true);

    public static final Block DEEPSLATE_TITANIUM_ORE = registerBlocks("deepslate_titanium_ore",
            new ExperienceDroppingBlock(ConstantIntProvider.create(0),
                    AbstractBlock.Settings.copy(MarvelBlocks.TITANIUM_ORE)
                            .mapColor(MapColor.DEEPSLATE_GRAY)
                            .strength(4.5F, 3.0F)
                            .sounds(BlockSoundGroup.DEEPSLATE)),true);

    public static final Block TITANIUM_BLOCK = registerBlocks("titanium_block",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_BLUE)
                    .strength(5.0F, 6.0F)
                    .requiresTool()
                    .sounds(BlockSoundGroup.METAL)),true);

    public static final Block RAW_TITANIUM_BLOCK = registerBlocks("raw_titanium_block",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_BLUE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(5.0F,6.0F)
                    .requiresTool()
            ),true);

    public static final Block PALLADIUM_ORE  = registerBlocks("palladium_ore",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(3.0F,3.0F)
                    .requiresTool()
            ),true);

    public static final Block DEEPSLATE_PALLADIUM_ORE  = registerBlocks("deepslate_palladium_ore",
            new ExperienceDroppingBlock(ConstantIntProvider.create(0),
                    AbstractBlock.Settings.copy(PALLADIUM_ORE)
                            .mapColor(MapColor.DEEPSLATE_GRAY)
                            .strength(4.5F, 3.0F)
                            .sounds(BlockSoundGroup.DEEPSLATE)),true);

    public static final Block PALLADIUM_BLOCK  = registerBlocks("deepslate_palladium_ore",
            new ExperienceDroppingBlock(ConstantIntProvider.create(0),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.GRAY)
                            .requiresTool()
                            .strength(5.0F, 6.0F)
                            .sounds(BlockSoundGroup.METAL)),true);

    public static final Block RAW_PALLADIUM_BLOCK = registerBlocks("raw_palladium_block",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(5.0F, 6.0F)
            ),true);

    public static final Block GOLD_TITANIUM_BLOCK = registerBlocks("gold_titanium_block",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.RED)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(5.0F, 6.0F)
                    .sounds(BlockSoundGroup.METAL)
            ),true);

    public static final Block ADAMANTIUM_BLOCK = registerFire("adamantium_block",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.LIGHT_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(50.0F, 1200.0F)
                    .sounds(BlockSoundGroup.METAL)
            ),true,false);

    public static final Block PROTO_ADAMANTIUM_BLOCK = registerFire("proto_adamantium_block",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.LIGHT_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(50.0F, 1200.0F)
                    .sounds(BlockSoundGroup.METAL)
            ),true,false);

    public static final Block URU_BLOCK = registerFire("uru_block",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.LIGHT_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(50.0F, 1200.0F)
                    .sounds(BlockSoundGroup.METAL)
            ),false,true);

    public static final Block GREEN_HYDRA_BRICKS = registerBlocks("green_hydra_bricks",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_GREEN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.5F, 6.0F)
            ),true);

    public static final Block GREEN_HYDRA_BRICK_SLAB = registerBlocks("green_hydra_brick_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_GREEN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F, 6.0F)
            ),true);

    public static final Block GREEN_HYDRA_BRICK_STAIRS = registerBlocks("green_hydra_brick_stairs",
            new StairsBlock(MarvelBlocks.GREEN_HYDRA_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.copy(MarvelBlocks.GREEN_HYDRA_BRICKS))
            ,true);

    public static final Block GREEN_HYDRA_BRICK_WALL = registerBlocks("green_hydra_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(MarvelBlocks.GREEN_HYDRA_BRICKS).solid()),true);

    public static final Block GREEN_HYDRA_BRICK_LAMP = registerBlocks("green_hydra_brick_lamp",
            new BulbBlock(AbstractBlock.Settings.copy(MarvelBlocks.GREEN_HYDRA_BRICKS)
                    .luminance(state -> state.get(BulbBlock.LIT) ? 15 : 9)),true);

    public static final Block YELLOW_HYDRA_BRICKS = registerBlocks("yellow_hydra_bricks",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_YELLOW)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.5F,6.0F))
                    ,true);

    public static final Block YELLOW_HYDRA_BRICK_SLAB = registerBlocks("yellow_hydra_brick_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_YELLOW)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F,6.0F)),true);

    public static final Block YELLOW_HYDRA_BRICK_STAIRS = registerBlocks("yellow_hydra_brick_stairs",
            new StairsBlock(MarvelBlocks.YELLOW_HYDRA_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.copy(MarvelBlocks.YELLOW_HYDRA_BRICKS))
            ,true);


    public static final Block YELLOW_HYDRA_BRICK_WALL = registerBlocks("green_hydra_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(MarvelBlocks.YELLOW_HYDRA_BRICKS).solid()),true);

    public static final Block YELLOW_HYDRA_BRICK_LAMP = registerBlocks("yellow_hydra_brick_lamp",
            new BulbBlock(AbstractBlock.Settings.copy(MarvelBlocks.YELLOW_HYDRA_BRICKS)
                    .luminance(state -> state.get(BulbBlock.LIT) ? 15 : 9)),true);

    public static final Block LIGHT_GRAY_HYDRA_BRICKS = registerBlocks("light_gray_hydra_bricks",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.WHITE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.5F,6.0F))
            ,true);

    public static final Block LIGHT_GRAY_HYDRA_BRICK_SLAB = registerBlocks("light_gray_hydra_brick_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.WHITE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F,6.0F)),true);

    public static final Block LIGHT_GRAY_HYDRA_BRICK_STAIRS = registerBlocks("light_gray_hydra_brick_stairs",
            new StairsBlock(MarvelBlocks.LIGHT_GRAY_HYDRA_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.copy(MarvelBlocks.LIGHT_GRAY_HYDRA_BRICKS))
            ,true);


    public static final Block LIGHT_GRAY_HYDRA_BRICK_WALL = registerBlocks("light_gray_hydra_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(MarvelBlocks.LIGHT_GRAY_HYDRA_BRICKS).solid()),true);

    public static final Block LIGHT_GRAY_HYDRA_BRICK_LAMP = registerBlocks("light_gray_hydra_brick_lamp",
            new BulbBlock(AbstractBlock.Settings.copy(MarvelBlocks.GRAY_HYDRA_BRICKS)
                    .luminance(state -> state.get(BulbBlock.LIT) ? 15 : 9)),true);

    public static final Block GRAY_HYDRA_BRICKS = registerBlocks("gray_hydra_bricks",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.WHITE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.5F,6.0F))
            ,true);

    public static final Block GRAY_HYDRA_BRICK_SLAB = registerBlocks("gray_hydra_brick_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.WHITE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(2.0F,6.0F)),true);

    public static final Block GRAY_HYDRA_BRICK_STAIRS = registerBlocks("gray_hydra_brick_stairs",
            new StairsBlock(MarvelBlocks.GRAY_HYDRA_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.copy(MarvelBlocks.GRAY_HYDRA_BRICKS))
            ,true);


    public static final Block GRAY_HYDRA_BRICK_WALL = registerBlocks("gray_hydra_brick_wall",
            new BossFloorBlock(AbstractBlock.Settings.copy(MarvelBlocks.GRAY_HYDRA_BRICKS).solid()),true);

    public static final Block GRAY_HYDRA_BRICK_LAMP = registerBlocks("gray_hydra_brick_lamp",
            new BulbBlock(AbstractBlock.Settings.copy(MarvelBlocks.GRAY_HYDRA_BRICKS)
                    .luminance(state -> state.get(BulbBlock.LIT) ? 15 : 9)),true);

    public static final Block STONE_BRICK_LAMP = registerBlocks("stone_brick_lamp",
            new BulbBlock(AbstractBlock.Settings.copy(Blocks.STONE_BRICKS)
                    .luminance(state -> state.get(BulbBlock.LIT) ? 15 : 9)),true);

    public static final Block DEEPSLATE_BRICK_LAMP = registerBlocks("deepslate_brick_lamp",
            new BulbBlock(AbstractBlock.Settings.copy(Blocks.DEEPSLATE_BRICKS)
                    .luminance(state -> state.get(BulbBlock.LIT) ? 15 : 9)),true);



    public static final Block SUIT_TABLE = registerWithType("suit_table", () -> SuitTableBlock.CODEC, () -> new SuitTableBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_BLUE).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final Block SUIT_CHARGER = registerWithType("suit_charger", () -> SuitChargerBlock.CODEC, () -> new SuitChargerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GRAY).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));

    public static final Block SUIT_CHARGER_UPPER = registerBlockOnlyWithType("suit_charger_upper", () -> SuitChargerUpperBlock.CODEC, () -> new SuitChargerUpperBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GRAY).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL).pushReaction(PushReaction.BLOCK).noLootTable()));
    public static final Block TESSERACT = registerBlockOnlyWithType("tesseract", () -> TesseractBlock.CODEC, () -> new TesseractBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_BLUE).instrument(NoteBlockInstrument.HAT).sound(SoundType.GLASS).emissiveRendering((state, getter, pos) -> true).lightLevel(state -> 10).strength(0.25F).pushReaction(PushReaction.NORMAL).explosionResistance(360000)));
    public static final Block SPIDER_WEB = registerBlockOnlyWithType("spider_web", () -> SpiderWebBlock.CODEC, () -> new SpiderWebBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOL).sound(SoundType.COBWEB).forceSolidOn().noCollission().requiresCorrectToolForDrops().strength(4.0F).pushReaction(PushReaction.DESTROY)));
    public static final Block MJOLNIR = registerBlockOnlyWithType("mjolnir", () -> MjolnirBlock.CODEC, () -> new MjolnirBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GRAY).noLootTable().strength(-1, 360000).sound(SoundType.METAL)));

    public static Block registerBlocks(String name, Block block,  boolean shouldRegisterItem) {
        Identifier id = Identifier.of(MarvelSuperHeroes.MOD_ID, name);

        if (shouldRegisterItem) {
            BlockItem blockItem = new BlockItem(block, new Item.Settings());
            Registry.register(Registries.ITEM, id, blockItem);
        }

        return Registry.register(Registries.BLOCK, id, block);
    }

    public static Block registerFire(String name, Block block, boolean shouldRegisterFire,boolean shouldRegisterFireEP ){
        Identifier id = Identifier.of(MarvelSuperHeroes.MOD_ID, name);

        if (shouldRegisterFire) {
            BlockItem blockItem = new BlockItem(block, new Item.Settings().rarity(Rarity.UNCOMMON).fireproof());
            Registry.register(Registries.ITEM, id, blockItem);
        }
        if (shouldRegisterFireEP) {
            BlockItem blockItem = new BlockItem(block, new Item.Settings().rarity(Rarity.RARE).fireproof());
            Registry.register(Registries.ITEM, id, blockItem);
        }

        return Registry.register(Registries.BLOCK, id, block);
    }

    public static void registerMarvelBlocks() {
        MarvelSuperHeroes.LOGGER.info("Registering Marvel Blocks for " + MarvelSuperHeroes.MOD_ID);
    }



}
