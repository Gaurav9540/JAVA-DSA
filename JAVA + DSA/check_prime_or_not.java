import java.util.*;

public class check_prime_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check whether prime or not: ");
        int n = sc.nextInt();
        sc.close();

        if (n == 2) {
            System.out.println(n + " is prime");
        } else {

            boolean isPrime = true;
            for (int i = 2; i <= n-1; i++) {
                if (n % i == 0) {
                    isPrime = false;
                }
            }
            if (isPrime == true) {
                System.out.println(n + " is prime");
            } else {
                System.out.println(n + " is not prime");
            }

        }

    }
}
