package org.example.characters

import org.example.attributes.ChooseAttributes
import org.example.racas.iRace
import org.example.messages.Messages
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
    var chooseAttributes: ChooseAttributes? = null;
    //var classCharacter: iClassCharacter? = null;


    fun init() {

        var chooseAttributes = ChooseAttributes();
        this.name = this.chooseName();
        this.race = this.chooseRace();
        this.chooseAttributes = chooseAttributes;
        this.chooseAttributes?.chooseAttribute(this);
        this.race?.applyRaceBonus(this);
    }

    private fun chooseName() : String {
        println("Choose your character name: ");
        val name = readlnOrNull() ?: "" ;
        return name;
    }

    private fun chooseRace(): iRace {
        
        var messages: Messages = Messages();

        val races = listOf(
            "Anão da Montanha",
            "Humano",
            "Draconato",
            "Meio-Orc",
            "Elfo",
            "Halfling",
            "Gnomo da Floresta",
            "Anão",
            "Halfling Robusto",
            "Gnomo das Rochas",
            "Alto Elfo",
            "Gnomo",
            "Tiefling",
            "Anão da Colina",
            "Elfo da Floresta",
            "Meio-Elfo",
            "Drow",
            "Halfling Pés-Leves"
        )

        for ((index, race) in races.withIndex()) {
            println("${index + 1}. $race")
        }

        print("Please choose a race: ");
        val raceChoice = readlnOrNull()?.toIntOrNull() ?: 0;

        val iRace: iRace = when (raceChoice) {

            1 -> AnaoDaMontanha();
            2 -> Humano();
            3 -> Draconato();
            4 -> MeioOrc();
            5 -> Elfo();
            6 -> Halfling();
            7 -> GnomoDaFloresta();
            8 -> Anao();
            9 -> HalflingRobusto();
            10 -> GnomoDasRochas();
            11 -> AltoElfo();
            12 -> Gnomo();
            13 -> Tiefling();
            14 -> AnaoDaColina();
            15 -> ElfoDaForesta();
            16 -> MeioElfo();
            17 -> Drow();
            18 -> HalfingPesLeves();
            else -> throw IllegalArgumentException(messages.showOptionUnavailable());
        }
        return iRace;
    }
}
