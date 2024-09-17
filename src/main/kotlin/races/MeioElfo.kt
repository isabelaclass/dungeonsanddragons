package org.example.races

import org.example.characters.Character
import org.example.racas.iRace

class MeioElfo : iRace {
    override fun applyRaceBonus(character: Character): Character {
        character.carisma += 2;
        return character;
    }
}