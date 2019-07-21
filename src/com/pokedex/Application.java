package com.pokedex;

import com.pokedex.infrastructure.HttpCallTemplate;

public class Application {

    public static void main(String[] args) {
        try {
            new HttpCallTemplate().get();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
