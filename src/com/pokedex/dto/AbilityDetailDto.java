package com.pokedex.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class AbilityDetailDto {
	@JsonProperty("effect_entries")
	List<AbilityDetailEntryDto> abilityDetailEntries;
	private String name;

	public AbilityDetailDto() {
	}

	public List<AbilityDetailEntryDto> getAbilityDetailEntries() {
		return abilityDetailEntries;
	}

	public String getName() {
		return name;
	}
}
