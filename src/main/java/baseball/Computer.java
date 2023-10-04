package baseball;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.List;
import java.util.ArrayList;

public class Computer {

    private final String number;

    public Computer() {
        this.number = createRandomNumber();
    }

    public String getNumber() {
        return number;
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
