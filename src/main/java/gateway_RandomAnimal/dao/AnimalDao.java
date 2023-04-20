package gateway_RandomAnimal.dao;


import gateway_RandomAnimal.model.Animal;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Component
public class AnimalDao {
    private List<Animal> list = Arrays.asList(new Animal("cat"), new Animal("dog"), new Animal("fox"));

    public Animal random(){
        Random rand = new Random();
        return  list.get(rand.nextInt(list.size()));
    }
}