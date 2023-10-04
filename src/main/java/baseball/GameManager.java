package baseball;

public class GameManager {

    private Computer computer;

    public GameManager() {}

    public void start() {
        computer = new Computer();
        GameIO.printLog("숫자 야구 게임을 시작합니다.");
        loop();
    }

    public void loop() {
        System.out.println(computer.getNumber());
        while (!computer.isGameOver()) {
            String input = GameIO.enterNumber();
            String log = computer.catchBall(input);
            GameIO.printLog(log);
        }

        GameIO.printLog("3개의 숫자를 모두 맞히셨습니다!\n게임 종료");
        endOrContinue();
    }

    public void endOrContinue() {
        int option = Integer.parseInt(GameIO.enterOption());
        if (option == 1) start();
    }


}
