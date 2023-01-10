package lesson08.animals;

public abstract class FlyingAnimal extends Animal {

    public FlyingAnimal(int age, int size, boolean male) {
        super(age, size, male);
    }

    public void fly() {
        System.out.println("I can fly");
    }

    @Override
    public void eat() {
        System.out.println("eating worms");
    }
}
