package com.example.examplemod;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

public class EventHandler {
    @SubscribeEvent
    public void onHumanHurt(LivingHurtEvent event) {
        World world = event.entity.worldObj;

        if(!world.isRemote && event.entity instanceof EntityZombie) {
            world.createExplosion(null, event.entity.posX,event.entity.posY,event.entity.posZ,25.0f,true);
        }
    }
}
