package filo.springapp.mongorecipeapp.config;

import filo.springapp.mongorecipeapp.domain.Recipe;
import filo.springapp.mongorecipeapp.services.RecipeService;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;

/**
 * Created by T. Filo Zegarlicki on 02.05.2022
 **/

@Configuration
public class WebConfig {

    @Bean
    RouterFunction<?> routes(RecipeService recipeService){
        return RouterFunctions.route(GET("/api/recipes"),
                serverRequest -> ServerResponse
                        .ok()
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(recipeService.getRecipes(), Recipe.class));

    }
}