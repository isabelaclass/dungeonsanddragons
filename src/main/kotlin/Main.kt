package org.example

import org.example.functions.Functions
import org.example.menus.InitialMenu
import org.example.messages.Messages
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    var messages: Messages = Messages();
    var function : Functions = Functions();
    var option: Int = 0;

   option = InitialMenu.showInitialMenu();

    do {
        when (option) {

            1 -> {

                try {

                    function.createCharacter();
                    println(messages.showAfterCreateCharacter());
                    println(messages.showYesOrNo());
                    print(messages.showChooseAnOption());
                    option = readlnOrNull()?.toIntOrNull() ?: 0;

                } catch (e: Exception) {
                    messages.showCreateCharacter();
                    messages.showChooseAnOption();
                    print(messages.showChooseAnOption());
                    option = readlnOrNull()?.toIntOrNull() ?: 0;
                }
            }
            2 -> println(messages.showChooseToLeave())
            else -> {
                println(messages.showOptionUnavailable())
                print(messages.showChooseAnOption());
                option = readlnOrNull()?.toIntOrNull() ?: 0;
            }
        }
    } while(option != 2);
}
