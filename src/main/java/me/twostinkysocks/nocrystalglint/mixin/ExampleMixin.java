package me.twostinkysocks.nocrystalglint.mixin;

import net.minecraft.item.EndCrystalItem;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(EndCrystalItem.class)
public class ExampleMixin {

	@Inject(at = @At("HEAD"), method = "hasGlint", cancellable = true)
	public void hasGlint(ItemStack stack, CallbackInfoReturnable<Boolean> cir) {
		cir.setReturnValue(false);
	}
}
