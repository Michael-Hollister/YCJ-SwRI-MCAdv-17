package com.example.examplemod;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

public class eventhandler {
    @SubscribeEvent
    public void chatOnHumanHurt(LivingHurtEvent event) {
        World world = event.entity.worldObj;
        if (!world.isRemote && event.entity instanceof steveentinty &&
                event.source.getEntity()instanceof EntityPlayer) {
            EntityPlayer player = (EntityPlayer)event.source.getEntity();
            MinecraftServer server = Minecraft.getMinecraft().getIntegratedServer();

            server.getCommandManager().executeCommand(player, String.format(
                    "/tellraw %s %s", player.getDisplayName(), "YOU MUST DIE!!!!!"));



        }
    }
}
