package Pattern_Advanced;

public class NumPyramid {

    public static void number_pyramid(int n) {
        //outer loop
        for(int i = 1; i <= n; i++){
            //inner loop
            //print spaces - n-i
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            //print numbers
            for(int j = 1; j <= i; j++){
                System.out.print(i+ " ");
            }
            System.out.println();    //next line
        }
    }

    public static void palindromic_number_pattern(int n){
        //outer loop
        for(int i = 1; i <= n; i++){
            //inner loop
            //print spaces - n-i
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }

            //print number in decending
            for(int j = i; j >=1; j--){
                System.out.print(j);
            } 

            //print number in ascending
            for(int j = 2; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();    //next line
        }
    }
    public static void main(String[] args) {
        int n = 5;

        // number_pyramid(n);           //function calling
        palindromic_number_pattern(n);  //function calling
    }
}
