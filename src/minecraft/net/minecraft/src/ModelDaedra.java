
package net.minecraft.src;

public class ModelDaedra extends ModelBase
{
  //fields
    ModelRenderer LeftHorn2;
    ModelRenderer LeftHorn;
    ModelRenderer RightHorn;
    ModelRenderer HeadHornRight;
    ModelRenderer RightHorn2;
    ModelRenderer HeadHornCenter;
    ModelRenderer HeadHornLeft;
    ModelRenderer head;
    ModelRenderer body;
    ModelRenderer rightarm;
    ModelRenderer leftarm;
    ModelRenderer rightleg;
    ModelRenderer leftleg;
    
    public int heldItemLeft;
    
  public ModelDaedra()
  {
    textureWidth = 64;
    textureHeight = 32;
      heldItemLeft = 0;
      LeftHorn2 = new ModelRenderer(this, 32, 8);
      LeftHorn2.addBox(0F, 0F, 0F, 1, 2, 1);
      LeftHorn2.setRotationPoint(6F, -9F, -0.7F);
      LeftHorn2.setTextureSize(64, 32);
      LeftHorn2.mirror = true;
      setRotation(LeftHorn2, 0F, 0F, 0F);
      LeftHorn = new ModelRenderer(this, 32, 6);
      LeftHorn.addBox(0F, 0F, 0F, 3, 1, 1);
      LeftHorn.setRotationPoint(4F, -7F, -0.7F);
      LeftHorn.setTextureSize(64, 32);
      LeftHorn.mirror = true;
      setRotation(LeftHorn, 0F, 0F, 0F);
      RightHorn = new ModelRenderer(this, 32, 6);
      RightHorn.addBox(0F, 0F, 0F, 3, 1, 1);
      RightHorn.setRotationPoint(-7F, -7F, -0.7F);
      RightHorn.setTextureSize(64, 32);
      RightHorn.mirror = true;
      setRotation(RightHorn, 0F, 0F, 0F);
      HeadHornRight = new ModelRenderer(this, 32, 13);
      HeadHornRight.addBox(0F, 0F, 0F, 1, 2, 1);
      HeadHornRight.setRotationPoint(2F, -10F, -0.7F);
      HeadHornRight.setTextureSize(64, 32);
      HeadHornRight.mirror = true;
      setRotation(HeadHornRight, 0F, 0F, 0F);
      RightHorn2 = new ModelRenderer(this, 32, 8);
      RightHorn2.addBox(0F, 0F, 0F, 1, 2, 1);
      RightHorn2.setRotationPoint(-7F, -9F, -0.7F);
      RightHorn2.setTextureSize(64, 32);
      RightHorn2.mirror = true;
      setRotation(RightHorn2, 0F, 0F, 0F);
      HeadHornCenter = new ModelRenderer(this, 32, 13);
      HeadHornCenter.addBox(0F, 0F, 0F, 1, 2, 1);
      HeadHornCenter.setRotationPoint(-0.5F, -10F, -2.7F);
      HeadHornCenter.setTextureSize(64, 32);
      HeadHornCenter.mirror = true;
      setRotation(HeadHornCenter, 0F, 0F, 0F);
      HeadHornLeft = new ModelRenderer(this, 32, 13);
      HeadHornLeft.addBox(0F, 0F, 0F, 1, 2, 1);
      HeadHornLeft.setRotationPoint(-3F, -10F, -0.7F);
      HeadHornLeft.setTextureSize(64, 32);
      HeadHornLeft.mirror = true;
      setRotation(HeadHornLeft, 0F, 0F, 0F);
      head = new ModelRenderer(this, 0, 0);
      head.addBox(-4F, -8F, -4F, 8, 8, 8);
      head.setRotationPoint(0F, 0F, 0F);
      head.setTextureSize(64, 32);
      head.mirror = true;
      setRotation(head, 0F, 0F, 0F);
      body = new ModelRenderer(this, 16, 16);
      body.addBox(-4F, 0F, -2F, 8, 12, 4);
      body.setRotationPoint(0F, 0F, 0F);
      body.setTextureSize(64, 32);
      body.mirror = true;
      setRotation(body, 0F, 0F, 0F);
      rightarm = new ModelRenderer(this, 40, 16);
      rightarm.addBox(-3F, -2F, -2F, 4, 12, 4);
      rightarm.setRotationPoint(-5F, 2F, 0F);
      rightarm.setTextureSize(64, 32);
      rightarm.mirror = true;
      setRotation(rightarm, 0F, 0F, 0F);
      leftarm = new ModelRenderer(this, 40, 16);
      leftarm.addBox(-1F, -2F, -2F, 4, 12, 4);
      leftarm.setRotationPoint(5F, 2F, 0F);
      leftarm.setTextureSize(64, 32);
      leftarm.mirror = true;
      setRotation(leftarm, 0F, 0F, 0F);
      rightleg = new ModelRenderer(this, 0, 16);
      rightleg.addBox(-2F, 0F, -2F, 4, 12, 4);
      rightleg.setRotationPoint(-2F, 12F, 0F);
      rightleg.setTextureSize(64, 32);
      rightleg.mirror = true;
      setRotation(rightleg, 0F, 0F, 0F);
      leftleg = new ModelRenderer(this, 0, 16);
      leftleg.addBox(-2F, 0F, -2F, 4, 12, 4);
      leftleg.setRotationPoint(2F, 12F, 0F);
      leftleg.setTextureSize(64, 32);
      leftleg.mirror = true;
      setRotation(leftleg, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    LeftHorn2.render(f5);
    LeftHorn.render(f5);
    RightHorn.render(f5);
    HeadHornRight.render(f5);
    RightHorn2.render(f5);
    HeadHornCenter.render(f5);
    HeadHornLeft.render(f5);
    head.render(f5);
    body.render(f5);
    rightarm.render(f5);
    leftarm.render(f5);
    rightleg.render(f5);
    leftleg.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6)
  {
    head.rotateAngleY = par4 / (180F / (float)Math.PI);
    head.rotateAngleX = par5 / (180F / (float)Math.PI);
    rightarm.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 2.0F * par2 * 0.5F;
    leftarm.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 2.0F * par2 * 0.5F;
    rightarm.rotateAngleZ = 0.0F;
    leftarm.rotateAngleZ = 0.0F;
    rightleg.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
    leftleg.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
    rightleg.rotateAngleY = 0.0F;
   leftleg.rotateAngleY = 0.0F;
   
   if (heldItemLeft != 0)
   {
       leftarm.rotateAngleX = leftarm.rotateAngleX * 0.5F - ((float)Math.PI / 10F) * (float)heldItemLeft;
   }

   leftarm.rotateAngleY = 0.0F;
 
  }
  

}
