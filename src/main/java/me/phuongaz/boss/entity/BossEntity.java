package me.phuongaz.boss.entity;

import cn.nukkit.entity.EntityHuman;
import cn.nukkit.level.format.FullChunk;
import cn.nukkit.nbt.tag.CompoundTag;

abstract public class BossEntity extends EntityHuman {

    public BossEntity(FullChunk chunk, CompoundTag nbt) {
        super(chunk, nbt);
    }

}
