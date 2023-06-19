class Computer {
    public void work() {
        System.out.println("In computer!");
    }
}

class Laptop extends Computer {
    public void work() {
        System.out.println("In laptop!");
    }
}

class SuperComputer extends Computer {
    public void work() {
        System.out.println("In Super computer!");
    }
}


public class Dynamic_Method_Dispatch {
    public static void main(String[] args) {
        
        Computer computer = new Computer();
        computer.work();

        computer = new Laptop();
        computer.work();

        computer = new SuperComputer();
        computer.work();
    }
}
