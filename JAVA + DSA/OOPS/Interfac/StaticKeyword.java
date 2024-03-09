package OOPS.Interfac;

public class StaticKeyword {
    public static void main(String[] args) {
        Student G = new Student();    //object 1
        G.schoolName = "SNJB";        //Static variable

        Student G2 = new Student();   //object 2
        System.out.println(G2.schoolName);

        Student G3 = new Student();   //object 3
        G3.schoolName = "SUN";  
        
        System.out.println(G.schoolName);
        
    }
}

class Student {
    // -------------- Static function -----------
    static int returnpercentage(int math, int phy, int chem){       
        int total = (math + phy + chem)/3;
        return total;
    }
    // -----------------------------------------

    String name;
    int roll;

    static String schoolName;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }
}
