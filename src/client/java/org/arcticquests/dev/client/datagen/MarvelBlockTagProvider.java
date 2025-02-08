package org.arcticquests.dev.client.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import org.arcticquests.dev.world.item.tags.MarvelTags;
import org.arcticquests.dev.world.level.block.MarvelBlocks;

import java.util.concurrent.CompletableFuture;

public class MarvelBlockTagProvider extends FabricTagProvider.BlockTagProvider {


    public MarvelBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(MarvelBlocks.VIBRANIUM_ORE)
                .add(MarvelBlocks.DEEPSLATE_VIBRANIUM_ORE)
                .add(MarvelBlocks.VIBRANIUM_BLOCK)
                .add(MarvelBlocks.TITANIUM_ORE)
                .add(MarvelBlocks.DEEPSLATE_TITANIUM_ORE)
                .add(MarvelBlocks.TITANIUM_BLOCK)
                .add(MarvelBlocks.RAW_TITANIUM_BLOCK)
                .add(MarvelBlocks.PALLADIUM_ORE)
                .add(MarvelBlocks.DEEPSLATE_PALLADIUM_ORE)
                .add(MarvelBlocks.PALLADIUM_BLOCK)
                .add(MarvelBlocks.RAW_PALLADIUM_BLOCK)
                .add(MarvelBlocks.GOLD_TITANIUM_BLOCK)
                .add(MarvelBlocks.ADAMANTIUM_BLOCK)
                .add(MarvelBlocks.PROTO_ADAMANTIUM_BLOCK)
                .add(MarvelBlocks.URU_BLOCK)
                .add(MarvelBlocks.SUIT_TABLE)
                .add(MarvelBlocks.SUIT_CHARGER)
                .add(MarvelBlocks.SUIT_CHARGER_UPPER)
                .add(MarvelBlocks.GREEN_HYDRA_BRICKS)
                .add(MarvelBlocks.GREEN_HYDRA_BRICK_SLAB)
                .add(MarvelBlocks.GREEN_HYDRA_BRICK_STAIRS)
                .add(MarvelBlocks.GREEN_HYDRA_BRICK_WALL)
                .add(MarvelBlocks.GREEN_HYDRA_BRICK_LAMP)
                .add(MarvelBlocks.YELLOW_HYDRA_BRICKS)
                .add(MarvelBlocks.YELLOW_HYDRA_BRICK_SLAB)
                .add(MarvelBlocks.YELLOW_HYDRA_BRICK_STAIRS)
                .add(MarvelBlocks.YELLOW_HYDRA_BRICK_WALL)
                .add(MarvelBlocks.YELLOW_HYDRA_BRICK_LAMP)
                .add(MarvelBlocks.LIGHT_GRAY_HYDRA_BRICKS)
                .add(MarvelBlocks.LIGHT_GRAY_HYDRA_BRICK_SLAB)
                .add(MarvelBlocks.LIGHT_GRAY_HYDRA_BRICK_STAIRS)
                .add(MarvelBlocks.LIGHT_GRAY_HYDRA_BRICK_WALL)
                .add(MarvelBlocks.LIGHT_GRAY_HYDRA_BRICK_LAMP)
                .add(MarvelBlocks.GRAY_HYDRA_BRICKS)
                .add(MarvelBlocks.GRAY_HYDRA_BRICK_SLAB)
                .add(MarvelBlocks.GRAY_HYDRA_BRICK_STAIRS)
                .add(MarvelBlocks.GRAY_HYDRA_BRICK_WALL)
                .add(MarvelBlocks.GRAY_HYDRA_BRICK_LAMP)
                .add(MarvelBlocks.STONE_BRICK_LAMP)
                .add(MarvelBlocks.DEEPSLATE_BRICK_LAMP);

        getOrCreateTagBuilder(BlockTags.BEACON_BASE_BLOCKS)
            .add(MarvelBlocks.VIBRANIUM_BLOCK)
            .add(MarvelBlocks.TITANIUM_BLOCK)
            .add(MarvelBlocks.ADAMANTIUM_BLOCK)
            .add(MarvelBlocks.PROTO_ADAMANTIUM_BLOCK)
            .add(MarvelBlocks.URU_BLOCK);

