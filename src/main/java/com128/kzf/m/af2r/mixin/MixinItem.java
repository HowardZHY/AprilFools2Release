package com128.kzf.m.af2r.mixin;

import net.minecraft.class_1426;
import net.minecraft.item.Item;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Item.class)
public class MixinItem {
    @Shadow
    private static void register(int id, String name, Item item){};

    @Inject(method = "method_6368", at = {@At(value = "TAIL")})
    private static void setup(CallbackInfo ci){
        register(398, "carrot_on_a_stick", (new class_1426()).setTranslationKey("carrotOnAStick"));
    }
}