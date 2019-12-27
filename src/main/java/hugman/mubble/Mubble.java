package hugman.mubble;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import hugman.mubble.init.MubbleBlocks;
import hugman.mubble.init.MubbleCommands;
import hugman.mubble.init.MubbleCostumes;
import hugman.mubble.init.MubbleEffects;
import hugman.mubble.init.MubbleEntities;
import hugman.mubble.init.MubbleItems;
import hugman.mubble.init.MubbleScreens;
import hugman.mubble.init.MubbleSounds;
import hugman.mubble.init.data.MubbleColorMaps;
import hugman.mubble.init.data.MubbleContainerTypes;
import hugman.mubble.init.data.MubbleTileEntityTypes;
import hugman.mubble.init.world.MubbleBiomes;
import hugman.mubble.init.world.MubbleDimensions;
import hugman.mubble.init.world.MubbleGenerators;
import hugman.mubble.objects.events_handlers.KonamiHandler;
import hugman.mubble.util.MoreWordUtils;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityType;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.item.Item;
import net.minecraft.potion.Effect;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.ModDimension;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.IForgeRegistry;

@Mod(Mubble.MOD_ID)
public class Mubble 
{
	public static final String MOD_ID = "mubble";
	public static final String MOD_PREFIX = MOD_ID + ":";
	public static final Logger LOGGER = LogManager.getLogger();
	
    public Mubble()
    {        
        MinecraftForge.EVENT_BUS.register(this);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
    }
    
    private void clientSetup(final FMLClientSetupEvent event)
    {
    	MubbleEntities.registerRenders();
    	LOGGER.info("Registered entity renders");
    	MubbleScreens.registerScreens();
    	LOGGER.info("Registered screens");
    	MinecraftForge.EVENT_BUS.register(new KonamiHandler());
    }
    
    private void setup(final FMLCommonSetupEvent event)
    {
    	MubbleGenerators.registerOres();
    	LOGGER.info("Registered ores");
    	MubbleGenerators.registerTrees();
    	LOGGER.info("Registered trees");
    	MubbleGenerators.registerSpawns();
    	LOGGER.info("Registered entity spawns");
    }
    
    @SubscribeEvent
    public void serverSetup(final FMLServerStartingEvent event)
    {
    	MubbleCommands.registerCommands(event.getCommandDispatcher());
    	LOGGER.info("Registered " + MoreWordUtils.pluralize(MubbleCommands.COMMANDS.size(), "command"));
    }
    
    @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
    public static class ModRegistryEvents
    {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> event)
        {
        	event.getRegistry().registerAll(MubbleBlocks.BLOCKS.toArray(new Block[0]));
        	LOGGER.info("Registered " + MoreWordUtils.pluralize(MubbleBlocks.BLOCKS.size(), "block"));
        }
        
        @SubscribeEvent
        public static void onTileEntitiesRegistry(final RegistryEvent.Register<TileEntityType<?>> event)
        {
        	event.getRegistry().registerAll(MubbleTileEntityTypes.TILE_ENTITY_TYPES.toArray(new TileEntityType<?>[0]));
        	LOGGER.info("Registered " + MoreWordUtils.pluralize(MubbleTileEntityTypes.TILE_ENTITY_TYPES.size(), "tile entity"));
        }
        
        @SubscribeEvent
        public static void onContainersRegistry(final RegistryEvent.Register<ContainerType<?>> event)
        {
        	event.getRegistry().registerAll(MubbleContainerTypes.CONTAINER_TYPES.toArray(new ContainerType<?>[0]));
        	LOGGER.info("Registered " + MoreWordUtils.pluralize(MubbleContainerTypes.CONTAINER_TYPES.size(), "container"));
        }
        
