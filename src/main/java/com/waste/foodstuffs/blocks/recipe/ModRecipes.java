package com.waste.foodstuffs.blocks.recipe;

import com.waste.foodstuffs.FoodStuffs;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModRecipes {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, FoodStuffs.MODID);

    public static final RegistryObject<RecipeSerializer<RealSmokerRecipe>> REAL_SMOKING_SERIALIZER =
            SERIALIZERS.register("real_smoking", () -> RealSmokerRecipe.Serializer.INSTANCE);

    public static void register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
    }
}
