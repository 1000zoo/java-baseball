package baseball;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.List;
import java.util.ArrayList;

public class Computer {

    private final String number;
    private boolean gameOver;

    public Computer() {
        this.number = createRandomNumber();
        this.gameOver = false;
    }

    private boolean isGameOver() {
        return gameOver;
    }

    //Test 전용
    public Computer(String ball) {
        this.number = ball;
    }

    public String getNumber() {
        return number;
    }

    public String catchBall(String guess) {
        int ballCounts = 0;
        int strikeCounts = 0;

        for (int i = 0; i < guess.length(); i++) {
            if (isStrike(guess, i)) {
                strikeCounts++;
                continue;
            }
            if (isBall(guess.charAt(i))) {
                ballCounts++;
            }
        }

        return getMessage(ballCounts, strikeCounts);
    }

    private boolean isBall(char guess) {
        return number.contains(String.valueOf(guess));
    }

    private boolean isStrike(String guess, int index) {
        return guess.charAt(index) == number.charAt(index);
    }

    private String getMessage(int ball, int strike) {
        if (ball == 0 && strike == 0) {
            return "낫싱";
        }

        if (strike == 0) {
            return ball + "볼";
        }

        if (ball == 0) {
            return strike + "스트라이크";
        }

        if (strike == 3) {
            this.gameOver = true;
        }

        return ball + "볼 " + strike + "스트라이크";
    }


    private String createRandomNumber() {
        List<String> list = new ArrayList<>(List.of("1", "2", "3", "4", "5", "6", "7", "8", "9"));
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            int randomIndex = Randoms.pickNumberInRange(0, list.size() - 1);
            temp.append(list.remove(randomIndex));
        }

        return temp.toString();
    }
}
