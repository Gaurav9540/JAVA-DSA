// Example of Multilevel Inheritance

package OOPS;

public class Multilevel {
    public static void main(String[] args) {
        Dog Dodo = new Dog();

        Dodo.color = "Black";
        System.out.println("color is: " + Dodo.color);

        Dodo.legs = 4;
        System.out.println("legs are: " + Dodo.legs);

        Dodo.breed = "vodafone";
        System.out.println("breed is: " + Dodo.breed);

        Dodo.eat();
        Dodo.breathe();
    }
}

// Base class OR Parent class
class Animal {
    String color;

    void eat(){
        System.out.println("It can eating.....");
    }

    void breathe(){
        System.out.println("It can breathing.....");
    }
}

// Derived class OR Child class
class Mammal extends Animal{
    int legs;
}

// Derived class OR Child class
class Dog extends Mammal{
    String breed;
}
