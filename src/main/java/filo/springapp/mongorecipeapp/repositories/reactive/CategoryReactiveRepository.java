package filo.springapp.mongorecipeapp.repositories.reactive;

import filo.springapp.mongorecipeapp.domain.Category;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

/**
 * Created by T. Filo Zegarlicki on 01.05.2022
 **/
public interface CategoryReactiveRepository extends ReactiveMongoRepository<Category, String> {

    Mono<Category> findByDescription(String description);
}