package ru.sberbank.user7.learnloaders;

/**
 * Created by user7 on 18.05.2017.
 */

public class Animal {
    private String mSpecie;
    private int mAge;
    private float height;
    private String name;

    public Animal(String mSpecie, int mAge, float height, String name) {
        this.mSpecie = mSpecie;
        this.mAge = mAge;
        this.height = height;
        this.name = name;
    }

    public String getmSpecie() {
        return mSpecie;
    }

    public int getmAge() {
        return mAge;
    }

    public float getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Animal animal = (Animal) o;

        if (mAge != animal.mAge) return false;
        if (height != animal.height) return false;
        if (mSpecie != null ? !mSpecie.equals(animal.mSpecie) : animal.mSpecie != null)
            return false;
        return name != null ? name.equals(animal.name) : animal.name == null;

    }

    @Override
    public int hashCode() {
        int result = mSpecie != null ? mSpecie.hashCode() : 0;
        result = 31 * result + mAge;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
