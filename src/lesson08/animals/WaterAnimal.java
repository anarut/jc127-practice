package lesson08.animals;

public abstract class WaterAnimal extends Animal {

    public WaterAnimal(int age, int size, boolean male) {
        super(age, size, male);
    }

    public void swim() {
        System.out.println("I can swim");
    }

    @Override
    public void eat() {
        System.out.println("eating grass");
    }

    @Override
    public void voice() {
        System.out.println("?");
    }

    @Override
    public void sleep() {
        System.out.println("-");
    }
}
