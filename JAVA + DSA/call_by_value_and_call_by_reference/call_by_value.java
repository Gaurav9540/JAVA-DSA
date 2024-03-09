package call_by_value_and_call_by_reference;

// In call by value, a copy of the actual parameter's value is passed to the method. 
// This means that any changes made to the parameter within the method do not affect 
//the original value of the variable outside the method.

public class call_by_value { 
    public static void main(String[] args) {               // main function
        int num = 10;
        System.out.println("Before calling method: " + num);
        increment(num);
        System.out.println("After calling method: " + num);
    }

    public static void increment(int num) {
        num++;                                     // Incrementing the value of the parameter
        System.out.println("Inside method: " + num);
    }
}
