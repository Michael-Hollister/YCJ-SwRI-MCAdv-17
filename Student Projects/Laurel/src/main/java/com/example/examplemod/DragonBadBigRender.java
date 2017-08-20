package com.example.examplemod;

import net.minecraft.client.renderer.entity.RenderDragon;
import net.minecraft.entity.Entity;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.util.ResourceLocation;

public class DragonBadBigRender extends RenderDragon {
    private static ResourceLocation texture = new ResourceLocation(ExampleMod.MODID, "textures/entity/dragon_big_bad.png");

    public DragonBadBigRender() {
        super();
    }

    public ResourceLocation getTexture() {
        return texture;
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity p_110775_1_) {
        return texture;
    }

    @Override
    protected ResourceLocation getEntityTexture(EntityDragon p_110775_1_) {
        return texture;
    }
}
