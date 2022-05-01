package filo.springapp.mongorecipeapp.services;

import filo.springapp.mongorecipeapp.commands.IngredientCommand;
import reactor.core.publisher.Mono;
/**
 * Created by T. Filo Zegarlicki on 01.05.2022
 **/
public interface IngredientService {

    Mono<IngredientCommand> findByRecipeIdAndIngredientId(String recipeId, String ingredientId);

    Mono<IngredientCommand> saveIngredientCommand(IngredientCommand command);

    Mono<Void> deleteById(String recipeId, String idToDelete);
}