package org.arcticquests.dev.world.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.server.network.ServerPlayerEntity;

public class IcingStatusEffect extends StatusEffect { //This class is absolutely no dam reason from the neo forge im just porting it, so I won't have any issues
    protected IcingStatusEffect(StatusEffectCategory category, int color) {
        super(category, color);
    }

    // Called every tick to check if the effect can be applied or not
    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        int i = 25 >> amplifier;
        return i == 0 || duration % i == 0;
        // In our case, we just make it return true so that it applies the effect every tick
    }

    // Called when the effect is applied.
    @Override
    public boolean applyUpdateEffect(LivingEntity entity, int amplifier) {
        if (entity instanceof ServerPlayerEntity player) {
            player.getAbilities().allowFlying = true;
            player.sendAbilitiesUpdate();
        }
        return super.applyUpdateEffect(entity, amplifier);
    }
}


