package com.megathirio.shinsei.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelToolBench extends ModelBase
{
  //fields
    ModelRenderer benchtop;
    ModelRenderer leftleg;
    ModelRenderer rightleg;
    ModelRenderer leftfoot;
    ModelRenderer rightfoot;
    ModelRenderer brace;
  
  public ModelToolBench()
  {
    textureWidth = 64;
    textureHeight = 64;
    
      benchtop = new ModelRenderer(this, 0, 0);
      benchtop.addBox(0F, 0F, 0F, 16, 4, 16);
      benchtop.setRotationPoint(-8F, 8F, -8F);
      benchtop.setTextureSize(64, 64);
      benchtop.mirror = true;
      setRotation(benchtop, 0F, 0F, 0F);
      leftleg = new ModelRenderer(this, 0, 20);
      leftleg.addBox(0F, 0F, 0F, 2, 10, 8);
      leftleg.setRotationPoint(4F, 12F, -4F);
      leftleg.setTextureSize(64, 64);
      leftleg.mirror = true;
      setRotation(leftleg, 0F, 0F, 0F);
      rightleg = new ModelRenderer(this, 20, 20);
      rightleg.addBox(0F, 0F, 0F, 2, 10, 8);
      rightleg.setRotationPoint(-6F, 12F, -4F);
      rightleg.setTextureSize(64, 64);
      rightleg.mirror = true;
      setRotation(rightleg, 0F, 0F, 0F);
      leftfoot = new ModelRenderer(this, 0, 38);
      leftfoot.addBox(0F, 0F, 0F, 2, 2, 12);
      leftfoot.setRotationPoint(4F, 22F, -6F);
      leftfoot.setTextureSize(64, 64);
      leftfoot.mirror = true;
      setRotation(leftfoot, 0F, 0F, 0F);
      rightfoot = new ModelRenderer(this, 28, 38);
      rightfoot.addBox(0F, 0F, 0F, 2, 2, 12);
      rightfoot.setRotationPoint(-6F, 22F, -6F);
      rightfoot.setTextureSize(64, 64);
      rightfoot.mirror = true;
      setRotation(rightfoot, 0F, 0F, 0F);
      brace = new ModelRenderer(this, 0, 52);
      brace.addBox(0F, 0F, 0F, 8, 2, 6);
      brace.setRotationPoint(-4F, 17F, -3F);
      brace.setTextureSize(64, 64);
      brace.mirror = true;
      setRotation(brace, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    benchtop.render(f5);
    leftleg.render(f5);
    rightleg.render(f5);
    leftfoot.render(f5);
    rightfoot.render(f5);
    brace.render(f5);
  }
  
  
  public void renderModel(float f){
	    benchtop.render(f);
	    leftleg.render(f);
	    rightleg.render(f);
	    leftfoot.render(f);
	    rightfoot.render(f);
	    brace.render(f);
	  
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}
