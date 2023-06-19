class A {
    public void show() {
        System.out.println("In A show");
    }
    public void config() {
        System.out.println("In config");
    }
}

class B extends A {

    /**
     * Method overriding
     */
    public void show() {
        System.out.println("In B show");
    }
}

public class Method_Overriding {
    public static void main(String[] args) {
        B b = new B();
        b.show();
        b.config();
    }
}
