package com.pokedex.infrastructure;

public enum BaseUrl {
	POKEAPI("https://pokeapi.co/api/v2");
	
	BaseUrl(String value) {
		this.value = value;
	}
	private String value;
	
	public String getValue() {
		return this.value;
	}
}
