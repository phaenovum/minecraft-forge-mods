/**
 * 
 */
package org.phaenovum.mc;

import net.minecraft.item.ItemFood;

/**
 * @author lars
 *
 */
public class ItemPaencaeke extends ItemFood {

	public ItemPaencaeke() {
		this(20, false);
	}

	/**
	 * @param healAmount
	 * @param isWolfsFavoriteMeat
	 */
	public ItemPaencaeke(int healAmount, boolean isWolfsFavoriteMeat) {
		this(healAmount, 0.6F, isWolfsFavoriteMeat);
	}

	/**
	 * @param healAmount
	 * @param saturationModifier
	 * @param isWolfsFavoriteMeat
	 */
	public ItemPaencaeke(int healAmount, float saturationModifier,
			boolean isWolfsFavoriteMeat) {
		super(healAmount, saturationModifier, isWolfsFavoriteMeat);
		setTextureName("Paencaeke:ae_cake");
		setUnlocalizedName("paencaeke");
	}

}
