package com.pokedex;

import com.pokedex.view.CommandLineView;

public class Application {

    public static void main(String[] args) {
        try {
            CommandLineView commandLineView = new CommandLineView();
            commandLineView.view(args);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
