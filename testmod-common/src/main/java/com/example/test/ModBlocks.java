package com.example.test;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import xyz.tcbuildmc.minecraft.blockylib.registry.Entry;
import xyz.tcbuildmc.minecraft.blockylib.registry.Register;

@Register(id = TestMod.MOD_ID, type = Block.class)
public class ModBlocks {
    @Entry
    public static final Block EXAMPLE_3 = new Block(AbstractBlock.Settings.create());
}
