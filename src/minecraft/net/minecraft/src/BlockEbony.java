package net.minecraft.src;
import java.util.Random;

public class BlockEbony extends Block
{
	
	
	
	protected BlockEbony(int x, int y)
	{
		super(x,y,Material.rock);
	}
	
	public int idDropped(int x, Random rand, int y)
	{
		return mod_orisinium.ebonyBlock.blockID;            
		
	}
	
	public int quantityDropped(Random rand)
	{
		return 1;          //quantity of that item dropped
	}
}
	