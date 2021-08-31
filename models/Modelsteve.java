// Made with Blockbench 3.9.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelsteve extends EntityModel<Entity> {
	private final ModelRenderer leftl;
	private final ModelRenderer rightl;
	private final ModelRenderer footr;
	private final ModelRenderer footl;
	private final ModelRenderer Head;
	private final ModelRenderer Body;
	private final ModelRenderer lefta;
	private final ModelRenderer righta;

	public Modelsteve() {
		textureWidth = 32;
		textureHeight = 32;

		leftl = new ModelRenderer(this);
		leftl.setRotationPoint(-1.9F, 12.0F, 0.0F);
		leftl.setTextureOffset(0, 20).addBox(-2.1F, 0.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.5F, false);

		rightl = new ModelRenderer(this);
		rightl.setRotationPoint(1.9F, 12.0F, 0.0F);
		rightl.setTextureOffset(16, 20).addBox(-1.9F, 0.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.5F, false);

		footr = new ModelRenderer(this);
		footr.setRotationPoint(0.0F, 24.0F, 0.0F);
		footr.setTextureOffset(0, 10).addBox(-5.0F, -4.0F, -3.0F, 6.0F, 4.0F, 6.0F, 0.0F, false);

		footl = new ModelRenderer(this);
		footl.setRotationPoint(5.0F, -22.0F, 0.0F);
		footr.addChild(footl);
		footl.setTextureOffset(0, 0).addBox(-6.0F, 18.0F, -3.0F, 6.0F, 4.0F, 6.0F, 0.0F, false);

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.setTextureOffset(0, 0).addBox(-5.0F, -9.0F, -5.0F, 10.0F, 1.0F, 10.0F, 0.0F, false);
		Head.setTextureOffset(24, 26).addBox(-4.0F, -10.0F, -4.0F, 8.0F, 1.0F, 8.0F, 0.0F, false);
		Head.setTextureOffset(58, 51).addBox(-6.0F, -10.0F, -2.0F, 2.0F, 2.0F, 4.0F, 0.5F, false);
		Head.setTextureOffset(58, 45).addBox(3.0F, -10.0F, -2.0F, 2.0F, 2.0F, 4.0F, 0.5F, false);
		Head.setTextureOffset(0, 5).addBox(-5.0F, -13.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.5F, false);
		Head.setTextureOffset(0, 0).addBox(2.0F, -13.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.5F, false);
		Head.setTextureOffset(0, 15).addBox(2.0F, -15.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		Head.setTextureOffset(0, 11).addBox(-5.0F, -15.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		Head.setTextureOffset(12, 35).addBox(-5.0F, -8.0F, -5.0F, 1.0F, 1.0F, 10.0F, 0.0F, false);
		Head.setTextureOffset(48, 49).addBox(-5.0F, -7.0F, -3.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);
		Head.setTextureOffset(51, 1).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
		Head.setTextureOffset(23, 59).addBox(-5.0F, -5.0F, 0.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		Head.setTextureOffset(11, 59).addBox(4.0F, -5.0F, 0.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		Head.setTextureOffset(29, 18).addBox(4.0F, -6.0F, -2.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
		Head.setTextureOffset(48, 30).addBox(4.0F, -7.0F, -3.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);
		Head.setTextureOffset(54, 9).addBox(-4.0F, -8.0F, 4.0F, 8.0F, 4.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(30, 8).addBox(-4.0F, -4.0F, 4.0F, 8.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(38, 18).addBox(-3.0F, -3.0F, 4.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(0, 34).addBox(4.0F, -8.0F, -5.0F, 1.0F, 1.0F, 10.0F, 0.0F, false);
		Head.setTextureOffset(54, 14).addBox(-4.0F, -8.0F, -5.0F, 8.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(38, 20).addBox(-3.0F, -7.0F, -5.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.setTextureOffset(28, 11).addBox(-5.0F, 4.0F, -3.0F, 10.0F, 1.0F, 6.0F, 0.5F, false);
		Body.setTextureOffset(0, 11).addBox(-5.0F, 2.0F, -4.0F, 10.0F, 2.0F, 8.0F, 0.0F, false);
		Body.setTextureOffset(0, 21).addBox(-5.0F, 5.0F, -3.0F, 10.0F, 7.0F, 6.0F, 0.0F, false);
		Body.setTextureOffset(30, 0).addBox(-4.0F, 0.0F, -3.0F, 8.0F, 2.0F, 6.0F, 0.5F, false);

		lefta = new ModelRenderer(this);
		lefta.setRotationPoint(-5.0F, 2.0F, 0.0F);
		lefta.setTextureOffset(0, 45).addBox(10.0F, 1.0F, -2.0F, 4.0F, 9.0F, 4.0F, 0.5F, false);
		lefta.setTextureOffset(58, 30).addBox(10.0F, -2.0F, -2.0F, 4.0F, 2.0F, 4.0F, 0.5F, false);
		lefta.setTextureOffset(0, 58).addBox(10.0F, -3.0F, -2.0F, 4.0F, 2.0F, 4.0F, 0.0F, false);
		lefta.setTextureOffset(26, 21).addBox(11.0F, -4.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.5F, false);

		righta = new ModelRenderer(this);
		righta.setRotationPoint(5.0F, 2.0F, 0.0F);
		righta.setTextureOffset(16, 46).addBox(-14.0F, 1.0F, -2.0F, 4.0F, 9.0F, 4.0F, 0.5F, false);
		righta.setTextureOffset(44, 58).addBox(-14.0F, -2.0F, -2.0F, 4.0F, 2.0F, 4.0F, 0.5F, false);
		righta.setTextureOffset(0, 34).addBox(-13.0F, -4.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.5F, false);
		righta.setTextureOffset(56, 39).addBox(-14.0F, -3.0F, -2.0F, 4.0F, 2.0F, 4.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		// previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		leftl.render(matrixStack, buffer, packedLight, packedOverlay);
		rightl.render(matrixStack, buffer, packedLight, packedOverlay);
		footr.render(matrixStack, buffer, packedLight, packedOverlay);
		Head.render(matrixStack, buffer, packedLight, packedOverlay);
		Body.render(matrixStack, buffer, packedLight, packedOverlay);
		lefta.render(matrixStack, buffer, packedLight, packedOverlay);
		righta.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}