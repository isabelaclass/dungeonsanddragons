package org.example.menus

import org.example.messages.Messages

class InitialMenu {
    companion object {

        fun showInitialMenu() : Int {

            val messages: Messages = Messages();
            var option : Int = 0;

            println(messages.showInitialMessage());
            println(messages.showCreateCharacter());
            println(messages.showExitOption());

            print(messages.showChooseAnOption());
            option = readlnOrNull()?.toIntOrNull() ?: 0;

            return option;
        }
    }
}