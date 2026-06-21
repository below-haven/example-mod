package com.bh.testmod.mixin;

import com.threerings.presents.client.ClientCommunicator;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ClientCommunicator.class)
public abstract class ClientCommunicatorMixin {
    @Inject(method = "debugLogMessages", cancellable = true, at = @At("HEAD"), require = 1)
    protected void debugLogMessages(CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue(true);
    }
}
