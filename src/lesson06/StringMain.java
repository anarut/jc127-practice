package lesson06;

public class StringMain {

    public static void main(String[] args) {
        String name = "Victoria" + "III";
        String victoria = new String("Victoria");
        String s = "";
        System.out.println();

        System.out.println(name == victoria);
        System.out.println(name.equals(victoria));
        System.out.println(name == victoria.intern());
        System.out.println(name.equalsIgnoreCase(victoria));


        String s_old = "Hello asdas\n\nasdas\n\n" +
                "asd\nas\nd";
        String s_new =
                """
               Hello asdas
               
               asdas
               
               asd
               as
               d
                """;

        s_new.charAt(5);

        System.out.println(name.substring(5, 7));

        String s1 = "       ".trim(); //""
    }
}
