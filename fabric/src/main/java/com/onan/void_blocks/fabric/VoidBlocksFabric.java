package com.onan.void_blocks.fabric;

import com.onan.void_blocks.VoidBlocksMod;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;

public class VoidBlocksFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        VoidBlocksMod.init();
        VoidBlocksMod.post(FabricLoader.getInstance().isModLoaded("chisel"));
    }
}
