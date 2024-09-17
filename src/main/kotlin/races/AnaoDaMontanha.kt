package org.example.races

import org.example.characters.Character
import org.example.racas.iRace

class AnaoDaMontanha : iRace {
    override fun applyRaceBonus(character: Character): Character {
        character.forca += 2;
        return character;
    }
}