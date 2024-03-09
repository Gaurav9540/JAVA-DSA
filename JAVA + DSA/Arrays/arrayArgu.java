package Arrays;

public class arrayArgu {
    public static void update(int marks[], int nonchangeable) {      //another function
        nonchangeable = 10;       
        for(int i = 0; i < marks.length; i++){
            marks[i]  = marks[i] + 1;
            //index no.    old index  + 1
        }  
    }
    public static void main(String[] args) {         //main function  
        int marks[] = {95, 97, 99};
        int nonchangeable = 5;
        update(marks, nonchangeable);
        System.out.println(nonchangeable);

        //print our marks

        for(int i = 0; i < marks.length; i++){
            System.out.print(marks[i] + " ");
        }
        System.out.println();

    }
}
