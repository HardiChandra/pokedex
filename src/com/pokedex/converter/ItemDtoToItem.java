package com.pokedex.converter;

import com.pokedex.domain.Item;
import com.pokedex.dto.EffectDto;
import com.pokedex.dto.ItemDto;
import com.pokedex.infrastructure.ResourceType;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ItemDtoToItem implements Function<ItemDto, Item> {

	private List<String> getEntries(List<EffectDto> effectEntries) {
		return effectEntries.stream()
				.map(EffectDto::getEffect)
				.collect(Collectors.toList());
	}

	@Override
	public Item apply(ItemDto itemDto) {
		return new Item(itemDto.getId(), itemDto.getName(), itemDto.getCost(), getEntries(itemDto.getEffectEntries()));
	}
}
