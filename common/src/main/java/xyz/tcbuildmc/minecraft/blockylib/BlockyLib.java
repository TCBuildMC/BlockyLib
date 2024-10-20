package xyz.tcbuildmc.minecraft.blockylib;

import dev.architectury.platform.Platform;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class BlockyLib {
    public static final String MOD_ID = "blockylib";
    public static final String MOD_NAME = "Blocky Lib";
    public static final String MOD_VERSION = Platform.getMod(MOD_ID).getVersion();
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_NAME);

    public static void init() {
    }
}
