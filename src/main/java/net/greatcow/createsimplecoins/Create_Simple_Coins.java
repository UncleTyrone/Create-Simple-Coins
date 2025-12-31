package net.greatcow.createsimplecoins;

import net.greatcow.createsimplecoins.item.ModCreativeModeTabs;
import net.greatcow.createsimplecoins.item.ModItems;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

@Mod(Create_Simple_Coins.MOD_ID)
public class Create_Simple_Coins {
    public static final String MOD_ID = "create_simple_coins";

    public Create_Simple_Coins(IEventBus modEventBus) {

        ModCreativeModeTabs.register(modEventBus);

        ModItems.register(modEventBus);

        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(ClientModEvents::onClientSetup);

        NeoForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    public static class ClientModEvents {
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}
