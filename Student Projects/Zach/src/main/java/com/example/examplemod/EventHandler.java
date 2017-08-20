package com.example.examplemod;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

public class EventHandler {
    @SubscribeEvent
    public void chatOnHumanHurk(LivingHurtEvent event) {
        World world = event.entity.worldObj;
        if (!world.isRemote && event.entity instanceof HumanEntity &&
                event.source.getEntity() instanceof EntityPlayer) {
            EntityPlayer player = (EntityPlayer) event.source.getEntity();
            MinecraftServer server = Minecraft.getMinecraft().getIntegratedServer();
            server.getCommandManager().executeCommand(player, String.format("/tellraw %s %", player.getDisplayName(), "Ouch"
            ));
            world.spawnEntityInWorld(new EntityLightningBolt(world, event.entity.posX, event.entity.posY,
                    event.entity.posZ));
        }

    }

    @SubscribeEvent
    public void entityUpdates(LivingEvent.LivingUpdateEvent event) {
        if(event.entity instanceof EntityPlayer && PortalAEntity.portalA != null && PortalBEntity.portalB != null){
            if (event.entity.worldObj.getBlock((int)event.entity.posX,(int) event.entity.posY - 1,(int) event.entity.posZ) ==
                    PortalAEntity.portalA.blockType) {
                event.entity.setPosition(PortalBEntity.portalB.xCoord, PortalBEntity.portalB.yCoord, PortalBEntity.portalB.zCoord);
            }

            if (event.entity.worldObj.getBlock((int)event.entity.posX,(int) event.entity.posY - 1,(int) event.entity.posZ) ==
                    PortalBEntity.portalB.blockType) {
                event.entity.setPosition(PortalAEntity.portalA.xCoord, PortalAEntity.portalA.yCoord, PortalAEntity.portalA.zCoord);


            }
        }
    }

}