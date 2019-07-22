package com.pokedex.infrastructure;

public interface HttpCall {
	public String get(String fullUrl) throws Exception;
}
