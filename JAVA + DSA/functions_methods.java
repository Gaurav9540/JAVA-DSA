// import java.util.Scanner;

public class functions_methods {

    // public static void printHelloWorld(){
    // System.out.println("Hello World");
    // System.out.println("Hello World");
    // System.out.println("Hello World");
    // System.out.println("Hello World");
    // System.out.println("Hello World");
    // }

    // public static void calculateSum(int num1, int num2){ //(int num1, int num2)
    // -------> parameters and formal parameters
    // int sum = num1 + num2;
    // System.out.println("The sum is: " + sum);

    // }
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // sc.close();

    // int a = sc.nextInt();
    // int b = sc.nextInt();
    // calculateSum(a, b); //(a, b) ---------> arguments or actual parameters

    // **************************************************************************************************

    //use of call by value

    public static void swapofTwonum(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        //Here we made a changes in this function it is only showing only this function not showing outside of function
        //changes that we are make
        System.out.println("value of a is: " + a);
        System.out.println("value of b is: " + b);

    }

    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        //original values changes that are made in above function that are not showing in this function
        //print original values 
        System.out.println("value of main function a is: " + a);
        System.out.println("value of main function b is: " + b);

        swapofTwonum(a, b);
    }

}
