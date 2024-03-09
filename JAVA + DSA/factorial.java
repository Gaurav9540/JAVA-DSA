//program to calculate binomial coefficient

public class factorial {

    public static int facto(int n){
        int f = 1;
        for(int i = 1; i <= n; i++){
            f = f * i;
        }
        return f;         //factorial of n
        
    }
    public static int binCoeff(int n, int r){
        int fact_n = facto(n);
        int fact_r = facto(r);
        int fact_nmr = facto(n-r);

        int binCoeff = fact_n / (fact_r * fact_nmr);
        return binCoeff;
    }
    public static void main(String[] args) {
        int n = 5;
        int r = 2;

        binCoeff(n, r);
        int binCoeff = binCoeff(n, r);
        System.out.println(binCoeff);

    }
}
