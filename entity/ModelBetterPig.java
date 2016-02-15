package timaxa007.entity;

import net.minecraft.client.model.ModelQuadruped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelBetterPig extends ModelQuadruped {

	ModelRenderer left_ear_1;
	ModelRenderer left_ear_2;
	ModelRenderer left_ear_3;
	ModelRenderer left_ear_4;
	ModelRenderer jaw;
	ModelRenderer head_pig;
	ModelRenderer nose;
	ModelRenderer right_ear_1;
	ModelRenderer right_ear_2;
	ModelRenderer right_ear_3;
	ModelRenderer right_ear_4;
	ModelRenderer body_pig;
	ModelRenderer tail;
	ModelRenderer front_left_leg;
	ModelRenderer front_left_tigh;
	ModelRenderer front_right_leg;
	ModelRenderer front_right_tigh;
	ModelRenderer back_right_leg;
	ModelRenderer back_right_knee;
	ModelRenderer back_right_tigh;
	ModelRenderer back_left_leg;
	ModelRenderer back_left_knee;
	ModelRenderer back_left_tigh;

	public ModelBetterPig() {
		super(0, 1F);

		textureWidth = 64;
		textureHeight = 32;

		left_ear_1 = new ModelRenderer(this, 32, 3);
		left_ear_1.addBox(-1F, -7F, 0F, 1, 2, 1);
		left_ear_1.setRotationPoint(-0.5F, 18F, -6.1F);
		left_ear_1.setTextureSize(64, 32);
		left_ear_1.mirror = true;
		setRotation(left_ear_1, 0F, 0F, 0.5235988F);

		left_ear_2 = new ModelRenderer(this, 36, 2);
		left_ear_2.addBox(-1F, -7F, 0F, 1, 3, 1);
		left_ear_2.setRotationPoint(0.8F, 17.6F, -6.1F);
		left_ear_2.setTextureSize(64, 32);
		left_ear_2.mirror = true;
		setRotation(left_ear_2, 0F, 0F, 0.5235988F);

		left_ear_3 = new ModelRenderer(this, 40, 1);
		left_ear_3.addBox(-1F, -7F, 0F, 1, 4, 1);
		left_ear_3.setRotationPoint(2.1F, 17.2F, -6.1F);
		left_ear_3.setTextureSize(64, 32);
		left_ear_3.mirror = true;
		setRotation(left_ear_3, 0F, 0F, 0.5235988F);

		left_ear_4 = new ModelRenderer(this, 44, 0);
		left_ear_4.addBox(-1F, -7F, 0F, 1, 4, 1);
		left_ear_4.setRotationPoint(3.2F, 17.2F, -6.1F);
		left_ear_4.setTextureSize(64, 32);
		left_ear_4.mirror = true;
		setRotation(left_ear_4, 0F, 0F, 0.5235988F);

		jaw = new ModelRenderer(this, 40, 23);
		jaw.addBox(-2.5F, 0F, -6F, 5, 3, 6);
		jaw.setRotationPoint(0F, 15F, -6F);
		jaw.setTextureSize(64, 32);
		jaw.mirror = true;
		setRotation(jaw, -0.1858931F, 0F, 0F);

		head_pig = new ModelRenderer(this, 40, 14);
		head_pig.addBox(-2F, -3F, -5F, 4, 3, 6);
		head_pig.setRotationPoint(0F, 15F, -6F);
		head_pig.setTextureSize(64, 32);
		head_pig.mirror = true;
		setRotation(head_pig, 0.3346075F, 0F, 0F);

		nose = new ModelRenderer(this, 40, 9);
		nose.addBox(-2F, -1F, -8F, 4, 3, 2);
		nose.setRotationPoint(0F, 15F, -6F);
		nose.setTextureSize(64, 32);
		nose.mirror = true;
		setRotation(nose, 0F, 0F, 0F);

		right_ear_1 = new ModelRenderer(this, 28, 3);
		right_ear_1.addBox(-4F, -7F, 0F, 1, 2, 1);
		right_ear_1.setRotationPoint(4F, 16F, -6.1F);
		right_ear_1.setTextureSize(64, 32);
		right_ear_1.mirror = true;
		setRotation(right_ear_1, 0F, 0F, -0.5235988F);

		right_ear_2 = new ModelRenderer(this, 24, 2);
		right_ear_2.addBox(-4F, -7F, 0F, 1, 3, 1);
		right_ear_2.setRotationPoint(2.7F, 15.6F, -6.1F);
		right_ear_2.setTextureSize(64, 32);
		right_ear_2.mirror = true;
		setRotation(right_ear_2, 0F, 0F, -0.5235988F);

		right_ear_3 = new ModelRenderer(this, 20, 1);
		right_ear_3.addBox(-4F, -7F, 0F, 1, 4, 1);
		right_ear_3.setRotationPoint(1.4F, 15.2F, -6.1F);
		right_ear_3.setTextureSize(64, 32);
		right_ear_3.mirror = true;
		setRotation(right_ear_3, 0F, 0F, -0.5235988F);

		right_ear_4 = new ModelRenderer(this, 16, 0);
		right_ear_4.addBox(-4F, -7F, 0F, 1, 4, 1);
		right_ear_4.setRotationPoint(0.3F, 15.2F, -6.1F);
		right_ear_4.setTextureSize(64, 32);
		right_ear_4.mirror = true;
		setRotation(right_ear_4, 0F, 0F, -0.5235988F);

		body_pig = new ModelRenderer(this, 0, 12);
		body_pig.addBox(-3F, -2F, -6F, 6, 6, 14);
		body_pig.setRotationPoint(0F, 14F, 0F);
		body_pig.setTextureSize(64, 32);
		body_pig.mirror = true;
		setRotation(body_pig, 0F, 0F, 0F);

		tail = new ModelRenderer(this, 10, 0);
		tail.addBox(-1.5F, -2.933333F, 0F, 3, 3, 0);
		tail.setRotationPoint(0F, 15F, 8F);
		tail.setTextureSize(64, 32);
		tail.mirror = true;
		setRotation(tail, -0.7853982F, 0F, 0F);

		front_left_leg = new ModelRenderer(this, 0, 12);
		front_left_leg.mirror = true;
		front_left_leg.addBox(-1F, 1F, -1.5F, 2, 5, 2);
		front_left_leg.setRotationPoint(2F, 18F, -3F);
		front_left_leg.setTextureSize(64, 32);
		front_left_leg.mirror = true;
		setRotation(front_left_leg, 0F, 0F, 0F);
		front_left_leg.mirror = false;

		front_left_tigh = new ModelRenderer(this, 0, 5);
		front_left_tigh.mirror = true;
		front_left_tigh.addBox(-0.9F, -2F, -2F, 2, 4, 3);
		front_left_tigh.setRotationPoint(2F, 18F, -3F);
		front_left_tigh.setTextureSize(64, 32);
		front_left_tigh.mirror = true;
		setRotation(front_left_tigh, 0F, 0F, 0F);
		front_left_tigh.mirror = false;

		front_right_leg = new ModelRenderer(this, 0, 12);
		front_right_leg.addBox(-1F, 1F, -1.5F, 2, 5, 2);
		front_right_leg.setRotationPoint(-2F, 18F, -3F);
		front_right_leg.setTextureSize(64, 32);
		front_right_leg.mirror = true;
		setRotation(front_right_leg, 0F, 0F, 0F);

		front_right_tigh = new ModelRenderer(this, 0, 5);
		front_right_tigh.addBox(-1.1F, -2F, -2F, 2, 4, 3);
		front_right_tigh.setRotationPoint(-2F, 18F, -3F);
		front_right_tigh.setTextureSize(64, 32);
		front_right_tigh.mirror = true;
		setRotation(front_right_tigh, 0F, 0F, 0F);

		back_right_leg = new ModelRenderer(this, 0, 12);
		back_right_leg.addBox(-0.9F, 3F, 1.5F, 2, 5, 2);
		back_right_leg.setRotationPoint(-2F, 16F, 4F);
		back_right_leg.setTextureSize(64, 32);
		back_right_leg.mirror = true;
		setRotation(back_right_leg, 0F, 0F, 0F);

		back_right_knee = new ModelRenderer(this, 0, 19);
		back_right_knee.addBox(-1F, 0.3F, -3.5F, 2, 4, 3);
		back_right_knee.setRotationPoint(-2F, 16F, 5F);
		back_right_knee.setTextureSize(64, 32);
		back_right_knee.mirror = true;
		setRotation(back_right_knee, 0.899206F, 0F, 0F);

		back_right_tigh = new ModelRenderer(this, 26, 10);
		back_right_tigh.addBox(-1.1F, -2F, -1.9F, 3, 5, 5);
		back_right_tigh.setRotationPoint(-2F, 16F, 5F);
		back_right_tigh.setTextureSize(64, 32);
		back_right_tigh.mirror = true;
		setRotation(back_right_tigh, 0F, 0F, 0F);

		back_left_leg = new ModelRenderer(this, 0, 12);
		back_left_leg.mirror = true;
		back_left_leg.addBox(-1.1F, 3F, 1.5F, 2, 5, 2);
		back_left_leg.setRotationPoint(2F, 16F, 4F);
		back_left_leg.setTextureSize(64, 32);
		back_left_leg.mirror = true;
		setRotation(back_left_leg, 0F, 0F, 0F);
		back_left_leg.mirror = false;

		back_left_knee = new ModelRenderer(this, 0, 19);
		back_left_knee.mirror = true;
		back_left_knee.addBox(-1F, 0.3F, -3.5F, 2, 4, 3);
		back_left_knee.setRotationPoint(2F, 16F, 5F);
		back_left_knee.setTextureSize(64, 32);
		back_left_knee.mirror = true;
		setRotation(back_left_knee, 0.899206F, 0F, 0F);
		back_left_knee.mirror = false;

		back_left_tigh = new ModelRenderer(this, 26, 10);
		back_left_tigh.mirror = true;
		back_left_tigh.addBox(-0.9F, -2F, -1.9F, 3, 5, 5);
		back_left_tigh.setRotationPoint(1F, 16F, 5F);
		back_left_tigh.setTextureSize(64, 32);
		back_left_tigh.mirror = true;
		setRotation(back_left_tigh, 0F, 0F, 0F);
		back_left_tigh.mirror = false;

		head.showModel = false;
		body.showModel = false;
		leg1.showModel = false;
		leg2.showModel = false;
		leg3.showModel = false;
		leg4.showModel = false;

	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		render(f5);
	}

	public void render(float f5) {
		left_ear_1.render(f5);
		left_ear_2.render(f5);
		left_ear_3.render(f5);
		left_ear_4.render(f5);
		jaw.render(f5);
		head_pig.render(f5);
		nose.render(f5);
		right_ear_1.render(f5);
		right_ear_2.render(f5);
		right_ear_3.render(f5);
		right_ear_4.render(f5);
		body_pig.render(f5);
		tail.render(f5);
		front_left_leg.render(f5);
		front_left_tigh.render(f5);
		front_right_leg.render(f5);
		front_right_tigh.render(f5);
		back_right_leg.render(f5);
		back_right_knee.render(f5);
		back_right_tigh.render(f5);
		back_left_leg.render(f5);
		back_left_knee.render(f5);
		back_left_tigh.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	}

}
