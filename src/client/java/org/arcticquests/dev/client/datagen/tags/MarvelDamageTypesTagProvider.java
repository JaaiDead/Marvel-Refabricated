package org.arcticquests.dev.client.datagen.tags;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.entity.damage.DamageType;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import org.arcticquests.dev.world.damagesources.MarvelDamageTypes;

import java.util.concurrent.CompletableFuture;

public class MarvelDamageTypesTagProvider extends FabricTagProvider<DamageType> {

    public MarvelDamageTypesTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, RegistryKeys.DAMAGE_TYPE, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(MarvelDamageTypes.DamageTypeTags.KINETIC_BLAST).add(MarvelDamageTypes.MarvelDamageType.KINETIC_BLAST);
        getOrCreateTagBuilder(MarvelDamageTypes.DamageTypeTags.VIBRANIUM_SHIELD).add(MarvelDamageTypes.MarvelDamageType.VIBRANIUM_SHIELD);
        getOrCreateTagBuilder(MarvelDamageTypes.DamageTypeTags.VIBRANIUM_SHIELD_DISPENSER).add(MarvelDamageTypes.MarvelDamageType.VIBRANIUM_SHIELD_DISPENSER);
        getOrCreateTagBuilder(MarvelDamageTypes.DamageTypeTags.OPTIC_BLAST).add(MarvelDamageTypes.MarvelDamageType.OPTIC_BLAST);
        getOrCreateTagBuilder(MarvelDamageTypes.DamageTypeTags.OPTIC_BLAST_GOOFY).add(MarvelDamageTypes.MarvelDamageType.OPTIC_BLAST_GOOFY);
        getOrCreateTagBuilder(MarvelDamageTypes.DamageTypeTags.WEB_SHOT).add(MarvelDamageTypes.MarvelDamageType.WEB_SHOT);
        getOrCreateTagBuilder(MarvelDamageTypes.DamageTypeTags.GIANT_MAN).add(MarvelDamageTypes.MarvelDamageType.GIANT_MAN);
        getOrCreateTagBuilder(MarvelDamageTypes.DamageTypeTags.MJOLNIR).add(MarvelDamageTypes.MarvelDamageType.MJOLNIR);
        getOrCreateTagBuilder(MarvelDamageTypes.DamageTypeTags.MJOLNIR_DISPENSER).add(MarvelDamageTypes.MarvelDamageType.MJOLNIR_DISPENSER);
        getOrCreateTagBuilder(MarvelDamageTypes.DamageTypeTags.STORMBREAKER).add(MarvelDamageTypes.MarvelDamageType.STORMBREAKER);
        getOrCreateTagBuilder(MarvelDamageTypes.DamageTypeTags.STORMBREAKER_DISPENSER).add(MarvelDamageTypes.MarvelDamageType.STORMBREAKER_DISPENSER);
        getOrCreateTagBuilder(MarvelDamageTypes.DamageTypeTags.FLAMETHROWER).add(MarvelDamageTypes.MarvelDamageType.FLAMETHROWER);
        getOrCreateTagBuilder(MarvelDamageTypes.DamageTypeTags.QUICKSILVER_ATTACK).add(MarvelDamageTypes.MarvelDamageType.QUICKSILVER_ATTACK);
        getOrCreateTagBuilder(MarvelDamageTypes.DamageTypeTags.PHOTON_BLAST).add(MarvelDamageTypes.MarvelDamageType.PHOTON_BLAST);
        getOrCreateTagBuilder(MarvelDamageTypes.DamageTypeTags.TESSERACT_ARROW).add(MarvelDamageTypes.MarvelDamageType.TESSERACT_ARROW);
        getOrCreateTagBuilder(MarvelDamageTypes.DamageTypeTags.TESSERACT_FIREWORKS).add(MarvelDamageTypes.MarvelDamageType.TESSERACT_FIREWORKS);
    }
}