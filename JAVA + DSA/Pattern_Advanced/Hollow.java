package Pattern_Advanced;

public class Hollow {

    public static void hollow_reactangle(int totRows, int totCols) {
        //outer loop - rows
        for(int i = 1; i <= totRows; i++){
            //inner loop - columns
            for(int j = 1; j <= totCols; j++){
                //cell - (i,j)
                if(i == 1 || i == totRows || j == 1 || j == totCols){
                    //boundary cells
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        int totRows = 10;
        int totCols = 10;

        hollow_reactangle(totRows, totCols);   //call the hollow_reactangle function
    }
}
