package com.waste.foodstuffs.items;

import com.waste.foodstuffs.FoodStuffs;
import com.waste.foodstuffs.blocks.ModBlocks;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.TridentItem;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CakeBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FoodStuffs.MODID);

    public static final RegistryObject<Item> FLESH = ITEMS.register("flesh",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(new FoodProperties.Builder().nutrition(4).saturationMod(0.8f).effect(() -> new MobEffectInstance(MobEffects.HUNGER, 600, 1), 0.8f).meat().build())));;
    public static final RegistryObject<Item> COOKED_FLESH = ITEMS.register("cooked_flesh",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(new FoodProperties.Builder().nutrition(4).saturationMod(0.8f).effect(() -> new MobEffectInstance(MobEffects.HUNGER, 600, 1), 0.8f).meat().build())));
    public static final RegistryObject<Item> COOKED_ROTTEN_FLESH = ITEMS.register("cooked_rotten_flesh",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(new FoodProperties.Builder().nutrition(4).saturationMod(0.8f).effect(() -> new MobEffectInstance(MobEffects.HUNGER, 600, 1), 0.8f).meat().build())));
    public static final RegistryObject<Item> BAKED_APPLE = ITEMS.register("baked_apple",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(new FoodProperties.Builder().nutrition(4).saturationMod(0.8f).build())));
    public static final RegistryObject<Item> APPLE_PIE = ITEMS.register("apple_pie",
            () -> new BlockItem(ModBlocks.APPLE_PIE.get(), new Item.Properties().tab(CreativeModeTab.TAB_FOOD)));
    public static final RegistryObject<Item> PUMPKIN_PIE = ITEMS.register("pumpkin_pie",
            () -> new BlockItem(ModBlocks.PUMPKIN_PIE.get(), new Item.Properties().tab(CreativeModeTab.TAB_FOOD)));
    public static final RegistryObject<Item> REAL_SMOKER = ITEMS.register("real_smoker",
            () -> new BlockItem(ModBlocks.REAL_SMOKER.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> SMOKED_BEEF = ITEMS.register("smoked_beef",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(new FoodProperties.Builder().nutrition(4).saturationMod(0.8f).meat().build())));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
