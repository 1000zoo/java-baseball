package study;

import baseball.Computer;
import baseball.GameIO;
import camp.nextstep.edu.missionutils.Randoms;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.regex.Pattern;

import static org.assertj.core.api.Assertions.assertThat;

public class RandomTest {

    @Test
    void 랜덤테스트() {
        for (int i = 0; i < 10; i++) {
            System.out.println("random " + i + "=> " + Randoms.pickNumberInRange(1, 9));
        }
    }
    
    @Test
    void 중복없이_랜덤숫자들_생성_테스트() {
        Computer computer = new Computer();
        System.out.println("computer.getNumber() = " + computer.getNumber());
    }
}
