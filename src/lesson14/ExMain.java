package lesson14;

import java.io.IOException;
import java.util.Random;

public class ExMain {


    public static void main(String[] args) {
        try {
            connectToDB();
        } catch (Throwable e) {
            e.printStackTrace();
            System.out.println("no data");
//            throw e;
            throw new RuntimeException("Failed to connect to DB", e);
        }
    }

    public static void connectToDB() throws Exception {
        IOException e = new IOException("tt");
        if (new Random().nextBoolean()) {
            throw e;
        }
    }
}
