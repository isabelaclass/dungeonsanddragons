package org.example.races

import org.example.characters.iCharacter
import org.example.racas.iRace

class Anao : iRace {
    override fun applyRaceBonus(character: iCharacter): iCharacter {

        character.constituicao += 2;
        return character;

    }
}