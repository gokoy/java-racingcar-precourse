package racingcar.util;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class ValidatorTest {

    @ParameterizedTest
    @ValueSource(strings = {"", " ", "!", "이름", "abcdef"})
    void 자동차_이름_검증_예외_발생(String string) {
        //given
        //when
        //then
        assertThrows(IllegalArgumentException.class, () -> Validator.checkRegex(string));
    }

    @ParameterizedTest
    @ValueSource(strings = {"a", "1", "1a", "a2c", "a1b2c",})
    void 자동차_이름_검증_성공(String string) {
        //given
        //when
        //then
        Validator.checkRegex(string);
    }

    @ParameterizedTest
    @ValueSource(strings = {"", " ", "a", "!", "2147483648"})
    void 시도_횟수_정수인지_검증_예외_발생(String string) {
        //given
        //when
        //then
        assertThrows(IllegalArgumentException.class, () -> Validator.isInteger(string));
    }

    @ParameterizedTest
    @ValueSource(strings = {"-2147483648", "-1", "0", "1", "2147483647"})
    void 시도_횟수_정수인지_검증_성공(String string) {
        //given
        //when
        //then
        Validator.isInteger(string);
    }

    @ParameterizedTest
    @ValueSource(strings = {"-1", "0"})
    void 시도_횟수_1_이상_검증_예외_발생(String string) {
        //given
        //when
        //then
        assertThrows(IllegalArgumentException.class, () -> Validator.isGreaterThanZero(string));
    }

    @ParameterizedTest
    @ValueSource(strings = {"1", "2", "2147483647"})
    void 시도_횟수_1_이상_검증_성공(String string) {
        //given
        //when
        //then
        Validator.isGreaterThanZero(string);
    }

}