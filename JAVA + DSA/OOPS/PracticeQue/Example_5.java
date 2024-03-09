package OOPS.PracticeQue;

public class Example_5 {
    public static void main(String[] args) {
        System.out.println(Book.count);      //prints the intial book count i.e 0
        Book b1 = new Book(150);
        Book b2 = new Book(250);
        System.out.println(Book.count);      //prints the final book count i.e 2
    }
}

class Book {
    int price;
    static int count;       // count by default intialize with 0

    public Book(int price){   //constructor
        this.price = price;
        count ++;
    }
}
