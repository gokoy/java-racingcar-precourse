package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

public class Racing {

    private final List<Car> cars;
    private int count;
    private boolean running;

    public Racing(String carNames, String count) {
        cars = new ArrayList<>();
        String[] names = carNames.split(",");
        for (String name : names) {
            cars.add(new Car(name));
        }
        isIntegerGreaterThanZero(count);
        this.count = Integer.parseInt(count);
        this.running = true;
    }

    private void isIntegerGreaterThanZero(String count) {
        try {
            Integer.parseInt(count);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("count must be an integer greater than 0.");
        }

        if (Integer.parseInt(count) <= 0) {
            throw new IllegalArgumentException("count must be an integer greater than 0.");
        }
    }

    public void race() {
        count--;

        if (count == 0) {
            running = false;
        }
    }

    public boolean isRunning() {
        return running;
    }


}
