package baseball;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class GameIOTest {

    @Test
    void 숫자입력유효성검증테스트() {
        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> GameIO.throwErrorIfInvalidNumber("aaa")
        );
    }

    @Test
    void 옵션입력유효성검증테스트() {
        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> GameIO.throwErrorIfInvalidOption("0")
        );
    }
}