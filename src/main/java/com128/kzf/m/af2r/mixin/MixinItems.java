package com128.kzf.m.af2r.mixin;

import net.minecraft.item.IItems;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(Items.class)
public class MixinItems implements IItems {
    public Item field_7067 = Items.getById("carrot_on_a_stick");
}
