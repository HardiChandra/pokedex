package com.pokedex.view;

public class CommandLineView {
	public void view(String args[]) {
		StringBuilder sb = new StringBuilder();
		for (String arg:args) {
			sb.append(arg);
			sb.append("-");
		}
		System.out.println(sb.substring(0, sb.length()-1));
	}
}
