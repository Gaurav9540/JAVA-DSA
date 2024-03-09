package OOPS.PracticeQue;

public class Example_4 {
    public static void main(String[] args) {
        Vehicle obj1 = new Car();
        obj1.print1();     // it can recognized only print() function not print1() function 
        // because print1() function is not available in Vehicle so it cannot recognized and it gives an ERROR

        Vehicle obj2 = new Vehicle();
        obj2.print();
    }
}

class Vehicle{
    void print(){
        System.out.println("Base class(Vehicle)");
    }
}

class Car extends Vehicle{
    void print1(){
        System.out.println("Derived class(car)");
    }
}
