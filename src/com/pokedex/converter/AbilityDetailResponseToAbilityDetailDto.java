package com.pokedex.converter;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pokedex.dto.AbilityDetailDto;

import java.io.IOException;
import java.util.function.Function;

public class AbilityDetailResponseToAbilityDetailDto implements Function<String, AbilityDetailDto> {

	@Override
	public AbilityDetailDto apply(String s) {
		try {
			ObjectMapper objectMapper = new ObjectMapper();
			objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
			return objectMapper.readValue(s, AbilityDetailDto.class);
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
}
