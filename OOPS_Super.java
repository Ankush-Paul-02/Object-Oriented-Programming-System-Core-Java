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

class Horse extends Animal {
    Horse() {
        super.color = "White";
        System.out.println("Horse constructor is called");
    }
} 