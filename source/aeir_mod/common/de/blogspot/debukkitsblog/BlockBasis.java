package de.blogspot.debukkitsblog;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class BlockBasis extends Block {

	private String filename = "Basis:ae_cobblestone_mossy";

	public BlockBasis(int id, Material mat) {
		super(id, mat);
	}

	@Override
	public void registerIcons(IconRegister reg) {
		this.blockIcon = reg.registerIcon(filename);
	}

}
