package net.minecraft.src;
import java.util.Map;
import java.util.Random;

public class mod_orisinium extends BaseMod

{
	//Blocks
	public static final Block ebonyBlock = new BlockEbony (202,0).setHardness(3F).setBlockName("Block Ebony");
	public static final Block orisiniumBlock = new BlockOrisinium (201,0).setHardness(2F).setBlockName("Orisinium Block");
	public static final Block moonstoneLog = new BlockMoonstoneLog(205).setHardness(2.0F).setStepSound(Block.soundWoodFootstep).setLightValue(0.3F).setBlockName("Blockium Log").setRequiresSelfNotify();
    public static final Block moonstoneLeaf = new BlockMoonstoneLeaf(206, 0).setHardness(0.2F).setLightOpacity(1).setStepSound(Block.soundGrassFootstep).setBlockName("Blockium Leaf").setRequiresSelfNotify();
	//Ingots
    public static final Item moonstoneIngot = new ItemMoonstoneIngot(601).setItemName("Moonstone Ingot");
	public static final Item orisiniumIngot = new ItemOrisiniumIngot(602).setItemName("Orisinium Ingot");
    public static final Item ebonyIngot = new ItemEbonyIngot(600).setItemName("Ebony Ingot");
	//Orcish tools
    public static final Item orisiniumPickaxe = new ItemPickaxe(603, EnumToolMaterial.ORISINIUM).setItemName("Orisinium Pickaxe");
    public static final Item orisiniumAxe = new ItemAxe(604, EnumToolMaterial.ORISINIUM).setItemName("Orisinium Axe");
  	public static final Item orisiniumSword = new ItemSword(605, EnumToolMaterial.ORISINIUM).setItemName("Orisinium Sword");
  	public static final Item orisiniumShovel = new ItemSpade(606, EnumToolMaterial.ORISINIUM).setItemName("Orisinium Shovel");
  	public static final Item orisiniumHoe = new ItemHoe(607, EnumToolMaterial.ORISINIUM).setItemName("Orisinium Hoe");
  	//Armour
  	public static final Item orisiniumHelmet = new ItemArmor(608,EnumArmorMaterial.ORISINIUM, ModLoader.addArmor("orisinium"), 0).setItemName("Orcish Helmet");
  	public static final Item orisiniumChest = new ItemArmor(609, EnumArmorMaterial.ORISINIUM, ModLoader.addArmor("orisinium"), 1).setItemName("Orcish Chest");
  	public static final Item orisiniumLegs = new ItemArmor(610,  EnumArmorMaterial.ORISINIUM, ModLoader.addArmor("orisinium"), 2).setItemName("Orcish Legs");
  	public static final Item orisiniumBoots = new ItemArmor(611, EnumArmorMaterial.ORISINIUM, ModLoader.addArmor("orisinium"), 3).setItemName("Orcish Boots");
    //Moonstone tools
  	public static final Item moonstonePickaxe = new ItemPickaxe(612, EnumToolMaterial.ELVEN).setItemName("Moonstone Pickaxe");
    public static final Item moonstoneAxe = new ItemAxe(613, EnumToolMaterial.ELVEN).setItemName("Moonstone Axe");
  	public static final Item moonstoneSword = new ItemSword(614, EnumToolMaterial.ELVEN).setItemName("Moonstone Sword");
  	public static final Item moonstoneShovel = new ItemSpade(615, EnumToolMaterial.ELVEN).setItemName("Moonstone Shovel");
  	public static final Item moonstoneHoe = new ItemHoe(616, EnumToolMaterial.ELVEN).setItemName("Moonstone Hoe");
  	//Ebony Tools
  	public static final Item ebonyPickaxe = new ItemPickaxe(617, EnumToolMaterial.EBONY).setItemName("Ebony Pickaxe");
    public static final Item ebonyAxe = new ItemAxe(618, EnumToolMaterial.EBONY).setItemName("Ebony Axe");
  	public static final Item ebonySword = new ItemSword(619, EnumToolMaterial.EBONY).setItemName("Ebony Sword");
  	public static final Item ebonyShovel = new ItemSpade(620, EnumToolMaterial.EBONY).setItemName("Ebony Shovel");
  	public static final Item ebonyHoe = new ItemHoe(621, EnumToolMaterial.EBONY).setItemName("Ebony Hoe");
  	//Daedric Tools
    public static final Item daedricPickaxe = new ItemPickaxe(622, EnumToolMaterial.DAEDRIC).setItemName("Daedric Pickaxe");
  	public static final Item daedricAxe =new ItemAxe(623, EnumToolMaterial.DAEDRIC).setItemName("Daedric Axe");
  	public static final Item daedricSword = new ItemSword(624, EnumToolMaterial.DAEDRIC).setItemName("Daedric Sword");
  	public static final Item daedricShovel = new ItemSpade(625, EnumToolMaterial.DAEDRIC).setItemName("Daedric Shovel");
  	public static final Item daedricHoe = new ItemHoe(626, EnumToolMaterial.DAEDRIC).setItemName("Daedric Hoe");
  	
