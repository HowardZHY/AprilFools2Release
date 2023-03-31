package com128.kzf.m.af2r.mixin;

import net.minecraft.client.network.ServerInfo;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(ServerInfo.class)
public class ServerInfoMixin {
    @Shadow
    public int protocolVersion;

    @ModifyConstant(method = "<init>", constant = @Constant(intValue = 48))
    public int protocolVersion(int i){
        this.protocolVersion = 47;
        return 47;
    }
}
