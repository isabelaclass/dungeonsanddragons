package org.example.races

import org.example.characters.iCharacter
import org.example.racas.iRace

class AnaoDaColina : iRace {
    override fun applyRaceBonus(character: iCharacter): iCharacter {
        character.constituicao += 2;
        character.sabedoria += 1;
        return character;
    }
}