package lesson08.animals;

import lesson09.Eatable;
import lesson09.Speakable;

public abstract class Animal implements Speakable, Eatable {

    private int age;
    private int size;
    private boolean male;

    public Animal(int age, int size, boolean male) {
        this.age = age;
        this.size = size;
        this.male = male;
    }

    public abstract void eat();

    public abstract void voice();

    public abstract void sleep();

    public int getAge() {
        return age;
    }

    public int getSize() {
        return size;
    }

    public boolean isMale() {
        return male;
    }
}
