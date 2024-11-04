package Wrapper;

public class Test {
    private Integer id;

    public Test func(Test t) {
        Test tt = new Test();
        tt.id = 3;
        tt = t;
        return tt;
    }

    public static void main(String[] args) {
//        int a = 1;
//        int b = 2;
        Integer c = 3;
        Integer d = 4;
//        double e = 2.6;
//        float f = 1.9f;
        Float f = 3.4f;
        Double e = 5.2;

//        System.out.println(a+b);
//        System.out.println(c+d);
//        System.out.println(f+e);

        int g = d.intValue();
//        System.out.println(g);

        Test tst = new Test();
        tst.id = 2;
        Test tst1 = tst.func(tst);
        System.out.println(tst1.id);
        System.out.println(tst);
        System.out.println(tst1);
    }
}
