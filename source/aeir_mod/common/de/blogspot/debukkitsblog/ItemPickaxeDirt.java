package de.blogspot.debukkitsblog;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemPickaxe;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemPickaxeDirt extends ItemPickaxe {

	private String filename;

	public ItemPickaxeDirt(int id, EnumToolMaterial toolMaterial) {
		super(id, toolMaterial);
	}

	/**
	 * Will be called on registration of items
	 * 
	 * @param reg
	 */
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister reg) {
		this.itemIcon = reg.registerIcon(filename);
	}

	public void setIconFile(String name) {
		filename = name;
	}
}
