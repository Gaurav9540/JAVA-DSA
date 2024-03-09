// What will be output of the following code

package OOPS.PracticeQue;

public class Example_3 {
    public static void main(String[] args) {
        Vehicle obj1 = new Car();
        obj1.print();  // ---------> method overriding 
        //(here two functions in car but in method overriding always called child function)
        // parent reference = child obj  ----> it can possible
        // parent(Vehivle)  = child(Car)
        
        Vehicle obj2 = new Vehicle();
        obj2.print();
    }
}

class Vehicle {
    void print (){
        System.out.println("Base class(Vehicle)");
    }
}
class Car extends Vehicle {
    void print (){
        System.out.println("Derived class(Car)");
    }
}
