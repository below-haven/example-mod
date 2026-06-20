package com.bh.testmod.mixin;

import com.threerings.projectx.client.ProjectXApp;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ProjectXApp.class)
public abstract class MainLog {
	@Inject(method = "main", at = @At("HEAD"))
	private static void main(String[] stringArray, CallbackInfo ci) {
		System.out.println("[bh-test-mod] game init :)");
	}
}
