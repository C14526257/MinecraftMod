package net.minecraft.src;

public enum EnumToolMaterial
{
    WOOD("WOOD", 0, 0, 59, 2.0F, 0, 15),
    STONE("STONE", 1, 1, 131, 4F, 1, 5),
    IRON("IRON", 2, 2, 250, 6F, 2, 14),
    EMERALD("EMERALD", 3, 3, 1561, 8F, 3, 10),
    GOLD("GOLD", 4, 0, 32, 12F, 0, 22),
    ORISINIUM("ORISINIUM", 5, 2, 325, 6F, 2, 15),
    ELVEN("ELVEN", 6, 3, 500, 7F, 2, 20),
    EBONY("EBONY", 7, 4, 1250, 7.5F, 3, 20),
    DAEDRIC("DAEDRIC", 8, 5, 5000, 8F, 50, 30);
    
    private final int harvestLevel;
    private final int maxUses;
    private final float efficiencyOnProperMaterial;
    private final int damageVsEntity;
    private final int enchantability;
    private static final EnumToolMaterial allToolMaterials[] = (new EnumToolMaterial[] {
        WOOD, STONE, IRON, EMERALD, GOLD, ORISINIUM, ELVEN, EBONY, DAEDRIC
    });

    private EnumToolMaterial(String s, int i, int j, int k, float f, int l, int i1)
    {
        harvestLevel = j;
        maxUses = k;
        efficiencyOnProperMaterial = f;
        damageVsEntity = l;
        enchantability = i1;
    }

    public int getMaxUses()
    {
        return maxUses;
    }

    public float getEfficiencyOnProperMaterial()
    {
        return efficiencyOnProperMaterial;
    }

    public int getDamageVsEntity()
    {
        return damageVsEntity;
    }

    public int getHarvestLevel()
    {
        return harvestLevel;
    }

    public int getEnchantability()
    {
        return enchantability;
    }
}
