package hugman.mubble.object.block.sapling_generator;

import hugman.mubble.init.world.MubbleConfiguredFeatures;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;

import java.util.Random;

public class PinkCherryOakSaplingGenerator extends SaplingGenerator {
	@Override
	protected ConfiguredFeature<TreeFeatureConfig, ?> createTreeFeature(Random random, boolean beeHive) {
		return random.nextInt(10) == 0 ? Feature.TREE.configure(beeHive ? MubbleConfiguredFeatures.FANCY_PINK_CHERRY_OAK_TREE_B1 : MubbleConfiguredFeatures.FANCY_PINK_CHERRY_OAK_TREE) : Feature.TREE.configure(beeHive ? MubbleConfiguredFeatures.PINK_CHERRY_OAK_TREE_B1 : MubbleConfiguredFeatures.PINK_CHERRY_OAK_TREE);
	}
}