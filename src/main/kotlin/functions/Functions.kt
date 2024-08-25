package org.example.functions

import org.example.characters.iCharacter
import org.example.messages.Messages
import org.example.racas.iRace
import org.example.races.*

class Functions {

    var messages: Messages = Messages();

    fun createCharacter() {

        var character = iCharacter();
        var race: iRace? = null;

        try {

            race = this.chooseRace();

        } catch (e: Exception) {
            println(e.message);

        }

        if (race != null) {
            character.initRace(race)
        };

        this.chooseName(character);
        this.pointsDistribution(character);
        race?.applyRaceBonus(character);
        this.applyModifier(character);
        //character.initClassCharacter(Guerreiro());
        messages.showCharacterCharacteristics(character);
    }

    private fun chooseName(character: iCharacter) {

        println("Your character name: ");
        val name = readlnOrNull() ?: "" ;
        character.name = name;

    }

    private fun chooseRace(): iRace {

        val races = listOf(
            "Anão da Montanha",
            "Humano",
            "Draconato",
            "Meio-Orc",
            "Elfo",
            "Halfling",
            "Gnomo da Floresta",
            "Anão",
            "Halfling Robusto",
            "Gnomo das Rochas",
            "Alto Elfo",
            "Gnomo",
            "Tiefling",
            "Anão da Colina",
            "Elfo da Floresta",
            "Meio-Elfo",
            "Drow",
            "Halfling Pés-Leves"
        )

        for ((index, race) in races.withIndex()) {
            println("${index + 1}. $race")
        }

        print("Please choose a race: ");
        val raceChoice = readlnOrNull()?.toIntOrNull() ?: 0;

        val iRace: iRace = when (raceChoice) {

            1 -> AnaoDaMontanha();
            2 -> Humano();
            3 -> Draconato();
            4 -> MeioOrc();
            5 -> Elfo();
            6 -> Halfling();
            7 -> GnomoDaFloresta();
            8 -> Anao();
            9 -> HalflingRobusto();
            10 -> GnomoDasRochas();
            11 -> AltoElfo();
            12 -> Gnomo();
            13 -> Tiefling();
            14 -> AnaoDaColina();
            15 -> ElfoDaForesta();
            16 -> MeioElfo();
            17 -> Drow();
            18 -> HalfingPesLeves();
            else -> throw IllegalArgumentException(messages.showOptionUnavailable());
        }
        return iRace;
    }

    fun pointsDistribution(character: iCharacter): iCharacter {

        this.selectAttribute(character);
        return character;
    }

    private fun selectAttribute(character: iCharacter) {

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

    private fun numberOfPoints(attributePoints : Int, previousAttributePoints : Int) : Int {

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

    private fun applyModifier(character: iCharacter) : iCharacter {

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