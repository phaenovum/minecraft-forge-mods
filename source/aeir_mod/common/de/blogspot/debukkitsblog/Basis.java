package de.blogspot.debukkitsblog;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import de.blogspot.debukkitsblog.proxies.BasisCommonProxy;

@Mod(modid = "basis", name = "Basis Mod", version = "1.0.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class Basis {

	@Instance("tutorial")
	public static Basis instance;

	@SidedProxy(clientSide = "de.blogspot.debukkitsblog.proxies.BasisClientProxy", serverSide = "de.blogspot.debukkitsblog.proxies.BasisCommonProxy")
	public static BasisCommonProxy proxy;

	@PreInit
	public void preInit(FMLPreInitializationEvent event) {

	}

	@Init
	public void init(FMLInitializationEvent event) {

	}

	@PostInit
	public static void postInit(FMLPostInitializationEvent event) {

	}
}