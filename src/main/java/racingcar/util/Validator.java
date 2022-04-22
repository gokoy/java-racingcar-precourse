package racingcar.util;

import static racingcar.config.Configuration.CAR_NAME_REGEX_PATTERN;
import static racingcar.config.Configuration.COUNT_CONDITION;

import java.util.regex.Pattern;

public class Validator {

    private Validator() {
    }

    public static void checkRegex(String str) {
        if (Pattern.matches(CAR_NAME_REGEX_PATTERN, str)) {
            return;
        }

        throw new IllegalArgumentException("자동차 이름은 영어, 숫자로 구성된 5자 이하의 문자열입니다.");
    }

    public static void isGreaterThanZero(String count) {
        if (Integer.parseInt(count) < COUNT_CONDITION) {
            throw new IllegalArgumentException("횟수는 " + COUNT_CONDITION + " 이상이어야 합니다.");
        }
    }

    public static void isInteger(String count) {
        try {
            Integer.parseInt(count);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("횟수는 정수여야 합니다.");
        }
    }
}
