package baseball;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.IntStream;

public class Computer {

    private final String number;

    public Computer() {
        this.number = createRandomNumber();
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

        return ballCounts + ", " + strikeCounts;
    }

    private boolean isBall(char guess) {
        return number.contains(String.valueOf(guess));
    }

    private boolean isStrike(String guess, int index) {
        return guess.charAt(index) == number.charAt(index);
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
