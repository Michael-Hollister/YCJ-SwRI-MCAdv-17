package com.example.examplemod;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;


public class HumanRenderer extends RenderBiped {
    private static ResourceLocation texture =
            new ResourceLocation(ExampleMod.MODID,
                    ":textures/entity/human.png");


    public HumanRenderer() {
        super(new ModelBiped(), 0.60f);
    }

    public ResourceLocation getTexture() {
        return texture;
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity p_110775_1_) {
        return texture;
    }

    @Override
    protected ResourceLocation getEntityTexture(EntityLiving p_110775_1_) {
        return texture;
    }
}
