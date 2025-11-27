package com.onan.VoidBlocks.forge;

import com.onan.void_blocks.VoidBlocksMod;
import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(VoidBlocksMod.MODID)
public class VoidBlocksForge {
    public VoidBlocksForge() {
        // Submit our event bus to let architectury register our content on the right time
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        EventBuses.registerModEventBus(VoidBlocksMod.MODID, FMLJavaModLoadingContext.get().getModEventBus());
        VoidBlocksMod.init();
        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        VoidBlocksMod.post(ModList.get().isLoaded("chisel"));
    }
}
