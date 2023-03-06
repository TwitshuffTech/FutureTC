package net.ddns.twicusstumble.futuretc;

import net.ddns.twicusstumble.futuretc.proxy.CommonProxy;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLConstructionEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.registry.GameRegistry;
import org.apache.logging.log4j.Logger;

@Mod(
        modid = FutureTC.MOD_ID,
        name = FutureTC.MOD_NAME,
        version = FutureTC.VERSION
)
public class FutureTC {

    public static final String MOD_ID = "futuretc";
    public static final String MOD_NAME = "Future TC";
    public static final String VERSION = "1.0.0";

    public static Logger logger;

    public static final String CLIENT_PROXY = "net.ddns.twicusstumble." + MOD_ID + ".proxy.ClientProxy";
    public static final String SERVER_PROXY = "net.ddns.twicusstumble." + MOD_ID + ".proxy.ServerProxy";

    /**
     * This is the instance of your mod as created by Forge. It will never be null.
     */
    @Mod.Instance(MOD_ID)
    public static FutureTC INSTANCE;

    @SidedProxy(clientSide = CLIENT_PROXY, serverSide = SERVER_PROXY)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void construct(FMLConstructionEvent event) {
        MinecraftForge.EVENT_BUS.register(proxy);
    }

    /**
     * This is the first initialization event. Register tile entities here.
     * The registry events below will have fired prior to entry to this method.
     */
    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
    }

    /**
     * This is the second initialization event. Register custom recipes
     */
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    /**
     * This is the final initialization event. Register actions from other mods here
     */
    @Mod.EventHandler
    public void postinit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }
}
