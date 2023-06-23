class A {
    public void show() {
        System.out.println("In a show!");
    }
}

class B extends A {
    public void show() {
        System.out.println("In b show!");
    }
}

public class AnonymousInnerClass {
    public static void main(String[] args) {
        A a = new A() {
            /**
             * Anonymous class and this class hasn't any name
             */
            @Override
            public void show() {
                System.out.println("In new show!");
            }
        };

        /**
         * It will call the new implementation of show method
         */
        a.show();
    }
}