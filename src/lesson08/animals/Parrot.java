package lesson08.animals;

public class Parrot extends FlyingAnimal {

    public Parrot(int age, int size, boolean male) {
        super(age, size, male);
    }

    @Override
    public void voice() {
        System.out.println("Yohoho");
    }

    @Override
    public void sleep() {
        System.out.println("z-z-z-z-z");
    }
}
