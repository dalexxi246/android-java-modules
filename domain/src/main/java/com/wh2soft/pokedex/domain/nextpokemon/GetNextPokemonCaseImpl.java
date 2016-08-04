package com.wh2soft.pokedex.domain.nextpokemon;

import com.wh2soft.pokedex.model.nextpokemon.PokemonRepository;

import java.util.Random;

import static com.wh2soft.pokedex.model.entities.Pokemon.POKEMON_MAX_NUMBER;

/**
 * Created by wilmer on 3/08/16.
 */
public class GetNextPokemonCaseImpl implements GetNextPokemonCase {

    PokemonRepository repository;

    public GetNextPokemonCaseImpl(PokemonRepository repository) {
        this.repository = repository;
    }

    @Override
    public void execute() {
        String pokemonID = "" + new Random().nextInt(POKEMON_MAX_NUMBER);
        repository.getNextPokemon(pokemonID);
    }
}