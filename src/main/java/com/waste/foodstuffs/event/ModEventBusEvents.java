package com.waste.foodstuffs.event;

import com.waste.foodstuffs.FoodStuffs;
import com.waste.foodstuffs.blocks.recipe.RealSmokerRecipe;
import net.minecraft.core.Registry;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegisterEvent;

@Mod.EventBusSubscriber(modid = FoodStuffs.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerRecipeTypes(final RegisterEvent event) {
        Registry.register(Registry.RECIPE_TYPE, RealSmokerRecipe.Type.ID, RealSmokerRecipe.Type.INSTANCE);
    }
}