        @SubscribeEvent
        public static void onItemsRegistry(final RegistryEvent.Register<Item> event)
        {
            event.getRegistry().registerAll(MubbleBlocks.CUBES.toArray(new Item[0]));
            event.getRegistry().registerAll(MubbleBlocks.STAIRS.toArray(new Item[0]));
            event.getRegistry().registerAll(MubbleBlocks.SLABS.toArray(new Item[0]));
            event.getRegistry().registerAll(MubbleBlocks.VERTICAL_SLABS.toArray(new Item[0]));
            event.getRegistry().registerAll(MubbleBlocks.FENCES.toArray(new Item[0]));
            event.getRegistry().registerAll(MubbleBlocks.WALLS.toArray(new Item[0]));
            event.getRegistry().registerAll(MubbleBlocks.SAPLINGS.toArray(new Item[0]));
            event.getRegistry().registerAll(MubbleBlocks.LEAVES.toArray(new Item[0]));
            event.getRegistry().registerAll(MubbleBlocks.LEAF_PILES.toArray(new Item[0]));
            event.getRegistry().registerAll(MubbleBlocks.PRESSURE_PLATES.toArray(new Item[0]));
            event.getRegistry().registerAll(MubbleBlocks.TRAPDOORS.toArray(new Item[0]));
            event.getRegistry().registerAll(MubbleBlocks.BUTTONS.toArray(new Item[0]));
            event.getRegistry().registerAll(MubbleBlocks.FENCE_GATES.toArray(new Item[0]));
            event.getRegistry().registerAll(MubbleBlocks.DOORS.toArray(new Item[0]));
            event.getRegistry().registerAll(MubbleBlocks.FLOWERS.toArray(new Item[0]));
            event.getRegistry().registerAll(MubbleBlocks.FLOWER_PILES.toArray(new Item[0]));
            event.getRegistry().registerAll(MubbleBlocks.OTHERS.toArray(new Item[0]));
        	event.getRegistry().registerAll(MubbleItems.ITEMS.toArray(new Item[0]));
        	LOGGER.info("Registered " + MoreWordUtils.pluralize(MubbleItems.ITEMS.size(), "item"));
    		event.getRegistry().registerAll(MubbleCostumes.COSTUMES.toArray(new Item[0]));
        	LOGGER.info("Registered " + MoreWordUtils.pluralize(MubbleCostumes.COSTUMES.size(), "costume"));
        }
        
        @SubscribeEvent
        public static void onEntitiesRegistry(final RegistryEvent.Register<EntityType<?>> event)
        {
        	IForgeRegistry<EntityType<?>> registry = event.getRegistry();
        	MubbleEntities.registerEntities(registry);
        	LOGGER.info("Registered " + MoreWordUtils.pluralize(MubbleEntities.ENTITY_TYPES.size(), "entity"));
        	MubbleEntities.registerPlacements();
        	LOGGER.info("Registered entity spawn placements");
        }
        
        @SubscribeEvent
        public static void onSoundsRegistry(final RegistryEvent.Register<SoundEvent> event)
        {
        	event.getRegistry().registerAll(MubbleSounds.SOUNDS.toArray(new SoundEvent[0]));
        	LOGGER.info("Registered " + MoreWordUtils.pluralize(MubbleSounds.SOUNDS.size(), "sound"));
        }
        
        @SubscribeEvent
        public static void onPotionsRegistry(final RegistryEvent.Register<Effect> event)
        {
        	event.getRegistry().registerAll(MubbleEffects.EFFECTS.toArray(new Effect[0]));
        	LOGGER.info("Registered " + MoreWordUtils.pluralize(MubbleEffects.EFFECTS.size(), "effect"));
        }
        
        @SubscribeEvent
        public static void onBiomesRegistry(final RegistryEvent.Register<Biome> event)
        {
        	event.getRegistry().registerAll(MubbleBiomes.BIOMES.toArray(new Biome[0]));
        	MubbleBiomes.registerGenerations();
        	LOGGER.info("Registered " + MoreWordUtils.pluralize(MubbleBiomes.BIOMES.size(), "biome"));
        }
        
        @SubscribeEvent
        public static void onDimensionsRegistry(final RegistryEvent.Register<ModDimension> event)
        {
        	event.getRegistry().registerAll(MubbleDimensions.DIMENSIONS.toArray(new ModDimension[0]));
        	LOGGER.info("Registered " + MoreWordUtils.pluralize(MubbleDimensions.DIMENSIONS.size(), "dimension"));
        }
        
    	@OnlyIn(Dist.CLIENT)
    	@SubscribeEvent
        public static void blockColorsRegistry(final ColorHandlerEvent.Block event)
        {
        	MubbleColorMaps.registerBlockColors(event);
        	LOGGER.info("Registered color maps for blocks");
        }

    	@OnlyIn(Dist.CLIENT)
    	@SubscribeEvent
        public static void itemColorsRegistry(final ColorHandlerEvent.Item event)
        {
        	MubbleColorMaps.registerItemColors(event);
        	LOGGER.info("Registered color maps for items");
        }
    }
}