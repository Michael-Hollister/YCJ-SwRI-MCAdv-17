package com.example.examplemod;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelCow;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.client.renderer.entity.RenderCow;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.util.ResourceLocation;

public class GappleCowRenderer extends RenderCow {
    private static ResourceLocation texture = new ResourceLocation(ExampleMod.MODID, "textures/entity/gapple_cow.png");

    public GappleCowRenderer() {
        super(new ModelCow(), 0.6f);
    }


    public ResourceLocation getTexture() {
        return texture;
    }


    @Override
    protected ResourceLocation getEntityTexture(Entity p_110775_1_) {
        return texture;
    }

//    @Override
    protected ResourceLocation getEntityTexture(EntityLiving p_110775_1_) {
        return texture;
    }

    //@Override
    //protected ResourceLocation getEntityTexture(EntityCow p_110775_1_) {

    //return super.getEntityTexture(p_110775_1_);
    //}
}


