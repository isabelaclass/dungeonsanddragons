package org.example.races

import org.example.characters.Character
import org.example.racas.iRace

class Elfo : iRace {
    override fun applyRaceBonus(character: Character): Character {

        character.destreza += 2;
        return character;

    }
}