package com.swingy;

import com.swingy.View.GameView;
import com.swingy.View.console.ConsoleView;
import com.swingy.View.gui.GuiView;

import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        GameView view;
        if (args.length > 0 && args[0].equalsIgnoreCase("console")) {
            view = new ConsoleView();
        } else if (args.length > 0 && args[0].equalsIgnoreCase("gui")) {
            view = new GuiView();
        } else {
            System.out.println("Usage: You need to specify the type of view you want, console or gui");
        }


    }
}