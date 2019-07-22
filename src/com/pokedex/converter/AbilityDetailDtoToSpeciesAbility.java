package com.pokedex.converter;

import com.pokedex.domain.SpeciesAbility;
import com.pokedex.dto.AbilityDetailDto;
import com.pokedex.dto.AbilityDetailEntryDto;

import java.util.function.Function;
import java.util.stream.Collectors;

public class AbilityDetailDtoToSpeciesAbility implements Function<AbilityDetailDto, SpeciesAbility> {

	@Override
	public SpeciesAbility apply(AbilityDetailDto abilityDetailDto) {
		return getSpeciesAbilities(abilityDetailDto);
	}

	private SpeciesAbility getSpeciesAbilities(AbilityDetailDto abilityDetailDto) {
		return new SpeciesAbility(abilityDetailDto.getName(), 
				abilityDetailDto.getAbilityDetailEntries().stream()
					.map(AbilityDetailEntryDto::getEffect)
						.collect(Collectors.joining()));
	}
}
