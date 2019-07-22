package com.pokedex.converter;

import com.pokedex.domain.Species;
import com.pokedex.domain.SpeciesAbility;
import com.pokedex.dto.SpeciesAbilityDto;
import com.pokedex.dto.SpeciesDto;
import com.pokedex.dto.SpeciesTypeDto;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SpeciesDtoToSpecies implements Function<SpeciesDto, Species> {
	@Override
	public Species apply(SpeciesDto speciesDto) {
		return new Species(speciesDto.getId(), speciesDto.getName(), getTypes(speciesDto.getTypes()), getAbilities(speciesDto.getAbilities()));
	}

	private List<SpeciesAbility> getAbilities(List<SpeciesAbilityDto> abilities) {
		return abilities.stream()
				.map(ability -> new SpeciesAbility(ability.getAbility().getName(), null))
				.collect(Collectors.toList());
	}

	private List<String> getTypes(List<SpeciesTypeDto> types) {
		return types.stream()
				.map(speciesTypeDto -> speciesTypeDto.getType().getName())
				.collect(Collectors.toList());
	}
}
