package net.minecraft;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.itemgroup.ItemGroup;
import net.minecraft.stat.Stats;
import net.minecraft.world.World;

public class class_1426 extends Item {
    public class_1426() {
        this.setItemGroup(ItemGroup.TRANSPORTATION);
        this.setMaxCount(1);
        this.setMaxDamage(25);
    }

    @Environment(EnvType.CLIENT)
    public boolean isHandheld() {
        return true;
    }

    @Environment(EnvType.CLIENT)
    public boolean shouldRotate() {
        return true;
    }

    public ItemStack onStartUse(ItemStack stack, World world, PlayerEntity player) {
        player.incrementStat(Stats.USED[Item.getRawId(this)]);
        return stack;
    }
}
