package gateway_RandomAnimal.controller;

import gateway_RandomAnimal.dao.AnimalDao;
import gateway_RandomAnimal.model.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RandomAnimalController {

    private final AnimalDao animalDao;

    @Autowired
    public RandomAnimalController(AnimalDao animalDao){
        this.animalDao=animalDao;
    }

    @GetMapping("/random")
    public Animal randomAnimal(){
        Animal animal=animalDao.random();
        System.out.println(animal);
        return animal;
    }
}