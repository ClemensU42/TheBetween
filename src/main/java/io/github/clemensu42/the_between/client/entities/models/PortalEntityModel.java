package io.github.clemensu42.the_between.client.entities.models;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.6.5
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class PortalEntityModel extends EntityModel<Entity> {
	private final ModelPart Portal;
	private final ModelPart Base;
	private final ModelPart Frame;
	private final ModelPart SolidFrame;
	private final ModelPart LeftFrame;
	private final ModelPart RightFrame;
	private final ModelPart FramePieces;
	private final ModelPart RightFramePiece1;
	private final ModelPart RightFramePiece2;
	private final ModelPart RightFramePiece3;
	private final ModelPart LeftFramePiece1;
	private final ModelPart LeftFramePiece2;
	private final ModelPart LeftFramePiece3;
	private final ModelPart TopFramePiece1;
	private final ModelPart TopFramePiece2;
	private final ModelPart TopFramePiece3;
	private final ModelPart TopFramePiece4;
	private final ModelPart PortalShards;
	public PortalEntityModel(ModelPart root) {
		this.Portal = root.getChild("Portal");

		this.Base = this.Portal.getChild("Base");
		this.Frame = this.Portal.getChild("Frame");
		this.PortalShards = this.Portal.getChild("PortalShards");

		this.SolidFrame = this.Frame.getChild("SolidFrame");
		this.FramePieces = this.Frame.getChild("FramePieces");

		this.LeftFrame = this.SolidFrame.getChild("LeftFrame");
		this.RightFrame = this.SolidFrame.getChild("RightFrame");

		this.RightFramePiece1 = this.FramePieces.getChild("RightFramePiece1");
		this.RightFramePiece2 = this.FramePieces.getChild("RightFramePiece2");
		this.RightFramePiece3 = this.FramePieces.getChild("RightFramePiece3");

		this.LeftFramePiece1 = this.FramePieces.getChild("LeftFramePiece1");
		this.LeftFramePiece2 = this.FramePieces.getChild("LeftFramePiece2");
		this.LeftFramePiece3 = this.FramePieces.getChild("LeftFramePiece3");

		this.TopFramePiece1 = this.FramePieces.getChild("TopFramePiece1");
		this.TopFramePiece2 = this.FramePieces.getChild("TopFramePiece2");
		this.TopFramePiece3 = this.FramePieces.getChild("TopFramePiece3");
		this.TopFramePiece4 = this.FramePieces.getChild("TopFramePiece4");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData Portal = modelPartData.addChild("Portal", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData Base = Portal.addChild("Base", ModelPartBuilder.create().uv(80, 44).mirrored().cuboid(-8.0F, -2.0F, -4.0F, 16.0F, 2.0F, 8.0F, new Dilation(0.0F)).mirrored(false)
		.uv(80, 54).mirrored().cuboid(-7.0F, -4.0F, -3.0F, 14.0F, 2.0F, 6.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData Frame = Portal.addChild("Frame", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData SolidFrame = Frame.addChild("SolidFrame", ModelPartBuilder.create().uv(0, 0).cuboid(-24.0F, -6.0F, -2.0F, 48.0F, 4.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData LeftFrame = SolidFrame.addChild("LeftFrame", ModelPartBuilder.create().uv(0, 44).cuboid(-24.0F, -22.0F, -2.0F, 2.0F, 16.0F, 2.0F, new Dilation(0.0F))
		.uv(16, 85).cuboid(-22.0F, -18.0F, 0.0F, 2.0F, 12.0F, 2.0F, new Dilation(0.0F))
		.uv(9, 55).cuboid(-22.0F, -19.0F, -2.0F, 2.0F, 13.0F, 2.0F, new Dilation(0.0F))
		.uv(17, 72).cuboid(-24.0F, -17.0F, 0.0F, 2.0F, 11.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData RightFrame = SolidFrame.addChild("RightFrame", ModelPartBuilder.create().uv(8, 84).cuboid(-24.0F, -19.0F, -2.0F, 2.0F, 13.0F, 2.0F, new Dilation(0.0F))
		.uv(0, 82).cuboid(-22.0F, -21.0F, 0.0F, 2.0F, 15.0F, 2.0F, new Dilation(0.0F))
		.uv(0, 62).cuboid(-22.0F, -24.0F, -2.0F, 2.0F, 18.0F, 2.0F, new Dilation(0.0F))
		.uv(8, 70).cuboid(-24.0F, -18.0F, 0.0F, 2.0F, 12.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(44.0F, 0.0F, 0.0F));

		ModelPartData FramePieces = Frame.addChild("FramePieces", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData RightFramePiece1 = FramePieces.addChild("RightFramePiece1", ModelPartBuilder.create().uv(56, 56).cuboid(0.0F, -6.25F, 0.0F, 2.0F, 12.0F, 2.0F, new Dilation(0.0F))
		.uv(80, 62).cuboid(-2.0F, -4.25F, 0.0F, 2.0F, 11.0F, 2.0F, new Dilation(0.0F))
		.uv(39, 79).cuboid(0.0F, -5.25F, -2.0F, 2.0F, 10.0F, 2.0F, new Dilation(0.0F))
		.uv(0, 121).cuboid(-2.0F, -3.25F, -2.0F, 2.0F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-22.0F, -23.75F, 0.0F));

		ModelPartData RightFramePiece2 = FramePieces.addChild("RightFramePiece2", ModelPartBuilder.create().uv(64, 54).cuboid(0.0F, -0.25F, 0.0F, 2.0F, 6.0F, 2.0F, new Dilation(0.0F))
		.uv(31, 79).cuboid(-2.0F, -2.25F, 0.0F, 2.0F, 10.0F, 2.0F, new Dilation(0.0F))
		.uv(64, 62).cuboid(0.0F, 0.75F, -2.0F, 2.0F, 6.0F, 2.0F, new Dilation(0.0F))
		.uv(72, 56).cuboid(-2.0F, -3.25F, -2.0F, 2.0F, 12.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-22.0F, -35.75F, 0.0F));

		ModelPartData RightFramePiece3 = FramePieces.addChild("RightFramePiece3", ModelPartBuilder.create().uv(41, 67).cuboid(0.0F, -0.25F, 0.0F, 2.0F, 10.0F, 2.0F, new Dilation(0.0F))
		.uv(33, 67).cuboid(-2.0F, -2.25F, 0.0F, 2.0F, 10.0F, 2.0F, new Dilation(0.0F))
		.uv(25, 66).cuboid(0.0F, -2.25F, -2.0F, 2.0F, 13.0F, 2.0F, new Dilation(0.0F))
		.uv(17, 58).cuboid(-2.0F, -4.25F, -2.0F, 2.0F, 11.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-22.0F, -45.75F, 0.0F));

		ModelPartData LeftFramePiece1 = FramePieces.addChild("LeftFramePiece1", ModelPartBuilder.create().uv(39, 55).cuboid(0.0F, -6.25F, 0.0F, 2.0F, 10.0F, 2.0F, new Dilation(0.0F))
		.uv(8, 39).cuboid(-2.0F, -7.25F, 0.0F, 2.0F, 14.0F, 2.0F, new Dilation(0.0F))
		.uv(47, 61).cuboid(0.0F, -5.25F, -2.0F, 2.0F, 6.0F, 2.0F, new Dilation(0.0F))
		.uv(17, 42).cuboid(-2.0F, -8.25F, -2.0F, 2.0F, 14.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(22.0F, -24.75F, 0.0F));

		ModelPartData LeftFramePiece2 = FramePieces.addChild("LeftFramePiece2", ModelPartBuilder.create().uv(25, 53).cuboid(0.0F, -7.25F, 0.0F, 2.0F, 11.0F, 2.0F, new Dilation(0.0F))
		.uv(80, 43).cuboid(-2.0F, -4.25F, 0.0F, 2.0F, 7.0F, 2.0F, new Dilation(0.0F))
		.uv(47, 48).cuboid(0.0F, -6.25F, -2.0F, 2.0F, 11.0F, 2.0F, new Dilation(0.0F))
		.uv(33, 48).cuboid(-2.0F, -5.25F, -2.0F, 2.0F, 7.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(22.0F, -34.75F, 0.0F));

		ModelPartData LeftFramePiece3 = FramePieces.addChild("LeftFramePiece3", ModelPartBuilder.create().uv(72, 48).cuboid(0.0F, -2.25F, 0.0F, 2.0F, 6.0F, 2.0F, new Dilation(0.0F))
		.uv(64, 45).cuboid(-2.0F, -0.25F, 0.0F, 2.0F, 7.0F, 2.0F, new Dilation(0.0F))
		.uv(55, 47).cuboid(0.0F, -2.25F, -2.0F, 2.0F, 7.0F, 2.0F, new Dilation(0.0F))
		.uv(120, 44).cuboid(-2.0F, -0.25F, -2.0F, 2.0F, 6.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(22.0F, -45.75F, 0.0F));

		ModelPartData TopFramePiece1 = FramePieces.addChild("TopFramePiece1", ModelPartBuilder.create().uv(112, 0).cuboid(-1.0F, -1.25F, 0.0F, 6.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(110, 4).cuboid(0.0F, -3.25F, 0.0F, 7.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(110, 8).cuboid(-2.0F, -1.25F, -2.0F, 7.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(102, 12).cuboid(-4.0F, -3.25F, -2.0F, 11.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(17.0F, -46.75F, 0.0F));

		ModelPartData TopFramePiece2 = FramePieces.addChild("TopFramePiece2", ModelPartBuilder.create().uv(92, 24).cuboid(-29.0F, -1.25F, 0.0F, 16.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(92, 32).cuboid(-27.0F, -3.25F, 0.0F, 15.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(92, 28).cuboid(-30.0F, -1.25F, -2.0F, 16.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(92, 20).cuboid(-28.0F, -3.25F, -2.0F, 12.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(29.0F, -46.75F, 0.0F));

		ModelPartData TopFramePiece3 = FramePieces.addChild("TopFramePiece3", ModelPartBuilder.create().uv(51, 29).cuboid(-30.0F, -1.25F, 0.0F, 13.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(51, 37).cuboid(-32.0F, -3.25F, 0.0F, 17.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(51, 25).cuboid(-28.0F, -1.25F, -2.0F, 10.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(51, 33).cuboid(-30.0F, -3.25F, -2.0F, 14.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(17.0F, -46.75F, 0.0F));

		ModelPartData TopFramePiece4 = FramePieces.addChild("TopFramePiece4", ModelPartBuilder.create().uv(0, 21).cuboid(-33.0F, -1.25F, 0.0F, 9.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(0, 17).cuboid(-35.0F, -3.25F, 0.0F, 9.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(20, 19).cuboid(-31.0F, -1.25F, -2.0F, 9.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(20, 23).cuboid(-33.0F, -3.25F, -2.0F, 9.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(11.0F, -46.75F, 0.0F));

		ModelPartData PortalShards = Portal.addChild("PortalShards", ModelPartBuilder.create()
		.uv(106, 117).cuboid(-20.0F, -17.0F, 0.0F, 11.0F, 11.0F, 0.01F, new Dilation(0.0F))
		.uv(110, 101).cuboid(-20.0F, -30.0F, 0.0F, 9.0F, 15.0F, 0.01F, new Dilation(0.0F))
		.uv(76, 118).cuboid(-15.0F, -21.0F, 0.0F, 15.0F, 10.0F, 0.01F, new Dilation(0.0F))
		.uv(74, 105).cuboid(-9.0F, -17.0F, 0.0F, 16.0F, 11.0F, 0.01F, new Dilation(0.0F))
		.uv(74, 97).cuboid(4.0F, -13.0F, 0.0F, 16.0F, 7.0F, 0.01F, new Dilation(0.0F))
		.uv(60, 112).cuboid(13.0F, -26.0F, 0.0F, 7.0F, 16.0F, 0.01F, new Dilation(0.0F))
		.uv(40, 119).cuboid(7.0F, -19.0F, 0.0F, 10.0F, 9.0F, 0.01F, new Dilation(0.0F))
		.uv(12, 119).cuboid(-7.0F, -25.0F, 0.0F, 14.0F, 9.0F, 0.01F, new Dilation(0.0F))
		.uv(81, 83).cuboid(-3.0F, -31.0F, 0.0F, 23.0F, 13.0F, 0.01F, new Dilation(0.0F))
		.uv(26, 106).cuboid(-11.0F, -33.0F, 0.0F, 17.0F, 13.0F, 0.01F, new Dilation(0.0F))
		.uv(6, 99).cuboid(-20.0F, -46.0F, 0.0F, 10.0F, 19.0F, 0.01F, new Dilation(0.0F))
		.uv(25, 91).cuboid(-20.0F, -46.0F, 0.0F, 25.0F, 14.0F, 0.01F, new Dilation(0.0F))
		.uv(88, 64).cuboid(-6.0F, -46.0F, 0.0F, 20.0F, 18.0F, 0.01F, new Dilation(0.0F))
		.uv(50, 70).cuboid(5.0F, -46.0F, 0.0F, 15.0F, 19.0F, 0.01F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
		return TexturedModelData.of(modelData, 128, 128);
	}
	@Override
	public void setAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		Portal.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}
}