package me.phuongaz.boss.utils;

import cn.nukkit.block.BlockID;
import cn.nukkit.entity.Entity;
import cn.nukkit.math.NukkitMath;

import java.util.SplittableRandom;

public class Utils {

    public static final SplittableRandom random = new SplittableRandom();

    public static int rand(int min, int max) {
        if (min == max) {
            return max;
        }
        return random.nextInt(max + 1 - min) + min;
    }

    public static double rand(double min, double max) {
        if (min == max) {
            return max;
        }
        return min + Math.random() * (max-min);
    }

    public static float rand(float min, float max) {
        if (min == max) {
            return max;
        }
        return min + (float) Math.random() * (max-min);
    }

    public static boolean rand() {
        return random.nextBoolean();
    }

    public static boolean entityInsideWaterFast(Entity ent) {
        double y = ent.y + ent.getEyeHeight();
        int b = ent.level.getBlockIdAt(NukkitMath.floorDouble(ent.x), NukkitMath.floorDouble(y), NukkitMath.floorDouble(ent.z));
        return b == BlockID.WATER || b == BlockID.STILL_WATER;
    }
}
