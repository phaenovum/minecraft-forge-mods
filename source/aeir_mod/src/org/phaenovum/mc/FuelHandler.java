/**
 * 
 */
package org.phaenovum.mc;

import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.IFuelHandler;

/**
 * @author lars
 *
 */
public class FuelHandler implements IFuelHandler {

	/**
	 * Burn time in ticks. 1 tick = 50 ms -> 10s = 200 ticks
	 * 
	 * @see cpw.mods.fml.common.IFuelHandler#getBurnTime(net.minecraft.item.ItemStack)
	 */
	@Override
	public int getBurnTime(ItemStack fuel) {
		if (fuel.getItem().getUnlocalizedName().equals("item.ae")) {
			return 200;
		}

		return 0;
	}
}
