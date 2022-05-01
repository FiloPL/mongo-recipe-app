package filo.springapp.mongorecipeapp.repositories;

import filo.springapp.mongorecipeapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by T. Filo Zegarlicki on 01.05.2022
 **/
public interface RecipeRepository extends CrudRepository<Recipe, String> {
}

