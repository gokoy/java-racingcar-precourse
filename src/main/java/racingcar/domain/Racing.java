package racingcar.domain;

import java.util.List;
import racingcar.dto.CarDto;

public class Racing {

    private final Cars cars;
    private int count;
    private boolean running;

    public Racing(String carNames, String count) {
        cars = new Cars(carNames);
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

    public List<CarDto> race() {
        count--;

        if (count == 0) {
            running = false;
        }

        return cars.move();
    }

    public boolean isRunning() {
        return running;
    }
}
