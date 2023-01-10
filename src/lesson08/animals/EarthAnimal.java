package lesson08.animals;

public abstract class EarthAnimal extends Animal {

    public EarthAnimal(int age, int size, boolean male) {
        super(age, size, male);
    }

    public void run() {
        System.out.println("I'm running");
    }

    @Override
    public void sleep() {
        System.out.println("Zzzzz-Zzzzz");
    }
}
