package org.arcticquests.dev.world.entity;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.network.RegistryByteBuf;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.network.codec.PacketCodecs;
import net.minecraft.registry.RegistryCodecs;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryElementCodec;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.registry.entry.RegistryEntryList;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;
import org.arcticquests.dev.core.registries.MarvelRegistries;

import java.util.Objects;

public record HydraAgentVariant(Identifier texture, RegistryEntryList<Biome> biome) {

    public static final Codec<HydraAgentVariant> DIRECT_CODEC = RecordCodecBuilder.create(instance ->
            instance.group(Identifier.CODEC.fieldOf("texture").
                            forGetter(hydraAgentVariant -> hydraAgentVariant.texture),
                    RegistryCodecs.entryList(RegistryKeys.BIOME).fieldOf("biome")
                                    .forGetter(HydraAgentVariant::biome)).apply(instance,HydraAgentVariant::new));


    public static final PacketCodec<RegistryByteBuf, HydraAgentVariant> DIRECT_PACKECT_CODEC = PacketCodec.tuple(Identifier.PACKET_CODEC,
            HydraAgentVariant::texture,PacketCodecs.registryEntryList(RegistryKeys.BIOME),
            HydraAgentVariant::biome, HydraAgentVariant::new);

    public static final RegistryElementCodec<HydraAgentVariant> CODEC = RegistryElementCodec.of(MarvelRegistries.HYDRA_AGENT_VARIANT, DIRECT_CODEC);

    public static final PacketCodec<RegistryByteBuf, RegistryEntry<HydraAgentVariant>> STREAM_CODEC =
            PacketCodecs.registryEntry(MarvelRegistries.HYDRA_AGENT_VARIANT, DIRECT_PACKECT_CODEC);


    public Identifier texture(String name) {

        return texture.withPath(path -> "textures/" + path + "_" + name + ".png");
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        } else {
            return object instanceof HydraAgentVariant hydraAgentVariant
                    && Objects.equals(this.texture, hydraAgentVariant.texture)
                    && Objects.equals(this.biome, hydraAgentVariant.biome);
        }
    }

}
