package org.example.races

import org.example.characters.iCharacter
import org.example.racas.iRace

class Draconato : iRace {

    override fun applyRaceBonus(character: iCharacter): iCharacter {

        character.forca += 2;
        character.carisma += 1;
        return character;

    }
}