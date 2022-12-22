package lesson03;

public class Main {

    public static void main(String[] args) {
        System.out.println(String.format("%s hello", "test"));
        System.out.printf("%s hello\n", "test");

        byte[] d;
        int g = 455 / 10;

        int h = (int)(78 + 8L);

        double m = 99;
        double o = 333f;

        float t = 1.01f;

        char w = 115;

        char z = 'z' - 'A';


        byte b = 1;
        b *= 1002;

        int i = 3;
        b += i++;

        System.out.println(b);

        float f = 1.1f;                 // line 14
        b /= f;

        System.out.println(b);


        char grade = 'C';

        switch (grade) {
            case 'A':
                System.out.println("Отлично!");
                break;
            case 'B':
            case 'C':
                System.out.println("Отлично выполнено");
                break;
            case 'D':
                System.out.println("Вы прошли");
                break;
            case 'F':
                System.out.println("Лучше попробуйте снова");
                break;
            default:
                System.out.println("Неверная оценка");
        }
        System.out.println("Ваша оценка " + grade);
    }
}
