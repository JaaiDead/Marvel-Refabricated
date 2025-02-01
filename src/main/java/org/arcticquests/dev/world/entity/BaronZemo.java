package org.arcticquests.dev.world.entity;


import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.provider.EnchantmentProviders;
import net.minecraft.entity.EntityData;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.boss.BossBar;
import net.minecraft.entity.boss.ServerBossBar;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.passive.IronGolemEntity;
import net.minecraft.entity.passive.MerchantEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.LocalDifficulty;
import net.minecraft.world.ServerWorldAccess;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;


public  class BaronZemo extends HostileEntity {


    private static final TrackedData<Boolean> ACTIVATED = DataTracker.registerData(BaronZemo.class, TrackedDataHandlerRegistry.BOOLEAN);
    private final ServerBossBar bossBar = new ServerBossBar(getDisplayName(), BossBar.Color.PURPLE, BossBar.Style.NOTCHED_10);

    protected BaronZemo(EntityType<? extends HostileEntity> entityType, World world) {
        super(entityType, world);
        this.experiencePoints = 250;
        bossBar.setVisible(false);
        setPersistent();
    }

    @Override
    protected void initDataTracker(DataTracker.Builder builder) {
        super.initDataTracker(builder);
        builder.add(ACTIVATED, false);
    }


    @Override
    protected void initGoals(){
        /*Goals Selector*/
        this.goalSelector.add(0, new SwimGoal(this));
        this.goalSelector.add(3, new MeleeAttackGoal(this,1.0,true));

        this.goalSelector.add(8,new WanderAroundGoal(this,0.6){
            @Override
            public boolean canStart() {
                return super.canStart() && isActivated();
            }
        }); //This Add Some Tracking stuff - Jaai

        this.goalSelector.add(9,new LookAtEntityGoal(this, PlayerEntity.class,15.0F,1.0F));
        this.goalSelector.add(10,new LookAtEntityGoal(this, MobEntity.class,15.0F));


        /*Target Selector*/
        this.targetSelector.add(1,new RevengeGoal(this, HydraAgent.class,BaronZemo.class));
        this.targetSelector.add(2,new ActiveTargetGoal<>(this, PlayerEntity.class,true));
        this.targetSelector.add(3,new ActiveTargetGoal<>(this, MerchantEntity.class,false));
        this.targetSelector.add(3,new ActiveTargetGoal<>(this, IronGolemEntity.class,true));
    }

    public boolean isActivated() {
        return dataTracker.get(ACTIVATED);
    }


    @Override
    public boolean canImmediatelyDespawn(double distanceSquared) {
        return false;
    }

    public void setActivated(boolean activated) {
        dataTracker.set(ACTIVATED, activated);
    }
   /* Attributes*/
    public static DefaultAttributeContainer.Builder createAttributes(){
        return MobEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED,0.3F)
                .add(EntityAttributes.GENERIC_MAX_HEALTH,150)
                .add(EntityAttributes.GENERIC_ARMOR,15)
                .add(EntityAttributes.GENERIC_ARMOR_TOUGHNESS,1)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE,1)
                .add(EntityAttributes.GENERIC_FOLLOW_RANGE,32.0);
    }

    @Override
    public int getLimitPerChunk(){
        return 1;
    }


    @Nullable
    @Override
    public EntityData initialize(ServerWorldAccess world, LocalDifficulty localdifficulty, SpawnReason spawnReason, @Nullable EntityData entityData) {
        Random random = world.getRandom();
        initEquipment(random,localdifficulty);
        updateEnchantments(world,random,localdifficulty);
        return super.initialize(world, localdifficulty, spawnReason, entityData);
    }

    @Override
    protected void initEquipment(Random random, LocalDifficulty localdifficulty) {
        this.equipStack(EquipmentSlot.MAINHAND, new ItemStack(Items.DIAMOND_SWORD));
        this.updateDropChances(EquipmentSlot.MAINHAND);
    }
    //TODO: Continue From Enchanting the equipment for todays thats all lol - Jaai
        /*BOSS BAR */
    @Override
    public void onStartedTrackingBy(ServerPlayerEntity player){
        super.onStartedTrackingBy(player);
        this.bossBar.addPlayer(player);
    }
    @Override
    public void onStoppedTrackingBy(ServerPlayerEntity player){
        super.onStoppedTrackingBy(player);
        this.bossBar.removePlayer(player);
    }
    @Override
    protected void mobTick(){
        super.mobTick();
        this.bossBar.setPercent(this.getHealth()/this.getMaxHealth());
    }
}
