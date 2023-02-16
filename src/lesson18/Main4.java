package lesson18;

import java.io.File;
import java.io.IOException;

public class Main4 {

    public static void main(String[] args) throws IOException {
        final File file = new File("test.txt");
        System.out.println(file.getName());
        System.out.println(file.getAbsolutePath());
        System.out.println(new File("../../").getCanonicalFile().getAbsolutePath());
        final boolean exists = file.exists();
        file.isDirectory();
        file.isFile();
        System.out.println(file.toURI());



    }
}
