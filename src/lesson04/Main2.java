package lesson04;

public class Main2 {

    public static void main(String[] args) {
        int n = 10;
        int m = 6;

        for (int b = 1; b <= m; b++) {
            for (int a = 1; a <= n; a++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");

            }
            System.out.println();
            
        }


    }
}
