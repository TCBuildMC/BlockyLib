package xyz.tcbuildmc.minecraft.blockylib.forge;

import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import xyz.tcbuildmc.minecraft.blockylib.BlockyLib;

@Mod(BlockyLib.MOD_ID)
public final class BlockyLibForge {
    public BlockyLibForge() {
        EventBuses.registerModEventBus(BlockyLib.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        BlockyLib.init();
    }
}
