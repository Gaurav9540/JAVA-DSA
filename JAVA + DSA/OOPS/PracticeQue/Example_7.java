package OOPS.PracticeQue;

public class Example_7 {
    public static void main(String[] args) {
        Test t = new Test();
        t.changeB();
        System.out.println(Test.a + Test.b);
    }
}

class Test {
    static int a = 10;
    static int b;            // no value java set by-default 0
    static void changeB(){   // function to change the value of b
        b = a * 3;
    }
}
