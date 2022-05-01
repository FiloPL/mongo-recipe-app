package filo.springapp.mongorecipeapp.repositories;

import filo.springapp.mongorecipeapp.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * Created by T. Filo Zegarlicki on 01.05.2022
 **/
public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, String> {

    Optional<UnitOfMeasure> findByDescription(String description);
}
