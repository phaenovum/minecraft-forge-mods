package de.blogspot.debukkitsblog;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
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
import cpw.mods.fml.common.registry.GameRegistry;
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
		initCraftingRecipes();
	}

	@PostInit
	public static void postInit(FMLPostInitializationEvent event) {

	}

	/*
	 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	 * private methods
	 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	 */

	/**
	 * add crafting recipes
	 */
	private void initCraftingRecipes() {
		GameRegistry.addShapelessRecipe(new ItemStack(Item.diamond, 64),
				new ItemStack(Block.dirt));
	}
}