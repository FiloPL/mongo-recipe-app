package filo.springapp.mongorecipeapp.services;

import org.springframework.web.multipart.MultipartFile;
import reactor.core.publisher.Mono;

/**
 * Created by T. Filo Zegarlicki on 01.05.2022
 **/
public interface ImageService {

    Mono<Void> saveImageFile(String recipeId, MultipartFile file);
}