package lesson06;

public class Main {

    public static void main(String[] args) {
        Hero hero = new Hero("Mario", "blue-red");
        System.out.println(hero);
        Object s = hero.toString();
        Boolean equals = hero.equals("");

        Object ivan = new Hero("Ivan", "green", 5, 3);
        hero.jump();
        hero.moveRight();

        if (ivan instanceof Hero) {
            Hero ivanHero = (Hero) ivan;
            ivanHero.moveRight();
        }

        if (s instanceof Hero) {
            Hero s1 = (Hero) s;
        }

//        Hero hero1 = new Hero();

        Hero superHero = new SuperHero();
        superHero.jump();
    }
}
