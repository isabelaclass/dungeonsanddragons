package org.example.racas

import org.example.characters.iCharacter

interface iRace {
    fun applyRaceBonus(iCharacter: iCharacter): iCharacter;
}
