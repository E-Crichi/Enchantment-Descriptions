package net.darkhax.enchdesc.fabric.impl;

import net.darkhax.enchdesc.common.impl.EnchdescMod;
import net.fabricmc.api.ModInitializer;

public class FabricMod implements ModInitializer {

    @Override
    public void onInitialize() {
        EnchdescMod.getInstance().init();
    }
}