public class OPPS_Abstraction {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.eat();
        horse.walk();

        Chicken chicken = new Chicken();
        chicken.eat();
        chicken.walk();

        Mustang myMustang = new Mustang();
        // Animal -> Horse -> Mustang (Constructor called hierarchy)
        myMustang.eat();
    }
}

abstract class Animal {     // We can't create any instance of an abstruct class

    String color;
    Animal() {  // Constructor
        System.out.println("Animal constructor called");
    }

    // non abstruct method
    void eat() {
        System.out.println("Animal eats");
    }
    // abstruct method  // dont have an implementation
    abstract void walk();   // It gives the idea of walk only & it's implementation depends on it's sub classes
}

// Sub class
class Horse extends Animal {

    Horse() {
        System.out.println("Horse constructor called");
    }

    void changeColor() {
        color = "Dark-Brown";
    }
    
    void walk() {   // walk method is compulsory
        System.out.println("Walks on 4 legs");
    }
}

class Mustang extends Horse {
    Mustang() {
        System.out.println("Mustang constructor called");
    }

    void eat() {
        System.out.println("It eats");
    }
}

class Chicken extends Animal {

    void changeColor() {
        color = "Yellow";
    }

    void walk() {   // walk method is compulsory
        System.out.println("Walks on 2 legs");
    }
}