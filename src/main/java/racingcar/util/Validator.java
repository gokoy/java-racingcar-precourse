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
                "[ERROR] name must be 5 characters or less in length consisting of English, numbers.");
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
            throw new IllegalArgumentException("[ERROR] count must be greater than 0.");
        }
    }

    private static void isInteger(String count) {
        try {
            Integer.parseInt(count);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("[ERROR] count must be an integer.");
        }
    }
}
