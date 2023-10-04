package baseball;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ComputerTest {

    @Test
    void 볼_테스트() {
        Computer computer = new Computer("123");
        String[] balls = {"123", "234", "345"};
        int[] answers = {3, 2, 1};

        for (int i = 0; i < balls.length; i++) {
            int countBall = computer.countBall(balls[i]);
            assertThat(countBall).isEqualTo(answers[i]);
        }
    }

    @Test
    void 스트라이크_테스트() {
        Computer computer = new Computer("123");
        String[] balls = {"123", "234", "163"};
        int[] answers = {3, 0, 2};

        for (int i = 0; i < balls.length; i++) {
            int countStrike = computer.countStrike(balls[i]);
            assertThat(countStrike).isEqualTo(answers[i]);
        }
    }
}