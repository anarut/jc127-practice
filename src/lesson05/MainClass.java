package lesson05;

import java.util.Arrays;
import java.util.Scanner;

public class MainClass {

    public static final int NUMBER_OF_TIMES = 10;

    public static void main(String[] args) {
        int monthInYear = 5;
        String dayOfWeek = "Monday";

        monthInYear = monthInYear + 5;
        monthInYear++;


        int[][] a = new int[3][2];
        a[0] = new int[4];
        a[1] = new int[2];
        a[2] = new int[0];

        a[0][0] = 5;
        a[0][1] = -3;
        a[0][2] = -4;
        a[0][3] = 4;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.print(Arrays.toString(arr));

        Arrays.binarySearch(arr, 4);
        int[][][] b = new int[n][n][n];

        Main main = new Main();
        int a1 = main.a;
//        int d = main.d;
        int c = main.c;
        int b1 = main.b;

    }
}
