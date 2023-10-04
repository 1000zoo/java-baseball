package baseball;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;

public class Computer {

    private final String number;
    private boolean gameOver;

    public Computer() {
        this.number = createRandomNumber();
        this.gameOver = false;
    }

    public boolean isGameOver() {
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

        if (strikeCounts == 3) {
            this.gameOver = true;
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

        return ball + "볼 " + strike + "스트라이크";
    }


    private String createRandomNumber() {
        Set<Integer> set = new HashSet<>();
        while (set.size() < 3) {
            set.add(Randoms.pickNumberInRange(1, 9));
        }
        return setToString(set);
    }

    private String setToString(Set<Integer> set) {
        StringBuilder sb = new StringBuilder();
        for (int s : set) {
            sb.append(s);
        }
        return sb.toString();
    }
}
