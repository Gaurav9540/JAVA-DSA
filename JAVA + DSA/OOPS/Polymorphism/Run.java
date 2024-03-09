// Example to illustrate runtime polymorphism
// achieved through Method Overriding


package OOPS.Polymorphism;

public class Run {
    public static void main(String[] args) {
       
        Animal animal3 = new Animal(); //Creating Animal object
        Animal animal1 = new Dog(); // Creating Dog object using Animal reference
        Animal animal2 = new Cat(); // Creating Cat object using Animal reference
    
        animal3.sound(); // Call Animal's sound method
        animal1.sound(); // Calls Dog's sound method
        animal2.sound(); // Calls Cat's sound method 
    }
}

class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    public void sound() {
        System.out.println("Cat meows");
    }
}