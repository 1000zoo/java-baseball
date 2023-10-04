package baseball;

public class Player {

    private final GameManager gm;

    public Player() {
        gm = new GameManager();
    }

    public void start() {
        gm.start();
    }
}
