package com.pokedex.converter;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pokedex.dto.SpeciesDto;

import java.io.IOException;
import java.util.function.Function;

public class SpeciesResponseToSpeciesDto implements Function<String, SpeciesDto> {

	@Override
	public SpeciesDto apply(String s) {
		try {
			ObjectMapper objectMapper = new ObjectMapper();
			objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
			return objectMapper.readValue(s, SpeciesDto.class);
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
}
