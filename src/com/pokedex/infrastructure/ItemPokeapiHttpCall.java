package com.pokedex.infrastructure;

public class ItemPokeapiHttpCall extends PokeapiHttpCall {

	String getResourceType() {
		return ResourceType.ITEM.getValue();
	}
	
	public String get(String resourceName) throws Exception {
		return super.get(getBaseUrl() + "/" + getResourceType() + "/" + resourceName);
	}
}