package Pattern_Advanced;

public class Triangle {

    public static void zero_one_triangle(int n){
        //outer loop 
        for(int i = 1; i <= n; i++){
            //inner loop
            for(int j = 1; j <= i; j++){
                if((i + j) % 2 == 0){
                    System.out.print("1");       //if even then print 1
                } else {
                    System.out.print("0");       //if odd then print 0
                }
                
            }
            System.out.println();    //print next line
        }
    }

    public static void main(String[] args) {
        int n = 5;
        
        zero_one_triangle(n);     //function calling
       
    }
}
