package com.pokedex.infrastructure;

public class SpeciesPokeapiHttpCall extends PokeapiHttpCall {

	String getResourceType() {
		return ResourceType.SPECIES.getValue();
	}
	
	public String get(String resourceName) throws Exception {
		return super.get(getBaseUrl() + "/" + getResourceType() + "/" + resourceName);
	}
}