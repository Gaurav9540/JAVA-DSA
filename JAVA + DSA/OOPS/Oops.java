package OOPS;


// public class Oops {
//     public static void main(String[] args) {
//        //created a pen object called p1

//         Pen p1 = new Pen();                 //Pen(); ---> called as constructor
//         p1.setColor("Blue");
//         System.out.println(p1.color);
        
//         p1.setTip(5);
//         System.out.println(p1.tip);

//     }   
// }

// class Pen{
//     String color;
//     int tip;

//     void setColor(String newColor){
//         color = newColor;
//     }
//     void setTip(int newTip){
//         tip = newTip;
//     }
// }  




// use of getters And setters

public class Oops {
    public static void main(String[] args) {
       //created a pen object called p1

        Pen p1 = new Pen();                 //Pen(); ---> called as constructor
        //setter 
        p1.setColor("Blue");
        //getter
        System.out.println(p1.getColor());
        
        // -------------------------------------//

        //setter 
        p1.setTip(5);
        //getter 
        System.out.println(p1.getTip());

    }   
}

class Pen{
    private String color;
    private int tip;

    //getters

    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }

    //setters

    void setColor(String newColor){
        this.color = newColor;
    }
    void setTip(int newTip){
        this.tip = newTip;
    }
}  


