import java.util.Scanner;

public class hello {

    //Take input from user

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // sc.close();
        //string
        String input = sc.nextLine();
        System.out.println("name is: " + input);

        //number
        int number = sc.nextInt();
        System.out.println("number is: " + number);

       
    }
}
