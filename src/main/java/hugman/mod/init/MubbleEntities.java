package hugman.mod.init;

import hugman.mod.Mubble;
import hugman.mod.objects.entity.ChinchoEntity;
import hugman.mod.objects.entity.CustomTNTEntity;
import hugman.mod.objects.entity.FlyingBlockEntity;
import hugman.mod.objects.entity.GoombaEntity;
import hugman.mod.objects.entity.ToadEntity;
import hugman.mod.objects.entity.ZombieCowmanEntity;
import hugman.mod.objects.entity.render.ChinchoRender;
import hugman.mod.objects.entity.render.CustomTNTRender;
import hugman.mod.objects.entity.render.FlyingBlockRender;
import hugman.mod.objects.entity.render.GoombaRender;
import hugman.mod.objects.entity.render.ToadRender;
import hugman.mod.objects.entity.render.ZombieCowmanRender;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.registries.IForgeRegistry;

public class MubbleEntities
{
	public static final EntityType<ChinchoEntity> CHINCHO = register("chincho", EntityType.Builder.create(ChinchoEntity::new, EntityClassification.MONSTER).size(0.6F, 1.2F));
	public static final EntityType<GoombaEntity> GOOMBA = register("goomba", EntityType.Builder.create(GoombaEntity::new, EntityClassification.MONSTER).size(0.75F, 0.85F));
	public static final EntityType<ToadEntity> TOAD = register("toad", EntityType.Builder.create(ToadEntity::new, EntityClassification.CREATURE).size(0.6F, 1.4F));
	public static final EntityType<ZombieCowmanEntity> ZOMBIE_COWMAN = register("zombie_cowman", EntityType.Builder.create(ZombieCowmanEntity::new, EntityClassification.MONSTER).size(0.6F, 1.95F));

	public static final EntityType<CustomTNTEntity> CUSTOM_TNT = register("custom_tnt", EntityType.Builder.<CustomTNTEntity>create(CustomTNTEntity::new, EntityClassification.MISC).immuneToFire().size(0.98F, 0.98F).setTrackingRange(128).setUpdateInterval(1));
	public static final EntityType<FlyingBlockEntity> FLYING_BLOCK = register("flying_block", EntityType.Builder.<FlyingBlockEntity>create(FlyingBlockEntity::new, EntityClassification.MISC).size(0.98F, 0.98F).setTrackingRange(128).setUpdateInterval(1));
	
	public static <T extends Entity> EntityType<T> register(String id, EntityType.Builder<T> builder)
	{
	    EntityType<T> entitytype = builder.build(Mubble.MOD_PREFIX + id);
	    entitytype.setRegistryName(Mubble.MOD_ID, id);
		return entitytype;
	}
	
    public static void registerEntities(IForgeRegistry<EntityType<?>> registry)
    {
    	registry.register(CHINCHO);
    	registry.register(TOAD);
    	registry.register(GOOMBA);
    	registry.register(ZOMBIE_COWMAN);

    	registry.register(CUSTOM_TNT);
    	registry.register(FLYING_BLOCK);
    }
    
    public static void registerRenders()
    {
    	RenderingRegistry.registerEntityRenderingHandler(ChinchoEntity.class, ChinchoRender::new);
    	RenderingRegistry.registerEntityRenderingHandler(GoombaEntity.class, GoombaRender::new);
    	RenderingRegistry.registerEntityRenderingHandler(ToadEntity.class, ToadRender::new);
    	RenderingRegistry.registerEntityRenderingHandler(ZombieCowmanEntity.class, ZombieCowmanRender::new);

    	RenderingRegistry.registerEntityRenderingHandler(CustomTNTEntity.class, CustomTNTRender::new);
    	RenderingRegistry.registerEntityRenderingHandler(FlyingBlockEntity.class, FlyingBlockRender::new);
    }
}