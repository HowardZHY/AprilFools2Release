package com128.kzf.m.af2r.mixin;

import net.minecraft.item.ExtendItems;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.item.Item;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ItemRenderer.class)
public class MixinItemRenderer {
    @Shadow
    private void addModel(Item item, String id){}

    @Inject(method = "method_10247", at = {@At(value = "TAIL")})
    private void initModels(CallbackInfo ci){
        addModel(ExtendItems.field_7067, "carrot_on_a_stick");
    }
}