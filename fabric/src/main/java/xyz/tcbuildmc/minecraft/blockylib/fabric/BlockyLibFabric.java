package xyz.tcbuildmc.minecraft.blockylib.fabric;

import net.fabricmc.api.ModInitializer;
import xyz.tcbuildmc.minecraft.blockylib.BlockyLib;

public final class BlockyLibFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        BlockyLib.init();
    }
}
