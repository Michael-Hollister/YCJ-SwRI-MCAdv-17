package com.example.examplemod;

import net.minecraft.block.Block;
import net.minecraft.block.BlockEndPortal;
import net.minecraft.client.model.ModelDragon;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.entity.*;
import net.minecraft.entity.boss.BossStatus;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.boss.EntityDragonPart;
import net.minecraft.entity.boss.IBossDisplayData;
import net.minecraft.entity.item.EntityEnderCrystal;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.util.*;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;
import org.lwjgl.opengl.GL11;

import java.util.Iterator;
import java.util.List;
import java.util.Random;


public class DragonBigBadEntity extends EntityDragon {
    public DragonBigBadEntity(World p_i1700_1_) {
        super(p_i1700_1_);
    }


}