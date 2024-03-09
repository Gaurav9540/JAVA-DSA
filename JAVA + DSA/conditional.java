import java.util.*;

public class conditional {
    
    public static void main(String[] args) {

        //example
        // int age = 21;

        // if (age >= 18) {
        //     System.out.println("Adult");
        //     System.out.println("you can vote");
        //     System.out.println("you can drive");
        // }
        // else if (age >=13 && age < 18) {
        //     System.out.println("Teenager");
        // }
        // else {
        //     System.out.println("child");
        //     System.out.println("you can not vote");
        //     System.out.println("you can not drive");
        // }

        // ------------------------------------------------------------

        //print largest of two number 

        // int A = 1;
        // int B = 3;
        // if (A > B) {
        //     System.out.println("A is Large");
        // } else {
        //     System.out.println("B is Large");
        // }

        // -----------------------------------------------------------------

        //Even or Odd
        
        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        

        // if (num % 2 ==0) {
        //     System.out.println("The number is EVEN");
        // } else {
        //     System.out.println("The number is ODD");
        // }

        // -------------------------------------------------------------------

        //Income tax Calculator

        // Scanner sc = new Scanner(System.in);
        // int income = sc.nextInt();
        // int tax;

        // if (income < 500000) {
        //     tax = 0;
        //     System.out.println("your tax is: " + tax);
        // } 
        // else if (income >= 500000 && income < 1000000){
        //     tax = (int)(income * 0.2);
        //     System.out.println("your tax is: " + tax);
        // }
        // else {
        //     tax = (int)(income * 0.3 );
        //     System.out.println("your tax is: " + tax);
        // }

        // --------------------------------------------------------------------

        //largest of three taking input from user

        // Scanner sc = new Scanner(System.in);
        // int A = sc.nextInt();
        // int B = sc.nextInt();
        // int C = sc.nextInt();

        // int A = 10;
        // int B = 30;
        // int C = 60;

        // if ((A >= B) && (A >= C)) {
        //     System.out.println("A is grether");
        // } 
        // else if (B >= C) {
        //     System.out.println("B is grether");
        // }
        // else {
        //     System.out.println("C is grether");
        // }

        // --------------------------------------------------------------------
        //Ternary operator

        // int A = 5;

        // String type = (A % 2 == 0)? "EVEN" : "ODD";
        // System.out.println(type);

        // -------------------------------------------------------------------------

        //Example of ternary check student will pass or fail

        // Scanner sc = new Scanner(System.in);
        // int marks = sc.nextInt();

        // int marks = 50;

        // String Result = (marks >= 33)? "PASS" : "FAIL";
        // System.out.println(Result);

        // ---------------------------------------------------------------------------

        // Switch Statement

        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // int num = 2;

        // switch (num) {
        //     case 1: System.out.println("PIZZA");
        //         break;
        //     case 2: System.out.println("BURGER");
        //         break;
        //     case 3: System.out.println("MANGO");
        //         break;
        //     default: System.out.println("Watching a Dream");
        
        // }


        // ---------------------------------------------------------------------------

        //calculator example using switch 

        Scanner sc = new Scanner(System.in);
        sc.close();

        System.out.println("Enter a: ");
        int a = sc.nextInt();

        System.out.println("Enter b: ");
        int b = sc.nextInt();

        System.out.println("Enter operator: ");
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+': System.out.println("Result is: " + (a+b));
                break;

            case '-': System.out.println("Result is: " + (a-b));
                break;

            case '*': System.out.println("Result is: " + (a*b));
                break;

            case '/': System.out.println("Result is: " + (a/b));
                break;

            case '%': System.out.println("Result is: " + (a%b));
                break;
        
            default: System.out.println("INVALID !!!!");
        
        }

        // --------------------------------------------------------------------------------------


        
    }
}
