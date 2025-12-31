package net.greatcow.createsimplecoins.item;

import net.greatcow.createsimplecoins.Create_Simple_Coins;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
        public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(Registries.ITEM,
                        Create_Simple_Coins.MOD_ID);

        public static final DeferredHolder<Item, Item> MEGA_COIN = ITEMS.register("mega_coin",
                        () -> new Item(new Item.Properties()));

        public static final DeferredHolder<Item, Item> COPPER_COIN = ITEMS.register("copper_coin",
                        () -> new Item(new Item.Properties()));
        public static final DeferredHolder<Item, Item> IRON_COIN = ITEMS.register("iron_coin",
                        () -> new Item(new Item.Properties()));
        public static final DeferredHolder<Item, Item> GOLD_COIN = ITEMS.register("gold_coin",
                        () -> new Item(new Item.Properties()));
        public static final DeferredHolder<Item, Item> DIAMOND_COIN = ITEMS.register("diamond_coin",
                        () -> new Item(new Item.Properties()));
        public static final DeferredHolder<Item, Item> NETHERITE_COIN = ITEMS.register("netherite_coin",
                        () -> new Item(new Item.Properties()));

        public static final DeferredHolder<Item, Item> INCOMPLETE_COPPER_COIN = ITEMS.register("incomplete_copper_coin",
                        () -> new Item(new Item.Properties()));
        public static final DeferredHolder<Item, Item> INCOMPLETE_IRON_COIN = ITEMS.register("incomplete_iron_coin",
                        () -> new Item(new Item.Properties()));
        public static final DeferredHolder<Item, Item> INCOMPLETE_GOLD_COIN = ITEMS.register("incomplete_gold_coin",
                        () -> new Item(new Item.Properties()));
        public static final DeferredHolder<Item, Item> INCOMPLETE_DIAMOND_COIN = ITEMS.register(
                        "incomplete_diamond_coin",
                        () -> new Item(new Item.Properties()));
        public static final DeferredHolder<Item, Item> INCOMPLETE_NETHERITE_COIN = ITEMS.register(
                        "incomplete_netherite_coin",
                        () -> new Item(new Item.Properties()));

        public static final DeferredHolder<Item, Item> DEFECTIVE_COPPER_COIN = ITEMS.register("defective_copper_coin",
                        () -> new Item(new Item.Properties()));
        public static final DeferredHolder<Item, Item> DEFECTIVE_IRON_COIN = ITEMS.register("defective_iron_coin",
                        () -> new Item(new Item.Properties()));
        public static final DeferredHolder<Item, Item> DEFECTIVE_GOLD_COIN = ITEMS.register("defective_gold_coin",
                        () -> new Item(new Item.Properties()));
        public static final DeferredHolder<Item, Item> DEFECTIVE_DIAMOND_COIN = ITEMS.register("defective_diamond_coin",
                        () -> new Item(new Item.Properties()));
        public static final DeferredHolder<Item, Item> DEFECTIVE_NETHERITE_COIN = ITEMS.register(
                        "defective_netherite_coin",
                        () -> new Item(new Item.Properties()));

        public static void register(IEventBus eventBus) {
                ITEMS.register(eventBus);
        }
}
