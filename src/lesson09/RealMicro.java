package lesson09;

public class RealMicro implements Microfon {
    @Override
    public boolean power() {
        return false;
    }

    @Override
    public boolean mute() {
        return false;
    }

    @Override
    public void loud(int percent) {

    }

//    @Override
    public void record() {
        System.out.println("real storage save");
    };
}
