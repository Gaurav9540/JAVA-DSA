package OOPS.Interfac;

public class SuperKey {
    public static void main(String[] args) {
        Horse H = new Horse();
        System.out.println(H.color);
         
    }
}

class Animal{
    String color;
    Animal(){    //Animal constructor 
        System.out.println("Animal constructor is called");
    }
}
class Horse extends Animal{
    Horse(){    // Horse constructor
        super.color = "BROWN";
        System.out.println("Horse constructor is called");
    }
}

