package com.example.examplemod;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class PortalA extends Block implements ITileEntityProvider{
    protected PortalA(Material mat) {
        super(mat);
        this.setBlockName(":portal_a");
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setHardness(1.0f);
        this.setStepSound(soundTypeMetal);
        this.setBlockTextureName(":portal_a");
    }

    @Override
    public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
        return new PortalAEntity();
    }


}
