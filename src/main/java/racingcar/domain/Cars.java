package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

public class Cars {

    private final List<Car> cars;

    public Cars(String carNames) {
        cars = new ArrayList<>();
        String[] names = carNames.split(",");
        for (String name : names) {
            cars.add(new Car(name));
        }
    }

    public List<Car> move() {
        for (Car car : cars) {
            car.move();
        }

        return cars;
    }

    public List<Car> getHeadCars() {
        int maxDistance = getMaxDistance();

        List<Car> headCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getDistance() == maxDistance) {
                headCars.add(car);
            }
        }

        return headCars;
    }

    private int getMaxDistance() {
        int maxDistance = Integer.MIN_VALUE;
        for (Car car : cars) {
            maxDistance = Math.max(maxDistance, car.getDistance());
        }
        return maxDistance;
    }
}
