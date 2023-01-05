package lesson07;

public class Main {

    public static void main(String[] args) {
        String str = "hsergd";
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(str.length() - 1));
        if (str.length() % 2 != 0) {
            System.out.println(str.charAt(str.length() / 2));
        }


        String str1 = "afdgysudfgksdufgksdugsdhjfasgdsf";
        char lastCh = str1.charAt(str1.length() - 1);
        for (int i = 0; i < str1.length() - 1; i++) {
            if (str1.charAt(i) == lastCh) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
        int idx = str1.indexOf(lastCh);
        while (idx > 0) {
            System.out.print(idx + " ");
            idx = str1.indexOf(lastCh, idx + 1);
        }

        String str2 = "I have a book The world is cool and colorful and full of smile";
        String[] strArr = str2.split(" ");
        String maxString = strArr[0];
        for (String s : strArr) {
            if (s.length() > maxString.length()) {
                maxString = s;
            }
        }
        System.out.println();
        System.out.println(maxString);


        String str3 = "А роза упала на лапу Азора";

        String newString = str3.replaceAll(" ", "");
        System.out.println(newString);
        newString = newString.toLowerCase();
        System.out.println(newString);
        boolean polendrom = true;
        for (int i = 0; i < newString.length() / 2 && polendrom; i++) {
            if (newString.charAt(i) != newString.charAt(newString.length() - 1 - i)) {
                polendrom = false;
            }
        }
        System.out.println(polendrom);
    }
}
