package baseball;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ComputerTest {

    @Test
    void 볼_스트라이크_테스트() {
        Computer computer = new Computer("713");
        String[] balls = {"123", "145", "671", "216", "713"};
        String[] answer = {
                "1, 1", "1, 0", "2, 0", "0, 1", "0, 3"
        };

        for (int i = 0; i < balls.length; i++) {
            assertThat(computer.catchBall(balls[i])).isEqualTo(answer[i]);
        }
    }
}