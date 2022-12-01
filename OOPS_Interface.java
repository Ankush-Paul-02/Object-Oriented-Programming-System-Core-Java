public class OOPS_Interface {
    public static void main(String[] args) {
        Queen queen = new Queen();
        queen.moves();

        Beer beer = new Beer();
        beer.vegetarian();
        beer.nonVegeterian();
    }
}

interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("It can move anywhere in all 4 directions");
    }
}

class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("It can moves diagonally");
    }
}

class King implements ChessPlayer {
    public void moves() {
        System.out.println("It can go anywhere by 1 step");
    }
}


// Multiple inheritance
interface Herbivore {
    void vegetarian();
}

interface Carnivore {
    void nonVegeterian();
}

class Beer implements Herbivore, Carnivore {
    public void vegetarian() {
        System.out.println("It is a vegetarian");
    }
    public void nonVegeterian() {
        System.out.println("It is a non-vegetarian also");
    }
}