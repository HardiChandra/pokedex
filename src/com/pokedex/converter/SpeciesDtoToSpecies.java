package com.pokedex.converter;

import com.pokedex.domain.Species;
import com.pokedex.domain.SpeciesAbility;
import com.pokedex.dto.SpeciesAbilityDto;
import com.pokedex.dto.SpeciesDto;
import com.pokedex.dto.SpeciesTypeDto;
import com.pokedex.service.PokedexService;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SpeciesDtoToSpecies implements Function<SpeciesDto, Species> {
	@Override
	public Species apply(SpeciesDto speciesDto) {
		return new Species(speciesDto.getId(), speciesDto.getName(), getTypes(speciesDto.getTypes()), getAbilities(speciesDto.getAbilities()));
	}

	private List<SpeciesAbility> getAbilities(List<SpeciesAbilityDto> abilities) {
		PokedexService pokedexService = new PokedexService();
		return abilities.stream()
				.map(ability -> {
					try {
						return pokedexService.getAbility(ability.getAbility().getUrl());
					} catch (Exception e) {
						e.printStackTrace();
						return null;
					}
				})
				.collect(Collectors.toList());
	}

	private List<String> getTypes(List<SpeciesTypeDto> types) {
		return types.stream()
				.map(speciesTypeDto -> speciesTypeDto.getType().getName())
				.collect(Collectors.toList());
	}
}
