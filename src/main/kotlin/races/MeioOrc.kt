package org.example.races

import org.example.characters.Character
import org.example.racas.iRace

class MeioOrc : iRace {
    override fun applyRaceBonus(character: Character): Character {
        character.forca += 2;
        character.constituicao += 1;

        return character;
    }
}