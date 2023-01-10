package lesson08.animals;

public class Dog extends EarthAnimal {

    public Dog(int age, int size, boolean male) {
        super(age, size, male);
    }

    @Override
    public void eat() {
        System.out.println("eating bones");
    }

    @Override
    public void voice() {
        System.out.println("bark");
    }

    public void doCommand() {
        System.out.println("I'm a good boy");
    }
}
