package org.example.races

import org.example.characters.Character
import org.example.racas.iRace

class Humano : iRace {

    override fun applyRaceBonus(character: Character): Character {

        character.forca += 1;
        character.destreza += 1;
        character.carisma += 1;
        character.constituicao += 1;
        character.sabedoria += 1;
        character.inteligencia += 1;

        return character;
    }
}