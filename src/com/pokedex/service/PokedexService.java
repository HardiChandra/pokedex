package com.pokedex.service;

import com.pokedex.converter.AbilityDetailDtoToSpeciesAbility;
import com.pokedex.converter.AbilityDetailResponseToAbilityDetailDto;
import com.pokedex.converter.ItemDtoToItem;
import com.pokedex.converter.ItemResponseToItemDto;
import com.pokedex.converter.SpeciesDtoToSpecies;
import com.pokedex.converter.SpeciesResponseToSpeciesDto;
import com.pokedex.domain.Item;
import com.pokedex.domain.Resource;
import com.pokedex.domain.Species;
import com.pokedex.domain.SpeciesAbility;
import com.pokedex.dto.AbilityDetailDto;
import com.pokedex.dto.ItemDto;
import com.pokedex.dto.SpeciesDto;
import com.pokedex.infrastructure.AbilityPokeapiHttpCall;
import com.pokedex.infrastructure.HttpCall;
import com.pokedex.infrastructure.ItemPokeapiHttpCall;
import com.pokedex.infrastructure.SpeciesPokeapiHttpCall;

import java.io.FileNotFoundException;

public class PokedexService {
	public Resource get(String resourceName) throws Exception {
		try {
			return getSpecies(resourceName);
		} catch (FileNotFoundException fnfe) {
			return getItems(resourceName);
		}
	}
	
	private Species getSpecies(String resourceName) throws Exception {
		HttpCall httpCall = new SpeciesPokeapiHttpCall();
		String response = httpCall.get(resourceName);
		SpeciesDto speciesDto = new SpeciesResponseToSpeciesDto().apply(response);
		return new SpeciesDtoToSpecies().apply(speciesDto);
	}

	private Item getItems(String resourceName) throws Exception {
		HttpCall httpCall = new ItemPokeapiHttpCall();
		String response = httpCall.get(resourceName);
		ItemDto itemDto = new ItemResponseToItemDto().apply(response);
		return new ItemDtoToItem().apply(itemDto);
	}
	
	public SpeciesAbility getAbility(String url) throws Exception {
		HttpCall httpCall = new AbilityPokeapiHttpCall();
		String response = httpCall.get(url);
		AbilityDetailDto abilityDetailDto = new AbilityDetailResponseToAbilityDetailDto().apply(response);
		return new AbilityDetailDtoToSpeciesAbility().apply(abilityDetailDto);
	}
}
