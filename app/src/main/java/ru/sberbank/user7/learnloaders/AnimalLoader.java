package ru.sberbank.user7.learnloaders;

import android.content.Context;
import android.support.v4.content.AsyncTaskLoader;

import java.util.List;
import java.util.Random;

/**
 * Created by user7 on 18.05.2017.
 */

public class AnimalLoader extends AsyncTaskLoader<Animal> {
    private final List<Animal> animalList;
    private Random random;
    public AnimalLoader(Context context) {
        super(context);
        random= new Random();
        this.animalList = AnimalGenerator.getAnimals();
    }


    @Override
    public Animal loadInBackground() {
        return animalList.get(random.nextInt(9));
    }
}
