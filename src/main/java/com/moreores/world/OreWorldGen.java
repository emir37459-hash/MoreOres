package com.moreores.world;

import com.moreores.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

public class OreWorldGen implements IWorldGenerator {

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        if (world.provider.getDimensionType().getId() == 0) {
            generateOre(ModBlocks.RUBY_ORE,      world, random, chunkX, chunkZ, 4,  8,  16, 48);
            generateOre(ModBlocks.SAPPHIRE_ORE,  world, random, chunkX, chunkZ, 4,  8,  16, 48);
            generateOre(ModBlocks.TOPAZ_ORE,     world, random, chunkX, chunkZ, 5,  8,  8,  48);
            generateOre(ModBlocks.AMETHYST_ORE,  world, random, chunkX, chunkZ, 4,  8,  16, 40);
            generateOre(ModBlocks.TITANIUM_ORE,  world, random, chunkX, chunkZ, 3,  6,  8,  24);
            generateOre(ModBlocks.COPPER_ORE,    world, random, chunkX, chunkZ, 8,  10, 8,  64);
            generateOre(ModBlocks.TIN_ORE,       world, random, chunkX, chunkZ, 8,  10, 8,  64);
            generateOre(ModBlocks.SILVER_ORE,    world, random, chunkX, chunkZ, 5,  8,  10, 40);
        }
    }

    private void generateOre(Block block, World world, Random rand, int chunkX, int chunkZ,
                              int veinSize, int veinsPerChunk, int minY, int maxY) {
        WorldGenMinable gen = new WorldGenMinable(block.getDefaultState(), veinSize);
        for (int i = 0; i < veinsPerChunk; i++) {
            int x = chunkX * 16 + rand.nextInt(16);
            int y = minY + rand.nextInt(maxY - minY);
            int z = chunkZ * 16 + rand.nextInt(16);
            gen.generate(world, rand, new BlockPos(x, y, z));
        }
    }
}
