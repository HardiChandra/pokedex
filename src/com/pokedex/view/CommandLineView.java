package com.pokedex.view;

import com.pokedex.controller.PokedexController;
import com.pokedex.domain.Item;
import com.pokedex.domain.Resource;
import com.pokedex.domain.Species;
import com.pokedex.domain.SpeciesAbility;

public class CommandLineView {
	private PokedexController pokedexController = new PokedexController();
	
	public void view(String[] args) {
		StringBuilder sb = new StringBuilder();
		for (String arg:args) {
			sb.append(arg);
			sb.append("-");
		}
		Resource resource = pokedexController.getResource(sb.substring(0, sb.length()-1));
		if (resource == null) {
			System.out.println("An error occured");
		} else if (resource instanceof Species) {
			printSpecies((Species)resource);
		} else if (resource instanceof Item) {
			printItem((Item)resource);
		}
	}

	private void printItem(Item item) {
		StringBuilder stringBuilder =  new StringBuilder();
		stringBuilder.append("\n").append("Item : ").append(item.getName()).append("\n");
		stringBuilder.append("Cost : ").append(item.getCost()).append("\n");
		stringBuilder.append("Entries : ").append(String.join(",", item.getEntries()));
		System.out.println(stringBuilder.toString());
	}

	private void printSpecies(Species species) {
		StringBuilder stringBuilder =  new StringBuilder();
		stringBuilder.append("#").append(species.getId()).append(" - ").append(species.getName()).append("\n");
		stringBuilder.append("Type : ").append(String.join(" - ", species.getTypes())).append("\n\n");
		stringBuilder.append("Abilities: ").append("\n");
		int i = 1;
		for (SpeciesAbility ability : species.getAbilities()) {
			stringBuilder.append(i).append(". ").append(ability.getAbilityName()).append("\n");
			stringBuilder.append(ability.getAbilityDescription()).append("\n\n");
			i++;		
		}
		System.out.println(stringBuilder.toString());
	}
}
