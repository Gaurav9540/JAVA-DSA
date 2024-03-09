// Example of Hierarchial Inheritance

package OOPS;

public class Hierarchial {
    public static void main(String[] args) {
        Bird duck = new Bird();

        duck.eat();
        duck.breathe();
        duck.fly();
    }
}

//Base OR Parent class
class Animal {
    String color;

    void eat(){
        System.out.println("It can eating ...");
    }
    void breathe(){
        System.out.println("It can breathing ...");
    }
}

//Derived OR Child class
class Mammals extends Animal{
    void walk(){
        System.out.println("It can walk ...");
    }
}

//Derived OR Child class
class Fish extends Animal {
    void swim(){
        System.out.println("It can swim ...");
    }
}

//Derived OR Child class
class Bird extends Animal {
    void fly(){
        System.out.println("It can flying ...");
    }
}

