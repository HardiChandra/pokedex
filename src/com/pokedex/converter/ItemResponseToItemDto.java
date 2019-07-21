package com.pokedex.converter;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pokedex.dto.ItemDto;

import java.io.IOException;
import java.util.function.Function;

public class ItemResponseToItemDto implements Function<String, ItemDto> {

	@Override
	public ItemDto apply(String s) {
		try {
			ObjectMapper objectMapper = new ObjectMapper();
			objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
			return objectMapper.readValue(s, ItemDto.class);
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
}
