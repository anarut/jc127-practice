/* Copyright */
package lesson06;

public class Hero { //extends Object {

    private static final int DEFAULT_SIZE = 2;
    private static final int NUMBER_OF_LIVES = 3;

    String name;
    String color;
    Integer numberOfLives = NUMBER_OF_LIVES;
    Integer size = DEFAULT_SIZE; // 1 2 3;

//    public Hero() {
//        System.out.println("Constructor HERO");
//    }

    public Hero(String name1, String color) {
//        super();
        name = name1;
        this.color = color;
//        this(name1, color, 3, 2);

//        this(name1, color, NUMBER_OF_LIVES);
    }

//    public Hero(String ololo , String hello) {
//
//    }

    public Hero(String name, String color, Integer numberOfLives) {
        this(name, color, numberOfLives, DEFAULT_SIZE);
    }

    //code -> generate
    public Hero(String name, String color, Integer numberOfLives, Integer size) {
//        super();
        this.name = name;
        this.color = color;
        this.numberOfLives = numberOfLives;
        this.size = size;
    }

    void moveLeft() {
        System.out.println("move left 1 tile");
    }

    void moveRight() {
        System.out.println("move right 1 tile");
    }

    void jump() {
        int tiles = 2;
        if (size == 1) {
            tiles = 1;
        } else if (size == 3) {
            tiles = 4;
        }
        System.out.println("jump " + tiles + " tiles");
    }

    void sit() {
        System.out.println("try go into pipe");
    }
}
