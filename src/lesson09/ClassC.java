package lesson09;

public class ClassC {

    private ClassA classA = new ClassA(1, 1);
    private ClassB classB = new ClassB();

    public ClassC(ClassA classA, ClassB classB) {
        this.classA = classA;
        this.classB = classB;
    }

    public ClassC(int a1, int a2) {
        this.classA = new ClassA(a1, a2);
        this.classB = new ClassB();
    }

    public void methodA() {
        classA.methodA();
    }
    public void anotherMethodA() {
        classA.anotherMethodA();
    }
    public void methodB() {
        classB.methodB();
    }
    public int anotherMethodB() {
        return classB.anotherMethodB();
    }



}
