package OOPS;

public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        // System.out.println(s1);

        Student s2 = new Student("gaurav");
        System.out.println(s2.name);

        Student s3 = new Student(12);
        System.out.println(s3.roll);

       

    }
}

class Student {
    String name;
    int roll;
    String password;

    // This is non-parameterized constructor

    Student(){
        System.out.println("This is non-parameterized constructor");
    }

    // This is parameterized constructor

    Student(String name){
        this.name = name;
    }

    // This is parameterized constructor

    Student(int roll){
        this.roll = roll;
    }
    
}
