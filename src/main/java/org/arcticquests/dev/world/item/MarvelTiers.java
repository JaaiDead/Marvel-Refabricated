package org.arcticquests.dev.world.item;


import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.component.type.ToolComponent;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;


import java.util.List;
import java.util.function.Supplier;

public enum MarvelTiers implements ToolMaterial {

    VIBRANIUM(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 4063, 1, 9.0F, 4.0F, 7, () -> Ingredient.ofItems(MarvelItems.VIBRANIUM_INGOT)),
    KATANAS(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1561, 1, 8.0F, 2.0F, 15, () -> Ingredient.ofItems(MarvelItems.TITANIUM_INGOT)),
    URU(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 0, 0, 9.0F, 4.0F, 0, () -> Ingredient.ofItems(MarvelItems.URU_INGOT)),
    ADAMANTIUM_CLAWS(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 0, 0, 9.0F, 4.0F, 0, () -> Ingredient.EMPTY),
    CENTURION_BLADE(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 0, 0, 8.0F, 3.0F, 0, () -> Ingredient.EMPTY);

    private final TagKey<Block> incorrectBlocksForDrops;
    private final int uses;
    private final int damagePerBlock;
    private final float speed;
    private final float damage;
    private final int enchantmentValue;
    private final Supplier<Ingredient> repairIngredient;

    MarvelTiers(TagKey<Block> incorrectBlocksForDrops, int durability, int damagePerBlock, float speed, float damageBonus, int enchantmentValue, Supplier<Ingredient> repairIngredient) {
        this.incorrectBlocksForDrops = incorrectBlocksForDrops;
        this.uses = durability;
        this.damagePerBlock = damagePerBlock;
        this.speed = speed;
        this.damage = damageBonus;
        this.enchantmentValue = enchantmentValue;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurability() {
        return this.uses;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.speed;
    }

    @Override
    public float getAttackDamage() {
        return this.damage;
    }

    @Override
    public TagKey<Block> getInverseTag() {
        return incorrectBlocksForDrops;
    }

    @Override
    public int getEnchantability() {
        return this.enchantmentValue;

    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @Override
    public ToolComponent createComponent(TagKey<Block> tag) {
        return new ToolComponent(
                List.of(ToolComponent.Rule.ofNeverDropping(this.incorrectBlocksForDrops),
                        ToolComponent.Rule.ofAlwaysDropping(tag, this.getMiningSpeedMultiplier())),
                1.0F, this.damagePerBlock);
    }
}