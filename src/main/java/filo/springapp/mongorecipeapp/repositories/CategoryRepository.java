package filo.springapp.mongorecipeapp.repositories;

import filo.springapp.mongorecipeapp.domain.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * Created by T. Filo Zegarlicki on 01.05.2022
 **/
public interface CategoryRepository extends CrudRepository<Category, String> {

    Optional<Category> findByDescription(String description);
}
