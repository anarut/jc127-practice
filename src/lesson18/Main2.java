package lesson18;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main2 {

    public static void main(String[] args) throws IOException {

        try (FileWriter fileWriter = new FileWriter("test2.txt");
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write("Hello");
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }

        try (FileReader fileReader = new FileReader("test2.txt");
             final BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String s = bufferedReader.readLine();
            while (s != null) {
                System.out.println(s);
                s = bufferedReader.readLine();
            }
            System.out.println(s);
        }
    }
}
