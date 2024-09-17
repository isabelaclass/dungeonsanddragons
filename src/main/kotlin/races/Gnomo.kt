package org.example.races

import org.example.characters.Character
import org.example.racas.iRace

class Gnomo : iRace {
    override fun applyRaceBonus(character: Character): Character {

        character.inteligencia += 2;
        return character;

    }
}