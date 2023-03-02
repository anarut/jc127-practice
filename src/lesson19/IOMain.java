package lesson19;

import java.io.File;
import java.nio.file.FileSystem;
import java.nio.file.Path;

public class IOMain {

    public static void main(String[] args) {
        final Path of = Path.of(".");
        final Path fileName = of.getFileName();
        final FileSystem fileSystem = of.getFileSystem();
        System.out.println(of.toAbsolutePath());
        System.out.println(of.normalize().toAbsolutePath());
        System.out.println(new File(".").getAbsolutePath());

        String text =
                """
                Когда поток вызовет метод interrupt(), метод sleep() сгенерирует исключение InterruptedException, и управление перейдет к блоку catch. Но если проверить статус потока, то увидим, что метод isInterrupted() возвращает false. Как вариант, в этом случае мы можем повторно прервать текущий поток, опять же вызвав метод interrupt(). Тогда при новой итерации цикла while метод isInterrupted() возвратит true, и поизойдет выход из цикла.
                Либо можно сразу же в блоке catch выйти из цикла с помощью break
                """;
    }
}
