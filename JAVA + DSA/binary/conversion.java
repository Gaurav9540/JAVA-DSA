// Binary to Decimal Conversion and Taking Binary number from the user

package binary;

import java.util.Scanner;

public class conversion {
    public static void binTode(int binNum){
        int Mynum = binNum;
        int pow = 0;
        int decNum = 0;


        while(binNum > 0){
            int lastdigit = binNum % 10;
            decNum = decNum + (lastdigit * (int)Math.pow(2, pow));

            pow ++;
            binNum = binNum / 10;
    
        }
        System.out.println("decimal of " + Mynum +" = " + decNum);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        int binNum = sc.nextInt();
        sc.close();
        binTode(binNum);
    }
}
