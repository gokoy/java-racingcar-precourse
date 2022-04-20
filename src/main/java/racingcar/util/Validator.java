package racingcar.util;

import java.util.regex.Pattern;

public class Validator {

    public static boolean validateCarName(String carNames) {
        String[] split = carNames.split(",");
        for (String s : split) {
            try {
                checkRegex(s);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                return false;
            }
        }
        return true;
    }

    private static void checkRegex(String str) {
        if (Pattern.matches("^[0-9a-zA-Z]{1,5}$", str)) {
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
        if (Integer.parseInt(count) <= 0) {
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
