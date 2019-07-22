package com.pokedex;

import com.pokedex.view.CommandLineView;

public class Application {

	public static void main(String[] args) {
		CommandLineView commandLineView = new CommandLineView();
		commandLineView.view(args);
	}
}
