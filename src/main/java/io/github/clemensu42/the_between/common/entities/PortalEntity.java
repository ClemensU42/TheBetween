package io.github.clemensu42.the_between.common.entities;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.network.packet.s2c.play.EntitySpawnS2CPacket;
import net.minecraft.world.World;

public class PortalEntity extends Entity {

    public float shatterProgress = 1.0F;

    public PortalEntity(EntityType<?> type, World world) {
        super(type, world);
    }

    @Override
    protected void initDataTracker() {

    }

    @Override
    protected void readCustomDataFromNbt(NbtCompound nbt) {
        if(nbt.contains("shatterProgress"))
            this.shatterProgress = nbt.getFloat("shatterProgress");
    }

    @Override
    protected void writeCustomDataToNbt(NbtCompound nbt) {
        nbt.putFloat("shatterProgress", this.shatterProgress);
    }

    @Override
    public void onSpawnPacket(EntitySpawnS2CPacket packet) {
        super.onSpawnPacket(packet);
    }

    @Override
    public void tick() {
        super.tick();
        if(age > 250){
            shatterProgress -= 0.01f;
        }
    }
}
