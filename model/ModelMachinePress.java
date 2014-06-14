package com.megathirio.shinsei.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelMachinePress extends ModelBase
{
  //fields
    ModelRenderer table;
    ModelRenderer backleftleg;
    ModelRenderer frontleftleg;
    ModelRenderer backrightleg;
    ModelRenderer frontrightleg;
    ModelRenderer rightbeam;
    ModelRenderer leftbeam;
    ModelRenderer handleright;
    ModelRenderer crossbeam;
    ModelRenderer press;
    ModelRenderer screwbot;
    ModelRenderer handleleft;
    ModelRenderer gripleft;
    ModelRenderer screwtop;
    ModelRenderer gripright;
  
  public ModelMachinePress()
  {
    textureWidth = 64;
    textureHeight = 64;
    
      table = new ModelRenderer(this, 0, 0);
      table.addBox(0F, 0F, 0F, 12, 2, 12);
      table.setRotationPoint(-6F, 18F, -6F);
      table.setTextureSize(64, 64);
      table.mirror = true;
      setRotation(table, 0F, 0F, 0F);
      backleftleg = new ModelRenderer(this, 48, 6);
      backleftleg.addBox(0F, 0F, 0F, 2, 4, 2);
      backleftleg.setRotationPoint(3F, 20F, 3F);
      backleftleg.setTextureSize(64, 64);
      backleftleg.mirror = true;
      setRotation(backleftleg, 0F, 0F, 0F);
      frontleftleg = new ModelRenderer(this, 48, 0);
      frontleftleg.addBox(0F, 0F, 0F, 2, 4, 2);
      frontleftleg.setRotationPoint(3F, 20F, -5F);
      frontleftleg.setTextureSize(64, 64);
      frontleftleg.mirror = true;
      setRotation(frontleftleg, 0F, 0F, 0F);
      backrightleg = new ModelRenderer(this, 56, 6);
      backrightleg.addBox(0F, 0F, 0F, 2, 4, 2);
      backrightleg.setRotationPoint(-5F, 20F, 3F);
      backrightleg.setTextureSize(64, 64);
      backrightleg.mirror = true;
      setRotation(backrightleg, 0F, 0F, 0F);
      frontrightleg = new ModelRenderer(this, 56, 0);
      frontrightleg.addBox(0F, 0F, 0F, 2, 4, 2);
      frontrightleg.setRotationPoint(-5F, 20F, -5F);
      frontrightleg.setTextureSize(64, 64);
      frontrightleg.mirror = true;
      setRotation(frontrightleg, 0F, 0F, 0F);
      rightbeam = new ModelRenderer(this, 12, 14);
      rightbeam.addBox(0F, 0F, 0F, 2, 7, 4);
      rightbeam.setRotationPoint(-5F, 11F, -2F);
      rightbeam.setTextureSize(64, 64);
      rightbeam.mirror = true;
      setRotation(rightbeam, 0F, 0F, 0F);
      leftbeam = new ModelRenderer(this, 0, 14);
      leftbeam.addBox(0F, 0F, 0F, 2, 7, 4);
      leftbeam.setRotationPoint(3F, 11F, -2F);
      leftbeam.setTextureSize(64, 64);
      leftbeam.mirror = true;
      setRotation(leftbeam, 0F, 0F, 0F);
      handleright = new ModelRenderer(this, 40, 14);
      handleright.addBox(0F, 0F, 0F, 6, 1, 2);
      handleright.setRotationPoint(-7F, 9F, -1F);
      handleright.setTextureSize(64, 64);
      handleright.mirror = true;
      setRotation(handleright, 0F, 0F, 0F);
      crossbeam = new ModelRenderer(this, 0, 25);
      crossbeam.addBox(0F, 0F, 0F, 6, 2, 4);
      crossbeam.setRotationPoint(-3F, 11F, -2F);
      crossbeam.setTextureSize(64, 64);
      crossbeam.mirror = true;
      setRotation(crossbeam, 0F, 0F, 0F);
      press = new ModelRenderer(this, 24, 17);
      press.addBox(0F, 0F, 0F, 6, 1, 6);
      press.setRotationPoint(-3F, 16F, -3F);
      press.setTextureSize(64, 64);
      press.mirror = true;
      setRotation(press, 0F, 0F, 0F);
      screwbot = new ModelRenderer(this, 8, 31);
      screwbot.addBox(0F, 0F, 0F, 2, 3, 2);
      screwbot.setRotationPoint(-1F, 13F, -1F);
      screwbot.setTextureSize(64, 64);
      screwbot.mirror = true;
      setRotation(screwbot, 0F, 0F, 0F);
      handleleft = new ModelRenderer(this, 24, 14);
      handleleft.addBox(0F, 0F, 0F, 6, 1, 2);
      handleleft.setRotationPoint(1F, 9F, -1F);
      handleleft.setTextureSize(64, 64);
      handleleft.mirror = true;
      setRotation(handleleft, 0F, 0F, 0F);
      gripleft = new ModelRenderer(this, 0, 36);
      gripleft.addBox(0F, 0F, 0F, 1, 3, 4);
      gripleft.setRotationPoint(7F, 8F, -2F);
      gripleft.setTextureSize(64, 64);
      gripleft.mirror = true;
      setRotation(gripleft, 0F, 0F, 0F);
      screwtop = new ModelRenderer(this, 0, 31);
      screwtop.addBox(0F, 0F, 0F, 2, 3, 2);
      screwtop.setRotationPoint(-1F, 8F, -1F);
      screwtop.setTextureSize(64, 64);
      screwtop.mirror = true;
      setRotation(screwtop, 0F, 0F, 0F);
      gripright = new ModelRenderer(this, 10, 36);
      gripright.addBox(-15F, 0F, 0F, 1, 3, 4);
      gripright.setRotationPoint(7F, 8F, -2F);
      gripright.setTextureSize(64, 64);
      gripright.mirror = true;
      setRotation(gripright, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    table.render(f5);
    backleftleg.render(f5);
    frontleftleg.render(f5);
    backrightleg.render(f5);
    frontrightleg.render(f5);
    rightbeam.render(f5);
    leftbeam.render(f5);
    handleright.render(f5);
    crossbeam.render(f5);
    press.render(f5);
    screwbot.render(f5);
    handleleft.render(f5);
    gripleft.render(f5);
    screwtop.render(f5);
    gripright.render(f5);
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
