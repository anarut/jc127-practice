package lesson08.animals;

import lesson09.Alica;
import lesson09.Robot;
import lesson09.Speakable;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Parrot parrot = new Parrot(3, 10, true);
        parrot.eat();
        parrot.sleep();
        parrot.fly();
        Cat cat = new Cat(2, 20, false);
        cat.sleep();
        Dog dog = new Dog(5, 35, true);
        dog.doCommand();
        Human human1 = new Human(24, 190, false);
        Human human2 = new Human(54, 150, true);
        human2.voice();
        Human human3 = new Human(4, 60, false);
        human3.think();
        Fish fish = new Fish(1, 3, false);
        fish.swim();

        System.out.println("--------");

        Animal[] animals = {parrot, cat, dog, human1, human2, human3, fish};
        for (Animal animal: animals) {
            animal.eat();
            System.out.println(animal.getAge());


//            if (animal instanceof Human) {
//                Human human  = (Human) animal;
//                human.think();
//            }

//            if (Human.class.equals(animal.getClass())) {
//                Human human  = (Human) animal;
//                human.think();
//            }

            if (animal instanceof Human human) {
                human.think();
            }
        }


        Robot robot = new Robot();
        Alica alica = new Alica();

        Speakable[] all = {dog, robot, cat, parrot, alica, human1};

        for (Speakable s : all) {
            s.voice();
        }

    }
}
