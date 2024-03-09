// Que - Find out the correct statement to assign name to object

package OOPS.PracticeQue;

public class Example_1 {
    public static void main(String[] args) {
        Student S = new Student();
        S.name = "Gaurav";                   // this is the way to assign value to the object
        System.out.println(S.name);

        S.marks = 85;                        // this is the way to assign value to the object
        System.out.println(S.marks);
    }
}

class Student{
    String name;
    int marks;
}
