package lesson10;

import lesson08.Point;

import java.math.BigInteger;

public class Main2 {

    public static void main(String[] args) {
        Account alex_white = new Account("Alex White", 123213455, 100);
        StringIdAccount account = new StringIdAccount("black jack", "aas1234asda", 666);

        GenericAccount<Integer, Integer> ab = new GenericAccount<>("a b", 123321, 11);
        GenericAccount<String, Integer> cd = new GenericAccount<>("c d", "asda", 11);
        Object id = cd.getId();
        String id1 = cd.getId();
        Integer id2 = ab.getId();

        GenericAccount<Long, Integer> abx = new GenericAccount<>("a b", 123321L, 11);
        Long id3 = abx.getId();


        GenericAccount<Long, BigInteger> abv = new GenericAccount<>("a b", 123321L, BigInteger.ZERO);
        BigInteger amount = abv.getAmount();

        GenericAccount<Long, Double> abvb =
                new GenericAccount<Long, Double>("a b", 123321L, 0d);


        String todo = abvb.todo("");
        Integer todo1 = abvb.todo(1);
        Point todo2 = abvb.todo(new Point(1, 1));
    }
}
