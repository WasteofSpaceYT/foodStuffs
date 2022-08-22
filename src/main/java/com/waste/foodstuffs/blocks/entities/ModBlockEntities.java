package com.waste.foodstuffs.blocks.entities;

import com.waste.foodstuffs.FoodStuffs;
import com.waste.foodstuffs.blocks.ModBlocks;
import com.waste.foodstuffs.blocks.entities.custom.RealSmokerBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, FoodStuffs.MODID);

    public static final RegistryObject<BlockEntityType<RealSmokerBlockEntity>> REAL_SMOKER_BLOCK_ENTITY = BLOCK_ENTITY_TYPES.register("real_smoker_block_entity",
            () -> BlockEntityType.Builder.of(RealSmokerBlockEntity::new, ModBlocks.REAL_SMOKER.get()).build(null));
    public static void register(IEventBus eventBus) {
        BLOCK_ENTITY_TYPES.register(eventBus);
    }
}
