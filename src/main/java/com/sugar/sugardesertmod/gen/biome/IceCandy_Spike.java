package com.sugar.sugardesertmod.gen.biome;

import java.util.Random;

import com.sugar.sugardesertmod.gen.feature.WorldGenIceCandySpike;
import com.sugar.sugardesertmod.gen.feature.WorldGenSugarTree;
import com.sugar.sugardesertmod.init.block.SugarDBlock;

import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntityStray;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeDecorator;
import net.minecraft.world.chunk.ChunkPrimer;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenIcePath;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;

public class IceCandy_Spike extends Biome {

	protected static final WorldGenSugarTree Sugartree = new WorldGenSugarTree(false);
	private final WorldGenIcePath icePatch = new WorldGenIcePath(4);
	private final WorldGenIceCandySpike icecandySpike = new WorldGenIceCandySpike();
	private final WorldGenerator cookie = new WorldGenMinable(SugarDBlock.Cookie_block.getDefaultState(), 4,BlockMatcher.forBlock(Blocks.SNOW));

	public IceCandy_Spike() {
		super(new BiomeProperties("icecandy_spikes")
				.setTemperature(0.00F)
				.setBaseHeight(0.425F)
				.setHeightVariation(0.45000002F)
				.setRainfall(0.5F)
				.setSnowEnabled());
		this.setRegistryName("icecandy_spikes");
		this.decorator.treesPerChunk = 1;
		this.spawnableMonsterList.add(new Biome.SpawnListEntry(EntitySkeleton.class, 20, 4, 4));
		this.spawnableMonsterList.add(new Biome.SpawnListEntry(EntityStray.class, 80, 4, 4));
	}

	@Override
	public void genTerrainBlocks(World worldIn, Random rand, ChunkPrimer chunkPrimerIn,int x, int z, double noiseVal) {
		this.topBlock = Blocks.SNOW.getDefaultState();
		this.fillerBlock = Blocks.DIRT.getDefaultState();
		this.generateBiomeTerrain(worldIn, rand, chunkPrimerIn, x, z, noiseVal);
	}

	@Override
	public void decorate(World worldIn, Random rand, BlockPos pos) {

		if (net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, new net.minecraft.util.math.ChunkPos(pos), net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.ICE)) {
			for (int i = 0; i < 3; ++i) {
				int j = rand.nextInt(16) + 8;
				int k = rand.nextInt(16) + 8;
				this.icecandySpike.generate(worldIn, rand, worldIn.getHeight(pos.add(j, 0, k)));
			}
			for (int l = 0; l < 2; ++l) {
				int i1 = rand.nextInt(16) + 8;
				int j1 = rand.nextInt(16) + 8;
				this.icePatch.generate(worldIn, rand, worldIn.getHeight(pos.add(i1, 0, j1)));
			}
		}
		super.decorate(worldIn, rand, pos);
	}

	@Override
	public float getSpawningChance() {
		return 0.035F;
	}

	@Override
	public WorldGenAbstractTree getRandomTreeFeature(Random rand) {
		return Sugartree;
	}

	@Override
	public BiomeDecorator createBiomeDecorator() {
		return new IceCandy_Spike.Decorator();
	}

	class Decorator extends BiomeDecorator{
		private Decorator() {}

		protected void generateOres(World worldIn, Random random) {
			super.generateOres(worldIn, random);
			this.genStandardOre1(worldIn, random, 20, cookie, 60, 80);
		}
	}
}
