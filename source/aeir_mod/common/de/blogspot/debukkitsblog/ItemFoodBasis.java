package de.blogspot.debukkitsblog;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemFood;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

/**
 * TODO: use composition to remove redundant code
 * 
 * @author lars
 * 
 */
public class ItemFoodBasis extends ItemFood {

	private String filename = "Basis:ae_cake";

	public ItemFoodBasis(int id, int healAmount, float saturationModifier,
			boolean isWolfsFavoriteMeat) {
		super(id, healAmount, saturationModifier, isWolfsFavoriteMeat);
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
