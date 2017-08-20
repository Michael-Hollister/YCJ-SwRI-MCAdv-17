package com.example.examplemod;

import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class steveentinty extends EntityCreature {
    public steveentinty(World world) {
        super(world);

        this.experienceValue = 1000000000;
        this.setEquipmentDropChance(0, 1.0f);
        this.setHealth(this.getMaxHealth());

        this.tasks.addTask(0, new EntityAILookIdle(this));
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(0, new EntityAIWander(this, 0));

        this.targetTasks.addTask(0,
                new EntityAIMoveTowardsTarget(this, 8.0, 5.0f));
        this.targetTasks.addTask(1, new EntityAINearestAttackableTarget(
            this, EntityZombie.class, 0, true));
        this.targetTasks.addTask(1, new EntityAINearestAttackableTarget(
            this, EntitySkeleton.class, 0, true));

        this.targetTasks.addTask(1, new EntityAIHurtByTarget(
            this, false));
    }


    @Override
    protected Item getDropItem() {
        return ExampleMod.rubyitem;
    }

    @Override
    public void onLivingUpdate() {
        super.onLivingUpdate();


    }
}
