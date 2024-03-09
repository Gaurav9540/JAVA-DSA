// Example to illustrate Compile-Time polymorphism
// achieved through Method Overloading

package OOPS.Polymorphism;

public class Compile {
    public static void main(String[] args) {

        Calculator calc = new Calculator();
        int sum1 = calc.add(5, 10); // Calls the first add method
        System.out.println(sum1);

        // --------------------------
        // we can write as follw 
        // System.out.println(calc.add(5, 10));
        // -----------------------------

        int sum2 = calc.add(5, 10, 15); // Calls the second add method
        System.out.println(sum2);

        double sum3 = calc.add(2.5, 3.5); // Calls the third add method
        System.out.println(sum3);
    }
}

    class Calculator {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }
}


// In this example, the compiler determines which 'add' method to call based on 
// the number and types of arguments passed in each method call, and this 
// decision is made at compile time. This is compile-time polymorphism in action.

