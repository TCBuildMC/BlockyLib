package xyz.tcbuildmc.minecraft.blockylib.client.fabric;

import net.fabricmc.api.ClientModInitializer;
import xyz.tcbuildmc.minecraft.blockylib.client.BlockyLibClient;

public final class BlockyLibClientFabric implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockyLibClient.initClient();
    }
}
