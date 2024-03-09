// Demonstration of Inheritance

//Example of Single Level Inheritance

package OOPS;

public class Inheritance {      //main class
    public static void main(String[] args) {
        // Object of Fish
        Fish shark = new Fish();
        shark.eat();
        shark.breathe();
        shark.swim();
    }
}

// Base class OR Parent class
class Animal {
    String color;

    void eat(){
        System.out.println("eating.....");
    }

    void breathe(){
        System.out.println("breathing.....");
    }
}

// Derived class OR Child class
class Fish extends Animal{
    int fins;

    void swim(){
        System.out.println("swims in water");
    }
}
