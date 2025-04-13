package org.arcticquests.dev.sounds;


import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import org.arcticquests.dev.MarvelSuperHeroes;

public class MarvelSoundEvents {

    private MarvelSoundEvents() {
        // private empty constructor to avoid accidental instantiation
    }
    public static final SoundEvent  EMPTY = register("empty");
    public static final SoundEvent  VIBRANIUM_SHIELD_THROW = register("item.vibranium_shield.throw");
    public static final SoundEvent  VIBRANIUM_SHIELD_HIT = register("item.vibranium_shield.hit");
    public static final SoundEvent  VIBRANIUM_SHIELD_CATCH = register("item.vibranium_shield.catch");
    public static final SoundEvent  KINETIC_BLACK_PANTHER_SUIT_UP = register("suit.kinetic_black_panther.suit_up");
    public static final SoundEvent  KINETIC_BLACK_PANTHER_SUIT_DOWN = register("suit.kinetic_black_panther.suit_down");
    public static final SoundEvent  KINETIC_BLACK_PANTHER_HELMET_UP = register("suit.kinetic_black_panther.helmet_up");
    public static final SoundEvent  KINETIC_BLACK_PANTHER_HELMET_DOWN = register("suit.kinetic_black_panther.helmet_down");
    public static final SoundEvent  WOLVERINE_CLAWS_OUT = register("suit.wolverine.claws_out");
    public static final SoundEvent  WOLVERINE_CLAWS_IN = register("suit.wolverine.claws_in");
    public static final SoundEvent  CYCLOPS_OPTIC_BLAST = register("suit.cyclops.optic_blast");
    public static final SoundEvent  CYCLOPS_OPTIC_BLAST_BIG = register("suit.cyclops.optic_blast_big");
    public static final SoundEvent  CYCLOPS_OPTIC_BLAST_EXPLOSION = register("suit.cyclops.optic_blast_explosion");
    public static final SoundEvent  SPIDER_MAN_WEB_SHOOT = register("suit.spider_man.web_shoot");
    public static final SoundEvent  SPIDER_MAN_SPIDER_SENSE = register("suit.spider_man.spider_sense");
    public static final SoundEvent  ANT_MAN_HELMET_OPEN = register("suit.ant_man.helmet_open");
    public static final SoundEvent  ANT_MAN_HELMET_CLOSE = register("suit.ant_man.helmet_close");
    public static final SoundEvent  ANT_MAN_SHRINK = register("suit.ant_man.shrink");
    public static final SoundEvent  ANT_MAN_GROW = register("suit.ant_man.grow");
    public static final SoundEvent  WASP_STING = register("suit.wasp.sting");
    public static final SoundEvent  MJOLNIR_THROW = register("item.mjolnir.throw");
    public static final SoundEvent  MJOLNIR_HIT = register("item.mjolnir.hit");
    public static final SoundEvent  MJOLNIR_HIT_SHIELD = register("item.mjolnir.hit_shield");
    public static final SoundEvent  MJOLNIR_CATCH = register("item.mjolnir.catch");
    public static final SoundEvent  STORMBREAKER_THROW = register("item.stormbreaker.throw");
    public static final SoundEvent  STORMBREAKER_HIT = register("item.stormbreaker.hit");
    public static final SoundEvent  STORMBREAKER_HIT_SHIELD = register("item.stormbreaker.hit_shield");
    public static final SoundEvent  STORMBREAKER_CATCH = register("item.stormbreaker.catch");
    public static final SoundEvent  IRON_MAN_HELMET_OPEN = register("suit.iron_man.helmet_open");
    public static final SoundEvent  IRON_MAN_HELMET_CLOSE = register("suit.iron_man.helmet_close");
    public static final SoundEvent  IRON_MAN_REPULSOR_CHARGE = register("suit.iron_man.repulsor_charge");
    public static final SoundEvent  IRON_MAN_UNIBEAM_CHARGE = register("suit.iron_man.unibeam_charge");
    public static final SoundEvent  IRON_MAN_REPULSOR_SHOOT = register("suit.iron_man.repulsor_shoot");
    public static final SoundEvent  IRON_MAN_UNIBEAM_SHOOT = register("suit.iron_man.unibeam_shoot");
    public static final SoundEvent  IRON_MAN_INVISIBLE = register("suit.iron_man.invisible");
    public static final SoundEvent  IRON_MAN_VISIBLE = register("suit.iron_man.visible");
    public static final SoundEvent  IRON_MAN_MARK_5_SUITCASE_USE = register("item.iron_man_mark_5_suitcase.use");
    public static final SoundEvent  QUICKSILVER_SONIC_BOOM = register("suit.quicksilver.sonic_boom");
    public static final SoundEvent  CAPTAIN_MARVEL_PHOTON_BLAST = register("suit.captain_marvel.photon_blast");
    public static final SoundEvent  CAPTAIN_MARVEL_PHOTON_BLAST_LOOP = register("suit.captain_marvel.photon_blast_loop");
    public static final SoundEvent  TESSERACT_CROSSBOW_HIT = register("item.tesseract_crossbow.hit");
    public static final SoundEvent  TESSERACT_CROSSBOW_LOADING_END = register("item.tesseract_crossbow.loading_end");
    public static final SoundEvent  TESSERACT_CROSSBOW_LOADING_MIDDLE = register("item.tesseract_crossbow.loading_middle");
    public static final SoundEvent  TESSERACT_CROSSBOW_LOADING_START = register("item.tesseract_crossbow.loading_start");
    public static final SoundEvent  TESSERACT_CROSSBOW_SHOOT = register("item.tesseract_crossbow.shoot");
    public static final SoundEvent  WINTER_SOLDIER_TARGET = register("entity.winter_soldier.target");
    public static final SoundEvent  TESSERACT_TELEPORT = register("item.tesseract.teleport");
    public static final SoundEvent  SPACE_STONE_TELEPORT = register("item.space_stone.teleport");
    public static final SoundEvent  RED_SKULL_SHOOT = register("entity.red_skull.shoot");
    public static final SoundEvent  RED_SKULL_HIT = register("entity.red_skull.hit");

    private static SoundEvent register(String id) {
        Identifier identifier = Identifier.of(MarvelSuperHeroes.MOD_ID, id);
        return Registry.register(Registries.SOUND_EVENT, identifier, SoundEvent.of(identifier));
    }

    public static void registerSounds(){
        MarvelSuperHeroes.LOGGER.info("Registering Marvel Sounds for" + MarvelSuperHeroes.MOD_ID);


    }
}