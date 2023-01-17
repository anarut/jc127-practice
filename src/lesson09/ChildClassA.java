package lesson09;

public class ChildClassA extends ClassA {

    int a1;
    int a2;

    public ChildClassA(int a1, int a2) {
        super(a1, a2);
        this.a1 = a1 + 10;
        this.a2 = a2 + 10;
    }

    @Override
    public int getA1() {
        return super.getA1();
    }

    @Override
    public int getA2() {
        return a2;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void methodA() {
        super.methodA();
    }
}
