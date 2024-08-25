package org.example.races

import org.example.characters.iCharacter
import org.example.racas.iRace

class Tiefling : iRace {
    override fun applyRaceBonus(character: iCharacter): iCharacter {
        character.carisma += 2;
        character.inteligencia += 1;
        return character;
    }
}