// implementation of Interfaces through Abstraction

package OOPS.Interfac;

public class Inter {
    public static void main(String[] args) {
        Queen Q = new Queen();
        Q.moves();

        // Rook k = new Rook();
        // k.moves();
    }
}

interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, left, right, diagonal -(in all 4 directions)");
    }
}

class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, left, right");
    }
}

class King implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, left, right, diagonal -(by 1 step)");
    }
}