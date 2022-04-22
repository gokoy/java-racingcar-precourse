package racingcar.domain;

import java.util.List;

public class Racing {

    private final Cars cars;
    private final Count count;

    public Racing(String carNames, String count) {
        cars = new Cars(carNames);
        this.count = new Count(Integer.parseInt(count));
    }

    public List<Car> race() {
        count.down();

        return cars.move();
    }

    public boolean isRunning() {
        return count.isRemain();
    }

    public List<Car> getWinners() {
        return cars.getHeadCars();
    }
}
