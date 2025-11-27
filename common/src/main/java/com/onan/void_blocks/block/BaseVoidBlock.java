package com.onan.void_blocks.block;

import net.minecraft.block.Block;
import net.minecraft.state.property.BooleanProperty;

public class BaseVoidBlock extends Block
{
    public static final BooleanProperty ON = BooleanProperty.of("on");
    public BaseVoidBlock(Settings settings)
    {
        super(settings.strength(2.0f));
    }
}
