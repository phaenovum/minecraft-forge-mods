/**
 * 
 */
package org.phaenovum.mc;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

/**
 * @author lars
 *
 */
public class BlockPhaenovum extends Block {

	/**
	 * @param p_i45394_1_
	 */
	public BlockPhaenovum(Material material) {
		super(material);

		setCreativeTab(CreativeTabs.tabBlock);
		setLightLevel(1.0f);
		setStepSound(Block.soundTypeGlass);
		setBlockName("blockPhaenovum");
		setBlockTextureName("Paencaeke:ae_cobblestone_mossy");
	}
}
