package lesson14;

import java.util.ArrayList;
import java.util.List;

public class ExceptionMain {

    public static void main(String[] args) {

        List<String> countries = null;
//        if (countries != null) {
//            countries.add("Norway");
//        }

//        if (countries == null) {
//            countries = new ArrayList<>();
//        }
        try {
            countries.add("Norway");
            countries.add("Sweden");
            countries.add("Finland");
            String s = countries.get(4);
        } catch (NullPointerException e) {
            System.out.println("No collection");
//            e.printStackTrace();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("No item with this index");
//            e.printStackTrace();
        }

        try {
            countries.add("Norway");
            countries.add("Sweden");
            countries.add("Finland");
            String s = countries.get(10);
        } catch (NullPointerException | IndexOutOfBoundsException e) {
            System.out.println("Error");
        }

        try {
            countries.add("Norway");
            countries.add("Sweden");
            countries.add("Finland");
            String s = countries.get(15);
        } catch (Exception e) {
            System.out.println("Error");
        } finally {
            System.out.println("TRY-CATCH end");
        }


        try {
            countries.add("Norway");
            countries.add("Sweden");
            countries.add("Finland");
            String s = countries.get(15);
            throw new RuntimeException();
        } finally {
            System.out.println("TRY-CATCH end");
        }

//        System.out.println("REAL END");
    }
}
