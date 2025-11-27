package com.onan.void_blocks;

import com.onan.void_blocks.block.RegisterBlocks;
import com.onan.void_blocks.optional.ChiselSupport;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.item.Item;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VoidBlocksMod
{
	public static final String MODID = "void_blocks";
	public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

	public static void init()
	{
		RegisterBlocks.register();
	}

	public static void post(boolean chisel) {
		if (chisel) {
			for (RegistrySupplier<Item> supplier : RegisterBlocks.itemSuppliers) {
				ChiselSupport.addvoidBlockToChisel(supplier.get().arch$registryName());
			}
		}
	}
}
