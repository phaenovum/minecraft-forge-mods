/**
 * 
 */
package org.phaenovum.mc;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import org.phaenovum.mc.proxies.CommonProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * @author lars
 *
 */
@Mod(modid = "org.phaenovum.mc.Paencaeke", name = "Paencaeke", version = "0.0.1")
public class Paencaeke {

	Item itemAe;

	@Instance(value = "org.phaenovum.mc.Paencaeke")
	public static Paencaeke paencaeke;

	@SidedProxy(clientSide = "org.phaenovum.mc.proxies.ClientProxy", serverSide = "org.phaenovum.mc.proxies.CommonProxy")
	public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		itemAe = new ItemAe();
		GameRegistry.registerItem(itemAe, "ae");
	}

	@EventHandler
	public void load(FMLInitializationEvent event) {
		/* registers the texture renderers */
		proxy.registerRenderers();

		loadRecipes();
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}

	/**
	 * Load crafting and smelt recipes.
	 */
	private void loadRecipes() {
		/*
		 * Everything you want to add to the MC game has to be registered at
		 * GameRegistry. This add a shapeless recipe, i.e. the arrangement of
		 * the items does not matter.
		 */
		GameRegistry.addShapelessRecipe(new ItemStack(Items.cake, 2),
				Items.egg, Items.water_bucket, Items.wheat_seeds);

		/*
		 * This is a shaped recipe, i.e. the String defines the layout of the
		 * items/blocks on the crafting table. The assignment of the characters
		 * to blocks/items follows after the String
		 */
		GameRegistry.addRecipe(new ItemStack(Items.nether_star, 1),// The output
																	// of the
																	// recipe
				// 3x3 crafting table
				"X  ", // upper row
				" # ", // middle row
				"  X", // lower row
				// definition of single characters (undefined chars are empty)
				Character.valueOf('X'), Blocks.dirt, // X stands for dirt block
				Character.valueOf('#'), Items.apple // # stands for apple item
				// space is undefined and thus stands for an empty field
				);

		/*
		 * This adds a smelting recipe. Unfortunately here, the input is the
		 * first parameter, the output the second.
		 */
		GameRegistry.addSmelting(Items.wheat, new ItemStack(Items.wheat_seeds),
				1f);
	}

}
