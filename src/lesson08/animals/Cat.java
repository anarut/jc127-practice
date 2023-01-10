package lesson08.animals;

public class Cat extends EarthAnimal {

    public Cat(int age, int size, boolean male) {
        super(age, size, male);
    }

    @Override
    public void eat() {
        System.out.println("Eating fish");
    }

    @Override
    public void voice() {
        System.out.println("Meow");
    }
}
