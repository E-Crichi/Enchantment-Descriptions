package net.darkhax.enchdesc.impl;

import net.darkhax.enchdesc.common.impl.Constants;
import net.darkhax.enchdesc.common.impl.EnchdescMod;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(Constants.MOD_ID)
public class NeoForgeMod {

    public NeoForgeMod(IEventBus eventBus) {
        EnchdescMod.getInstance().init();
    }
}