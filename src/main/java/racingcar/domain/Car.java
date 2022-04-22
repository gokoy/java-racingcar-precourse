package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {

    private final Name name;
    private final Distance distance;

    public Car(String name) {
        this.name = new Name(name);
        this.distance = new Distance(0);
    }

    public void move() {
        int randomNumber = Randoms.pickNumberInRange(0, 9);

        if (4 <= randomNumber) {
            distance.add(1);
        }
    }

    public String getName() {
        return name.getName();
    }

    public int getDistance() {
        return distance.getDistance();
    }
}
