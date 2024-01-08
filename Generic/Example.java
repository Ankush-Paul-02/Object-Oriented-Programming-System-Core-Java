package Generic;

public class Example {
    public static void main(String[] args) {
        // Box box = new Box("Water");
        // box.container = 123;
        // System.out.println(box.getValue());

        Box<String> box1 = new Box<>("Wow");
        System.out.println(box1.getValue());
        box1.performSomeTask();
        System.out.println(box1.container.getClass().getName());

        Box<Integer> box2 = new Box<Integer>(123);
        System.out.println(box2.getValue());
        System.out.println(box2.container.getClass().getName());
    }
}
