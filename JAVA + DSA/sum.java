//SUM OF a & b (INPUT FROM USER)

import java.util.*;

public class sum {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        sc.close();
         
        //sum of two numbers
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum = a + b;
    
        // System.out.println("sum of a & b is: " + sum);
    
        // -------------------------------------------------------------------
        //area of circle

        // float r = sc.nextFloat();
        // float area = 3.14f * r * r;

        // System.out.println("area of circle is : " + area);

        // ----------------------------------------------------------------------


        //Type Casting

        // 1. java not allowed to do this
        // float a = 25.12f;
        // int b = a;
        // System.out.println(b);

        //2. forcefully conversion
        // float a = 25.12f;
        // int b = (int)a;
        // System.out.println(b);


        //PreIncrement And PostIncrement

        // Pre-Increment
        // int a = 10;
        // int b = ++a;

        // System.out.println(a);          //output 11   first increment 
        // System.out.println(b);          //output 11   then use

        // Post-Increment

        // int c = 10;
        // int d = c++;
        // System.out.println(c);         //output 11    first use 
        // System.out.println(d);         //output 10    then increment


        // Pre-Decrement

        int a = 10;
        int b = --a;
        
        System.out.println(a);           //output 9
        System.out.println(b);           //output 9

        //Post-Decrement

        int c = 10;
        int d = c--;

        System.out.println(c);          //output 9
        System.out.println(d);          //output 10
 


    }
    
}
