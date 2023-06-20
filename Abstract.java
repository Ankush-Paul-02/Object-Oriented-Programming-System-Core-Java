/**
 * Abstract class
 */
abstract class Car {
    public abstract void drive();
    public abstract void transformer();

    public void playMusic() {
        System.out.println("Play Music!");
    }
}

/**
 * Concrete class
 */
class BMW extends Car {

    public void drive() {
        System.out.println("Driving!");
    }

    public void transformer() {
        System.out.println("It can transform into robot!");
    }
}

public class Abstract {
    public static void main(String[] args) {

        /**
         * We can't make an object of an abstract class 
         * Car car = new Car(); //? Not possible
         */

        Car car = new BMW();
        car.drive();
        car.playMusic();
        car.transformer();
    }
}
