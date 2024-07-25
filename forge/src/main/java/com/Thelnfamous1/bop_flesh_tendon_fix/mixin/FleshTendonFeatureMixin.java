package com.Thelnfamous1.bop_flesh_tendon_fix.mixin;

import biomesoplenty.common.worldgen.feature.misc.FleshTendonFeature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(FleshTendonFeature.class)
public class FleshTendonFeatureMixin {

    @ModifyConstant(method = "place", constant = @Constant(intValue = 126))
    private int fixHardcodedWorldHeight(int constant, FeaturePlaceContext<NoneFeatureConfiguration> context){
        return context.level().getHeight() - 2;
    }
}
