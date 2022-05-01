package filo.springapp.mongorecipeapp.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

/**
 * Created by T. Filo Zegarlicki on 01.05.2022
 **/

@Getter
@Setter
public class Notes {
    @Id
    private String id;
    private String recipeNotes;
}
