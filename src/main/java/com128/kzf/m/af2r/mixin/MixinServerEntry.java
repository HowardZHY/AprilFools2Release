package com128.kzf.m.af2r.mixin;

import net.minecraft.client.gui.widget.ServerEntry;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(ServerEntry.class)
public class MixinServerEntry {
    @ModifyConstant(method = "method_6700", constant = @Constant(intValue = 48, ordinal = 0))
    public int pn1(int constant){
        return 47;
    }
    @ModifyConstant(method = "method_6700", constant = @Constant(intValue = 48, ordinal = 1))
    public int pn2(int constant){
        return 47;
    }
}
