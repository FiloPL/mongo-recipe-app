package filo.springapp.mongorecipeapp.services;

import filo.springapp.mongorecipeapp.commands.RecipeCommand;
import filo.springapp.mongorecipeapp.domain.Recipe;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
/**
 * Created by T. Filo Zegarlicki on 01.05.2022
 **/

public interface RecipeService {

    Flux<Recipe> getRecipes();

    Mono<Recipe> findById(String id);

    Mono<RecipeCommand> findCommandById(String id);

    Mono<RecipeCommand>  saveRecipeCommand(RecipeCommand command);

    Mono<Void> deleteById(String idToDelete);
}