package org.arcticquests.dev.world.entity;

import net.minecraft.entity.CrossbowUser;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.VariantHolder;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.world.World;
import net.minecraft.world.event.listener.GameEventListener;

public class HydraAgent extends HostileEntity implements VariantHolder<GameEventListener.Holder<HydraAgentVariant>>, CrossbowUser {
    protected HydraAgent(EntityType<? extends HostileEntity> entityType, World world) {
        super(entityType, world);
    }
    }
/*


    private static final TrackedData<GameEventListener.Holder<HydraAgentVariant>> VARIANT = DataTracker.registerData(HydraAgent.class, MarvelEntityDataSerializers.HYDRA_AGENT_VARIANT.get());
    private static final TrackedData<Holder<HydraAgentSkin>> SKIN = DataTracker.registerData(HydraAgent.class, MarvelEntityDataSerializers.HYDRA_AGENT_SKIN.get());
    private static final TrackedData<Boolean> IS_CHARGING_CROSSBOW = DataTracker.registerData(HydraAgent.class, EntityDataSerializers.BOOLEAN);
    private final RangedCrossbowAttackGoal<HydraAgent> crossbowGoal = new RangedCrossbowAttackGoal<>(this, 1.0, 8.0F);

    private final TimedMeleeAttackGoal meleeGoal = new TimedMeleeAttackGoal(this, 1.2, false) {

        @Override
        public void stop() {
            super.stop();
            HydraAgent.this.setAttacking(false);
        }

        @Override
        public void start() {
            super.start();
            HydraAgent.this.setAttacking(true);
        }
    };

    protected HydraAgent(EntityType<? extends HydraAgent> type, Level level) {
        super(type, level);
        reassessWeaponGoal();
        setPersistenceRequired();
    }

    @Override
    public boolean removeWhenFarAway(double p_21542_) {
        return false;
    }

    @Override
    protected void initGoals() {
        this.goalSelector.add(0, new SwimGoal(this));
        this.goalSelector.add(8, new WanderAroundGoal(this, 0.6));
        this.goalSelector.add(9, new LookAtEntityGoal(this, PlayerEntity.class, 15.0F, 1.0F));
        this.goalSelector.add(10, new LookAtEntityGoal(this, MobEntity.class, 15.0F));

        this.targetSelector.add(1, new RevengeGoal(this, HydraAgent.class, BaronZemo.class, WinterSoldier.class, RedSkull.class).setAlertOthers());
        this.targetSelector.add(2, new ActiveTargetGoal<>(this, PlayerEntity.class, true));
        this.targetSelector.add(3, new ActiveTargetGoal<>(this, MerchantEntity.class, false));
        this.targetSelector.add(3, new ActiveTargetGoal<>(this, IronGolemEntity.class, true));
    }

    public void reassessWeaponGoal() {
        if (!level().isClientSide) {
            goalSelector.removeGoal(meleeGoal);
            goalSelector.removeGoal(crossbowGoal);
            ItemStack itemstack = getItemInHand(ProjectileUtil.getWeaponHoldingHand(this, item -> item instanceof CrossbowItem));
            if (itemstack.getItem() instanceof CrossbowItem) {
                goalSelector.addGoal(3, crossbowGoal);
            } else {
                goalSelector.addGoal(3, meleeGoal);
            }
        }
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Monster.createMonsterAttributes().add(Attributes.MOVEMENT_SPEED, 0.3F).add(Attributes.MAX_HEALTH, 20.0).add(Attributes.ARMOR, 4.0).add(Attributes.ATTACK_DAMAGE, 1.0).add(Attributes.FOLLOW_RANGE, 32.0);
    }

    @Override
    protected void defineSynchedData(SynchedEntityData.Builder builder) {
        super.defineSynchedData(builder);
        RegistryAccess registryaccess = registryAccess();
        Registry<HydraAgentVariant> hydraAgentVariants = registryaccess.registryOrThrow(MarvelRegistries.HYDRA_AGENT_VARIANT);
        builder.define(VARIANT, hydraAgentVariants.getHolder(HydraAgentVariants.DEFAULT).or(hydraAgentVariants::getAny).orElseThrow());
        Registry<HydraAgentSkin> hydraAgentSkins = registryaccess.registryOrThrow(MarvelRegistries.HYDRA_AGENT_SKIN);
        builder.define(SKIN, hydraAgentSkins.getHolder(HydraAgentSkins.DEFAULT).or(hydraAgentSkins::getAny).orElseThrow());
        builder.define(IS_CHARGING_CROSSBOW, false);
    }

    @Override
    public boolean canFireProjectileWeapon(ProjectileWeaponItem item) {
        return item instanceof CrossbowItem;
    }

    @Override
    public void setVariant(Holder<HydraAgentVariant> holder) {
        entityData.set(VARIANT, holder);
    }

    @Override
    public Holder<HydraAgentVariant> getVariant() {
        return entityData.get(VARIANT);
    }

    public void setSkin(Holder<HydraAgentSkin> holder) {
        entityData.set(SKIN, holder);
    }

    public Holder<HydraAgentSkin> getSkin() {
        return entityData.get(SKIN);
    }

    @Override
    public void addAdditionalSaveData(CompoundTag tag) {
        super.addAdditionalSaveData(tag);
        getVariant().unwrapKey().ifPresent(key -> tag.putString("variant", key.location().toString()));
        getSkin().unwrapKey().ifPresent(key -> tag.putString("skin", key.location().toString()));
    }

    @Override
    public void readAdditionalSaveData(CompoundTag tag) {
        super.readAdditionalSaveData(tag);
        Optional.ofNullable(ResourceLocation.tryParse(tag.getString("variant"))).map(location -> ResourceKey.create(MarvelRegistries.HYDRA_AGENT_VARIANT, location)).flatMap(key -> registryAccess().registryOrThrow(MarvelRegistries.HYDRA_AGENT_VARIANT).getHolder(key)).ifPresent(this::setVariant);
        Optional.ofNullable(ResourceLocation.tryParse(tag.getString("skin"))).map(location -> ResourceKey.create(MarvelRegistries.HYDRA_AGENT_SKIN, location)).flatMap(key -> registryAccess().registryOrThrow(MarvelRegistries.HYDRA_AGENT_SKIN).getHolder(key)).ifPresent(this::setSkin);
        setCanPickUpLoot(true);
        reassessWeaponGoal();
    }

    @Override
    public void setItemSlot(EquipmentSlot slot, ItemStack stack) {
        super.setItemSlot(slot, stack);
        if (!level().isClientSide) {
            reassessWeaponGoal();
        }
    }

    @Override
    public float getWalkTargetValue(BlockPos pos, LevelReader levelReader) {
        return 0.0F;
    }

    @Override
    public int getMaxSpawnClusterSize() {
        return 1;
    }

    @Nullable
    @Override
    public SpawnGroupData finalizeSpawn(ServerLevelAccessor levelAccessor, DifficultyInstance difficultyInstance, MobSpawnType mobSpawnType, @Nullable SpawnGroupData spawnGroupData) {
        Holder<Biome> biomeHolder = levelAccessor.getBiome(blockPosition().atY(319));
        Holder<HydraAgentVariant> agentVariant;
        if (spawnGroupData instanceof AgentSpawnGroupData agentSpawnGroupData) {
            agentVariant = agentSpawnGroupData.type;
        } else {
            agentVariant = HydraAgentVariants.getSpawnVariant(registryAccess(), biomeHolder);
            spawnGroupData = new AgentSpawnGroupData(agentVariant);
        }
        RandomSource randomSource = levelAccessor.getRandom();
        populateDefaultEquipmentSlots(randomSource, difficultyInstance);
        populateDefaultEquipmentEnchantments(levelAccessor, randomSource, difficultyInstance);
        reassessWeaponGoal();

        if (mobSpawnType != MobSpawnType.STRUCTURE) setVariant(agentVariant);
        Registry<HydraAgentSkin> hydraAgentSkins = registryAccess().registryOrThrow(MarvelRegistries.HYDRA_AGENT_SKIN);
        setSkin(hydraAgentSkins.getRandom(randomSource).orElse(hydraAgentSkins.getHolder(HydraAgentSkins.DEFAULT).or(hydraAgentSkins::getAny).orElseThrow()));
        return super.finalizeSpawn(levelAccessor, difficultyInstance, mobSpawnType, spawnGroupData);
    }

    @Override
    protected void populateDefaultEquipmentSlots(RandomSource randomSource, DifficultyInstance difficultyInstance) {
        boolean bl = randomSource.nextBoolean();
        boolean bl2 = randomSource.nextBoolean();
        setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(bl ? bl2 ? Items.CROSSBOW : MarvelItems.TESSERACT_CROSSBOW : Items.IRON_SWORD));
    }

    @Override
    protected void enchantSpawnedWeapon(ServerLevelAccessor levelAccessor, RandomSource randomSource, DifficultyInstance difficultyInstance) {
        super.enchantSpawnedWeapon(levelAccessor, randomSource, difficultyInstance);
        if (randomSource.nextInt(300) == 0) {
            ItemStack itemstack = getMainHandItem();
            if (itemstack.is(Items.CROSSBOW) || itemstack.is(MarvelItems.TESSERACT_CROSSBOW)) {
                EnchantmentHelper.enchantItemFromProvider(itemstack, levelAccessor.registryAccess(), VanillaEnchantmentProviders.PILLAGER_SPAWN_CROSSBOW, difficultyInstance, randomSource);
            }
        }
    }

    public static boolean checkHydraAgentSpawnRules(EntityType<HydraAgent> type, LevelAccessor accessor, MobSpawnType spawnType, BlockPos pos, RandomSource randomSource) {
        return accessor.getBlockState(pos.below()).is(MarvelBlocks.Tags.HYDRA_AGENT_SPAWNABLE_ON) && accessor.getDifficulty() != Difficulty.PEACEFUL && checkMobSpawnRules(type, accessor, spawnType, pos, randomSource);
    }

    public ArmPose getArmPose() {
        if (isChargingCrossbow()) {
            return ArmPose.CROSSBOW_CHARGE;
        } else if (isHolding(stack -> stack.getItem() instanceof CrossbowItem)) {
            return ArmPose.CROSSBOW_HOLD;
        } else {
            return ArmPose.NEUTRAL;
        }
    }

    public boolean isChargingCrossbow() {
        return entityData.get(IS_CHARGING_CROSSBOW);
    }

    @Override
    public void setChargingCrossbow(boolean charging) {
        entityData.set(IS_CHARGING_CROSSBOW, charging);
    }

    @Override
    public void onCrossbowAttackPerformed() {
        noActionTime = 0;
    }

    @Override
    public void performRangedAttack(LivingEntity living, float f) {
        performCrossbowAttack(this, 1.6F);
    }

    public static class AgentSpawnGroupData implements EntityData {
        public final GameEventListener.Holder<HydraAgentVariant> type;

        public AgentSpawnGroupData(GameEventListener.Holder<HydraAgentVariant> holder) {
            type = holder;
        }
    }

    public enum ArmPose {
        NEUTRAL,
        CROSSBOW_HOLD,
        CROSSBOW_CHARGE
    }
}
*/
