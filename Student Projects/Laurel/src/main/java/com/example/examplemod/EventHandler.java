package com.example.examplemod;

import com.google.common.eventbus.Subscribe;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

public class EventHandler {
    @SubscribeEvent

    public void chatOnDragonHurt(LivingHurtEvent event) {
        World world = event.entity.worldObj;
        if (!world.isRemote && event.entity instanceof DragonBigGoodEntity && event.source.getEntity()instanceof EntityPlayer){
            EntityPlayer player = (EntityPlayer)event.source.getEntity();
            MinecraftServer server= Minecraft.getMinecraft().getIntegratedServer();
            server.getCommandManager().executeCommand(player, String.format("/tellraw %s %s", player.getDisplayName(), "*Roar*"));
        }

    }
}
