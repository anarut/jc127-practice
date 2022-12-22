package lesson03;

public class NextDay {

    public static void main(String[] args) {
        int x = -672_354_782;

        int r = (x % 7 + 7) % 7;

//        r = x % 7;
//        if (x < 0) {
//            r = r + 7;
//        }

//        if (x >= 0 ) {
//            r = x % 7;
//        } else {
//            r = x % 7 + 7;
//        }

//        r = x >= 0 ? x % 7 : x % 7 + 7;

//        r =  x % 7 + (x >= 0 ? 0 : 7);

        switch (r) {
            case 0:
                System.out.println("Чт");
                break;
            case 1:
//            case -6:
                System.out.println("Пт");
                break;
            case 2:
//            case -5:
                System.out.println("Сб");
                break;
            case 3:
//            case -4:
                System.out.println("Вск");
                break;
            case 4:
//            case -3:
                System.out.println("Пн");
                break;
            case 5:
//            case -2:
                System.out.println("Вт");
                break;
            case 6:
//            case -1:
                System.out.println("Ср");
                break;
        }
    }
}
