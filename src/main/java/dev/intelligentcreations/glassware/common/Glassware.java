package dev.intelligentcreations.glassware.common;

import dev.intelligentcreations.glassware.common.util.RegistryHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod(Glassware.MOD_ID)
public class Glassware {
    public static final String MOD_ID = "glassware";

    public Glassware() {
        RegistryHandler.register();
        MinecraftForge.EVENT_BUS.register(this);
    }
}
