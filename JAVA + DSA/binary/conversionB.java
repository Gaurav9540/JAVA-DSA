// Decimal to Binary Conversion and Taking Binary number from the user

package binary;

import java.util.Scanner;

public class conversionB {
    
    public static void decTobin(int decNum){
        int MyNum = decNum;
        int binNum = 0;
        int pow = 0;


        while(decNum > 0){
            int rem = decNum % 2;
            binNum = binNum + (rem * (int)Math.pow(10, pow));
            pow++;
            decNum = decNum/2;
        }
        System.out.println("binary of " + MyNum + " = " + binNum);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decNum = sc.nextInt();
        sc.close();
        decTobin(decNum);
    }
}
