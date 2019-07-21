package com.pokedex;

import com.pokedex.infrastructure.ItemPokeapiHttpCall;
import com.pokedex.infrastructure.SpeciesPokeapiHttpCall;

public class Application {

    public static void main(String[] args) {
        try {
            System.out.println(new SpeciesPokeapiHttpCall().get("tapu-koko"));
            System.out.println(new ItemPokeapiHttpCall().get("ability-capsule"));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
