package lesson04;

import java.util.Arrays;
import java.util.Random;

//Исключить одинаковые элементы массива
// (каждое значение должно присутствовать в единственном экземпляре).
public class Main4 {

    public static void main(String[] args) {
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(15) + 1;
//            System.out.print(arr[i] + " ");
        }
        System.out.println(Arrays.toString(arr));

        int newLength = arr.length;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = -arr[i];
                    newLength--;
                    break;
                }
            }
        }
        System.out.println(newLength);
        System.out.println(Arrays.toString(arr));
        int[] newArr = new int[newLength];
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                newArr[idx++] = arr[i];
            } else {
                arr[i] = -arr[i];
            }
        }
        System.out.println(Arrays.toString(newArr));
        System.out.println(Arrays.toString(arr));
    }
}
