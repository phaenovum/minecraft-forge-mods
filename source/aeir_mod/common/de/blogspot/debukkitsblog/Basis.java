package de.blogspot.debukkitsblog;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
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
import cpw.mods.fml.common.registry.LanguageRegistry;
import de.blogspot.debukkitsblog.proxies.BasisCommonProxy;

@Mod(modid = "basis", name = "Basis Mod", version = "1.0.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class Basis {

	/*
	 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	 * Variables
	 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	 */

	public static Item testItem;
	/*
	 * see http://minecraft.gamepedia.com/Data_values for valid data values for
	 * blocks and items
	 */
	public int testItemID = 15000;

	public static ItemBasis testItem2;
	public int testItem2ID = 15001;

	public static ItemFoodBasis aeCake;
	public int aeCakeID = 15002;

	public static Block testBlock;
	public int testBlockID = 180;

	@Instance("tutorial")
	public static Basis instance;

	@SidedProxy(clientSide = "de.blogspot.debukkitsblog.proxies.BasisClientProxy", serverSide = "de.blogspot.debukkitsblog.proxies.BasisCommonProxy")
	public static BasisCommonProxy proxy;

	@PreInit
	public void preInit(FMLPreInitializationEvent event) {

	}

	@Init
	public void init(FMLInitializationEvent event) {

		testBlock = new BlockBasis(testBlockID, Material.rock);
		testBlock.setCreativeTab(CreativeTabs.tabMaterials);
		testBlock.setLightValue(1.0F);
		testBlock.setStepSound(Block.soundStoneFootstep);
		testBlock.setUnlocalizedName("testBlock");

		testItem = new ItemBasis(testItemID);
		testItem.setUnlocalizedName("testItem");
		testItem.setCreativeTab(CreativeTabs.tabDecorations);

		testItem2 = new ItemBasis(testItem2ID);
		testItem2.setUnlocalizedName("testItem2");
		testItem2.setCreativeTab(CreativeTabs.tabDecorations);
		testItem2.setIconFile("Basis:me");

		aeCake = new ItemFoodBasis(aeCakeID, 10, 0.6F, false);
		aeCake.setUnlocalizedName("aeCake");
		aeCake.setCreativeTab(CreativeTabs.tabFood);
		aeCake.setMaxStackSize(16);
		aeCake.setIconFile("Basis:ae_cake");

		registerBlocks();
		registerItems();
		updateLanguage();
		initCraftingRecipes();
		initSmeltingRecipes();
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
		GameRegistry.addRecipe(new ItemStack(Item.feather),
		// 3x3 crafting table
				"#XU", // upper row
				"#XX", // middle row
				"###", // lower row
				// definition of single characters (undefined chars are empty)
				'#', Block.dirt, 'U', Item.ingotGold);

		GameRegistry.addShapelessRecipe(new ItemStack(Item.diamond, 64),
				new ItemStack(Block.dirt));
	}

	/**
	 * add melting recipes
	 */
	private void initSmeltingRecipes() {
		GameRegistry.addSmelting(testBlock.blockID, new ItemStack(testItem),
				1.0F);
		GameRegistry.addSmelting(Block.dirt.blockID, new ItemStack(
				Item.diamond, 64), 1.0F);
	}

	/**
	 * add blocks
	 */
	private void registerBlocks() {
		GameRegistry.registerBlock(testBlock, "phaenovum Rock");
	}

	/**
	 * add items
	 */
	private void registerItems() {
		GameRegistry.registerItem(testItem, "phaenovum");
		GameRegistry.registerItem(testItem2, "lars");
		GameRegistry.registerItem(aeCake, "aeCake");
	}

	/**
	 * add names for blocks and items
	 */
	private void updateLanguage() {
		LanguageRegistry.addName(testBlock, "phaenovum Rock");
		LanguageRegistry.addName(testItem, "phaenovum");
		LanguageRegistry.addName(testItem2, "Lars");
		LanguageRegistry.addName(aeCake, "phaenovum Cake");
	}
}