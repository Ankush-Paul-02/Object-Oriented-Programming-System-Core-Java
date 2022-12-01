public class OOPS {
    public static void main(String[] args) {  // public = access specifier or Modifirer

        Pen p1 = new Pen();  // created a pen object called p1
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        p1.setColor("Red");;
        System.out.println(p1.getColor());


        // Student s1 = new Student("Ankush"); // make a new student by the help of constructor
        // System.out.println(s1.name);
        // Student s2 = new Student();
        // Student s3 = new Student(1);

        Student s1 = new Student();
        s1.name = "Ankush";
        s1.roll = 24;
        s1.password = "12345";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s2 = new Student(s1);
        s2.password = "123456";
        s1.marks[2] = 100; 

        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }
    }
}


class Pen {
    // Properties of pen
    private String color;
    private int tip;

    // Getters
    String getColor() {
        return this.color;
    }
    int getTip() {
        return this.tip;
    }

    // Setters
    // Functions of pen
    void setColor(String color) {
        this.color = color;
    }
    void setTip(int tip) {
        this.tip = tip;
    }
}

class Student {
    String name;
    int roll;
    String password;
    int marks[];
    
    // Constructor 
    Student(String name) {  // parameterized constructor
        marks = new int[3];
        this.name = name;
    }  

    Student() {  // nor parameterized constructor
        marks = new int[3];
        System.out.println("Constructor is called...");
    }

    Student(int roll) {
        marks = new int[3];
        this.roll = roll;
    }

    // shallow copy constructor
    // Student(Student s1) {
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks = s1.marks;
    // }

    // deep copy constructor
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }  
}
