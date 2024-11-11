package net.minecraft.src;

public class ItemEbonyIngot extends Item
{
	
	public ItemEbonyIngot(int X)
	{
		super(X);
		maxStackSize = 64;
	}
	
	
	 public boolean hasEffect(ItemStack par1ItemStack)
	    {
	        return true;
	    }
	}



