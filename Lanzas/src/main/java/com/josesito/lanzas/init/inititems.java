package com.josesito.lanzas.init;

import com.josesito.lanzas.Lanzas;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class inititems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(
            ForgeRegistries.ITEMS, Lanzas.MODID
    );

    public static final RegistryObject<SwordItem> LANZA = ITEMS.register(
            "lanzanetherite", () -> new SwordItem(
                    Tiers.NETHERITE,
                    (int)1.9,
                    0.005F,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT))
    );

    public static final RegistryObject<SwordItem> LANZA1 = ITEMS.register(
            "lanzadiamante", () -> new SwordItem(
                    Tiers.DIAMOND,
                    (int)1.8,
                    0.005F,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT))
    );

    public static final RegistryObject<SwordItem> LANZA2 = ITEMS.register(
            "lanzahierro", () -> new SwordItem(
                    Tiers.IRON,
                    (int)1.5,
                    0.005F,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT))
    );

    public static final RegistryObject<SwordItem> LANZA3 = ITEMS.register(
            "lanzaoro", () -> new SwordItem(
                    Tiers.GOLD,
                    (int)0.5,
                    0.005F,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT))
    );

    public static final RegistryObject<SwordItem> LANZA4 = ITEMS.register(
            "lanzapiedra", () -> new SwordItem(
                    Tiers.STONE,
                    1,
                    0.005F,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT))
    );

    public static final RegistryObject<SwordItem> LANZA5 = ITEMS.register(
            "lanzamadera", () -> new SwordItem(
                    Tiers.WOOD,
                    (int)0.5,
                    0.005F,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT))
    );


    public static final RegistryObject<SwordItem> PRUEBA = ITEMS.register(
            "prueba", () -> new SwordItem(
                    Tiers.NETHERITE,
                    1,
                    0.01f,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT))
    );
}



