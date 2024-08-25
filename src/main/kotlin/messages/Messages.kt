package org.example.messages

import com.sun.org.apache.bcel.internal.classfile.Unknown
import org.example.characters.iCharacter

class Messages {

    fun showInitialMessage() : String {
        return ("Welcome to the Dungeons and Dragons! Would like to play?");
    }

    fun showCreateCharacter() : String {
        return ("1 - Create Character");
    }

    fun showExitOption() : String {
        return ("2 - Exit");
    }

    fun showAfterCreateCharacter() : String {
        return ("Would you like to create another character?");
    }

    fun showYesOrNo() : String {
        return ("1 - Yes or 2 - No");
    }

    fun showChooseAnOption() : String {
        return ("Please choose an option: ");
    }

    fun showChooseToLeave() : String {
        return ("You choose to leave.");
    }

    fun showOptionUnavailable() : String {
        return ("Option unaveilable");
    }

    fun showExitConfirmation() : String {
        return ("Do you want to leave?");
    }

    fun showAttributeSelection() : String {
        return ("Choose one attribute: ");
    }

    fun showHowMuchPoints() : String {
        return ("How much points do you want to apply?");
    }

    fun showCantSumPoints() : String {
        return ("The limit to these attribute is 15 points");
    }

    fun showCharacterCharacteristics(character : iCharacter) {

        println("Character created successfully with the following attributes:")
        println("Name:  ${character.name}")
        println("Strength: ${character.forca}")
        println("Dexterity: ${character.destreza}")
        println("Constitution: ${character.constituicao}")
        println("Intelligence: ${character.inteligencia}")
        println("Wisdom: ${character.sabedoria}")
        println("Charisma: ${character.carisma}")
        println("Hit Points: ${character.pontosVida}")

        val raceName = if (character.race != null) {
            character.race!!::class.simpleName
        } else {
            "Unknown"
        }

        println("Race: $raceName");

//        val className = if (character.classCharacter != null) {
//            character.classCharacter!!::class.simpleName
//        } else {
//            "Unknown"
//        }
//
//        println("Class: $className")

    }
}