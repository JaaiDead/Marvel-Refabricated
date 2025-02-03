package org.arcticquests.dev.core.registries;

import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import org.arcticquests.dev.MarvelSuperHeroes;
import org.arcticquests.dev.world.entity.HydraAgentVariant;
import net.fabricmc.fabric.api.event.Event;

public class MarvelRegistries {
    public static final RegistryKey<Registry<HydraAgentVariant>> HYDRA_AGENT_VARIANT = RegistryKey.ofRegistry(MarvelSuperHeroes.id("hydra_agent_variant"));
    public static final RegistryKey<Registry<HydraAgentSkin>> HYDRA_AGENT_SKIN = RegistryKey.ofRegistry(MarvelSuperHeroes.id("hydra_agent_skin"));


    /*public static void dataPackRegistries() {

        event.dataPackRegistry(HYDRA_AGENT_VARIANT, HydraAgentVariant.DIRECT_CODEC, HydraAgentVariant.DIRECT_CODEC);
        event.dataPackRegistry(HYDRA_AGENT_SKIN, HydraAgentSkin.DIRECT_CODEC, HydraAgentSkin.DIRECT_CODEC);
    }*/


}