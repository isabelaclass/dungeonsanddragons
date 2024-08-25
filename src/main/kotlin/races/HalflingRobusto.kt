package org.example.races

import org.example.characters.iCharacter
import org.example.racas.iRace

class HalflingRobusto : iRace {
    override fun applyRaceBonus(character: iCharacter): iCharacter {

        character.constituicao += 2;
        character.destreza += 1;
        return character;

    }
}