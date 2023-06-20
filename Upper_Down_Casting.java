class A {
    public void show1() {
        System.out.println("In A show");
    }
}

class B extends A {
    public void show2() {
        System.out.println("In B show");
    }
}

public class Upper_Down_Casting {
    public static void main(String[] args) {
        A obj = new B();
        obj.show1();

        /**
         * Down casting
         */
        B obj1 = (B) obj;
        obj1.show2();
    }
}
