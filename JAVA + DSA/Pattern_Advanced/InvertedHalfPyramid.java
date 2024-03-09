package Pattern_Advanced;

public class InvertedHalfPyramid {

    public static void Inverted_Pyramid(int n) {
        //outer loop
        for(int i = 1; i <= n; i++){
            //inner loop

            //for print spaces
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }

            //for print stars
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }

            //for next line after completed the inner loop
            System.out.println();
        }
       
    }
    public static void main(String[] args) {
        int n = 5;
        Inverted_Pyramid(n);     //function calling
    }
}
