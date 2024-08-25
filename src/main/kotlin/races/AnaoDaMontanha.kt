package org.example.races

import org.example.characters.iCharacter
import org.example.racas.iRace

class AnaoDaMontanha : iRace {
    override fun applyRaceBonus(character: iCharacter): iCharacter {
        character.forca += 2;
        return character;
    }
}