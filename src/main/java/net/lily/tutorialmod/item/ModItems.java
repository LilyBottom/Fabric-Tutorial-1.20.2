package net.lily.tutorialmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.impl.itemgroup.FabricItemGroup;
import net.lily.tutorialmod.TutorialMod;
import net.lily.tutorialmod.item.custom.MetalDetectorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
public static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings()));
public static final Item RAW_RUBY = registerItem("raw_ruby", new Item(new FabricItemSettings()));

public static final Item METAL_DETECTOR = registerItem("metal_detector",
            new MetalDetectorItem(new FabricItemSettings().maxDamage(64)));

public static final Item RUBY_STAFF = registerItem("ruby_staff",
            new Item(new FabricItemSettings().maxCount(1)));

public static final Item TOMATO = registerItem("tomato", new Item(new FabricItemSettings().food(ModFoodComponent.TOMATO)));
public static final Item COAL_BRIQUETTE = registerItem("coal_briquette", new Item(new FabricItemSettings().food(ModFoodComponent.TOMATO)));
//Add item to Creative tab
private static void addItemToIngredientTabItemGroup(FabricItemGroupEntries entries){
    entries.add(RUBY);
    entries.add(RAW_RUBY);
}

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(TutorialMod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        TutorialMod.LOGGER.info("Registering Mod Items for" + TutorialMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemToIngredientTabItemGroup);
    }
}
