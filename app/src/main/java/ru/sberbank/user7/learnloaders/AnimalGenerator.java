package ru.sberbank.user7.learnloaders;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user7 on 18.05.2017.
 */

public class AnimalGenerator {
    public static final List<Animal> getAnimals(){
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Cat", 1, 0.3f,"Васька"));
        animals.add(new Animal("Dog", 5,1.5f,"Зубастый"));
        animals.add(new Animal("Cat", 2,0.6f,"Пельмень"));

        animals.add(new Animal("Horse", 8, 2.1f,"Шип"));
        animals.add(new Animal("Bird", 5,0.5f,"клювогриф"));
        animals.add(new Animal("Cat", 4,0.4f,"Неспящий"));

        animals.add(new Animal("Tiger", 12, 1.8f,"Скальпель"));
        animals.add(new Animal("Dog", 12,0.8f, "Калоша"));
        animals.add(new Animal("Cat", 2,0.7f,"Ложкин"));
        animals.add(new Animal("Cat", 2,0.7f,"Сапожкин"));
        return  animals;
    }
}
