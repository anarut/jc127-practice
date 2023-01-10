package lesson07;

import java.math.BigInteger;

public class Main2 {

    public static void main(String[] args) {
        StringBuilder sBuilder = new StringBuilder()
                .append("hello")
                .append(" ")
                .append(15)
                .append("asdfasdsgkhsdfkgsd")
                .delete(5, 7);

        int n = 25;

        long start = System.currentTimeMillis();
        String s = "";
        for (int i = 0; i < n; i++) {
            s += i;
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        System.out.println("----");

        start = System.currentTimeMillis();
        StringBuilder builder = new StringBuilder(1388890);
        for (int i = 0; i < n; i++) {
            builder.append(i);
        }
        end = System.currentTimeMillis();
        System.out.println(end - start);
        System.out.println("length:" + builder.length());

        Integer a = null;
        if (a != null) {
            int b = a;
        }

        BigInteger bigInteger = new BigInteger("134896589345687346573465876342895634287657843265873426578346");
        System.out.println(bigInteger);
        BigInteger divide = bigInteger.divide(BigInteger.TEN);
        divide.multiply(new BigInteger("12312321"));


    }
}
