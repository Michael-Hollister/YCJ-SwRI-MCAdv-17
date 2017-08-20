package com.example.examplemod;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class GappleCowEntity extends EntityCreature {
    public GappleCowEntity(World world) {
        super(world);


        this.experienceValue = 25;
        this.setEquipmentDropChance(0, 0.10f);
        this.setEquipmentDropChance(1, 0.10f);
        this.setEquipmentDropChance(2, 0.10f);
        this.setEquipmentDropChance(3, 0.10f);
        this.setHealth(this.getMaxHealth());

        this.getNavigator().setAvoidsWater(true);
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new EntityAIPanic(this, 2.0D));
        //this.tasks.addTask(2, new EntityAIMate(this, 1.0D));
        this.tasks.addTask(3, new EntityAITempt(this, 1.25D, Items.wheat, false));
        //this.tasks.addTask(4, new EntityAIFollowParent(this, 1.25D));
        this.tasks.addTask(5, new EntityAIWander(this, 1.0D));
        this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
        this.tasks.addTask(7, new EntityAILookIdle(this));


    }


    //@Override
    public EntityAgeable createChild(EntityAgeable p_90011_1_) {
        return null;
    }



    @Override
    protected boolean isAIEnabled() {
        return true;
    }


    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(300.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.3D);
        this.getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(0.25D);
    }

    @Override
    protected Item getDropItem() {
        return ExampleMod.gappleItem;
    }


}












