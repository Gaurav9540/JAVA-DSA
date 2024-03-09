// implementation of Multiple Inheritance It Only Achieved Through Abstraction
package OOPS.Interfac;

public class Multi {
    public static void main(String[] args) {
        beer b = new beer();
        b.eat();   // Output: Method 1
        b.bark();  // Output: Method 2
    }
}

// Interface 1
interface Herbivore {
    void eat();
}

// Interface 2
interface Carnivore {
    void bark();
}

// Class beer implementing interfaces 1 and 2
class beer implements Herbivore, Carnivore {
    // Implementation of method 1 from interface 1
    public void eat(){
        System.out.println("eats grass");
    }

    // Implementation of method 2 from interface 2
    public void bark(){
        System.out.println("bark ...");

    }
}
