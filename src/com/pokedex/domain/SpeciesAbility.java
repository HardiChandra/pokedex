package com.pokedex.domain;

public class SpeciesAbility {
	private String abilityName;
	private String abilityDescription;
	
	public SpeciesAbility(String abilityName, String abilityDescription) {
		this.abilityName = abilityName;
		this.abilityDescription = abilityDescription;
	}
	
	public String getAbilityName() {
		return this.abilityName;
	}
	
	public String getAbilityDescription() {
		return this.abilityDescription;
	}
}
