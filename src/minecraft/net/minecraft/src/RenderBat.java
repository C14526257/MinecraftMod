package net.minecraft.src;

import org.lwjgl.opengl.GL11;


public class RenderBat extends RenderLiving
{
        protected ModelBat modelBatMain;
        protected float field_40296_d;

        public RenderBat(ModelBat par1ModelBat, float par2)
        {
                this(par1ModelBat, par2, 1.0F);
                modelBatMain = par1ModelBat;
        }

        public RenderBat(ModelBat par1ModelBat, float par2, float par3)
        {
                super(par1ModelBat, par2);
                modelBatMain = par1ModelBat;
                field_40296_d = par3;
        }
}
