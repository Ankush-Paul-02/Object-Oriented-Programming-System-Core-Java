public class OOPS_Static {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.schoolName = "NSV";

        Student student2 = new Student();
        System.out.println(student2.schoolName);
    }
}

class Student {
    String name;
    int roll;
    static int returnPercentage(int math, int phy, int chem) {
        return (math+phy+chem)/3;
    }
    
    static String schoolName;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }
}
