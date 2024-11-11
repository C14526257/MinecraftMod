package net.minecraft.src;

public class ModelBat extends ModelBase
{
  //fields
    ModelRenderer RightEar;
    ModelRenderer Head;
    ModelRenderer LeftEar;
    ModelRenderer Nose;
    ModelRenderer RightWing;
    ModelRenderer LeftWing;
  
  public ModelBat()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      RightEar = new ModelRenderer(this, 7, 0);
      RightEar.addBox(0F, 0F, 0F, 1, 1, 1);
      RightEar.setRotationPoint(-2.2F, 10.5F, 0.5F);
      RightEar.setTextureSize(64, 32);
      RightEar.mirror = true;
      setRotation(RightEar, 0F, 0F, 0F);
      Head = new ModelRenderer(this, 10, 9);
      Head.addBox(0F, 0F, 0F, 4, 3, 2);
      Head.setRotationPoint(-2F, 11F, 0F);
      Head.setTextureSize(64, 32);
      Head.mirror = true;
      setRotation(Head, 0F, 0F, 0F);
      LeftEar = new ModelRenderer(this, 7, 3);
      LeftEar.addBox(0F, 0F, 0F, 1, 1, 1);
      LeftEar.setRotationPoint(1.2F, 10.5F, 0.5F);
      LeftEar.setTextureSize(64, 32);
      LeftEar.mirror = true;
      setRotation(LeftEar, 0F, 0F, 0F);
      Nose = new ModelRenderer(this, 12, 17);
      Nose.addBox(0F, 0F, 1F, 2, 1, 1);
      Nose.setRotationPoint(-1F, 12F, -2F);
      Nose.setTextureSize(64, 32);
      Nose.mirror = true;
      setRotation(Nose, 0F, 0F, 0F);
      RightWing = new ModelRenderer(this, 0, 13);
      RightWing.addBox(0F, 0F, 0F, 3, 1, 1);
      RightWing.setRotationPoint(-5F, 12F, 0.5F);
      RightWing.setTextureSize(64, 32);
      RightWing.mirror = true;
      setRotation(RightWing, 0.0371786F, 0F, 0F);
      LeftWing = new ModelRenderer(this, 0, 16);
      LeftWing.addBox(0F, 0F, 0F, 3, 1, 1);
      LeftWing.setRotationPoint(2F, 12F, 0.5F);
      LeftWing.setTextureSize(64, 32);
      LeftWing.mirror = true;
      setRotation(LeftWing, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    RightEar.render(f5);
    Head.render(f5);
    LeftEar.render(f5);
    Nose.render(f5);
    RightWing.render(f5);
    LeftWing.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
	  
  }
  
}

