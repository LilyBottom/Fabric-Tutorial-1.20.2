package net.lily.tutorialmod.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;


public class ModFoodComponent {
    public static final FoodComponent TOMATO = new FoodComponent.Builder().hunger(3).saturationModifier(.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 200),.25f).build();
}
