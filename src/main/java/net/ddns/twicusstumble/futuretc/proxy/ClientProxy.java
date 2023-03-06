package net.ddns.twicusstumble.futuretc.proxy;

import net.ddns.twicusstumble.futuretc.init.BlockInit;
import net.ddns.twicusstumble.futuretc.init.ItemInit;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ClientProxy extends CommonProxy {
    @Override
    public void preInit(FMLPreInitializationEvent event) {

    }

    @SubscribeEvent
    public void registerModels(ModelRegistryEvent event) {
        BlockInit.BLOCKS.forEach(f -> f.registerModel(event));
    }
}
