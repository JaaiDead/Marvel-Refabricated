package org.arcticquests.dev.world.inventory;

import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.CraftingInventory;
import net.minecraft.inventory.CraftingResultInventory;
import net.minecraft.inventory.RecipeInputInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.PropertyDelegate;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.Chunk;
import org.jetbrains.annotations.Nullable;

public class SuitRepairingMenu extends ScreenHandler implements SuitTableMenu {

    private final RecipeInputInventory craftSlots = new CraftingInventory(this, 5, 2);
    private final CraftingResultInventory resultSlot = new CraftingResultInventory();
    private final ScreenHandlerContext access;
    private final PlayerEntity player;
    private final PropertyDelegate data;

    protected SuitRepairingMenu(@Nullable ScreenHandlerType<SuitRepairingMenu> type, int syncId,PlayerInventory playerinventory) {
        super(type, syncId);
    }

    @Override
    public BlockPos getPos() {
        return new BlockPos(data.get(0),data.get(1),data.get(2));
    }

}
