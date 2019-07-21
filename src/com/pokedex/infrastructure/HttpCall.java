package com.pokedex.infrastructure;

public interface HttpCall {
	public String get(String resourceName) throws Exception;
}
