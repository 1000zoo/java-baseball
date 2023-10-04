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

    private String catchBall(String guess) {
        return "";
    }

    public int countBall(String guess) {
        return (int) IntStream.range(0, 3)
                .filter(a -> this.number.contains(guess.substring(a, a + 1)))
                .count();
    }

    public int countStrike(String guess) {
        return (int) IntStream.range(0, 3)
                .filter(a -> this.number.charAt(a) == guess.charAt(a))
                .count();
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
