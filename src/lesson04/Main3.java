package lesson04;

import java.util.Random;

public class Main3 {

    public static void main(String[] args) {
        System.out.println(args.length);

        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }


        int[] massiv = new int[10];
        for (int i = 0; i < massiv.length; i++) {
            massiv[i] = new Random().nextInt(100);
            System.out.print(massiv[i] + " ");
        }
        int max = massiv[0];
        for (int i = 0; i < massiv.length; i++) {
            if (max < massiv[i]) {
                max = massiv[i];

            }
        }
        System.out.println();
        System.out.println(max);

        int min = massiv[1];
//        for (int i=0; i<massiv.length; i++) {
//            if (i % 2 != 0 && massiv[i] < min) {
//                min = massiv[i];
//            }
//        }
        for (int i = 1; i < massiv.length; i+=2) {
            if (massiv[i] < min) {
                min = massiv[i];
            }
        }
        System.out.println(min);

    }
}
