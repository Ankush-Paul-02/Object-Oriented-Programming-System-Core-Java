package Generic;

public class Box<T> { // T is type
    T container;

    Box(T container) {
        this.container = container;
    }

    public T getValue() {
        return this.container;
    }

    public void performSomeTask() {
        if (container instanceof String) {
            System.out.println("length of " + container + " is " + ((String) this.container).length());
        }
    }
}
