package com.pokedex;

import com.pokedex.converter.ItemResponseToItemDto;
import com.pokedex.converter.SpeciesResponseToSpeciesDto;
import com.pokedex.dto.ItemDto;
import com.pokedex.dto.SpeciesDto;
import com.pokedex.infrastructure.ItemPokeapiHttpCall;
import com.pokedex.infrastructure.SpeciesPokeapiHttpCall;

public class Application {

    public static void main(String[] args) {
        try {
            SpeciesResponseToSpeciesDto speciesResponseToSpeciesDto = new SpeciesResponseToSpeciesDto();
            ItemResponseToItemDto itemResponseToItemDto = new ItemResponseToItemDto();
            SpeciesDto speciesDto = speciesResponseToSpeciesDto.apply(new SpeciesPokeapiHttpCall().get("tapu-koko"));
            ItemDto itemDto = itemResponseToItemDto.apply(new ItemPokeapiHttpCall().get("ability-capsule"));
            System.out.println(speciesDto);
            System.out.println(itemDto);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
