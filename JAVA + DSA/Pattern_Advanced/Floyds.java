package Pattern_Advanced;

public class Floyds {

    public static void floyds_triangle(int n){
        int counter = 1;
        //outer loop to decide how many lines to be print 
        for(int i = 1; i <= n; i++){
            //inner loop to decide logic to print 
            for(int j = 1; j <= i; j++ ){
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        
        int n = 4;

        floyds_triangle(n);  //function calling 
    }
}
