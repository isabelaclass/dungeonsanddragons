package org.example.races

import org.example.characters.iCharacter
import org.example.racas.iRace

class Halfling : iRace {
    override fun applyRaceBonus(character: iCharacter): iCharacter {
        character.destreza += 2;
        return character;
    }
}