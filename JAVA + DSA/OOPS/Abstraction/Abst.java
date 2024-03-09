package OOPS.Abstraction;

public class Abst {
    public static void main(String[] args) {
        Mustang myHorse = new Mustang();
        // Animal --> Horse --> Mustang     hierarchy of constructor calling 
        // h.eat();
        // h.walk();
        // System.out.println(h.color);

        // Chicken c = new Chicken();
        // c.eat();
        // c.walk();

        // Animal a = new Animal();     // we can not create object of Abstract class
    }
}

abstract class Animal {
    String color;
    // constructor
    Animal(){
    //  color = "brown";
        System.out.println("Animal constructor called ...");
    }

    // non abstract method
    void eat() {
        System.out.println("Animal eats ..");
    }

    // abstract method
    abstract void walk();  //not written implementation so these is absract method
}

class Horse extends Animal {
    // constructor
    Horse(){
        System.out.println("Horse constructor called ...");
    }
    //change color function
    void changeColor(){      
        color = "black";
    }
    void walk(){
        System.out.println("walk on 4 legs");
    }
}

class Mustang extends Horse {
    // constructor
    Mustang(){
        System.out.println("Mustang constructor called ...");
    }
}

// class Chicken extends Animal {
//     //change color function
//     void changeColor(){
//         color = "red";
//     }
//     void walk(){
//         System.out.println("walk on 2 legs");
//     }
// }