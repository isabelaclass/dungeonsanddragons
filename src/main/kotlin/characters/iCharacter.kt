package org.example.characters

import org.example.racas.iRace
import org.example.classes.iClassCharacter

class iCharacter()
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
    //var classCharacter: iClassCharacter? = null;

    fun initRace(race: iRace){
        this.race = race;
    }

}
