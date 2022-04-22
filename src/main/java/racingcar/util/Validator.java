package racingcar.util;

import static racingcar.config.Configuration.CAR_NAME_DELIMITER;
import static racingcar.config.Configuration.CAR_NAME_REGEX_PATTERN;
import static racingcar.config.Configuration.COUNT_CONDITION;

import java.util.regex.Pattern;

public class Validator {

    public static boolean validateCarNames(String str) {
        try {
            validateEachCarName(str);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return false;
        }

        return true;
    }

    private static void validateEachCarName(String str) {
        String[] names = str.split(CAR_NAME_DELIMITER);
        for (String name : names) {
            checkRegex(name);
        }
    }

    private static void checkRegex(String str) {
        if (Pattern.matches(CAR_NAME_REGEX_PATTERN, str)) {
            return;
        }

        throw new IllegalArgumentException(
                "[ERROR] 자동차 이름은 영어, 숫자로 구성된 5자 이하의 문자열입니다.");
    }

    public static boolean validateCount(String count) {
        try {
            isInteger(count);
            isGreaterThanZero(count);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    private static void isGreaterThanZero(String count) {
        if (Integer.parseInt(count) <= COUNT_CONDITION) {
            throw new IllegalArgumentException("[ERROR] 횟수는 0 이상이어야 합니다.");
        }
    }

    private static void isInteger(String count) {
        try {
            Integer.parseInt(count);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("[ERROR] 횟수는 정수여야 합니다.");
        }
    }
}
