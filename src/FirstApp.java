public class FirstApp {
    public static void main(String[] args) {
        System.out.println("Hello students ' of\\ \"" +
                "Java\" group");

        System.out.println(Integer.toBinaryString(-127));
        byte a = 27;
        byte b = 37;
        byte c = (byte) (a + b);
//        byte e = a - b;

        char a1 = 33;
        char b1 = 66;

//        char c1 = a1 + b1;
        double v = 0.1f;
//        float f = 1d;

        char h = '\'';
        long l = 111234567890L;

        int j = -15; // 0000 0000 1x`
        System.out.println(j);
        byte j1 = (byte) j;
        System.out.println(j1);

//        var test3;
//        test3 = SuperPuperDuperLontTextClass.SuperPuperLongEnum.TEST;


        int z = 5;
        System.out.println(z++);

        System.out.println(z);
        z = z + 1;

        ///
        System.out.println(++z);

        z = z + 1;
        System.out.println(z);


        z *= 66;
        z = z * 66;

    }
}
