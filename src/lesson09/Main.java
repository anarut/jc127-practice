package lesson09;

public class Main {

    // 0 0      0
    // 1 2      0
    // 11 12    -1
    // 10 10    0
    // error    1
    public static void main(String[] args) {
        ChildClassA childClassA = new ChildClassA(1, 2);
        System.out.println(childClassA.a1);
        System.out.println(childClassA.a2);
        System.out.println();

    }

    public void todo(Microfon microfon) {
        microfon.power();
        microfon.loud(90);
        microfon.mute();
        microfon.loud(40);
        microfon.mute();
        microfon.power();
    }
}
