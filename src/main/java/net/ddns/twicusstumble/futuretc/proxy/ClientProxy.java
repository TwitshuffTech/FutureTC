package net.ddns.twicusstumble.futuretc.proxy;

import net.ddns.twicusstumble.futuretc.FutureTC;
import net.ddns.twicusstumble.futuretc.block.BlockSlabBase;
import net.ddns.twicusstumble.futuretc.init.BlockInit;
import net.ddns.twicusstumble.futuretc.init.ItemInit;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ClientProxy extends CommonProxy {
    @Override
    public void preInit(FMLPreInitializationEvent event) {

    }

    @SubscribeEvent
    public void registerModels(ModelRegistryEvent event) {
        BlockInit.BLOCKS.forEach(f -> {
            if (!(f instanceof BlockSlabBase) || !((BlockSlabBase) f).isDouble()) {
                f.registerModel(event);
            }
        });
    }
}
