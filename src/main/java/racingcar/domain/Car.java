package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {

    private static final int CAR_DISTANCE_INIT = 0;
    private static final int RANDOM_NUMBER_RANGE_FROM = 0;
    private static final int RANDOM_NUMBER_RANGE_TO = 9;
    private static final int MOVE_CONDITION = 4;
    private static final int MOVE_UNIT = 1;

    private final Name name;
    private final Distance distance;

    public Car(String name) {
        this.name = new Name(name);
        this.distance = new Distance(CAR_DISTANCE_INIT);
    }

    public void move() {
        int randomNumber = Randoms.pickNumberInRange(RANDOM_NUMBER_RANGE_FROM, RANDOM_NUMBER_RANGE_TO);

        if (MOVE_CONDITION <= randomNumber) {
            distance.add(MOVE_UNIT);
        }
    }

    public String getName() {
        return name.getName();
    }

    public int getDistance() {
        return distance.getDistance();
    }
}
