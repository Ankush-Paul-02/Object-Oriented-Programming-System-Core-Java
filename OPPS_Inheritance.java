public class OPPS_Inheritance {
    public static void main(String[] args) {

        Fish shark = new Fish();
        shark.eat();

        Dog tom = new Dog();
        tom.eat();
        tom.legs = 4;
        System.out.println(tom.legs);
    }
}

// Base or parent class
class Animal {
    String color;
    void eat() {
        System.out.println("It eats");
    }
    void breathe() {
        System.out.println("It breathes");
    }
}

// Derived Class or child class
// Multilevel inheritance
class Mammal extends Animal {
    int legs;
}
class Dog extends Mammal {
    String bread;
} 


// Hierarcial inheritance
class Fish extends Animal {
    int fins;
    void swim() {
        System.out.println("It swims in water");
    }
}
class Bird extends Animal {
    void fly() {
        System.out.println("It can fly");
    }
}
class Cat extends Animal {
    void meow() {
        System.out.println("Meow Meow");
    }
}

// Hybrid inheritance
class Shark extends Fish {
    void kill() {
        System.out.println("It can kill a human");
    }
}
class Tuna extends Fish {
    void eatable() {
        System.out.println("Human can eat it");
    }
}
