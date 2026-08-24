package com.example.tutorial;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterials;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class MainMod implements ModInitializer {
    public static final String MOD_ID = "tutorial";

    public static final Item KARADELIK = new SwordItem(
        ToolMaterials.NETHERITE,
        20,
        -1.0f,
        new Item.Settings()
    );

    @Override
    public void onInitialize() {
        Registry.register(Registries.ITEM, Identifier.of(MOD_ID, "karadelik"), KARADELIK);
    }
}