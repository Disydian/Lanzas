package com.josesito.lanzas;
import com.josesito.lanzas.init.inititems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Lanzas.MODID)
public class Lanzas{
        public static final String MODID = "lanzas";

public Lanzas() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        inititems.ITEMS.register(bus);
}

}


