package org.arcticquests.dev.world.damagesources;

import net.minecraft.entity.damage.DamageType;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import org.arcticquests.dev.MarvelSuperHeroes;

public class MarvelDamageTypes {

    public interface MarvelDamageType {

        RegistryKey<DamageType> KINETIC_BLAST = create("kinetic_blast");
        RegistryKey<DamageType> VIBRANIUM_SHIELD = create("vibranium_shield");
        RegistryKey<DamageType> VIBRANIUM_SHIELD_DISPENSER = create("vibranium_shield_dispenser");
        RegistryKey<DamageType> OPTIC_BLAST = create("optic_blast");
        RegistryKey<DamageType> OPTIC_BLAST_GOOFY = create("optic_blast_goofy");
        RegistryKey<DamageType> WEB_SHOT = create("web_shot");
        RegistryKey<DamageType> GIANT_MAN = create("giant_man");
        RegistryKey<DamageType> MJOLNIR = create("mjolnir");
        RegistryKey<DamageType> MJOLNIR_DISPENSER = create("mjolnir_dispenser");
        RegistryKey<DamageType> STORMBREAKER = create("stormbreaker");
        RegistryKey<DamageType> STORMBREAKER_DISPENSER = create("stormbreaker_dispenser");
        RegistryKey<DamageType> FLAMETHROWER = create("flamethrower");
        RegistryKey<DamageType> QUICKSILVER_ATTACK = create("quicksilver_attack");
        RegistryKey<DamageType> PHOTON_BLAST = create("photon_blast");
        RegistryKey<DamageType> TESSERACT_ARROW = create("tesseract_arrow");
        RegistryKey<DamageType> TESSERACT_FIREWORKS = create("tesseract_fireworks");

        static RegistryKey<DamageType> create(String id){
            return RegistryKey.of(RegistryKeys.DAMAGE_TYPE,Identifier.of(MarvelSuperHeroes.MOD_ID,id));
        }

    }

    public interface DamageTypeTags {

        //TagKey<DamageType> MARVEL_DAMAGE_TYPE = of("test_damage_type");
        TagKey<DamageType> KINETIC_BLAST = of("kinetic_blast");
        TagKey<DamageType> VIBRANIUM_SHIELD = of("vibranium_shield");
        TagKey<DamageType> VIBRANIUM_SHIELD_DISPENSER = of("vibranium_shield_dispenser");
        TagKey<DamageType> OPTIC_BLAST = of("optic_blast");
        TagKey<DamageType> OPTIC_BLAST_GOOFY = of("optic_blast_goofy");
        TagKey<DamageType> WEB_SHOT = of("web_shot");
        TagKey<DamageType> GIANT_MAN = of("giant_man");
        TagKey<DamageType> MJOLNIR = of("mjolnir");
        TagKey<DamageType> MJOLNIR_DISPENSER = of("mjolnir_dispenser");
        TagKey<DamageType> STORMBREAKER = of("stormbreaker");
        TagKey<DamageType> STORMBREAKER_DISPENSER = of("stormbreaker_dispenser");
        TagKey<DamageType> FLAMETHROWER = of("flamethrower");
        TagKey<DamageType> QUICKSILVER_ATTACK = of("quicksilver_attack");
        TagKey<DamageType> PHOTON_BLAST = of("photon_blast");
        TagKey<DamageType> TESSERACT_ARROW = of("tesseract_arrow");
        TagKey<DamageType> TESSERACT_FIREWORKS = of("tesseract_fireworks");

        static TagKey<DamageType> of(String id) {
            return TagKey.of(RegistryKeys.DAMAGE_TYPE, Identifier.of(MarvelSuperHeroes.MOD_ID, id));
        }
    }
}