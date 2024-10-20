package com.example.test;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import xyz.tcbuildmc.minecraft.blockylib.registry.Entry;
import xyz.tcbuildmc.minecraft.blockylib.registry.Register;

@Register(id = TestMod.MOD_ID, type = Item.class)
public class ModItems {
    @Entry("example_1")
    public static final Item EXAMPLE_1 = new Item(new Item.Settings().arch$tab(ItemGroups.INGREDIENTS));

    @Entry
    public static final Item EXAMPLE_2 = new Item(new Item.Settings().arch$tab(ItemGroups.INGREDIENTS));

    @Entry
    public static final Item EXAMPLE_3 = new BlockItem(ModBlocks.EXAMPLE_3, new Item.Settings().arch$tab(ItemGroups.INGREDIENTS));
}