        getOrCreateTagBuilder(BlockTags.DRAGON_IMMUNE)
            .add(MarvelBlocks.TESSERACT)
            .add(MarvelBlocks.MJOLNIR);
        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
            .add(MarvelBlocks.VIBRANIUM_ORE)
            .add(MarvelBlocks.DEEPSLATE_VIBRANIUM_ORE)
            .add(MarvelBlocks.VIBRANIUM_BLOCK)
            .add(MarvelBlocks.ADAMANTIUM_BLOCK)
            .add(MarvelBlocks.PROTO_ADAMANTIUM_BLOCK)
            .add(MarvelBlocks.URU_BLOCK);
        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
            .add(MarvelBlocks.TITANIUM_ORE)
            .add(MarvelBlocks.DEEPSLATE_TITANIUM_ORE)
            .add(MarvelBlocks.TITANIUM_BLOCK)
            .add(MarvelBlocks.RAW_TITANIUM_BLOCK)
            .add(MarvelBlocks.GOLD_TITANIUM_BLOCK);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
            .add(MarvelBlocks.PALLADIUM_ORE)
            .add(MarvelBlocks.DEEPSLATE_PALLADIUM_ORE)
            .add(MarvelBlocks.PALLADIUM_BLOCK)
            .add(MarvelBlocks.RAW_PALLADIUM_BLOCK)
            .add(MarvelBlocks.SUIT_TABLE)
            .add(MarvelBlocks.SUIT_CHARGER)
            .add(MarvelBlocks.SUIT_CHARGER_UPPER);

        getOrCreateTagBuilder(BlockTags.SLABS)
            .add(MarvelBlocks.GREEN_HYDRA_BRICK_SLAB)
            .add(MarvelBlocks.YELLOW_HYDRA_BRICK_SLAB)
            .add(MarvelBlocks.LIGHT_GRAY_HYDRA_BRICK_SLAB)
            .add(MarvelBlocks.GRAY_HYDRA_BRICK_SLAB);
        getOrCreateTagBuilder(BlockTags.STAIRS)
            .add(MarvelBlocks.GREEN_HYDRA_BRICK_STAIRS)
            .add(MarvelBlocks.YELLOW_HYDRA_BRICK_STAIRS)
            .add(MarvelBlocks.LIGHT_GRAY_HYDRA_BRICK_STAIRS)
            .add(MarvelBlocks.GRAY_HYDRA_BRICK_STAIRS);
        getOrCreateTagBuilder(BlockTags.WALLS)
            .add(MarvelBlocks.GREEN_HYDRA_BRICK_WALL)
            .add(MarvelBlocks.YELLOW_HYDRA_BRICK_WALL)
            .add(MarvelBlocks.LIGHT_GRAY_HYDRA_BRICK_WALL)
            .add(MarvelBlocks.GRAY_HYDRA_BRICK_WALL);
        getOrCreateTagBuilder(BlockTags.WITHER_IMMUNE)
            .add(MarvelBlocks.TESSERACT)
            .add(MarvelBlocks.MJOLNIR);

        getOrCreateTagBuilder(MarvelTags.Blocks.VIBRANIUM_ORES)
                .add(MarvelBlocks.VIBRANIUM_ORE)
                .add(MarvelBlocks.DEEPSLATE_VIBRANIUM_ORE);
        getOrCreateTagBuilder(MarvelTags.Blocks.TITANIUM_ORES)
                .add(MarvelBlocks.TITANIUM_ORE)
                .add(MarvelBlocks.DEEPSLATE_TITANIUM_ORE);
        getOrCreateTagBuilder(MarvelTags.Blocks.PALLADIUM_ORES)
                .add(MarvelBlocks.PALLADIUM_ORE)
                .add(MarvelBlocks.DEEPSLATE_PALLADIUM_ORE);
        getOrCreateTagBuilder(MarvelTags.Blocks.HYDRA_AGENT_SPAWNABLE_ON)
                .add(MarvelBlocks.GREEN_HYDRA_BRICKS)
                .add(MarvelBlocks.YELLOW_HYDRA_BRICKS)
                .add(MarvelBlocks.LIGHT_GRAY_HYDRA_BRICKS)
                .add(Blocks.STONE_BRICKS)
                .add(Blocks.DEEPSLATE_BRICKS)
                .add(MarvelBlocks.GRAY_HYDRA_BRICKS);
    }
}
