package org.example.attributes

import org.example.characters.Character
import org.example.messages.Messages

class ChooseAttributes {

    var messages: Messages = Messages();

    fun chooseAttribute(character: Character) : Character {
        this.pointsDistribution(character);
        return character;
}
    private fun pointsDistribution(character: Character) {

        this.selectAttribute(character);
    }

    private fun selectAttribute(character: Character) {
        var playerPoints : Int = 27;

        val attributes = listOf(
            "Força",
            "Destreza",
            "Constituição",
            "Inteligência",
            "Sabedoria",
            "Carisma"
        );

        for ((index, attribute) in attributes.withIndex()) {
            println("${index + 1}. $attribute")
        }

        do {

            println(messages.showAttributeSelection());
            var attributeChoice = readlnOrNull()?.toIntOrNull() ?: 0;

            when (attributeChoice) {
                1 -> {
                    var simulateValue : Int = 0;

                    if(character.forca < 15) {

                        println(messages.showHowMuchPoints());
                        var points = readlnOrNull()?.toIntOrNull() ?: 0;

                        if (points <= 15) {
                            var pointsValues = this.numberOfPoints(points, character.forca);
                            simulateValue = playerPoints - pointsValues;
                            if(simulateValue >= 0) {
                                character.forca = points;
                                playerPoints -= pointsValues;
                                println("Your points = $playerPoints and character força = ${character.forca}");
                            } else {
                                println("No enough points to allocate");
                            }
                        } else {
                            println(messages.showCantSumPoints());
                        }
                    }
                    else
                    {
                        println(messages.showCantSumPoints());
                    }
                }

                2 -> {
                    var simulateValue : Int = 0;

                    if(character.destreza < 15) {

                        println(messages.showHowMuchPoints());
                        var points = readlnOrNull()?.toIntOrNull() ?: 0;

                        if (points <= 15) {
                            var pointsValues = this.numberOfPoints(points, character.destreza);
                            simulateValue = playerPoints - pointsValues;
                            if(simulateValue >= 0) {
                                character.destreza = points;
                                playerPoints -= pointsValues;
                                println("Your points = $playerPoints and character destreza = ${character.destreza}");
                            } else {
                                println("No enough points to allocate");
                            }
                        } else {
                            println(messages.showCantSumPoints());
                        }
                    }
                    else
                    {
                        println(messages.showCantSumPoints());
                    }
                }

                3 -> {
                    var simulateValue : Int = 0;

                    if(character.constituicao < 15) {

                        println(messages.showHowMuchPoints());
                        var points = readlnOrNull()?.toIntOrNull() ?: 0;

                        if (points <= 15) {
                            var pointsValues = this.numberOfPoints(points, character.constituicao);
                            simulateValue = playerPoints - pointsValues;
                            if(simulateValue >= 0) {
                                character.constituicao = points;
                                playerPoints -= pointsValues;
                                println("Your points = $playerPoints and character constituição = ${character.constituicao}");
                            } else {
                                println("No enough points to allocate");
                            }
                        } else {
                            println(messages.showCantSumPoints());
                        }
                    }
                    else
                    {
                        println(messages.showCantSumPoints());
                    }
                }

                4 -> {
                    var simulateValue : Int = 0;

                    if(character.inteligencia < 15) {

                        println(messages.showHowMuchPoints());
                        var points = readlnOrNull()?.toIntOrNull() ?: 0;

                        if (points <= 15) {
                            var pointsValues = this.numberOfPoints(points, character.inteligencia);
                            simulateValue = playerPoints - pointsValues;
                            if(simulateValue >= 0) {
                                character.inteligencia = points;
                                playerPoints -= pointsValues;
                                println("Your points = $playerPoints and character inteligência = ${character.inteligencia}");
                            } else {
                                println("No enough points to allocate");
                            }
                        } else {
                            println(messages.showCantSumPoints());
                        }
                    }
                    else
                    {
                        println(messages.showCantSumPoints());
                    }
                }

                5 -> {
                    var simulateValue : Int = 0;

                    if(character.sabedoria < 15) {

                        println(messages.showHowMuchPoints());
                        var points = readlnOrNull()?.toIntOrNull() ?: 0;

                        if (points <= 15) {
                            var pointsValues = this.numberOfPoints(points, character.sabedoria);
                            simulateValue = playerPoints - pointsValues;
                            if(simulateValue >= 0) {
                                character.sabedoria = points;
                                playerPoints -= pointsValues;
                                println("Your points = $playerPoints and character sabedoria = ${character.sabedoria}");
                            } else {
                                println("No enough points to allocate");
                            }
                        } else {
                            println(messages.showCantSumPoints());
                        }
                    }
                    else
                    {
                        println(messages.showCantSumPoints());
                    }
                }

                6 -> {
                    var simulateValue : Int = 0;

                    if(character.carisma < 15) {

                        println(messages.showHowMuchPoints());
                        var points = readlnOrNull()?.toIntOrNull() ?: 0;

                        if (points <= 15) {
                            var pointsValues = this.numberOfPoints(points, character.carisma);
                            simulateValue = playerPoints - pointsValues;
                            if(simulateValue >= 0) {
                                character.carisma = points;
                                playerPoints -= pointsValues;
                                println("Your points = $playerPoints and character carisma = ${character.carisma}");
                            } else {
                                println("No enough points to allocate");
                            }
                        } else {
                            println(messages.showCantSumPoints());
                        }
                    }
                    else
                    {
                        println(messages.showCantSumPoints());
                    }
                }

                else -> {
                    println(messages.showOptionUnavailable());
                }
            }

            if (playerPoints <= 0) {
                println("No more points to allocate. Exiting the loop.");
                break;
            }

        } while (true);
    }

    fun numberOfPoints(attributePoints : Int, previousAttributePoints : Int) : Int {

        var valuePlayerPoints: Int = 0;

        val valuesMap = mapOf (
            8 to 0,
            9 to 1,
            10 to 2,
            11 to 3,
            12 to 4,
            13 to 5,
            14 to 7,
            15 to 9
        );

        valuePlayerPoints = valuesMap[attributePoints]!! - valuesMap[previousAttributePoints]!!;

        return valuePlayerPoints;
    }

    fun applyModifier(character: Character) : Character {

        var modifierPoints: Int = 0;

        val valuesMap = mapOf (
            1 to -5,
            2 to -4,
            3 to -4,
            4 to -3,
            5 to -3,
            6 to -2,
            7 to -2,
            8 to -1,
            9 to -1,
            10 to 0,
            11 to 0,
            12 to 1,
            13 to 1,
            14 to 2,
            15 to 2,
            16 to 3,
            17 to 3,
            18 to 4,
            19 to 4,
            20 to 5,
            21 to 5,
            22 to 6,
            23 to 6,
            24 to 7,
            25 to 7,
            26 to 8,
            27 to 8,
            28 to 9,
            29 to 9,
            30 to 10,
        );

        modifierPoints =  valuesMap[character.constituicao]!!;

        character.pontosVida += modifierPoints;

        return character;
    }
}