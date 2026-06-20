package com.bh.testmod.mixin;

import com.threerings.presents.client.BlockingCommunicator;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Coerce;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(BlockingCommunicator.class)
public abstract class NetworkLog {
    @Inject(method = "method_11857", at = @At("HEAD"))
	protected void sendMessage(@Coerce Object arg, CallbackInfo ci) {
	    System.out.println("[bh] sendMessage");
		System.out.println("arg = " + arg);
        System.out.println("arg class = " + (arg == null ? "null" : arg.getClass().getName()));
	}

	@Inject(method = "method_11858", at = @At("HEAD"))
	protected void sendDatagram(@Coerce Object arg, CallbackInfo ci) {
	    System.out.println("[bh] sendDatagram");
		System.out.println("arg = " + arg);
        System.out.println("arg class = " + (arg == null ? "null" : arg.getClass().getName()));
	}
}
