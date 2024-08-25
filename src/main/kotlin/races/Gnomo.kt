package org.example.races

import org.example.characters.iCharacter
import org.example.racas.iRace

class Gnomo : iRace {
    override fun applyRaceBonus(character: iCharacter): iCharacter {

        character.inteligencia += 2;
        return character;

    }
}