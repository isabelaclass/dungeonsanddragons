package org.example.races

import org.example.characters.Character
import org.example.racas.iRace

class AnaoDaColina : iRace {
    override fun applyRaceBonus(character: Character): Character {
        character.constituicao += 2;
        character.sabedoria += 1;
        return character;
    }
}