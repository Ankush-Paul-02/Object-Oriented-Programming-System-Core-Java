class A {
    public A() {
        System.out.println("Object created");
    }
    public void show() {
        System.out.println(" In A show");
    }
}

public class Anonymous_Object {
    public static void main(String[] args) {
        
        /**
         * Anonymous object
         * We can't reuse them
         */
        new A().show();    
    }
}
