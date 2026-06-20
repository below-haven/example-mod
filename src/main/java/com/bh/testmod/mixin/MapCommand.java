package com.bh.testmod.mixin;


import com.threerings.crowd.chat.client.ChatDirector;
import com.threerings.crowd.util.CrowdContext;
import com.threerings.projectx.client.WorldMapWindow;
import com.threerings.projectx.util.ProjectXContext;
import game.Class_1543;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ChatDirector.class)
public abstract class MapCommand {
    @Shadow
    private CrowdContext _ctx;

    @Inject(method = "method_6095", at = @At("HEAD"), cancellable = true, require = 1)
    protected void something(Class_1543 v1, String v2, boolean i3, CallbackInfoReturnable<String> cir) {
        if ("/testcommand".equals(v2)) {
            ProjectXContext v4 = (ProjectXContext) this._ctx;
            new WorldMapWindow(v4);
            cir.setReturnValue("success");
        }
    }
}