  	//Items
  	public static final Item orange = new ItemFood(627, 4, true).setItemName("Orange");
  	public static final Item vampireDust = new ItemVampireDust(628).setItemName("Vampire Dust");
  	public static final Item daedricHeart = new ItemDaedricHeart(629).setItemName("Daedric Heart");
  	
  	//textureSide
	public static int logBottom;
	public static int logSide;
	
  	
  	public mod_orisinium()
	{   
  		//Vampire
  		ModLoader.registerEntityID(EntityVampire.class, "Vampire", ModLoader.getUniqueEntityId());
  		ModLoader.addSpawn(EntityVampire.class, 4, 2, 4, EnumCreatureType.monster);
  		
  	    //Vampire dust
  		ModLoader.addName(vampireDust, "Vampire Dust");
  		vampireDust.iconIndex = ModLoader.addOverride("/gui/items.png", "/Mod/VampireDust.png");
  		
  		
  		//Daedra
  		ModLoader.registerEntityID(EntityDaedra.class, "Daedra", ModLoader.getUniqueEntityId());
  		ModLoader.addSpawn(EntityDaedra.class, 2, 2, 2, EnumCreatureType.monster, new BiomeGenBase[]{BiomeGenBase.hell});
  		
  		//Daedric Heart
  		ModLoader.addName(daedricHeart, "Daedric Heart");
  		daedricHeart.iconIndex = ModLoader.addOverride("/gui/items.png", "/Mod/DaedricHeart.png");
 
  	    //Orange
  	    ModLoader.addName(orange, "Orange");
  	    orange.iconIndex = ModLoader.addOverride("/gui/items.png", "/Mod/Orange.png");
  	
    	//Logs
  		ModLoader.registerBlock(moonstoneLog);
  		ModLoader.addName(moonstoneLog, "Moonstone Ore");
  		
  		logBottom = ModLoader.addOverride("/terrain.png", "/Mod/moonstoneLogBottom.png");
  		logSide = ModLoader.addOverride("/terrain.png", "/Mod/moonstoneLogSide.png");
  		
  		
     	//Leafs
  	    ModLoader.registerBlock(moonstoneLeaf);
  	    ModLoader.addName(moonstoneLeaf, "Moonstone Leaf");
  	    moonstoneLeaf.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/Mod/moonstoneLeaf.png");
  		
  		//OrisiniumBlock
		ModLoader.registerBlock(orisiniumBlock);
		ModLoader.addName(orisiniumBlock, "Orisinium Ore ");
		orisiniumBlock.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/Mod/orisiniumBlock.png");
		
		//EbonyBlock
		ModLoader.registerBlock(ebonyBlock);
		ModLoader.addName(ebonyBlock, "Orisinium ");
		ebonyBlock.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/Mod/ebonyBlock.png");
		
		//orcishIngot
		ModLoader.addName(orisiniumIngot, "Orisinium Ingot");
		orisiniumIngot.iconIndex = ModLoader.addOverride("/gui/items.png", "/Mod/OrisiniumIngot.png");
		
		ModLoader.addSmelting(mod_orisinium.orisiniumBlock.blockID, new ItemStack(mod_orisinium.orisiniumIngot, 1));
		
        //MoonstoneIngot	
		ModLoader.addName(moonstoneIngot, "Moonstone Ingot");
		moonstoneIngot.iconIndex = ModLoader.addOverride("/gui/items.png", "/Mod/MoonstoneIngot.png");
		
		ModLoader.addSmelting(mod_orisinium.moonstoneLog.blockID, new ItemStack(mod_orisinium.moonstoneIngot, 1));
		
		//EbonyIngot
		ModLoader.addName(ebonyIngot, "Ebony Ingot");
		ebonyIngot.iconIndex = ModLoader.addOverride("/gui/items.png", "/Mod/EbonyIngot.png");
		
		ModLoader.addSmelting(mod_orisinium.ebonyBlock.blockID, new ItemStack(mod_orisinium.ebonyIngot, 1));
		
		
		//OrcishPickaxe
		ModLoader.addName(orisiniumPickaxe, "Orcish Pickaxe");
		orisiniumPickaxe.iconIndex = ModLoader.addOverride("/gui/items.png", "/Mod/OrisiniumPickaxe.png");
				
		ModLoader.addRecipe(new ItemStack(orisiniumPickaxe, 1), new Object[]{
					"###", " X ", " X ", Character.valueOf('#'), orisiniumIngot, Character.valueOf('X'), Item.stick
					
				});
		//OrcishAxe
		ModLoader.addName(orisiniumAxe, "Orcish Axe");
		orisiniumAxe.iconIndex = ModLoader.addOverride("/gui/items.png", "/Mod/orcishAxe.png");
				
		ModLoader.addRecipe(new ItemStack(orisiniumAxe, 1) , new Object[]{
			       "## ", "#X ", " X ", Character.valueOf('#'), orisiniumIngot, Character.valueOf('X'), Item.stick
					
				});
				
		ModLoader.addRecipe(new ItemStack(orisiniumAxe, 1) , new Object[]
				{
			       " ##", " X#", " X ", Character.valueOf('#'), orisiniumIngot, Character.valueOf('X'), Item.stick		
	            });
	
		//OrcishSword
		ModLoader.addName(orisiniumSword, "Orcish Sword");
	    orisiniumSword.iconIndex = ModLoader.addOverride("/gui/items.png", "/Mod/orcishSword.png");
				
		ModLoader.addRecipe(new ItemStack(orisiniumSword, 1) , new Object[]{
			" # ", " # ", " X ", Character.valueOf('#'), orisiniumIngot, Character.valueOf('X'), Item.stick
					
				});
				
		//OrcishShovel
		ModLoader.addName(orisiniumShovel, "Orcish Shovel");
		orisiniumShovel.iconIndex = ModLoader.addOverride("/gui/items.png", "/Mod/orcishShovel.png");
				
		ModLoader.addRecipe(new ItemStack(orisiniumShovel, 1) , new Object[]{
			" # ", " X ", " X ", Character.valueOf('#'), orisiniumIngot, Character.valueOf('X'), Item.stick
					
				});
				
		//OrcishHoe
		ModLoader.addName(orisiniumHoe, "Orcish Hoe");
		orisiniumHoe.iconIndex = ModLoader.addOverride("/gui/items.png", "/Mod/orcishHoe.png");
				
		ModLoader.addRecipe(new ItemStack(orisiniumHoe, 1) , new Object[]{
			"## ", " X ", " X ", Character.valueOf('#'), orisiniumIngot, Character.valueOf('X'), Item.stick
					
				});
				
		ModLoader.addRecipe(new ItemStack(orisiniumHoe, 1) , new Object[]{
			" ##", " X ", " X ", Character.valueOf('#'), orisiniumIngot, Character.valueOf('X'), Item.stick
					
				});
		//ElvenPickaxe
		ModLoader.addName(moonstonePickaxe, "Elven Pickaxe");
		moonstonePickaxe.iconIndex = ModLoader.addOverride("/gui/items.png", "/Mod/ElvenPickaxe.png");
						
		ModLoader.addRecipe(new ItemStack(moonstonePickaxe, 1), new Object[]{
			"###", " X ", " X ", Character.valueOf('#'), moonstoneIngot, Character.valueOf('X'), Item.stick
							
						});
	    //ElvenAxe
		ModLoader.addName(moonstoneAxe, "Elven Axe");
		moonstoneAxe.iconIndex = ModLoader.addOverride("/gui/items.png", "/Mod/ElvenAxe.png");
						
		ModLoader.addRecipe(new ItemStack(moonstoneAxe, 1) , new Object[]{
			"## ", "#X ", " X ", Character.valueOf('#'), moonstoneIngot, Character.valueOf('X'), Item.stick
							
						});
						
		ModLoader.addRecipe(new ItemStack(moonstoneAxe, 1) , new Object[]{
			" ##", " X#", " X ", Character.valueOf('#'), moonstoneIngot, Character.valueOf('X'), Item.stick		
			            });
			
		//ElvenSword
		ModLoader.addName(moonstoneSword, "Elven Sword");
	    moonstoneSword.iconIndex = ModLoader.addOverride("/gui/items.png", "/Mod/ElvenSword.png");
						
		ModLoader.addRecipe(new ItemStack(moonstoneSword, 1) , new Object[]{
			" # ", " # ", " X ", Character.valueOf('#'), moonstoneIngot, Character.valueOf('X'), Item.stick
							
						});
						
		//ElvenShovel
		ModLoader.addName(moonstoneShovel, "Elven Shovel");
		moonstoneShovel.iconIndex = ModLoader.addOverride("/gui/items.png", "/Mod/ElvenShovel.png");
						
		ModLoader.addRecipe(new ItemStack(moonstoneShovel, 1) , new Object[]{
			" # ", " X ", " X ", Character.valueOf('#'), moonstoneIngot, Character.valueOf('X'), Item.stick
							
						});
						
		//ElvenHoe
		ModLoader.addName(moonstoneHoe, "Elven Hoe");
		moonstoneHoe.iconIndex = ModLoader.addOverride("/gui/items.png", "/Mod/ElvenHoe.png");
						
		ModLoader.addRecipe(new ItemStack(moonstoneHoe, 1) , new Object[]{
			"## ", " X ", " X ", Character.valueOf('#'), moonstoneIngot, Character.valueOf('X'), Item.stick
							
						});
						
		ModLoader.addRecipe(new ItemStack(moonstoneHoe, 1) , new Object[]{
			" ##", " X ", " X ", Character.valueOf('#'), moonstoneIngot, Character.valueOf('X'), Item.stick
							
						});
		//EbonyPickaxe
		ModLoader.addName(ebonyPickaxe, "Ebony Pickaxe");
		ebonyPickaxe.iconIndex = ModLoader.addOverride("/gui/items.png", "/Mod/EbonyPickaxe.png");
						
		ModLoader.addRecipe(new ItemStack(ebonyPickaxe, 1), new Object[]{
					"###", " X ", " X ", Character.valueOf('#'), ebonyIngot, Character.valueOf('X'), Item.stick
							
						});
		//EbonyAxe
		ModLoader.addName(ebonyAxe, "Ebony Axe");
		ebonyAxe.iconIndex = ModLoader.addOverride("/gui/items.png", "/Mod/EbonyAxe.png");
						
		ModLoader.addRecipe(new ItemStack(ebonyAxe, 1) , new Object[]{
					     "## ", "#X ", " X ", Character.valueOf('#'), ebonyIngot, Character.valueOf('X'), Item.stick
							
						});
						
		ModLoader.addRecipe(new ItemStack(ebonyAxe, 1) , new Object[]{
					     " ##", " X#", " X ", Character.valueOf('#'), ebonyIngot, Character.valueOf('X'), Item.stick		
			            });
			
		//EbonySword
		ModLoader.addName(ebonySword, "Ebony Sword");
	    ebonySword.iconIndex = ModLoader.addOverride("/gui/items.png", "/Mod/EbonySword.png");
						
		ModLoader.addRecipe(new ItemStack(ebonySword, 1) , new Object[]{
			" # ", " # ", " X ", Character.valueOf('#'), ebonyIngot, Character.valueOf('X'), Item.stick
							
						});
						
		//EbonyShovel
		ModLoader.addName(ebonyShovel, "Ebony Shovel");
		ebonyShovel.iconIndex = ModLoader.addOverride("/gui/items.png", "/Mod/EbonyShovel.png");
						
		ModLoader.addRecipe(new ItemStack(ebonyShovel, 1) , new Object[]{
					" # ", " X ", " X ", Character.valueOf('#'), ebonyIngot, Character.valueOf('X'), Item.stick
							
						});
						
		//EbonyHoe
		ModLoader.addName(ebonyHoe, "Ebony Hoe");
		ebonyHoe.iconIndex = ModLoader.addOverride("/gui/items.png", "/Mod/EbonyHoe.png");
						
		ModLoader.addRecipe(new ItemStack(ebonyHoe, 1) , new Object[]{
			"## ", " X ", " X ", Character.valueOf('#'), ebonyIngot, Character.valueOf('X'), Item.stick
							
						});
						
		ModLoader.addRecipe(new ItemStack(ebonyHoe, 1) , new Object[]{
			" ##", " X ", " X ", Character.valueOf('#'), ebonyIngot, Character.valueOf('X'), Item.stick
							
						});
		
		//DaedricPickaxe
		ModLoader.addName(daedricPickaxe, "Daedric Pickaxe");
		daedricPickaxe.iconIndex = ModLoader.addOverride("/gui/items.png", "/Mod/DaedricPickaxe.png");
		
		ModLoader.addRecipe(new ItemStack(daedricPickaxe, 1) , new Object[]{
			" # ", " # ", " X ", Character.valueOf('#'), daedricHeart, Character.valueOf('X'), ebonyPickaxe
		});
		
		//DaedricSword
		ModLoader.addName(daedricSword, "Daedric Sword");
		daedricSword.iconIndex = ModLoader.addOverride("/gui/items.png", "/Mod/DaedricSword.png");
		
		ModLoader.addRecipe(new ItemStack(daedricSword, 1) , new Object[]{
			" # ", " # ", " X ", Character.valueOf('#'), daedricHeart, Character.valueOf('X'), ebonySword
		});
		
		//Daedric Shovel
		ModLoader.addName(daedricShovel, "Daedric Shovel");
		daedricShovel.iconIndex = ModLoader.addOverride("/gui/items.png", "/Mod/DaedricShovel.png");
		
		ModLoader.addRecipe(new ItemStack(daedricShovel, 1) , new Object[]{
			" # ", " # ", " X ", Character.valueOf('#'),daedricHeart, Character.valueOf('X'), ebonyShovel		
		});
		
		//Daedric Axe
		ModLoader.addName(daedricAxe, "Daedric Axe");
		daedricAxe.iconIndex = ModLoader.addOverride("/gui/items.png", "/Mod/DaedricAxe.png");
		
		ModLoader.addRecipe(new ItemStack(daedricAxe, 1) , new Object[]{
			" # ", " # ", " X ", Character.valueOf('#'), daedricHeart, Character.valueOf('X'), ebonyAxe
							
						});
		//Daedric Hoe
		ModLoader.addName(daedricHoe, "Daedric Hoe");
		daedricHoe.iconIndex = ModLoader.addOverride("/gui/items.png", "/Mod/DaedricHoe.png");
		
		ModLoader.addRecipe(new ItemStack(daedricHoe, 1) , new Object[]{
			" # ", " # ", " X ", Character.valueOf('#'), daedricHeart, Character.valueOf('X'), ebonyHoe
		});
		
		//Armour's
		
		//Helmet
		ModLoader.addName(orisiniumHelmet,"Orcish Helmet");
		orisiniumHelmet.iconIndex = ModLoader.addOverride("/gui/items.png", "/Mod/orcishHelmet.png");
		ModLoader.addRecipe(new ItemStack(orisiniumHelmet, 1) , new Object[]{
			"###", "# #", Character.valueOf('#'), orisiniumIngot
					
				});
				
		//Chestplate
		ModLoader.addName(orisiniumChest, "Orcish Chest Plate");
		orisiniumChest.iconIndex = ModLoader.addOverride("/gui/items.png", "/Mod/orcishChest.png");
		ModLoader.addRecipe(new ItemStack(orisiniumChest, 1), new Object[]{
			"# #", "###", "###", Character.valueOf('#'), orisiniumIngot
				});
				
		//Legs
		ModLoader.addName(orisiniumLegs, "Orcish Legs");
		orisiniumLegs.iconIndex = ModLoader.addOverride("/gui/items.png", "/Mod/orcishLegs.png");
		ModLoader.addRecipe(new ItemStack(orisiniumLegs, 1) , new Object[]{
			"###", "# #", "# #", Character.valueOf('#'), orisiniumIngot
				});
				
		//Boots
		ModLoader.addName(orisiniumBoots, "Orcish Boots");
		orisiniumBoots.iconIndex = ModLoader.addOverride("/gui/items.png", "/Mod/orcishBoots.png");
		ModLoader.addRecipe(new ItemStack(orisiniumBoots, 1) , new Object[]{
			"# #", "# #", Character.valueOf('#'), orisiniumIngot
				});		
		
	     
	}	

