class TestThis {
    public static void main(String args[]) {
        Student s1 = new Student(111, "ankit", 5000f);
        Student s2 = new Student(112, "sumit", 6000f);
        s1.display();
        s2.display();
    }
}

public class Student {
    int rollNo;
    String Name;
    float Fee;

    Student(int rollno, String name, float fee) {
        rollNo = rollno;
        Name = name;
        Fee = fee;
    }

    void display() {
        System.out.println(rollNo + " " + Name + " " + Fee);
    }
}


