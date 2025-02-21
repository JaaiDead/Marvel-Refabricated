package org.arcticquests.dev.world.level.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;

public class BossFloorBlock extends Block {

    public static final BooleanProperty BOSS = BooleanProperty.of("boss");

    public BossFloorBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.stateManager.getDefaultState().with((BOSS), false));
    }
    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(BOSS);
    }
}
