package com.pokedex.domain;

import java.util.List;

public class Item {
	private int id;
	private String name;
	private int cost;
	private List<String> entries;

	public Item(int id, String name, int cost, List<String> entries) {
		this.id = id;
		this.name = name;
		this.cost = cost;
		this.entries = entries;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getCost() {
		return cost;
	}

	public List<String> getEntries() {
		return entries;
	}
}
