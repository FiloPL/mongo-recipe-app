package filo.springapp.mongorecipeapp.services;

import filo.springapp.mongorecipeapp.commands.UnitOfMeasureCommand;
import reactor.core.publisher.Flux;

/**
 * Created by T. Filo Zegarlicki on 01.05.2022
 **/
public interface UnitOfMeasureService {

    Flux<UnitOfMeasureCommand> listAllUoms();
}