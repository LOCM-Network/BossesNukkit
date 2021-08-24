package me.phuongaz.boss;

import cn.nukkit.entity.Entity;
import cn.nukkit.plugin.PluginBase;
import me.phuongaz.boss.command.BossCommand;
import me.phuongaz.boss.entity.BossEntity;

public class Loader extends PluginBase{

    private static Loader instance;

    @Override
    public void onLoad() {
        instance = this;
    }

    @Override
    public void onEnable() {
        Entity.registerEntity(BossEntity.class.getSimpleName(), BossEntity.class);
        getServer().getCommandMap().register("Bosses", new BossCommand());
    }

    public static Loader getInstance() {
        return instance;
    }
}
