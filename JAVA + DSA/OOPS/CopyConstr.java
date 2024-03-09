package OOPS;

public class CopyConstr {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.name = "gaurav";
        s1.roll = 21;
        s1.password = "xyz";

        Student s2 = new Student(s1);
        s2.password = "abcd";
    }
}

class Student {
    String name;
    int roll;
    String password;

    // Copy Constructor
    Student(Student s1){
        this.name = s1.name;
        this.roll = s1.roll;
    }

    Student(){
        System.out.println("pr");
    }
    Student(String name){
        this.name = name;
    }
    Student(int roll){
        this.roll = roll;
    }
}
