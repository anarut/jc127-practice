package lesson18;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main3 {

    public static void main(String[] args) throws IOException {
//        final Person person = new Person("Andrey", "qwerty");
//        try (FileOutputStream fos = new FileOutputStream("persons.data");
//             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
//            oos.writeObject(person);
//        }


        try (var fos = new FileInputStream("persons.data");
             var oos = new ObjectInputStream(fos)) {
            final Object o = oos.readObject();
            if (o instanceof Person p) {
//                Person p = (Person) o;
                System.out.println(p);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
