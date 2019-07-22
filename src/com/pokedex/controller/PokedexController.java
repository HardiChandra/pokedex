package com.pokedex.controller;

import com.pokedex.domain.Resource;
import com.pokedex.service.PokedexService;

import java.io.FileNotFoundException;

public class PokedexController {
	private PokedexService pokedexService = new PokedexService();
	public Resource getResource(String resourceType) {
		try {
			return pokedexService.get(resourceType);
		} catch (FileNotFoundException fnfe) {
			System.out.println("No species/item with that name found");
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	} 
}
