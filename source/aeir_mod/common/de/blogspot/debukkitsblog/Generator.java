package de.blogspot.debukkitsblog;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class Generator implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch (world.provider.dimensionId) {
		case -1:
			genNether();
			break;

		case 0:
			/*
			 * X,Y are the coordinates which must be multiplied by 16 to reach
			 * chunk size. FIXME: what?
			 */
			genWorld(world, random, chunkX * 16, chunkZ * 16);
			break;

		case 1:
			genEnd();
			break;

		default:
			break;
		}
	}

	private void genEnd() {
	}

	private void genWorld(World world, Random rand, int chunkX, int chunkZ) {
		for (int i = 0; i < 30; i++) {
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(128);
			int randPosZ = chunkZ + rand.nextInt(16);

			(new WorldGenMinable(Basis.testBlock.blockID, 32)).generate(world,
					rand, randPosX, randPosY, randPosZ);
		}
	}

	private void genNether() {
	}

}