  	//Ore generation. Generates the ores for ebony and orisinium
  	public void generateSurface(World world, Random rand, int baseX, int baseZ)
  	
  	{		for(int x = 0; x < 2; x++)
  	        {
	       
				int Xcoord = baseX + rand.nextInt(16);
				int Ycoord = rand.nextInt(20);
				int Zcoord = baseZ + rand.nextInt(16);
				new WorldGenMinable(ebonyBlock.blockID, 5).generate(world, rand, Xcoord, Ycoord, Zcoord);
  	        }
  		
  	
			for(int x = 0; x < 4; x++) //rarity
			{
				int Xcoord = baseX + rand.nextInt(16);
				int Ycoord = rand.nextInt(64);
				int Zcoord = baseZ + rand.nextInt(16);
				(new WorldGenMinable(orisiniumBlock.blockID, 6)).generate(world, rand, Xcoord, Ycoord, Zcoord);
				
			}
				
	         //Alowed Biomes
	         BiomeGenBase biome = world.getWorldChunkManager().getBiomeGenAt(baseX, baseZ); 
             WorldGenMoonstoneTree tree = new WorldGenMoonstoneTree(); 
             if((biome instanceof BiomeGenForest))
             {
				
    
    	for(int x1 = 0; x1 < 5; x1++)
    	{
    		int Xcoord1 = baseX + rand.nextInt(16); 
    		int Zcoord1 = baseZ + rand.nextInt(16); 
    		int i = world.getHeightValue(Xcoord1, Zcoord1); 
    		tree.generate(world, rand, Xcoord1, i, Zcoord1); 
        
    	}
    
             }
   }
        //For custom Mobs
        public void addRenderer(Map map)
        {
        	map.put(EntityVampire.class, new RenderVampire(new ModelVampire(), 0.5F));
        	
        	//map.put(EntityBat.class, new RenderBat(new ModelBat(), 0.5F));
        	
        	map.put(EntityDaedra.class, new RenderDaedra(new ModelDaedra(), 0.5F));
        }
        
        
			
	public void load(){}
	
	public String getVersion()
	{
		return "1.2.5  ores plus more! ";
	}
    	
}
