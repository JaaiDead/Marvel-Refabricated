package org.arcticquests.dev.client.datagen;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;
import org.arcticquests.dev.client.datagen.tags.MarvelDamageTypesTagProvider;

public class MarvelDataGenrator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        //pack.addProvider(MarvelAdvancementProvider::new);
        pack.addProvider(MarvelDamageTypesProvider::new);
        pack.addProvider(MarvelDamageTypesTagProvider::new);
    }
    @Override
    public void buildRegistry(RegistryBuilder builder) {
        builder.addRegistry(RegistryKeys.DAMAGE_TYPE, MarvelDamageTypesProvider::bootstrap);
    }
}