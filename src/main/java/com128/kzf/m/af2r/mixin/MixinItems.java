package com128.kzf.m.af2r.mixin;

import net.minecraft.item.Item;
import net.minecraft.item.Items;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(Items.class)
public class MixinItems{
    @Shadow
    private static Item getById(String id){
        return null;
    }

    private static final Item field_7067 = getById("carrot_on_a_stick");
}