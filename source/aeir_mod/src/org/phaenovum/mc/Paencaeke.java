/**
 * 
 */
package org.phaenovum.mc;

import org.phaenovum.mc.proxies.CommonProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

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

	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}

}
