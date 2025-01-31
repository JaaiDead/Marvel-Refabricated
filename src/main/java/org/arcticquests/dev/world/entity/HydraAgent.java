package org.arcticquests.dev.world.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.world.World;

public class HydraAgent extends HostileEntity  {
    protected HydraAgent(EntityType<? extends HostileEntity> entityType, World world) {
        super(entityType, world);
    }
}
