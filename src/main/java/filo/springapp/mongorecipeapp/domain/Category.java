package filo.springapp.mongorecipeapp.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;

/**
 * Created by T. Filo Zegarlicki on 01.05.2022
 **/

@Getter
@Setter
@Document
public class Category {

    @Id
    private String id;
    private String description;
    private Set<Recipe> recipes;
}
