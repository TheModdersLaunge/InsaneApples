package themodderslaunge.insaneapples.core;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.food.Foods;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import themodderslaunge.insaneapples.InsaneApples;

public class ModItems {
    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, InsaneApples.MODID);

    public static RegistryObject<Item> DIRT_APPLE = CreativeTabInit.addToTab(
            ITEMS.register("dirt_apple",
            () -> new Item(new Item.Properties()
                    .stacksTo(64)
                    .food(getBaseFoodProperties()
                            .effect(() -> new MobEffectInstance(MobEffects.HUNGER, 600, 1), 1.0f)
                            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 600, 1), 1.0f)
                            .alwaysEat()
                            .build()))));

    private static FoodProperties.Builder getBaseFoodProperties() {
        return new FoodProperties.Builder()
                        .saturationMod(Foods.APPLE.getSaturationModifier())
                        .nutrition(Foods.APPLE.getNutrition());
    }
}
