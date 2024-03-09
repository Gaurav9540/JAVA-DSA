package Arrays;

public class Largest {
    public static int largestNumber(int numbers[]) {
        int LargestNum = Integer.MIN_VALUE;

        for(int i = 0; i < numbers.length; i++){
            if(LargestNum < numbers[i]){
                LargestNum = numbers[i];
            }
        }
        return LargestNum;
    }
    
    public static void main(String[] args) {
        int numbers[] = {20, 40, 35, 15, 5, 10};
        largestNumber(numbers); // Store the result of largestNumber
        System.out.println("The largest number is: " + numbers);
    }
}
