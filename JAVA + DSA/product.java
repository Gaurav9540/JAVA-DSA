public class product {

    public static int multiply(int a, int b){          //function created
        int product = a * b;
        return product;
    }
    public static void main(String[] args) {          //main function 
        int a = 6;
        int b = 6;

        int product = (multiply(a, b));             //function calling
        System.out.println(product);

        //or we can write as below
                  
        System.out.println(multiply(a, b));
    }
}
