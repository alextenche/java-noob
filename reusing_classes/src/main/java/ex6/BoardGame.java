package ex6;

public class BoardGame extends Game {

    public BoardGame(int i) {
        super(i); // no default constructor in Game if this is commented
        System.out.println("BoardGame constructor");
    }
}
