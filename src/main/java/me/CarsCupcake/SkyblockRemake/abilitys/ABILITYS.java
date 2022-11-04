package me.CarsCupcake.SkyblockRemake.abilitys;

import me.CarsCupcake.SkyblockRemake.End.Dragon.DragonAi.Loot;
import me.CarsCupcake.SkyblockRemake.Equipment.EquipmentManager;
import me.CarsCupcake.SkyblockRemake.Items.AbilityPreExecuteEvent;
import me.CarsCupcake.SkyblockRemake.Main;
import me.CarsCupcake.SkyblockRemake.Skyblock.Jerry.JerryListener;
import me.CarsCupcake.SkyblockRemake.Skyblock.Teleporters;
import me.CarsCupcake.SkyblockRemake.Slayer.Enderman.EndermanT1;
import org.bukkit.event.Listener;

public class ABILITYS {
    public static void init(){
        registerEvent(new DreadlordHandler());
        registerEvent(new PreAbilityExecution() {
            @Override
            public void preEvent(AbilityPreExecuteEvent event) {

            }
        });
        registerEvent(new IceSprayWand());
        registerEvent(new JerryListener());
        registerEvent(new EquipmentManager());
        registerEvent(new StaticCharge());
        registerEvent(new Spirit());
        registerEvent(new EndermanT1(null));
        registerEvent(new Teleporters());
        registerEvent(new Loot());
    }
    public static void disable(){
        Totem.stopAll();
    }
    private static void registerEvent(Listener listener){
        try {
            Main.getMain().getServer().getPluginManager().registerEvents(listener, Main.getMain());
        }catch (Exception ignored){

        }
    }
}