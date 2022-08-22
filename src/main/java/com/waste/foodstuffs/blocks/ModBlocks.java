package com.waste.foodstuffs.blocks;

import com.waste.foodstuffs.FoodStuffs;
import com.waste.foodstuffs.blocks.custom.RealSmokerBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CakeBlock;
import net.minecraft.world.level.block.ChestBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, FoodStuffs.MODID);
    public static final DeferredRegister<BlockEntityType<?>> FOODSUFFS_BLOCK_ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, FoodStuffs.MODID);

    public static RegistryObject<Block> APPLE_PIE = BLOCKS.register("apple_pie",
            () -> new CakeBlock(BlockBehaviour.Properties.of(Material.CAKE).strength(0.5F).sound(SoundType.WOOL)));

    public static RegistryObject<Block> PUMPKIN_PIE = BLOCKS.register("pumpkin_pie",
            () -> new CakeBlock(BlockBehaviour.Properties.of(Material.CAKE).strength(0.5F).sound(SoundType.WOOL)));

    public static RegistryObject<Block> REAL_SMOKER = BLOCKS.register("real_smoker",
            () -> new RealSmokerBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.5F).sound(SoundType.STONE)));
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
