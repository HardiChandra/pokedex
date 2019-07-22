package com.pokedex.domain;

import java.util.List;

public class Species extends Resource {
	private List<String> types;
	private List<SpeciesAbility> abilities;

	public Species(int id, String name, List<String> types, List<SpeciesAbility> abilities) {
		super(id, name);
		this.types = types;
		this.abilities = abilities;
	}

	public List<String> getTypes() {
		return types;
	}

	public List<SpeciesAbility> getAbilities() {
		return abilities;
	}

	public void setAbilities(List<SpeciesAbility> abilities) {
		this.abilities = abilities;
	}
}
