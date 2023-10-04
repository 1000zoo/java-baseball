package baseball;

public class GameManager {

    private Computer computer;

    public GameManager() {}

    public void start() {
        computer = new Computer();
        System.out.println("숫자 야구 게임을 시작합니다.");
    }

    public void loop() {

    }

    public void endOrContinue() {
        int option = Integer.parseInt(GameIO.enterOption());

    }


}
