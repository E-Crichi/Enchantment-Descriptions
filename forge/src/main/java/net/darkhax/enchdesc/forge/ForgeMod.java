package net.darkhax.enchdesc.forge;

import net.darkhax.enchdesc.common.impl.Constants;
import net.darkhax.enchdesc.common.impl.EnchdescMod;
import net.minecraftforge.fml.common.Mod;

@Mod(Constants.MOD_ID)
public class ForgeMod {

    public ForgeMod() {
        EnchdescMod.getInstance().init();
    }
}