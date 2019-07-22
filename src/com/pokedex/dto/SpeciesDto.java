package com.pokedex.dto;

import java.util.List;

public class SpeciesDto {
	private int id;
	private String name;
	private List<SpeciesTypeDto> types;
	private List<SpeciesAbilityDto> abilities;

	public SpeciesDto() {
	}
	
	public void setAbilities(List<SpeciesAbilityDto> abilities) {
		this.abilities = abilities;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setTypes(List<SpeciesTypeDto> types) {
		this.types = types;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public List<SpeciesTypeDto> getTypes() {
		return types;
	}

	public List<SpeciesAbilityDto> getAbilities() {
		return abilities;
	}
}
