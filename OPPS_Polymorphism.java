public class OPPS_Polymorphism {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println(cal.sum(1, 2));
        System.out.println(cal.sum(1.5f, 2.5f));
        System.out.println(cal.sum(1, 2, 3));

        Deer deer = new Deer();
        deer.eat();
    }
}

// method/function overloading
class Calculator {
    int sum(int a, int b) {
        return a+b;
    }
    float sum(float a, float b) {
        return a+b;
    }
    int sum(int a, int b, int c) {
        return a+b+c;
    }
}

// method overriding
class Animal {
    void eat() {
        System.out.println("Eats anything");
    }
}

class Deer extends Animal {
    void eat() {
        System.out.println("Eats grass");
    }
}
