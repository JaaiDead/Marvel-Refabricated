package org.arcticquests.dev.client.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricDynamicRegistryProvider;

import net.minecraft.entity.damage.DamageType;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import org.arcticquests.dev.world.damagesources.MarvelDamageTypes;

import java.util.concurrent.CompletableFuture;
import static org.arcticquests.dev.world.damagesources.MarvelDamageTypes.MarvelDamageType.*;

public class MarvelDamageTypesProvider extends FabricDynamicRegistryProvider {
    public MarvelDamageTypesProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup lookup, Entries entries) {
        entries.addAll(lookup.getWrapperOrThrow(RegistryKeys.DAMAGE_TYPE));
    }

    public static void bootstrap(Registerable<DamageType> damageTypeRegisterable) {
        damageTypeRegisterable.register(KINETIC_BLAST, new DamageType("kinetic_blast", 0.1f));
        damageTypeRegisterable.register(VIBRANIUM_SHIELD, new DamageType("vibranium_shield", 0.1f));
        damageTypeRegisterable.register(VIBRANIUM_SHIELD_DISPENSER, new DamageType("vibranium_shield_dispenser", 0.1f));
        damageTypeRegisterable.register(OPTIC_BLAST, new DamageType("optic_blast", 0.1f));
        damageTypeRegisterable.register(OPTIC_BLAST_GOOFY, new DamageType("optic_blast_goofy", 0.1f));
        damageTypeRegisterable.register(WEB_SHOT, new DamageType("web_shot", 0.1f));
        damageTypeRegisterable.register(GIANT_MAN, new DamageType("giant_man", 0.1f));
        damageTypeRegisterable.register(MJOLNIR, new DamageType("mjolnir", 0.1f));
        damageTypeRegisterable.register(MJOLNIR_DISPENSER, new DamageType("mjolnir_dispenser", 0.1f));
        damageTypeRegisterable.register(STORMBREAKER, new DamageType("stormbreaker", 0.1f));
        damageTypeRegisterable.register(STORMBREAKER_DISPENSER, new DamageType("stormbreaker_dispenser", 0.1f));
        damageTypeRegisterable.register(FLAMETHROWER, new DamageType("flamethrower", 0.1f));
        damageTypeRegisterable.register(QUICKSILVER_ATTACK, new DamageType("quicksilver_attack", 0.1f));
        damageTypeRegisterable.register(PHOTON_BLAST, new DamageType("photon_blast", 0.1f));
        damageTypeRegisterable.register(TESSERACT_ARROW, new DamageType("arrow", 0.1F));
        damageTypeRegisterable.register(TESSERACT_FIREWORKS, new DamageType("fireworks", 0.1F));
    }
    //TODO: Fix The Text Stuff
    @Override
    public String getName() {
        return "Marvel Damage Types Provider";
    }
}