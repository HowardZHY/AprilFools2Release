package com128.kzf.m.af2r.mixin;

import net.minecraft.server.network.ServerHandshakeNetworkHandler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(ServerHandshakeNetworkHandler.class)
public class MixinServerHandshakeNetworkHandler {
    @ModifyConstant(method = "onHandshake", constant = @Constant(intValue = 48, ordinal = 1))
    public int onHandshake(int constant){
        return 47;
    }
}
