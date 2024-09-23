package org.example.characters

import org.example.attributes.ChooseAttributes
import org.example.racas.iRace
import org.example.races.*

class Character()
{
    var name : String = "";
    var forca: Int = 8;
    var destreza: Int = 8;
    var constituicao: Int = 8;
    var inteligencia: Int = 8;
    var sabedoria: Int = 8;
    var carisma: Int = 8;
    var pontosVida: Int = 10;
    var race: iRace? = null;
    var chooseAttributes = ChooseAttributes();

    fun init(name: String, race: String) {

        this.name = name;
        this.race = this.chooseRace(race);
        this.chooseAttributes.chooseAttribute(this);
        this.race?.applyRaceBonus(this);
    }

    private fun chooseRace(race: String): iRace {

        val iRace: iRace = when (race) {

            "AnaoDaMontanha" -> AnaoDaMontanha();
            "Humano" -> Humano();
            "Draconato" -> Draconato();
            "MeioOrc" -> MeioOrc();
            "Elfo" -> Elfo();
            "Halfling" -> Halfling();
            "GnomoDaFloresta" -> GnomoDaFloresta();
            "Anao" -> Anao();
            "HalflingRobusto" -> HalflingRobusto();
            "GnomoDasRochas" -> GnomoDasRochas();
            "AltoElfo" -> AltoElfo();
            "Gnomo" -> Gnomo();
            "Tiefling" -> Tiefling();
            "AnaoDaColina" -> AnaoDaColina();
            "ElfoDaFloresta" -> ElfoDaForesta();
            "MeioElfo" -> MeioElfo();
            "Drow" -> Drow();
            "HalflingPesLeves" -> HalfingPesLeves();
            else -> throw IllegalArgumentException("Option unavailable");
        }
        return iRace;
    }
}
