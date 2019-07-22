package com.pokedex.domain;

import java.util.List;

public class AbilityDetail {
	private List<SpeciesAbility> speciesAbilities;

	public AbilityDetail(List<SpeciesAbility> speciesAbilities) {
		this.speciesAbilities = speciesAbilities;
	}

	public List<SpeciesAbility> getSpeciesAbilities() {
		return speciesAbilities;
	}
}
