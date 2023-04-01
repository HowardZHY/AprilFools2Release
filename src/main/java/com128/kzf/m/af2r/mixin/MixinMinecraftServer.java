package com128.kzf.m.af2r.mixin;

import net.minecraft.server.MinecraftServer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(MinecraftServer.class)
public class MixinMinecraftServer {
    @ModifyConstant(method = "run", constant = @Constant(intValue = 48))
    public int run(int constant){
        return 47;
    }
}
