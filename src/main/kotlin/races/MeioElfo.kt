package org.example.races

import org.example.characters.iCharacter
import org.example.racas.iRace

class MeioElfo : iRace {
    override fun applyRaceBonus(character: iCharacter): iCharacter {
        character.carisma += 2;
        return character;
    }
}