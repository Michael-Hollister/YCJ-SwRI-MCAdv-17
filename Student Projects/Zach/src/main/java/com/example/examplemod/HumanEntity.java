package com.example.examplemod;

import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.item.Item;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class HumanEntity extends EntityCreature {
    public HumanEntity(World world) {
        super(world);

        this.experienceValue = 25;
        this.setEquipmentDropChance(0, .75f);
        this.setHealth(this.getMaxHealth());
        this.tasks.addTask(0, new EntityAILookIdle(this));
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(0, new EntityAIWander(this, 5.0));
        this.targetTasks.addTask(0, new EntityAINearestAttackableTarget(this, EntityZombie.class
        , 0, true));
        this.targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntitySkeleton.class, 0,
                true));
        this.targetTasks.addTask(1, new EntityAINearestAttackableTarget(
                this, EntityEnderman.class, 0, true));
        this.targetTasks.addTask(2, new EntityAIHurtByTarget(this, false));
    }

    @Override
    protected Item getDropItem() {
        return ExampleMod.rubyItem;
    }

    @Override
    protected boolean isAIEnabled() {
        return true;
    }

    public void onEntityUpdate() {
        this.updateArmSwingProgress();
        super.onEntityUpdate();
    }
    protected void applyEntityAtributes() {
        this.getAttributeMap().registerAttribute(SharedMonsterAttributes.attackDamage);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(3.0D);
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(25.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.30D);
        this.getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(0.25D);

    }

    public boolean attackEntityAsMob(Entity p_70652_1_)
    {
        float f = (float)this.getEntityAttribute(SharedMonsterAttributes.attackDamage).getAttributeValue();
        int i = 0;

        if (p_70652_1_ instanceof EntityLivingBase)
        {
            f += EnchantmentHelper.getEnchantmentModifierLiving(this, (EntityLivingBase)p_70652_1_);
            i += EnchantmentHelper.getKnockbackModifier(this, (EntityLivingBase)p_70652_1_);
        }

        boolean flag = p_70652_1_.attackEntityFrom(DamageSource.causeMobDamage(this), f);

        if (flag)
        {
            if (i > 0)
            {
                p_70652_1_.addVelocity((double)(-MathHelper.sin(this.rotationYaw * (float)Math.PI / 180.0F) * (float)i * 0.5F), 0.1D, (double)(MathHelper.cos(this.rotationYaw * (float)Math.PI / 180.0F) * (float)i * 0.5F));
                this.motionX *= 0.6D;
                this.motionZ *= 0.6D;
            }

            int j = EnchantmentHelper.getFireAspectModifier(this);

            if (j > 0)
            {
                p_70652_1_.setFire(j * 4);
            }

            if (p_70652_1_ instanceof EntityLivingBase)
            {
                EnchantmentHelper.func_151384_a((EntityLivingBase)p_70652_1_, this);
            }

            EnchantmentHelper.func_151385_b(this, p_70652_1_);
        }

        return flag;
    }

    /**
     * Basic mob attack. Default to touch of death in EntityCreature. Overridden by each mob to define their attack.
     */
    protected void attackEntity(Entity p_70785_1_, float p_70785_2_)
    {
        if (this.attackTime <= 0 && p_70785_2_ < 2.0F && p_70785_1_.boundingBox.maxY > this.boundingBox.minY && p_70785_1_.boundingBox.minY < this.boundingBox.maxY)
        {
            this.attackTime = 20;
            this.attackEntityAsMob(p_70785_1_);
        }
    }

}
