package com.codecool.farm;

import com.codecool.farm.animal.Animal;

import java.util.ArrayList;
import java.util.List;

class Farm {
    List<Animal> farmAnimals = new ArrayList<>();
    List<String> statusOfAnimals = new ArrayList<>();

    public List<Animal> getAnimals() {
        return farmAnimals;
    }

    public Farm(List<Animal> animals) {
        this.farmAnimals = animals;
    }

    public void feedAnimals(){
        for (Animal animal : farmAnimals) {
            animal.feed();
        }
    }

    public void butcher(Butcher butcher) {
        for (int i = 0; i < farmAnimals.size(); i++) {
            if(farmAnimals.get(i).getSize() > 4){
                farmAnimals.remove(i);
            }
        }
    }

    public boolean isEmpty() {
        return farmAnimals.size() == 0;
    }

    public List<String> getStatus() {
        statusOfAnimals.clear();
        for (Animal animal : farmAnimals) {
            statusOfAnimals.add("There is a " + animal.getSize() + "sized " + animal.getClass() + "in the farm.");
        }
        return statusOfAnimals;
    }

}