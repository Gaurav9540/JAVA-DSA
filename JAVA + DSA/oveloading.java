// method overloading --> functions having same name but diffrent in parameters

public class oveloading {

    public static int sum(int a, int b){                  //function 1
        int ans = a + b;
        return ans;

        //-------or--------
        // return a + b;
    }
    public static int sum(int c, int d, int e){          //function 2
        int ans1 = c + d + e;
        return ans1;

        // ------------ or --------
        // return c + d + e;
    }
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int c = 5;
        int d = 2;
        int e = 1;

        int ans = sum(a, b);
        System.out.println("The sum is: " + ans);

        int ans1 = sum(c, d, e);
        System.out.println("The sum is: " + ans1);

        // --------------------- OR --------------------

        // System.out.println(sum(ans1, b));
        // System.out.println(sum(c, d, e));
    }
}
