package com.example.test.forge;

import com.example.test.TestMod;
import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(TestMod.MOD_ID)
public class TestModForge {
    public TestModForge() {
        EventBuses.registerModEventBus(TestMod.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        TestMod.init();
    }
}
