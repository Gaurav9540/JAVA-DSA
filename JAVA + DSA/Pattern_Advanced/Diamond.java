package Pattern_Advanced;

public class Diamond {

    public static void diamond_pattern(int n){
        //First Half
        //outer loop
        for(int i = 1; i <= n; i++){
            //inner loop
            //spaces - (n-i)
            for(int j = 1; j <= (n-i); j++){
                System.out.print(" ");
            }
            //star - i - (2*i)-1
            for(int j = 1; j <= (2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //Second Half
        //outer loop
        for(int i = n; i >= 1; i--){
            //inner loop
            //spaces - (n-i)
            for(int j = 1; j <= (n-i); j++){
                System.out.print(" ");
            }
            //star - i - (2*i)-1
            for(int j = 1; j <= (2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int n = 5;
        diamond_pattern(n);
    }
}
