package com.terraformersmc.cinderscapes.legacy.feature.config;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.terraformersmc.cinderscapes.legacy.block.PolypiteQuartzBlock;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.feature.FeatureConfig;

public class PolypiteQuartzFeatureConfig implements FeatureConfig {

    public final PolypiteQuartzBlock quartzMaterial;

    public PolypiteQuartzFeatureConfig(PolypiteQuartzBlock quartzMaterial) {
        this.quartzMaterial = quartzMaterial;
    }

    public static final Codec<PolypiteQuartzFeatureConfig> CODEC = RecordCodecBuilder.create((instance) -> {
        return instance.group(Codec.STRING.fieldOf("quartz_material").forGetter((config) -> {
            return Registry.BLOCK.getId(config.quartzMaterial).toString();
        })).apply(instance, PolypiteQuartzFeatureConfig::from);
    });

    private static PolypiteQuartzFeatureConfig from(String s) {
        return new PolypiteQuartzFeatureConfig((PolypiteQuartzBlock) Registry.BLOCK.get(Identifier.tryParse(s)));
    }
}
