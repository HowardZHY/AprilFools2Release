package com128.kzf.m.af2r.mixin;

import net.minecraft.class_1069;
import net.minecraft.class_1734;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Pseudo
@Mixin(remap = false, targets = "net.minecraft.class_560")
public class MixinItemRenderer {
    @Shadow
    private void method_10239(class_1069 item, String id){}

    @Inject(method = "method_10247", at = {@At(value = "TAIL")})
    private void initModels(CallbackInfo ci){
        // method_10239(class_1734.field_7067, "carrot_on_a_stick");
    }
}