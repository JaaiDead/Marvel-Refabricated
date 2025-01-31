package org.arcticquests.dev.world.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.boss.BossBar;
import net.minecraft.entity.boss.ServerBossBar;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.world.World;


public class BaronZemo extends HostileEntity {
    private static final TrackedData<Boolean> ACTIVATED = DataTracker.registerData(BaronZemo.class, TrackedDataHandlerRegistry.BOOLEAN);
    private final ServerBossBar bossEvent = new ServerBossBar(getDisplayName(), BossBar.Color.PURPLE, BossBar.Style.PROGRESS);

    protected BaronZemo(EntityType<? extends HostileEntity> entityType, World world) {
        super(entityType, world);
        this.experiencePoints = 250;
        bossEvent.setVisible(false);
        setPersistent();

    }
}
