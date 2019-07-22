package com.pokedex.infrastructure;

abstract class PokeapiHttpCall extends HttpCallTemplate {
	String getBaseUrl() {
		return BaseUrl.POKEAPI.getValue();
	}

	abstract String getResourceType();
}
