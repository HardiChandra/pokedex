package com.pokedex.infrastructure;

abstract class PokeapiHttpCall extends HttpCallTemplate {
	@Override
	String getBaseUrl() {
		return BaseUrl.POKEAPI.getValue();
	}

	abstract String getResourceType();
}
