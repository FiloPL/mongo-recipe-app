package filo.springapp.mongorecipeapp.repositories.reactive;


import filo.springapp.mongorecipeapp.domain.Recipe;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

/**
 * Created by T. Filo Zegarlicki on 01.05.2022
 **/
public interface RecipeReactiveRepository extends ReactiveMongoRepository<Recipe, String>{
}