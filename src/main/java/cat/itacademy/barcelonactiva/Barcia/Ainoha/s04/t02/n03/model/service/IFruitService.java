package cat.itacademy.barcelonactiva.Barcia.Ainoha.s04.t02.n03.model.service;

import cat.itacademy.barcelonactiva.Barcia.Ainoha.s04.t02.n03.model.domain.Fruit;

import java.util.List;

public interface IFruitService {

    Fruit createFruit(Fruit fruit);

    Fruit updateFruit(Fruit fruit);

    void deleteFruit(String id);

    Fruit getFruitById(String id);

    List<Fruit> getAllFruits();
}
