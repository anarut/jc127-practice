package lesson18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {
        String fileName = "../test.txt";
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(fileName, true);
            Properties properties = System.getProperties();

            fos.write("hello world\n".getBytes());
            for (Map.Entry e : properties.entrySet()) {
                fos.write(String.format("%s ---> %s \n", e.getKey(), e.getValue()).getBytes());
            }
//            properties.forEach((k, v) -> {
//                System.out.printf("%s ---> %s \n", k, v);
//            });
            System.out.println("-------------");
            Map<String, String> getenv = System.getenv();
            getenv.forEach((k, v) -> {
                System.out.printf("%s ---> %s \n", k, v);
            });


            fos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        System.out.println(" SECOND PART");
        try (FileInputStream fis = new FileInputStream(fileName)) {
            byte[] bytes = fis.readAllBytes();
            String s = new String(bytes);
            System.out.println(s);
        } catch (IOException e) {
            e.printStackTrace();
        }




    }
}
