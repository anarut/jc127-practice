package lesson08.animals;

public class Human extends EarthAnimal {

    public Human(int age, int size, boolean male) {
        super(age, size, male);
    }

    @Override
    public void eat() {
        System.out.println("Eating spagetti");
    }

    @Override
    public void voice() {
        System.out.println("I can sing song");
    }

    public void think() {
        System.out.println("I have no idea");
    }
}
