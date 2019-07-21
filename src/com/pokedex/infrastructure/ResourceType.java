package com.pokedex.infrastructure;

public enum ResourceType {
	SPECIES("pokemon"),
	ITEM("item");

	ResourceType(String value) {
		this.value = value;
	}
	private String value;

	public String getValue() {
		return this.value;
	}
}
