package org.example.races

import org.example.characters.Character
import org.example.racas.iRace

class Tiefling : iRace {
    override fun applyRaceBonus(character: Character): Character {
        character.carisma += 2;
        character.inteligencia += 1;
        return character;
    }
}