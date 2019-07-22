package com.pokedex.controller;

import com.pokedex.domain.Resource;
import com.pokedex.service.PokedexService;

public class PokedexController {
	private PokedexService pokedexService = new PokedexService();
	public Resource getResource(String resourceType) {
		try {
			return pokedexService.get(resourceType);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	} 
}
