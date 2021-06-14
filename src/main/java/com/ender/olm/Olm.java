package com.ender.olm;

import com.ender.olm.items.ItemRegistry;
import net.fabricmc.api.ModInitializer;

public class Olm implements ModInitializer {

	public static final String MODID = "olm";

	@Override
	public void onInitialize() {
		ItemRegistry.init();
	}
}
