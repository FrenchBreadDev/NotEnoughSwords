package net.frenchbreadev.gsmod.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.frenchbreadev.gsmod.GsMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup GILDEDCOM = FabricItemGroupBuilder.build(
            new Identifier(GsMod.MOD_ID, "gildedcom"), () -> new ItemStack(ModItems.REFORGED_GILDSTONE_BLADE));
    }
