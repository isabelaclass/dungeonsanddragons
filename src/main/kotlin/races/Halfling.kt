package org.example.races

import org.example.characters.Character
import org.example.racas.iRace

class Halfling : iRace {
    override fun applyRaceBonus(character: Character): Character {
        character.destreza += 2;
        return character;
    }
}