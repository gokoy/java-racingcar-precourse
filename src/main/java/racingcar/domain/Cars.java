package racingcar.domain;

import java.util.ArrayList;
import java.util.List;
import racingcar.dto.CarDto;

public class Cars {

    private final List<Car> cars;

    public Cars(String carNames) {
        cars = new ArrayList<>();
        String[] names = carNames.split(",");
        for (String name : names) {
            cars.add(new Car(name));
        }
    }

    public List<CarDto> move() {

        return null;
    }
}
