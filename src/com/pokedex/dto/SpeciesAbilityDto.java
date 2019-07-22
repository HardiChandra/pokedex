package com.pokedex.dto;

public class SpeciesAbilityDto {
	private AbilityDto ability;
	
	public SpeciesAbilityDto() {
		
	}
	
	public void setAbility(AbilityDto ability) {
		this.ability = ability;
	}

	public AbilityDto getAbility() {
		return ability;
	}
}
