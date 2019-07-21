package com.pokedex.domain;

import java.util.List;

public class Species {
	private int id;
	private String name;
	private List<String> types;
	private List<SpeciesAbility> abilities;

	public Species(int id, String name, List<String> types, List<SpeciesAbility> abilities) {
		this.id = id;
		this.name = name;
		this.types = types;
		this.abilities = abilities;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public List<String> getTypes() {
		return types;
	}

	public List<SpeciesAbility> getAbilities() {
		return abilities;
	}
}
