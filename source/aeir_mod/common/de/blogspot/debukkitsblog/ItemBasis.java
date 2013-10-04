package de.blogspot.debukkitsblog;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemBasis extends Item {

	/**
	 * Constructor creating an ItemBasis item
	 * 
	 * @param id
	 *            Data ID (see Minecraft Wiki)
	 */
	public ItemBasis(int id) {
		super(id);
		this.setMaxStackSize(16);
	}

	/**
	 * Will be called on registration of items
	 * 
	 * @param reg
	 */
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister reg) {
		this.itemIcon = reg.registerIcon("Basis:ae");
	}
}
