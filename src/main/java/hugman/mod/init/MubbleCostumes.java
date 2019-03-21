package hugman.mod.init;

import java.util.ArrayList;
import java.util.List;

import hugman.mod.objects.costume.CostumeEffect;
import hugman.mod.objects.costume.CostumeGooigiCap;
import hugman.mod.objects.costume.CostumeMayroCap;
import hugman.mod.objects.costume.CostumePrincessPeachCrown;
import hugman.mod.objects.costume.CostumeSimple;
import hugman.mod.objects.costume.CostumeVanishCap;
import hugman.mod.objects.costume.CostumeWingCap;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.potion.PotionEffect;

public class MubbleCostumes
{
	public static final List<Item> COSTUMES = new ArrayList<Item>();
	
	public static final Item HEADPHONES = new CostumeSimple("headphones", SoundEvents.ITEM_ARMOR_EQUIP_IRON, EntityEquipmentSlot.HEAD);
	public static final Item CHRISTMAS_HAT = new CostumeSimple("christmas_hat", SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, EntityEquipmentSlot.HEAD);

	public static final Item CAPPY = new CostumeSimple("cappy", SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, EntityEquipmentSlot.HEAD);
	public static final Item LUIGI_CAP = new CostumeEffect("luigi_cap", SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, EntityEquipmentSlot.HEAD, new PotionEffect(MobEffects.JUMP_BOOST, 1, 0), new PotionEffect(MobEffects.SPEED, 1, 0));
	public static final Item WARIO_CAP = new CostumeEffect("wario_cap", SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, EntityEquipmentSlot.HEAD, new PotionEffect(MobEffects.SLOWNESS, 1, 0), new PotionEffect(MobEffects.STRENGTH, 1, 0));
	public static final Item WALUIGI_CAP = new CostumeEffect("waluigi_cap", SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, EntityEquipmentSlot.HEAD, new PotionEffect(MobEffects.JUMP_BOOST, 2, 0));
	public static final Item VANISH_CAP = new CostumeVanishCap();
	public static final Item WING_CAP = new CostumeWingCap();
	public static final Item GOOIGI_CAP = new CostumeGooigiCap();
	public static final Item PRINCESS_PEACH_CROWN = new CostumePrincessPeachCrown();
	public static final Item PRINCESS_DAISY_CROWN = new CostumeSimple("princess_daisy_crown", SoundEvents.ITEM_ARMOR_EQUIP_IRON, EntityEquipmentSlot.HEAD);
	public static final Item ROSALINA_CROWN = new CostumeSimple("rosalina_crown", SoundEvents.ITEM_ARMOR_EQUIP_IRON, EntityEquipmentSlot.HEAD);
	public static final Item PINK_GOLD_PEACH_CROWN = new CostumeSimple("pink_gold_peach_crown", SoundEvents.ITEM_ARMOR_EQUIP_IRON, EntityEquipmentSlot.HEAD);
	public static final Item SUPER_CROWN = new CostumeSimple("super_crown", SoundEvents.ITEM_ARMOR_EQUIP_IRON, EntityEquipmentSlot.HEAD);
	public static final Item BROQUE_MONSIEUR_HEAD = new CostumeSimple("broque_monsieur_head", SoundEvents.ITEM_ARMOR_EQUIP_IRON, EntityEquipmentSlot.HEAD);
	
	public static final Item BANDANA = new CostumeSimple("bandana", SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, EntityEquipmentSlot.HEAD);
	
	public static final Item SNORLAX_HAT = new CostumeSimple("snorlax_hat", SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, EntityEquipmentSlot.HEAD);
	
	public static final Item TOP_HAT = new CostumeSimple("top_hat", SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, EntityEquipmentSlot.HEAD);
	
	public static final Item RALSEI_HAT = new CostumeSimple("ralsei_hat", SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, EntityEquipmentSlot.HEAD);
	public static final Item KING_ROUND_MASK = new CostumeSimple("king_round_mask", SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, EntityEquipmentSlot.HEAD);
	
	public static final Item BALDI_HEAD = new CostumeSimple("baldi_head", SoundEvents.ENTITY_PARROT_IMITATE_VEX, EntityEquipmentSlot.HEAD);

	public static final Item MAYRO_CAP = new CostumeMayroCap();
	public static final Item NOTEBLOCK_HEAD = new CostumeSimple("noteblock_head", SoundEvents.ITEM_ARMOR_EQUIP_IRON, EntityEquipmentSlot.HEAD);
	
	
    public static void register(Item item)
    {
    	COSTUMES.add(item);
    }
}
