package filo.springapp.mongorecipeapp.repositories.reactive;

import filo.springapp.mongorecipeapp.domain.UnitOfMeasure;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;
/**
 * Created by T. Filo Zegarlicki on 01.05.2022
 **/
public interface UnitOfMeasureReactiveRepository extends ReactiveMongoRepository<UnitOfMeasure, String> {

    Mono<UnitOfMeasure> findByDescription(String description);
}