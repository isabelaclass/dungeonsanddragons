package org.example.races

import org.example.characters.iCharacter
import org.example.racas.iRace

class GnomoDasRochas : iRace {

    override fun applyRaceBonus(character: iCharacter): iCharacter {

        character.inteligencia += 2;
        character.constituicao += 1;
        return character;

    }
}