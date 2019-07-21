package com.pokedex.dto;

import java.util.List;

public class ItemDto {
	private int id;
	private String name;
	private int cost;
	private List<EffectDto> effectEntries;

	public ItemDto() {
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public void setEffectEntries(List<EffectDto> effectEntries) {
		this.effectEntries = effectEntries;
	}
}
