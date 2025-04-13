package org.arcticquests.dev.world.level.block.entity;



import net.minecraft.block.Block;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.arcticquests.dev.MarvelSuperHeroes;
import org.arcticquests.dev.world.level.block.MarvelBlocks;


public class MarvelBlockEntityTypes {

    public static final BlockEntityType<SuitTableBlockEntity>  SUIT_TABLE = register("suit_table",  SuitTableBlockEntity::new, MarvelBlocks.SUIT_TABLE);
    public static final BlockEntityType<SuitChargerBlockEntity>  SUIT_CHARGER = register("suit_charger",  SuitChargerBlockEntity::new, MarvelBlocks.SUIT_CHARGER);
    public static final BlockEntityType<MjolnirBlockEntity>  MJOLNIR = register("mjolnir",  MjolnirBlockEntity::new, MarvelBlocks.MJOLNIR);


    private static <T extends BlockEntity> BlockEntityType<T> register(String name,
                                                                       BlockEntityType.BlockEntityFactory<? extends T> entityFactory,
                                                                       Block... blocks) {
        Identifier id = Identifier.of(MarvelSuperHeroes.MOD_ID, name);
        return Registry.register(Registries.BLOCK_ENTITY_TYPE, id, BlockEntityType.Builder.<T>create(entityFactory, blocks).build());
    }

}