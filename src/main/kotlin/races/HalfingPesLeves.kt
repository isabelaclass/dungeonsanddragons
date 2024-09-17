package org.example.races

import org.example.characters.Character
import org.example.racas.iRace

class HalfingPesLeves : iRace {
    override fun applyRaceBonus(character: Character): Character {

        character.destreza += 2;
        character.carisma += 1;
        return character;

    }
}