package com.pokedex.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ItemDto {
	private int id;
	private String name;
	private int cost;
	@JsonProperty("effect_entries")
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

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getCost() {
		return cost;
	}

	public List<EffectDto> getEffectEntries() {
		return effectEntries;
	}
}
