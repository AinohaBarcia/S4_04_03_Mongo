package cat.itacademy.barcelonactiva.Barcia.Ainoha.s04.t02.n03.model.repository;

import cat.itacademy.barcelonactiva.Barcia.Ainoha.s04.t02.n03.model.domain.Fruit;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IFruitRepository extends MongoRepository<Fruit, String> {
}
