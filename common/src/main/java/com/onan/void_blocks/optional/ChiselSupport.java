package com.onan.void_blocks.optional;

import com.periut.chisel.block.ChiselGroupLookup;
import net.minecraft.util.Identifier;

public class ChiselSupport {
    public static void addvoidBlockToChisel(Identifier blockID)
    {
        try {
            ChiselGroupLookup.addItemToGroup("void", blockID);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
