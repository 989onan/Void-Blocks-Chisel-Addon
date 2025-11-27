package com.onan.void_blocks.block;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.onan.void_blocks.TooltipBlockItem;
import dev.architectury.registry.registries.Registrar;
import dev.architectury.registry.registries.RegistrarManager;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

import java.util.ArrayList;

import static com.onan.void_blocks.VoidBlocksMod.MODID;

public class RegisterBlocks
{
    public static final Supplier<RegistrarManager> MANAGER = Suppliers.memoize(() -> RegistrarManager.get(MODID));

    private static void addvoidBlock(String nameID)
    {
        addvoidBlock(nameID, true);
    }

    public static ArrayList<RegistrySupplier<Item>> itemSuppliers = new ArrayList<>();

    private static void addvoidBlock(String nameID, boolean include)
    {
        Identifier blockID = Identifier.of(MODID, nameID);

        Registrar<Block> blocks = MANAGER.get().get(Registries.BLOCK);
        RegistrySupplier<Block> blockSupplier = blocks.register(blockID, () -> new BaseVoidBlock(AbstractBlock.Settings.copy(Blocks.STONE)));

        Registrar<Item> items = MANAGER.get().get(Registries.ITEM);
        itemSuppliers.add(items.register(blockID, () -> new TooltipBlockItem(blockSupplier.get(), new Item.Settings().arch$tab(ItemGroups.BUILDING_BLOCKS), nameID + ".tooltip")));
    }

    public static void register()
    {
        addvoidBlock("voidstone_rune_black");
        addvoidBlock("voidstone_rune_blue");
        addvoidBlock("voidstone_rune_brown");
        addvoidBlock("voidstone_rune_cyan");
        addvoidBlock("voidstone_rune_gray");
        addvoidBlock("voidstone_rune_green");
        addvoidBlock("voidstone_rune_lightblue");
        addvoidBlock("voidstone_rune_lightgray");
        addvoidBlock("voidstone_rune_lime");
        addvoidBlock("voidstone_rune_magenta");
        addvoidBlock("voidstone_rune_orange");
        addvoidBlock("voidstone_rune_pink");
        addvoidBlock("voidstone_rune_purple");
        addvoidBlock("voidstone_rune_red");
        addvoidBlock("voidstone_rune_yellow");
        addvoidBlock("voidstone_bevel");
        addvoidBlock("voidstone_bevel_animated");
        addvoidBlock("voidstone_metal");
        addvoidBlock("voidstone_metal_animated");
        addvoidBlock("voidstone_eye");
        addvoidBlock("voidstone_quarters");
        addvoidBlock("voidstone_quarters_animated");
        addvoidBlock("voidstone_raw");
        addvoidBlock("voidstone_raw_animated");
        addvoidBlock("voidstone_rune");
        addvoidBlock("voidstone_rune_animated");
        addvoidBlock("voidstone_skulls");
        addvoidBlock("voidstone_skulls_animated");
        addvoidBlock("voidstone_smooth");
        addvoidBlock("voidstone_smooth_animated");
    }
}
