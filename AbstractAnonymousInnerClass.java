abstract class A {
    public abstract void show();
}

/**
 * We haven't created this class for the method's implementation.
 * Instead of we can create the inner anonymous class of A
 */
class B extends A {
    @Override
    public void show() {
        System.out.println("In class B");
    }
}

public class AbstractAnonymousInnerClass {
    public static void main(String[] args) {
        /*
         * A a = new B();
         * a.show();
         */

        A a = new A() {
            /**
             * We are creating the object of anonymous inner class not of A
             */
            @Override
            public void show() {
                System.out.println("In anonymous inner class");
            }
        };

        a.show();

    }
}
