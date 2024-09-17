package org.example.races

import org.example.characters.Character
import org.example.racas.iRace

class Anao : iRace {
    override fun applyRaceBonus(character: Character): Character {

        character.constituicao += 2;
        return character;

    }
}