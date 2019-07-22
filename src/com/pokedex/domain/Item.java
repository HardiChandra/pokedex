package com.pokedex.domain;

import java.util.List;

public class Item extends Resource {
	private int cost;
	private List<String> entries;

	public Item(int id, String name, int cost, List<String> entries) {
		super(id, name);
		this.cost = cost;
		this.entries = entries;
	}

	public int getCost() {
		return cost;
	}

	public List<String> getEntries() {
		return entries;
	}
}
