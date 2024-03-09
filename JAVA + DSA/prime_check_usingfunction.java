import java.lang.Math;
public class prime_check_usingfunction {
    
    //only for n>=2

    // public static boolean isPrime(int n){
    //     //corner case for 2
    //     if(n == 2){
    //         return true;
    //     }

    //     boolean isPrime = true;
    //     for(int i = 2; i <= n-1; i++){
    //         if(n % i == 0){
    //             isPrime = false;
    //             break;
    //         }  
    //     }
    //     return isPrime;
    // }

    // --------------- another method -----------------

    // Optimize  the program for time saving 

    public static boolean isPrime(int n){

        if(n == 2){
            return true;
        }

        for(int i = 2; i <= Math.sqrt(n); i++ ){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    //range function 

    public static void PrimeInRange(int n){
        for(int i = 2; i <= n; i++){
            if (isPrime(i)){               //if true then print
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {

        // int n = 11;
        // isPrime(n);
        // boolean isPrime = isPrime(n);
        // System.out.println(isPrime);

        // OR we can write as follow using one line statement
        // System.out.println(isPrime(4));

        // calling for range function

        int a = 60;      //range from 2 to 50
        PrimeInRange(a);   //calling for range function
      
    }
}
