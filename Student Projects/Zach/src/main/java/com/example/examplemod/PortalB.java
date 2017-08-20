package com.example.examplemod;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class PortalB extends Block implements ITileEntityProvider {
    protected PortalB(Material mat) {
        super(mat);
        this.setBlockName(":portal_b");
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setHardness(1.0f);
        this.setStepSound(soundTypeMetal);
        this.setBlockTextureName(":portal_b");
    }

    @Override
    public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
        return new PortalBEntity();
    }
}
