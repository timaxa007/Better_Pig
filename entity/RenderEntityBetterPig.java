package timaxa007.entity;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderEntityBetterPig extends RenderLiving {

	private static final ResourceLocation textures = new ResourceLocation(ModEntity.MODID, "textures/entity/better_pig.png");
	private static final ModelBetterPig model = new ModelBetterPig();

	public RenderEntityBetterPig() {
		super(model, 1.0F);
	}

	@Override
	public ResourceLocation getEntityTexture(Entity entity) {
		return textures;
	}

}
