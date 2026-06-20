package com.bh.testmod;

import net.fabricmc.api.ModInitializer;

public final class BhTestMod implements ModInitializer {
	public static final String MOD_ID = "bh-test-mod";

	@Override
	public void onInitialize() {
		System.out.println("[bh-test-mod] Mod initialized.");
	}
}
