package cat.itacademy.barcelonactiva.Barcia.Ainoha.s04.t02.n03.model.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Indexed;


@Document (collection = "Fruit")
public class Fruit {
    @Id

    private String id;
    private String name;
    private float amountKilos;

    public Fruit(String id, String name, float amountKilos) {
        this.id = id;
        this.name = name;
        this.amountKilos = amountKilos;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAmountKilos() {
        return amountKilos;
    }

    public void setAmountKilos(float amountKilos) {
        this.amountKilos = amountKilos;
    }
}
