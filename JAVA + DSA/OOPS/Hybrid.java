package OOPS;

public class Hybrid {
    public static void main(String[] args) {
        Human man = new Human();
        
        man.eat();
        man.breathe();
        man.walk();
    }
}

//Base OR Parent class
class Animal {
    String color;

    void eat(){
        System.out.println("It can eating ...");
    }
    void breathe(){
        System.out.println("It can breathe ...");
    }
}

//Derived OR child class of Animal
class Fish extends Animal {
    String swim;
}

//Derived OR child class of Fish
class Tune extends Fish {
    String name;
}

//Derived OR child class of Fish
class Shark extends Fish {

}

//Derived OR child class of Animal
class Bird extends Animal {
    void fly(){
        System.out.println("It can flying ...");
    }
}

//Derived OR child class of Bird
class Peacock extends Bird {
    
}

//Derived OR child class of Animal
class Mammals extends Animal {

}

//Derived OR child class of Mammals
class Dog extends Mammals {

}

//Derived OR child class of Mammals
class Cat extends Mammals{

}

//Derived OR child class of Mammals
class Human extends Mammals{
    void walk(){
        System.out.println("It can walk ..");
    }

}