package com.pokedex.infrastructure;

public class ItemPokeapiHttpCall extends PokeapiHttpCall {

	@Override
	String getResourceType() {
		return ResourceType.ITEM.getValue();
	}
	
	public String get(String resourceName) throws Exception {
		return super.get(resourceName);
	}
}