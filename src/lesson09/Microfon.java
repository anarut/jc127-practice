package lesson09;

public interface Microfon {

    boolean power();

    boolean mute();

    void loud(int percent);

    default void record() {
        System.out.println("storage save");
    };
}
