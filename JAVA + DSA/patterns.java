public class patterns {
    public static void main(String[] args) {

        // To print star pattern
        // *
        // **
        // ***
        // ****    like this
 
        
        // for(int line = 1; line <= 4; line++){
        //     // its print one line
        //     for(int star = 1; star <= line; star++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // --------------------------------------------------------------------

        // To print Inverted star pattern
        // ****
        // ***
        // **
        // *    like this
        int n = 4;
        for(int line = 1; line <= n; line++){
            for(int star =1; star <= n-line+1; star++){
                System.out.print("*");
            }
            System.out.println();
        }

        // *******************************************************************************

        //To print half pyramid pattern

        // int n = 4;
        
        // for(int line = 1; line <= n; line++){
        //     for (int number = 1; number <= line; number++){
        //         System.out.print(number);
        //     }
        //     System.out.println();
        // }

        // **********************************************************************************

        // To print character pattern 
        // A
        // B C
        // D E F
        // G H I J     like this

        // int n = 4;
        // char ch = 'A';

        // for(int line = 1; line <= n; line++){
        //     for(int chars = 1; chars <= line; chars++){
        //         System.out.print(ch);
        //         ch++;
        //     }
        //     System.out.println();
        // }

        // int n = 5;
        // int number = 1;

        // for(int line = 1; line <= n; line++){
        //     for(int numb = 1; numb <= line; numb++){
        //         System.out.print(number);
        //         number++;
        //     }
        //     System.out.println();
        // }
        
  
    }
}
