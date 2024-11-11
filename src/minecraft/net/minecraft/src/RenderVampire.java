package net.minecraft.src;

import org.lwjgl.opengl.GL11;


public class RenderVampire extends RenderLiving
{
        protected ModelVampire modelVampireMain;
        protected float field_40296_d;

        public RenderVampire(ModelVampire par1ModelVampire, float par2)
        {
                this(par1ModelVampire, par2, 1.0F);
                modelVampireMain = par1ModelVampire;
        }

        public RenderVampire(ModelVampire par1ModelVampire, float par2, float par3)
        {
                super(par1ModelVampire, par2);
                modelVampireMain = par1ModelVampire;
                field_40296_d = par3;
        }
}
