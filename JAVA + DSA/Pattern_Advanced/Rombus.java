package Pattern_Advanced;

public class Rombus {

    public static void solid_rombus(int n) {
        //outer loop 
        for(int i = 1; i <= n; i++){
            //inner loop
            //print spaces
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            //print stars
            for(int j = 1; j <= n; j++){
                System.out.print("*");
            }
            System.out.println();     //next line
        }
    }

    public static void hollow_rombus(int n){
        //outer loop
        for(int i = 1; i <= n; i ++){
            //inner loop
            //to print spaces
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            //hollow rectagle boundary
            for(int j = 1; j <= n; j++){
                if(i == 1 || i == n || j == 1 || j == n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    
    public static void main(String[] args) {
        int n = 5;
        // solid_rombus(n);    //function calling

        hollow_rombus(n);
    }
}
