package cat.itacademy.barcelonactiva.Barcia.Ainoha.s04.t02.n03.model.service;

import cat.itacademy.barcelonactiva.Barcia.Ainoha.s04.t02.n03.FruitException;
import cat.itacademy.barcelonactiva.Barcia.Ainoha.s04.t02.n03.model.domain.Fruit;
import cat.itacademy.barcelonactiva.Barcia.Ainoha.s04.t02.n03.model.repository.IFruitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class FruitService implements IFruitService {

    //@Autowired
    private final IFruitRepository fruitRepository;

    public FruitService(IFruitRepository fruitRepository) {
        this.fruitRepository = fruitRepository;
    }

    public Fruit createFruit (Fruit fruit){
        return fruitRepository.save(fruit);
    }


    public Fruit updateFruit(Fruit fruit) {
        return null;
    }


    public void deleteFruit(String id) {

    }

    public Fruit updateFruit(String id, Fruit newFruitData) throws FruitException {
        Optional<Fruit> optionalFruit = fruitRepository.findById(id);
        if (optionalFruit.isPresent()) {
            Fruit oldFruit = optionalFruit.get();
            oldFruit.setName(newFruitData.getName());
            oldFruit.setAmountKilos(newFruitData.getAmountKilos());
            return fruitRepository.save(oldFruit);
        } else {
            throw new FruitException ("Fruit with id: " + id + " not found ");
        }
    }

    public void deletfruit(String id){
        fruitRepository.deleteById(id);
        System.out.println("The fruit with ID " + id + "is delete");
    }
    public Fruit getFruitById (String id){
        Optional<Fruit> optionalFruit = fruitRepository.findById(id);
        return optionalFruit.get();
    }

    public List<Fruit> getAllFruits() {
        return null;
    }

    public List<Fruit> findAllFruit (){
        return fruitRepository.findAll();
    }

}
