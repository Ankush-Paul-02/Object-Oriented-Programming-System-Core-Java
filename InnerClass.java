/**
 * We can't make outer class static
 */
class A {
    int age;
    public void show() {
        System.out.println("In show");
    }

    /**
     * Inner class
     */
    static class B {
        public void config() {
            System.out.println("In config");
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {
        A a = new A();
        a.show();

        /**
         * If the B class isn't static then
         * A.B b = a.new B();
         */

        A.B b = new A.B();  // If the B class is static
        b.config();
    }
}
