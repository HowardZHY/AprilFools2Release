package com128.kzf.m.af2r.mixin;

import net.minecraft.client.gui.screen.ConnectScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(targets = "net.minecraft.class_472$1")
public class MixinConnectScreen {
    @ModifyConstant(method = "run", constant = @Constant(intValue = 48))
    public int run (int constant){
        return 47;
    }
}
