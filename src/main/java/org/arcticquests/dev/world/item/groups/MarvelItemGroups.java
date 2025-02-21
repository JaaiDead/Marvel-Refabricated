package org.arcticquests.dev.world.item.groups;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.arcticquests.dev.MarvelSuperHeroes;
import org.arcticquests.dev.world.item.MarvelItems;
import org.arcticquests.dev.world.level.block.MarvelBlocks;

public class MarvelItemGroups {

    public static final ItemGroup BLOCKS_AND_ITEMS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(MarvelSuperHeroes.MOD_ID,"blocks_and_items"),
            FabricItemGroup.builder().icon(()-> new ItemStack(MarvelItems.VIBRANIUM))
                    .displayName(Text.translatable("itemgroup.marvel.blocks_and_items"))
                    .entries(((displayContext, entries) -> {
                        entries.add(MarvelBlocks.VIBRANIUM_ORE);
                        entries.add(MarvelBlocks.DEEPSLATE_VIBRANIUM_ORE);
                        entries.add(MarvelBlocks.VIBRANIUM_BLOCK);
                        entries.add(MarvelBlocks.TITANIUM_ORE);
                        entries.add(MarvelBlocks.DEEPSLATE_TITANIUM_ORE);
                        entries.add(MarvelBlocks.TITANIUM_BLOCK);
                        entries.add(MarvelBlocks.RAW_TITANIUM_BLOCK);
                        entries.add(MarvelBlocks.PALLADIUM_ORE);
                        entries.add(MarvelBlocks.DEEPSLATE_PALLADIUM_ORE);
                        entries.add(MarvelBlocks.PALLADIUM_BLOCK);
                        entries.add(MarvelBlocks.RAW_PALLADIUM_BLOCK);
                        entries.add(MarvelBlocks.GOLD_TITANIUM_BLOCK);
                        entries.add(MarvelBlocks.ADAMANTIUM_BLOCK);
                        entries.add(MarvelBlocks.PROTO_ADAMANTIUM_BLOCK);
                        entries.add(MarvelBlocks.URU_BLOCK);
                        entries.add(MarvelBlocks.SUIT_TABLE);
                        entries.add(MarvelBlocks.SUIT_CHARGER);
                        entries.add(MarvelBlocks.GREEN_HYDRA_BRICKS);
                        entries.add(MarvelBlocks.GREEN_HYDRA_BRICK_SLAB);
                        entries.add(MarvelBlocks.GREEN_HYDRA_BRICK_STAIRS);
                        entries.add(MarvelBlocks.GREEN_HYDRA_BRICK_WALL);
                        entries.add(MarvelBlocks.GREEN_HYDRA_BRICK_LAMP);
                        entries.add(MarvelBlocks.YELLOW_HYDRA_BRICKS);
                        entries.add(MarvelBlocks.YELLOW_HYDRA_BRICK_SLAB);
                        entries.add(MarvelBlocks.YELLOW_HYDRA_BRICK_STAIRS);
                        entries.add(MarvelBlocks.YELLOW_HYDRA_BRICK_WALL);
                        entries.add(MarvelBlocks.YELLOW_HYDRA_BRICK_LAMP);
                        entries.add(MarvelBlocks.LIGHT_GRAY_HYDRA_BRICKS);
                        entries.add(MarvelBlocks.LIGHT_GRAY_HYDRA_BRICK_SLAB);
                        entries.add(MarvelBlocks.LIGHT_GRAY_HYDRA_BRICK_STAIRS);
                        entries.add(MarvelBlocks.LIGHT_GRAY_HYDRA_BRICK_WALL);
                        entries.add(MarvelBlocks.LIGHT_GRAY_HYDRA_BRICK_LAMP);
                        entries.add(MarvelBlocks.GRAY_HYDRA_BRICKS);
                        entries.add(MarvelBlocks.GRAY_HYDRA_BRICK_SLAB);
                        entries.add(MarvelBlocks.GRAY_HYDRA_BRICK_STAIRS);
                        entries.add(MarvelBlocks.GRAY_HYDRA_BRICK_WALL);
                        entries.add(MarvelBlocks.GRAY_HYDRA_BRICK_LAMP);
                        entries.add(MarvelBlocks.STONE_BRICK_LAMP);
                        entries.add(MarvelBlocks.DEEPSLATE_BRICK_LAMP);
                        entries.add(MarvelBlocks.TESSERACT);
                        entries.add(MarvelItems.VIBRANIUM);
                        entries.add(MarvelItems.VIBRANIUM_INGOT);
                        entries.add(MarvelItems.VIBRANIUM_NUGGET);
                        entries.add(MarvelItems.VIBRANIUM_SWORD);
                        entries.add(MarvelItems.VIBRANIUM_SHOVEL);
                        entries.add(MarvelItems.VIBRANIUM_PICKAXE);
                        entries.add(MarvelItems.VIBRANIUM_AXE);
                        entries.add(MarvelItems.VIBRANIUM_HOE);
                        entries.add(MarvelItems.VIBRANIUM_HELMET);
                        entries.add(MarvelItems.VIBRANIUM_CHESTPLATE);
                        entries.add(MarvelItems.VIBRANIUM_LEGGINGS);
                        entries.add(MarvelItems.VIBRANIUM_BOOTS);
                        entries.add(MarvelItems.RAW_TITANIUM);
                        entries.add(MarvelItems.TITANIUM_INGOT);
                        entries.add(MarvelItems.TITANIUM_NUGGET);
                        entries.add(MarvelItems.RAW_PALLADIUM);
                        entries.add(MarvelItems.PALLADIUM_INGOT);
                        entries.add(MarvelItems.PALLADIUM_NUGGET);
                        entries.add(MarvelItems.GOLD_TITANIUM_INGOT);
                        entries.add(MarvelItems.GOLD_TITANIUM_NUGGET);
                        entries.add(MarvelItems.ADAMANTIUM_INGOT);
                        entries.add(MarvelItems.ADAMANTIUM_NUGGET);
                        entries.add(MarvelItems.PROTO_ADAMANTIUM_INGOT);
                        entries.add(MarvelItems.PROTO_ADAMANTIUM_NUGGET);
                        entries.add(MarvelItems.URU_INGOT);
                        entries.add(MarvelItems.URU_NUGGET);
                        entries.add(MarvelItems.REINFORCED_LEATHER);
                        entries.add(MarvelItems.VIBRANIUM_WEAVE);
                        entries.add(MarvelItems.VIBRANIUM_NANITES);
                        entries.add(MarvelItems.KINETIC_BLACK_PANTHER_NECKLACE);
                        entries.add(MarvelItems.KILLMONGER_NECKLACE);
                        entries.add(MarvelItems.BLACK_PANTHER_SHURI_NECKLACE);
                        entries.add(MarvelItems.WEB_FLUID);
                        entries.add(MarvelItems.UNSTABLE_PYM_PARTICLE);
                        entries.add(MarvelItems.PYM_PARTICLE);
                        entries.add(MarvelItems.SYRINGE);
                        entries.add(MarvelItems.VILLAGER_BLOOD_SAMPLE);
                        entries.add(MarvelItems.X_GENES);
                        entries.add(MarvelItems.PALLADIUM_ARC_REACTOR);
                        entries.add(MarvelItems.DIAMOND_ARC_REACTOR);
                        entries.add(MarvelItems.IRON_MAN_MARK_5_SUITCASE);
                        entries.add(MarvelItems.VERONICA_SATELLITE);
                        entries.add(MarvelItems.VERONICA_REPAIR_MODULE_MARK_1);
                        entries.add(MarvelItems.VERONICA_REPAIR_MODULE_MARK_2);
                        entries.add(MarvelItems.VERONICA_REMOTE);
                        entries.add(MarvelItems.HYDRA_BANNER_PATTERN);
                        entries.add(MarvelItems.TESSERACT_SHARD);
                        entries.add(MarvelItems.SPACE_STONE);
                        entries.add(MarvelItems.KATANA_UPGRADE_SMITHING_TEMPLATE);
                        entries.add(MarvelItems.HYDRA_AGENT_SPAWN_EGG);
                        entries.add(MarvelItems.BARON_ZEMO_SPAWN_EGG);
                        entries.add(MarvelItems.WINTER_SOLDIER_SPAWN_EGG);
                        entries.add(MarvelItems.RED_SKULL_SPAWN_EGG);
                    }))
                    .build());

    public static final ItemGroup WEAPONS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(MarvelSuperHeroes.MOD_ID,"weapons"),
            FabricItemGroup.builder().icon(()-> new ItemStack(MarvelItems.VIBRANIUM))
                    .displayName(Text.translatable("itemgroup.marvel.weapons"))
                    .entries(((displayContext, entries) -> {

                    }))
                    .build());
    public static final ItemGroup SUITS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(MarvelSuperHeroes.MOD_ID,"suits"),
            FabricItemGroup.builder().icon(()-> new ItemStack(MarvelItems.VIBRANIUM))
                    .displayName(Text.translatable("itemgroup.marvel.suits"))
                    .entries(((displayContext, entries) -> {
                        entries.add(MarvelItems.CAPTAIN_AMERICA_HELMET);
                        entries.add(MarvelItems.CAPTAIN_AMERICA_CHESTPLATE);
                        entries.add(MarvelItems.CAPTAIN_AMERICA_LEGGINGS);
                        entries.add(MarvelItems.CAPTAIN_AMERICA_BOOTS);
                        entries.add(MarvelItems.CAPTAIN_AMERICA_STEALTH_HELMET);
                        entries.add(MarvelItems.CAPTAIN_AMERICA_STEALTH_CHESTPLATE);
                        entries.add(MarvelItems.CAPTAIN_AMERICA_STEALTH_LEGGINGS);
                        entries.add(MarvelItems.CAPTAIN_AMERICA_STEALTH_BOOTS);
                        entries.add(MarvelItems.CAPTAIN_CARTER_HELMET);
                        entries.add(MarvelItems.CAPTAIN_CARTER_CHESTPLATE);
                        entries.add(MarvelItems.CAPTAIN_CARTER_LEGGINGS);
                        entries.add(MarvelItems.CAPTAIN_CARTER_BOOTS);
                        entries.add(MarvelItems.RED_GUARDIAN_HELMET);
                        entries.add(MarvelItems.RED_GUARDIAN_CHESTPLATE);
                        entries.add(MarvelItems.RED_GUARDIAN_LEGGINGS);
                        entries.add(MarvelItems.RED_GUARDIAN_BOOTS);
                        entries.add(MarvelItems.BLACK_PANTHER_HELMET);
                        entries.add(MarvelItems.BLACK_PANTHER_CHESTPLATE);
                        entries.add(MarvelItems.BLACK_PANTHER_LEGGINGS);
                        entries.add(MarvelItems.BLACK_PANTHER_BOOTS);
                        entries.add(MarvelItems.KINETIC_BLACK_PANTHER_HELMET);
                        entries.add(MarvelItems.KINETIC_BLACK_PANTHER_CHESTPLATE);
                        entries.add(MarvelItems.KINETIC_BLACK_PANTHER_LEGGINGS);
                        entries.add(MarvelItems.KINETIC_BLACK_PANTHER_BOOTS);
                        entries.add(MarvelItems.KILLMONGER_HELMET);
                        entries.add(MarvelItems.KILLMONGER_CHESTPLATE);
                        entries.add(MarvelItems.KILLMONGER_LEGGINGS);
                        entries.add(MarvelItems.KILLMONGER_BOOTS);
                        entries.add(MarvelItems.BLACK_PANTHER_SHURI_HELMET);
                        entries.add(MarvelItems.BLACK_PANTHER_SHURI_CHESTPLATE);
                        entries.add(MarvelItems.BLACK_PANTHER_SHURI_LEGGINGS);
                        entries.add(MarvelItems.BLACK_PANTHER_SHURI_BOOTS);
                        entries.add(MarvelItems.WOLVERINE_HELMET);
                        entries.add(MarvelItems.WOLVERINE_CHESTPLATE);
                        entries.add(MarvelItems.WOLVERINE_SLEEVELESS_CHESTPLATE);
                        entries.add(MarvelItems.WOLVERINE_LEGGINGS);
                        entries.add(MarvelItems.WOLVERINE_BOOTS);
                        entries.add(MarvelItems.WOLVERINE_BROWN_HELMET);
                        entries.add(MarvelItems.WOLVERINE_BROWN_CHESTPLATE);
                        entries.add(MarvelItems.WOLVERINE_BROWN_SLEEVELESS_CHESTPLATE);
                        entries.add(MarvelItems.WOLVERINE_BROWN_LEGGINGS);
                        entries.add(MarvelItems.WOLVERINE_BROWN_BOOTS);
                        entries.add(MarvelItems.WOLVERINE_X_FORCE_HELMET);
                        entries.add(MarvelItems.WOLVERINE_X_FORCE_CHESTPLATE);
                        entries.add(MarvelItems.WOLVERINE_X_FORCE_SLEEVELESS_CHESTPLATE);
                        entries.add(MarvelItems.WOLVERINE_X_FORCE_LEGGINGS);
                        entries.add(MarvelItems.WOLVERINE_X_FORCE_BOOTS);
                        entries.add(MarvelItems.CYCLOPS_HELMET);
                        entries.add(MarvelItems.CYCLOPS_CHESTPLATE);
                        entries.add(MarvelItems.CYCLOPS_LEGGINGS);
                        entries.add(MarvelItems.CYCLOPS_BOOTS);
                        entries.add(MarvelItems.CYCLOPS_ASTONISHING_HELMET);
                        entries.add(MarvelItems.CYCLOPS_ASTONISHING_CHESTPLATE);
                        entries.add(MarvelItems.CYCLOPS_ASTONISHING_LEGGINGS);
                        entries.add(MarvelItems.CYCLOPS_ASTONISHING_BOOTS);
                        entries.add(MarvelItems.SPIDER_MAN_HELMET);
                        entries.add(MarvelItems.SPIDER_MAN_CHESTPLATE);
                        entries.add(MarvelItems.SPIDER_MAN_LEGGINGS);
                        entries.add(MarvelItems.SPIDER_MAN_BOOTS);
                        entries.add(MarvelItems.SPIDER_MAN_MCU_HELMET);
                        entries.add(MarvelItems.SPIDER_MAN_MCU_CHESTPLATE);
                        entries.add(MarvelItems.SPIDER_MAN_MCU_LEGGINGS);
                        entries.add(MarvelItems.SPIDER_MAN_MCU_BOOTS);
                        entries.add(MarvelItems.MILES_MORALES_HELMET);
                        entries.add(MarvelItems.MILES_MORALES_CHESTPLATE);
                        entries.add(MarvelItems.MILES_MORALES_LEGGINGS);
                        entries.add(MarvelItems.MILES_MORALES_BOOTS);
                        entries.add(MarvelItems.SPIDER_GWEN_HELMET);
                        entries.add(MarvelItems.SPIDER_GWEN_CHESTPLATE);
                        entries.add(MarvelItems.SPIDER_GWEN_LEGGINGS);
                        entries.add(MarvelItems.SPIDER_GWEN_BOOTS);
                        entries.add(MarvelItems.SPIDER_MAN_INSOMNIAC_HELMET);
                        entries.add(MarvelItems.SPIDER_MAN_INSOMNIAC_CHESTPLATE);
                        entries.add(MarvelItems.SPIDER_MAN_INSOMNIAC_LEGGINGS);
                        entries.add(MarvelItems.SPIDER_MAN_INSOMNIAC_BOOTS);
                        entries.add(MarvelItems.ANT_MAN_HELMET);
                        entries.add(MarvelItems.ANT_MAN_CHESTPLATE);
                        entries.add(MarvelItems.ANT_MAN_LEGGINGS);
                        entries.add(MarvelItems.ANT_MAN_BOOTS);
                        entries.add(MarvelItems.ANT_MAN_UPGRADED_HELMET);
                        entries.add(MarvelItems.ANT_MAN_UPGRADED_CHESTPLATE);
                        entries.add(MarvelItems.ANT_MAN_UPGRADED_LEGGINGS);
                        entries.add(MarvelItems.ANT_MAN_UPGRADED_BOOTS);
                        entries.add(MarvelItems.WASP_HELMET);
                        entries.add(MarvelItems.WASP_CHESTPLATE);
                        entries.add(MarvelItems.WASP_LEGGINGS);
                        entries.add(MarvelItems.WASP_BOOTS);
                        entries.add(MarvelItems.WAR_MACHINE_MARK_1_HELMET);
                        entries.add(MarvelItems.WAR_MACHINE_MARK_1_CHESTPLATE);
                        entries.add(MarvelItems.WAR_MACHINE_MARK_1_LEGGINGS);
                        entries.add(MarvelItems.WAR_MACHINE_MARK_1_BOOTS);
                        entries.add(MarvelItems.WAR_MACHINE_MARK_2_HELMET);
                        entries.add(MarvelItems.WAR_MACHINE_MARK_2_CHESTPLATE);
                        entries.add(MarvelItems.WAR_MACHINE_MARK_2_LEGGINGS);
                        entries.add(MarvelItems.WAR_MACHINE_MARK_2_BOOTS);
                        entries.add(MarvelItems.IRON_PATRIOT_HELMET);
                        entries.add(MarvelItems.IRON_PATRIOT_CHESTPLATE);
                        entries.add(MarvelItems.IRON_PATRIOT_LEGGINGS);
                        entries.add(MarvelItems.IRON_PATRIOT_BOOTS);
                        entries.add(MarvelItems.QUICKSILVER_CHESTPLATE);
                        entries.add(MarvelItems.QUICKSILVER_LEGGINGS);
                        entries.add(MarvelItems.QUICKSILVER_BOOTS);
                        entries.add(MarvelItems.QUICKSILVER_MCU_CHESTPLATE);
                        entries.add(MarvelItems.QUICKSILVER_MCU_LEGGINGS);
                        entries.add(MarvelItems.QUICKSILVER_MCU_BOOTS);
                        entries.add(MarvelItems.DEADPOOL_HELMET);
                        entries.add(MarvelItems.DEADPOOL_CHESTPLATE);
                        entries.add(MarvelItems.DEADPOOL_LEGGINGS);
                        entries.add(MarvelItems.DEADPOOL_BOOTS);
                        entries.add(MarvelItems.DEADPOOL_X_FORCE_HELMET);
                        entries.add(MarvelItems.DEADPOOL_X_FORCE_CHESTPLATE);
                        entries.add(MarvelItems.DEADPOOL_X_FORCE_LEGGINGS);
                        entries.add(MarvelItems.DEADPOOL_X_FORCE_BOOTS);
                        entries.add(MarvelItems.CAPTAIN_MARVEL_HELMET);
                        entries.add(MarvelItems.CAPTAIN_MARVEL_CHESTPLATE);
                        entries.add(MarvelItems.CAPTAIN_MARVEL_LEGGINGS);
                        entries.add(MarvelItems.CAPTAIN_MARVEL_BOOTS);
                        entries.add(MarvelItems.CAPTAIN_MARVEL_838_HELMET);
                        entries.add(MarvelItems.CAPTAIN_MARVEL_838_CHESTPLATE);
                        entries.add(MarvelItems.CAPTAIN_MARVEL_838_LEGGINGS);
                        entries.add(MarvelItems.CAPTAIN_MARVEL_838_BOOTS);
                        entries.add(MarvelItems.WINTER_SOLDIER_CHESTPLATE);
                        entries.add(MarvelItems.WINTER_SOLDIER_LEGGINGS);
                        entries.add(MarvelItems.WINTER_SOLDIER_BOOTS);


                    }))
                    .build());
     public static final ItemGroup IRON_MAN_SUITS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(MarvelSuperHeroes.MOD_ID,"iron_man_suits"),
            FabricItemGroup.builder().icon(()-> new ItemStack(MarvelItems.VIBRANIUM))
                    .displayName(Text.translatable("itemgroup.marvel.iron_man_suits"))
                    .entries(((displayContext, entries) -> {
                        entries.add(MarvelItems.IRON_MAN_MARK_1_HELMET);
                        entries.add(MarvelItems.IRON_MAN_MARK_1_CHESTPLATE);
                        entries.add(MarvelItems.IRON_MAN_MARK_1_LEGGINGS);
                        entries.add(MarvelItems.IRON_MAN_MARK_1_BOOTS);
                        entries.add(MarvelItems.IRON_MAN_MARK_2_HELMET);
                        entries.add(MarvelItems.IRON_MAN_MARK_2_CHESTPLATE);
                        entries.add(MarvelItems.IRON_MAN_MARK_2_LEGGINGS);
                        entries.add(MarvelItems.IRON_MAN_MARK_2_BOOTS);
                        entries.add(MarvelItems.IRON_MAN_MARK_3_HELMET);
                        entries.add(MarvelItems.IRON_MAN_MARK_3_CHESTPLATE);
                        entries.add(MarvelItems.IRON_MAN_MARK_3_LEGGINGS);
                        entries.add(MarvelItems.IRON_MAN_MARK_3_BOOTS);
                        entries.add(MarvelItems.IRON_MAN_MARK_5_HELMET);
                        entries.add(MarvelItems.IRON_MAN_MARK_5_CHESTPLATE);
                        entries.add(MarvelItems.IRON_MAN_MARK_5_LEGGINGS);
                        entries.add(MarvelItems.IRON_MAN_MARK_5_BOOTS);
                        entries.add(MarvelItems.IRON_MAN_MARK_6_HELMET);
                        entries.add(MarvelItems.IRON_MAN_MARK_6_CHESTPLATE);
                        entries.add(MarvelItems.IRON_MAN_MARK_6_LEGGINGS);
                        entries.add(MarvelItems.IRON_MAN_MARK_6_BOOTS);
                        entries.add(MarvelItems.IRON_MAN_MARK_7_HELMET);
                        entries.add(MarvelItems.IRON_MAN_MARK_7_CHESTPLATE);
                        entries.add(MarvelItems.IRON_MAN_MARK_7_LEGGINGS);
                        entries.add(MarvelItems.IRON_MAN_MARK_7_BOOTS);
                        entries.add(MarvelItems.IRON_MAN_MARK_11_HELMET);
                        entries.add(MarvelItems.IRON_MAN_MARK_11_CHESTPLATE);
                        entries.add(MarvelItems.IRON_MAN_MARK_11_LEGGINGS);
                        entries.add(MarvelItems.IRON_MAN_MARK_11_BOOTS);
                        entries.add(MarvelItems.IRON_MAN_MARK_15_HELMET);
                        entries.add(MarvelItems.IRON_MAN_MARK_15_CHESTPLATE);
                        entries.add(MarvelItems.IRON_MAN_MARK_15_LEGGINGS);
                        entries.add(MarvelItems.IRON_MAN_MARK_15_BOOTS);
                        entries.add(MarvelItems.IRON_MAN_MARK_17_HELMET);
                        entries.add(MarvelItems.IRON_MAN_MARK_17_CHESTPLATE);
                        entries.add(MarvelItems.IRON_MAN_MARK_17_LEGGINGS);
                        entries.add(MarvelItems.IRON_MAN_MARK_17_BOOTS);
                        entries.add(MarvelItems.IRON_MAN_MARK_19_HELMET);
                        entries.add(MarvelItems.IRON_MAN_MARK_19_CHESTPLATE);
                        entries.add(MarvelItems.IRON_MAN_MARK_19_LEGGINGS);
                        entries.add(MarvelItems.IRON_MAN_MARK_19_BOOTS);
                        entries.add(MarvelItems.IRON_MAN_MARK_20_HELMET);
                        entries.add(MarvelItems.IRON_MAN_MARK_20_CHESTPLATE);
                        entries.add(MarvelItems.IRON_MAN_MARK_20_LEGGINGS);
                        entries.add(MarvelItems.IRON_MAN_MARK_20_BOOTS);
                        entries.add(MarvelItems.IRON_MAN_MARK_21_HELMET);
                        entries.add(MarvelItems.IRON_MAN_MARK_21_CHESTPLATE);
                        entries.add(MarvelItems.IRON_MAN_MARK_21_LEGGINGS);
                        entries.add(MarvelItems.IRON_MAN_MARK_21_BOOTS);
                        entries.add(MarvelItems.IRON_MAN_MARK_22_HELMET);
                        entries.add(MarvelItems.IRON_MAN_MARK_22_CHESTPLATE);
                        entries.add(MarvelItems.IRON_MAN_MARK_22_LEGGINGS);
                        entries.add(MarvelItems.IRON_MAN_MARK_22_BOOTS);
                        entries.add(MarvelItems.IRON_MAN_MARK_23_HELMET);
                        entries.add(MarvelItems.IRON_MAN_MARK_23_CHESTPLATE);
                        entries.add(MarvelItems.IRON_MAN_MARK_23_LEGGINGS);
                        entries.add(MarvelItems.IRON_MAN_MARK_23_BOOTS);
                        entries.add(MarvelItems.IRON_MAN_MARK_24_HELMET);
                        entries.add(MarvelItems.IRON_MAN_MARK_24_CHESTPLATE);
                        entries.add(MarvelItems.IRON_MAN_MARK_24_LEGGINGS);
                        entries.add(MarvelItems.IRON_MAN_MARK_24_BOOTS);
                        entries.add(MarvelItems.IRON_MAN_MARK_25_HELMET);
                        entries.add(MarvelItems.IRON_MAN_MARK_25_CHESTPLATE);
                        entries.add(MarvelItems.IRON_MAN_MARK_25_LEGGINGS);
                        entries.add(MarvelItems.IRON_MAN_MARK_25_BOOTS);
                        entries.add(MarvelItems.IRON_MAN_MARK_28_HELMET);
                        entries.add(MarvelItems.IRON_MAN_MARK_28_CHESTPLATE);
                        entries.add(MarvelItems.IRON_MAN_MARK_28_LEGGINGS);
                        entries.add(MarvelItems.IRON_MAN_MARK_28_BOOTS);
                        entries.add(MarvelItems.IRON_MAN_MARK_30_HELMET);
                        entries.add(MarvelItems.IRON_MAN_MARK_30_CHESTPLATE);
                        entries.add(MarvelItems.IRON_MAN_MARK_30_LEGGINGS);
                        entries.add(MarvelItems.IRON_MAN_MARK_30_BOOTS);
                        entries.add(MarvelItems.IRON_MAN_MARK_33_HELMET);
                        entries.add(MarvelItems.IRON_MAN_MARK_33_CHESTPLATE);
                        entries.add(MarvelItems.IRON_MAN_MARK_33_LEGGINGS);
                        entries.add(MarvelItems.IRON_MAN_MARK_33_BOOTS);
                        entries.add(MarvelItems.IRON_MAN_MARK_35_HELMET);
                        entries.add(MarvelItems.IRON_MAN_MARK_35_CHESTPLATE);
                        entries.add(MarvelItems.IRON_MAN_MARK_35_LEGGINGS);
                        entries.add(MarvelItems.IRON_MAN_MARK_35_BOOTS);
                        entries.add(MarvelItems.IRON_MAN_MARK_37_HELMET);
                        entries.add(MarvelItems.IRON_MAN_MARK_37_CHESTPLATE);
                        entries.add(MarvelItems.IRON_MAN_MARK_37_LEGGINGS);
                        entries.add(MarvelItems.IRON_MAN_MARK_37_BOOTS);
                        entries.add(MarvelItems.IRON_MAN_MARK_39_HELMET);
                        entries.add(MarvelItems.IRON_MAN_MARK_39_CHESTPLATE);
                        entries.add(MarvelItems.IRON_MAN_MARK_39_LEGGINGS);
                        entries.add(MarvelItems.IRON_MAN_MARK_39_BOOTS);

                    }))
                    .build());

    public static void registerItemGroups(){
        MarvelSuperHeroes.LOGGER.info("Registering Item Groups for"+ MarvelSuperHeroes.MOD_ID);
    }
}
