public class OOPS_Super {
    public static void main(String[] args) {
        Horse horse = new Horse();
        System.out.println(horse.color);
    }
}

class Animal {
    String color;
    Animal() {
        System.out.println("Animal constructor is called");
    }
}
// The super keyword in Java is a reference variable used to refer to parent class objects. The super() in Java is a reference variable that refers to parent class constructors. super can be used to call parent class variables and methods.

class Horse extends Animal {
    Horse() {
        super.color = "White";
        System.out.println("Horse constructor is called");
    }
} 
