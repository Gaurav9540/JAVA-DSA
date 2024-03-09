// Que - which variable(s) can the class person access in the following

package OOPS.PracticeQue;

public class Example_2 {
    public static void main(String[] args) {
        // Person p = new Person();
        // p.name = "Gaurav";
        // System.out.println(p.name);

        // p.weight = 52;
        // System.out.println(p.weight);

        Student c = new Student();
        c.name = "Bala";
        System.out.println(c.name);
       
        Person m = new Student();
    }
}

class Person{
    String name;
    int weight;
}

class Student extends Person{
    int rollNumber;
    String schoolName;
}
