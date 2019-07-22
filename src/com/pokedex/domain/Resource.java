package com.pokedex.domain;

public class Resource {
	private int id;
	private String name;

	Resource(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}
