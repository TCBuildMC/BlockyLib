package com.example.test;

import net.minecraft.registry.RegistryKeys;
import xyz.tcbuildmc.minecraft.blockylib.registry.AnnotatedRegister;

public final class TestMod {
    public static final String MOD_ID = "test-mod";

    public static void init() {
        AnnotatedRegister.register(ModBlocks.class, RegistryKeys.BLOCK);
        AnnotatedRegister.register(ModItems.class, RegistryKeys.ITEM);
    }
}
