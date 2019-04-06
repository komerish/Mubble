package hugman.mod.init;

import java.util.ArrayList;
import java.util.List;

import hugman.mod.Mubble;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;

public class MubbleSounds 
{	
	public static final List<SoundEvent> SOUNDS = new ArrayList<SoundEvent>();
	
	public static final SoundEvent BLOCK_BRICK_BLOCK_BREAK = register("block.brick_block.break");
	public static final SoundEvent BLOCK_EMPTY_BLOCK_HIT = register("block.empty_block.hit");
	public static final SoundEvent BLOCK_NOTE_BLOCK_JUMP_LOW = register("block.note_block.jump.low");
	public static final SoundEvent BLOCK_NOTE_BLOCK_JUMP_HIGH = register("block.note_block.jump.high");
	public static final SoundEvent BLOCK_QUESTION_BLOCK_LOOT_POWER_UP = register("block.question_block.loot.power_up");
	public static final SoundEvent BLOCK_QUESTION_BLOCK_LOOT_COIN = register("block.question_block.loot.coin");
	public static final SoundEvent BLOCK_SPACE_JAM_BREAK = register("block.space_jam.break");
	public static final SoundEvent BLOCK_SPACE_JAM_FALL = register("block.space_jam.fall");
	public static final SoundEvent BLOCK_SPACE_JAM_PLACE = register("block.space_jam.place");
	public static final SoundEvent BLOCK_SPACE_JAM_HIT = register("block.space_jam.hit");
	public static final SoundEvent BLOCK_SPACE_JAM_STEP = register("block.space_jam.step");
	public static final SoundEvent BLOCK_SPRING_TRIGGER = register("block.spring.trigger");
	public static final SoundEvent BLOCK_ULTIMATUM_PORTAL_AMBIENT = register("block.ultimatum_portal.ambient");

	public static final SoundEvent ITEM_ANNOYING_DOG_DISAPPEAR = register("item.annoying_dog.disappear");
	public static final SoundEvent ITEM_ANNOYING_DOG_BARK = register("item.annoying_dog.bark");
	public static final SoundEvent ITEM_CAPE_FEATHER_USE = register("item.cape_feather.use");
	public static final SoundEvent ITEM_SMASH_BALL_USE = register("item.smash_ball.use");
	public static final SoundEvent ITEM_SUPER_MUSHROOM_CONSUME = register("item.super_mushroom.consume");
	public static final SoundEvent ITEM_SUPER_STAR_THEME = register("item.super_star.theme");
	
	public static final SoundEvent COSTUME_CAPPY_AMBIENT = register("costume.cappy.ambient");
	public static final SoundEvent COSTUME_CAPPY_AMBIENT_NETHER = register("costume.cappy.ambient.nether");
	public static final SoundEvent COSTUME_CAPPY_EQUIP = register("costume.cappy.equip");
	public static final SoundEvent COSTUME_CAPPY_HAPPY = register("costume.cappy.happy");
	public static final SoundEvent COSTUME_CAPPY_HELP = register("costume.cappy.help");
	public static final SoundEvent COSTUME_CAPPY_HELP_WATER = register("costume.cappy.help.water");

	public static final SoundEvent ENTITY_CHINCHO_AMBIENT = register("entity.chincho.ambient");
	public static final SoundEvent ENTITY_CHINCHO_HURT = register("entity.chincho.hurt");
	public static final SoundEvent ENTITY_CHINCHO_DEATH = register("entity.chincho.death");
	public static final SoundEvent ENTITY_TOAD_AMBIENT = register("entity.toad.ambient");
	public static final SoundEvent ENTITY_TOAD_HURT = register("entity.toad.hurt");
	public static final SoundEvent ENTITY_TOAD_DEATH = register("entity.toad.death");
	
	public static final SoundEvent MUSIC_DISC_BATTLEFIELD = register("music_disc.battlefield");
	public static final SoundEvent MUSIC_DISC_CHAMPIONS_ROAD = register("music_disc.champions_road");
	public static final SoundEvent MUSIC_DISC_CONFRONTING_MYSELF = register("music_disc.confronting_myself");
	public static final SoundEvent MUSIC_DISC_ELECTROPLANKTON_MELDEY = register("music_disc.electroplankton_medley");
	public static final SoundEvent MUSIC_DISC_FIELDS_OF_HOPES_AND_DREAMS = register("music_disc.fields_of_hopes_and_dreams");
	public static final SoundEvent MUSIC_DISC_KASS_THEME = register("music_disc.kass_theme");
	public static final SoundEvent MUSIC_DISC_LOST_PAINTING = register("music_disc.lost_painting");
	public static final SoundEvent MUSIC_DISC_MAD_MEW_MEW = register("music_disc.mad_mew_mew");
	public static final SoundEvent MUSIC_DISC_MEGALOVANIA = register("music_disc.megalovania");
	public static final SoundEvent MUSIC_DISC_POPPLE_BATTLE = register("music_disc.popple_battle");
	public static final SoundEvent MUSIC_DISC_REFLECTION = register("music_disc.reflection");
	public static final SoundEvent MUSIC_DISC_RUDE_BUSTER = register("music_disc.rude_buster");
	public static final SoundEvent MUSIC_DISC_SHARK_BYTES = register("music_disc.shark_bytes");
	public static final SoundEvent MUSIC_DISC_SOUND_STAGE = register("music_disc.sound_stage");
	public static final SoundEvent MUSIC_DISC_STUDIOPOLIS_ACT1 = register("music_disc.studiopolis_act1");
	public static final SoundEvent MUSIC_DISC_THE_GRAND_FINALE = register("music_disc.the_grand_finale");
	public static final SoundEvent MUSIC_DISC_TYPE_A = register("music_disc.type_a");
	public static final SoundEvent MUSIC_DISC_VAMPIRE_KILLER = register("music_disc.vampire_killer");
	public static final SoundEvent MUSIC_DISC_VS_CHAMPION_RED_AND_BLUE = register("music_disc.vs_champion_red_and_blue");
	public static final SoundEvent REMIX_DISC_NB_BEWARE_THE_FOREST_MUSHROOMS = register("remix_disc.nb.beware_the_forest_mushrooms");
	public static final SoundEvent REMIX_DISC_NB_BUOY_BASE_GALAXY = register("remix_disc.nb.buoy_base_galaxy");
	public static final SoundEvent REMIX_DISC_NB_FLY_OCTO_FLY = register("remix_disc.nb.fly_octo_fly");
	public static final SoundEvent REMIX_DISC_NB_HARVEST_HAZARDS = register("remix_disc.nb.harvest_hazards");
	public static final SoundEvent REMIX_DISC_NB_SWEDEN = register("remix_disc.nb.sweden");
	public static final SoundEvent REMIX_DISC_NB_WALUIGI_PINBALL = register("remix_disc.nb.waluigi_pinball");
	
	public static SoundEvent register(String name)
	{
		ResourceLocation path = new ResourceLocation(Mubble.MOD_ID, name);
		SoundEvent sound = new SoundEvent(path).setRegistryName(path);
		SOUNDS.add(sound);
		return sound;
	}
}