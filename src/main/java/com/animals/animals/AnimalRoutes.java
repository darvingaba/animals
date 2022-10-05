package com.animals.animals;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnimalRoutes {
    @Autowired
    private AnimalRepository animalRepository;

    @GetMapping("/animals")
    public List<Animal> getAnimals(){
        return animalRepository.findAll();
    }

    @PostMapping("/animals")
    public Animal createActor(@RequestBody Animal animal) {
    Animal newAnimal = animalRepository.save(animal);
    return newAnimal;
  }

    // @DeleteMapping("/animals{id}")
    // public Animal deleteAnimal(@PathVariable Integer id){
    //     Animal animal = animalRepository.findById(id);
    //     animalRepository.deleteById;
    // }

}

interface AnimalRepository extends JpaRepository<Animal,Integer>{}
