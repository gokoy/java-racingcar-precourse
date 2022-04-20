package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.regex.Pattern;

public class Car {

    private final String name;
    private int distance;

    public Car(String name) {
        isLessFiveCharacters(name);
        this.name = name;
        this.distance = 0;
    }

    private void isLessFiveCharacters(String name) {
        if (Pattern.matches("^[0-9a-zA-Z]{1,5}$", name)) {
            return;
        }

        throw new IllegalArgumentException(
                "name must be 5 characters or less in length consisting of English, numbers.");
    }

    public void move() {
        int randomNumber = Randoms.pickNumberInRange(0, 9);

        if (4 <= randomNumber) {
            distance += 1;
        }
    }

    public String getName() {
        return name;
    }

    public int getDistance() {
        return distance;
    }
}
