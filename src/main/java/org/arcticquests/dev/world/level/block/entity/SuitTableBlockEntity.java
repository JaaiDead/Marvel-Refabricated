package org.arcticquests.dev.world.level.block.entity;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntityType;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.network.listener.ClientPlayPacketListener;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.text.Text;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.BlockEntityUpdateS2CPacket;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.util.Nameable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.screen.PropertyDelegate;
import net.minecraft.block.entity.BlockEntity;
import org.arcticquests.dev.world.inventory.SuitRepairingMenu;
import org.arcticquests.dev.world.inventory.SuitUpgradingMenu;
import org.arcticquests.dev.world.inventory.SuitVariantMenu;
import org.arcticquests.dev.world.level.block.MarvelBlocks;
import org.jetbrains.annotations.Nullable;

public class SuitTableBlockEntity extends BlockEntity implements NamedScreenHandlerFactory, Nameable {
    protected final PropertyDelegate dataAccess;
    @Nullable
    private Text name;
    public int tab;

    public SuitTableBlockEntity(BlockPos pos,  BlockState state) {

        super(MarvelBlockEntityTypes.SUIT_TABLE, pos, state);

        this.dataAccess = new PropertyDelegate() {
            @Override
            public int get(int index) {
                return switch (index){
                    case 1 -> getPos().getY();
                    case 2 -> getPos().getZ();
                    case 3 -> tab;
                    default -> getPos().getX();

                };
            }

            @Override
            public void set(int index, int value) {
                if(index == 3 ){
                    tab = value;
                }

            }

            @Override
            public int size() {
                return 4;
            }
        };
    }

    @Override
    protected void readNbt(NbtCompound nbt, RegistryWrapper.WrapperLookup registryLookup) {
        super.readNbt(nbt,registryLookup);
        if (nbt.contains("CustomName",8)){
            this.name = tryParseCustomName(nbt.getString("CustomName"),registryLookup);

        }
        this.tab = nbt.getInt("tab");
    }

    @Override
    protected void writeNbt(NbtCompound nbt, RegistryWrapper.WrapperLookup registryLookup) {
        super.writeNbt(nbt,registryLookup);
        if(this.name !=null){
            nbt.putString("CustomName",Text.Serialization.toJsonString(this.name,registryLookup));
        }
    }

    @Override
    @Nullable
    public NbtCompound toInitialChunkDataNbt(RegistryWrapper.WrapperLookup registryLookup) {
        return this.createComponentlessNbt(registryLookup);
    }


    @Override
    public Text getName() {
        return this.name != null ? this.name : MarvelBlocks.SUIT_TABLE.getName();
    }


    @Override
    public Text getDisplayName() {
        return this.getName();
    }

    @Override
    public @Nullable Text getCustomName() {
        return this.name;
    }

    @Nullable
    @Override
    public Packet<ClientPlayPacketListener> toUpdatePacket() {
        return BlockEntityUpdateS2CPacket.create(this);
    }

    @Override
    public @Nullable ScreenHandler createMenu(int syncId, PlayerInventory playerInventory, PlayerEntity player) {
        return tab>=2 ? new SuitRepairingMenu(syncId,playerInventory, ScreenHandlerContext.create(getWorld(),getPos()),getPos(),dataAccess)
                : new SuitUpgradingMenu(ScreenHandlerContext.create(getWorld(),getPos()),getPos(),dataAccess);
    }
}

