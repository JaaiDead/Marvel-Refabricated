package org.arcticquests.dev.world.effect;

import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import org.arcticquests.dev.MarvelSuperHeroes;

public class MarvelStatusEffects {
    public static final RegistryEntry<StatusEffect> ICING = registerStatusEfftects("icing",
            new IcingStatusEffect(StatusEffectCategory.HARMFUL,0xA8F7FF)
                    .addAttributeModifier(EntityAttributes.GENERIC_FLYING_SPEED,Identifier.of(MarvelSuperHeroes.MOD_ID,"icing"),-1F,
                            EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));


    public static RegistryEntry<StatusEffect> registerStatusEfftects (String name , StatusEffect statusEffect){
        return Registry.registerReference(Registries.STATUS_EFFECT, Identifier.of(MarvelSuperHeroes.MOD_ID,name), statusEffect);
    }
    public static void registerEffects() {
        MarvelSuperHeroes.LOGGER.info("Registering Mod Effects for " + MarvelSuperHeroes.MOD_ID);
    }
}
