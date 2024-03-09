import java.util.Scanner;

public class loops {
    public static void main(String[] args) {

        // while loop

        int count = 1;
        while (count <= 10) {
        System.out.println("Hello world");
        count ++;
        }

        // ----------------------------------------------------

        // print in multiple line
        // int count = 1;
        // while (count <= 100){
        // System.out.println(count);
        // count++;
        // }

        // print in single line
        // int count = 1;

        // -------------------------------------------------------------------

        // Example - print number from 1 to n

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number: ");
        // int n = sc.nextInt();

        // int count = 1;
        // while (count <= n){
        // System.out.println(count+ " ");
        // count++;

        // }

        // ------------------------------------------------------------------------

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number: ");
        // int n = sc.nextInt();
        // int sum = 0;

        // int i = 1;
        // while (i <= n) {
        // sum = sum + i;
        // i++;

        // }
        // System.out.println("sum is: " + sum);

        // ***********************************************************************************

        // FOR LOOP

        // for(int i = 1; i <= 10; i ++){
        // System.out.println("Hello world");
        // }

        // ----------------------------------------

        // for(int i = 1; i <=10; i++){
        // System.out.println("Hi");
        // }

        // ----------------------------------------------------------------------------------

        // Example - print * in square pattern using for loop

        // for(int line = 1; line <= 4; line++){
        // System.out.println("* * * *");
        // }

        // ----------------------------------------------------------------------

        // Example - print * in square pattern using while loop

        // int line = 1;

        // while (line <= 4) {
        // System.out.println("* * * *");
        // line++;
        // }

        // --------------------------------------

        // Example - reverse of a number

        // int n = 50876;

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number: ");
        // int n = sc.nextInt();

        // while (n > 0) {
        // int lastdigit = n % 10;
        // System.out.print(lastdigit);
        // n = n / 10;
        // }
        // System.out.println();

        // ------------------------- OR -----------------------------

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number: ");
        // int n = sc.nextInt();
        // int n = 10899;
        // int rev = 0;

        // while (n > 0) {
        // int lastdigit = n % 10;
        // rev = (rev*10) + lastdigit;
        // n = n/10;
        // }
        // System.out.println(rev);

        // ************************************************************************

        // do-while loop
        // int i = 1;
        // do {
        // System.out.println("Hello Bala");
        // i++;
        // } while (i <= 10 );

        // -----------------------------------------------------------

        // Break Statement

        // for(int i = 1; i <= 10; i++){
        // if(i==5){
        // break;
        // }
        // System.out.println(i);
        // }
        // System.out.println("I am out of the loop");

        // ----------------------------------------------------------------

        // Example - keep entering numbers till user enters a multiple of 10

        // Scanner sc = new Scanner(System.in);

        // do {
        // System.out.println("Enter your num: ");
        // int n = sc.nextInt();

        // if(n % 10 == 0){
        // break;
        // }
        // System.out.println("your number is: " + n);
        // } while (true);
        // System.out.println("Sucessfully Exit From Loop !!!");

        // ------------------------------------------------------------------------

        // Continue Statement

        // for(int i = 1; i <= 5; i++){
        // if(i==3){
        // continue;
        // }
        // System.out.println(i);
        // }

        // ---------------------------------------------------------------------------

        // Example - display all numbers entered by user except multiples of 10

        // Scanner sc = new Scanner(System.in);
        // sc.close();
        
        // do {
        //     System.out.println("Enter a num: ");
        //     int num = sc.nextInt();
        //     if(num % 10 == 0){
        //         continue;
        //     }
        //     System.out.println("your number is: " + num);

        // } while (true);

    

    
    }
}
