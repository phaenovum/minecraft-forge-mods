/**
 * 
 */
package org.phaenovum.mc;

import net.minecraft.init.Items;
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

	@Instance(value = "org.phaenovum.mc.Paencaeke")
	public static Paencaeke paencaeke;

	@SidedProxy(clientSide = "org.phaenovum.mc.proxies.ClientProxy", serverSide = "org.phaenovum.mc.proxies.CommonProxy")
	public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {

	}

	@EventHandler
	public void load(FMLInitializationEvent event) {
		/* registers the texture renderers */
		proxy.registerRenderers();

		/*
		 * Everything you want to add to the MC game has to be registered at
		 * GameRegistry. This add a shapeless recipe, i.e. the arrangement of
		 * the items does not matter.
		 */
		GameRegistry.addShapelessRecipe(new ItemStack(Items.cake, 2),
				Items.egg, Items.water_bucket, Items.wheat_seeds);

	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}

}
