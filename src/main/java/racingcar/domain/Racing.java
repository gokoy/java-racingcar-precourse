package racingcar.domain;

import java.util.List;

public class Racing {

    private final Cars cars;
    private int count;
    private boolean running;

    public Racing(String carNames, String count) {
        cars = new Cars(carNames);
        this.count = Integer.parseInt(count);
        this.running = true;
    }

    public List<Car> race() {
        count -= 1;

        if (count == 0) {
            running = false;
        }

        return cars.move();
    }

    public boolean isRunning() {
        return running;
    }

    public List<Car> getWinners() {
        return cars.getHeadCars();
    }
}
