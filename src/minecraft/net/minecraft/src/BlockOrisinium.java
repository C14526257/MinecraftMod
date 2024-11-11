package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Block, Material, mod_Orisinium

public class BlockOrisinium extends Block {

            protected BlockOrisinium(int x, int y) {
/*   9*/        super(x, y, Material.rock);
            }

            public int idDropped(int x, Random rand, int y) {
/*  14*/        return mod_orisinium.orisiniumBlock.blockID;
            }

            public int quantityDropped(Random rand) {
/*  19*/        return 1;
            }
} 
