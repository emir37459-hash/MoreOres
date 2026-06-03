package com.moreores.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockOre extends Block {

    public BlockOre(Material material, int harvestLevel, float hardness) {
        super(material);
        this.setHardness(hardness);
        this.setResistance(5.0f);
        this.setHarvestLevel("pickaxe", harvestLevel);
        this.setSoundType(net.minecraft.block.SoundType.STONE);
        this.setLightLevel(0.0f);
    }
}
