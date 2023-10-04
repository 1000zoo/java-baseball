package study;

import camp.nextstep.edu.missionutils.Randoms;
import org.junit.jupiter.api.Test;

public class RandomTest {

    @Test
    void 랜덤테스트() {
        for (int i = 0; i < 10; i++) {
            System.out.println("random " + i + "=> " + Randoms.pickNumberInRange(1, 9));
        }
    }
}
