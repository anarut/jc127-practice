package lesson06;

public class SuperHero extends Hero {

    {
        numberOfLives = 5;
        System.out.println("creating class");

        numberOfLives = 3;
        System.out.println("creating ne class");
    }


    public SuperHero() {
//        super();
        super("Mario", "pink", 3, 2);
        // <----
        System.out.println("hello");
        //this(params);
        //super(params);
    }


}
