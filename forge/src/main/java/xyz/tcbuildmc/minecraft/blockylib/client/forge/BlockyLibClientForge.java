package xyz.tcbuildmc.minecraft.blockylib.client.forge;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.common.Mod;
import xyz.tcbuildmc.minecraft.blockylib.BlockyLib;
import xyz.tcbuildmc.minecraft.blockylib.client.BlockyLibClient;

@Mod(BlockyLib.MOD_ID)
public class BlockyLibClientForge {
    public BlockyLibClientForge(Dist dist) {
        if (dist == Dist.CLIENT) {
            BlockyLibClient.initClient();
        }
    }
}
